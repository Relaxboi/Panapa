package Controller;

import Model.Pan;
import Persistence.MongoConexion;
import com.mongodb.BasicDBObject;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import java.util.ArrayList;
import java.util.UUID;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class PanController {
    
    // Conexión a la base de datos noSQL [MongoDB] //
    MongoConexion mc = new MongoConexion();
    DBCollection collection = mc.getDB().getCollection("pan");
    
    ArrayList<Pan> ListaPan = new ArrayList();
    ArrayList<Object[]> Panes = new ArrayList();    
    
    public PanController(){
 
    }

    public void Create(Pan Pan1) {//Crea un tipo de pan - datos en cola
 
        DBObject document = new BasicDBObject()
                .append("nombreTipo",Pan1.getNombreTipo())
                .append("precio", Pan1.getPrecio())
                .append("cantidad", Pan1.getCantidad())
                .append("id", UUID.randomUUID().toString());
        
        collection.insert(document);
        
    }

    public ArrayList Read(String s) {//Busca leer/buscar
        String Palabra = "";
        ArrayList<Object[]> A = new ArrayList<>();
        A.clear();
        for (int i = 0; i < ListaPan.size(); i++) {
            Palabra = "";
            for (int b = 0; b < ListaPan.get(i).getNombreTipo().length(); b++) {
                if (ListaPan.get(i).getNombreTipo().charAt(b) != ' ') {
                    Palabra += ListaPan.get(i).getNombreTipo().charAt(b);
                    if (Palabra.equals(s)) {
                        A.add(new Object[]{ListaPan.get(i).getNombreTipo(), "" + ListaPan.get(i).getCantidad(), "" + ListaPan.get(i).getPrecio()});
                        break;
                    }

                } else {
                    Palabra = "";
                }
            }
        }
        return A;
    }

    public void Uptade(int index, Pan p1) {//Actualizar o modificar
        
        String Id = ListaPan.get(index).getId();
        
        DBObject document = new BasicDBObject()
                .append("nombreTipo",p1.getNombreTipo())
                .append("precio", p1.getPrecio())
                .append("cantidad", p1.getCantidad())
                .append("id", Id);       
        collection.update(new BasicDBObject("id",Id),document);
        
    }

    public void Delete(int index) {//Eliminar
        collection.remove(new BasicDBObject("id",ListaPan.get(index).getId()));
        ListaPan.remove(index);                            
    }

    public ArrayList Listar() {
             
        Panes.clear();
        DBCursor cursor = collection.find();
        try {
            while (cursor.hasNext()) {
            DBObject cur = cursor.next();
            
            ListaPan.add(
                new Pan(cur.get("nombreTipo").toString(),
                        Integer.parseInt(cur.get("precio").toString()),
                        Integer.parseInt(cur.get("cantidad").toString()),
                        cur.get("id").toString())
            );
            
            Panes.add(new Object[]{
                cur.get("nombreTipo").toString(),
                cur.get("cantidad").toString(),
                cur.get("precio").toString(),
                cur.get("id").toString()
            });
        }
        } finally {
            cursor.close();
        }
        return Panes;
    }

    //Set and get del ArrayList
    public ArrayList<Pan> getListaPan() {
        return ListaPan;
    }

    public void setListaPan(ArrayList<Pan> ListaPan) {
        this.ListaPan = ListaPan;
    }

    public void Tablas(DefaultTableModel Table, ArrayList<Object[]> Array) {
        
        while(Table.getRowCount() != 0){
            Table.removeRow(0);
        }
        for (int i = 0; i < Array.size(); i++) {
            Table.addRow(Array.get(i));
        }
    }
}
