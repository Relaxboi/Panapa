package Controller;

import Model.Producto;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class ProductoController {

    ArrayList<Producto> ListaPan = new ArrayList();
    ArrayList<Object[]> Panes = new ArrayList();    

    public void Create(Producto Pan1) {//Crea un tipo de pan - datos en cola
        ListaPan.add(Pan1);

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

    public void Uptade(int index, Producto p1) {//Actualizar o modificar
        getListaPan().get(index).setNombreTipo(p1.getNombreTipo());
        getListaPan().get(index).setCantidad(p1.getCantidad());
        getListaPan().get(index).setPrecio(p1.getPrecio());
        getListaPan().get(index).setsProveedor(p1.getsProveedor());
    }

    public void Delete(int index) {//Eliminar
        ListaPan.remove(index);
        
    }

    public ArrayList Listar() {
        Panes.clear();
        for (int i = 0; i < getListaPan().size(); i++) {
            Panes.add(new Object[]{
                getListaPan().get(i).getNombreTipo(), 
                getListaPan().get(i).getCantidad(), 
                getListaPan().get(i).getPrecio(),
                getListaPan().get(i).getsProveedor()});
        
        }
        return Panes;
    }

    //Set and get del ArrayList
    public ArrayList<Producto> getListaPan() {
        return ListaPan;
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
