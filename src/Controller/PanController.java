package Controller;

import Model.Pan;
import java.util.ArrayList;


public class PanController {

    ArrayList<Pan> ListaPan = new ArrayList();

    Object[][] ListaPanesMtz = new Object[getListaPan().size()][3];


    public void Create(Pan Pan1) {//Crea un tipo de pan - datos en cola
        ListaPan.add(Pan1);
        
    }

    public ArrayList Read(String s) {//Busca leer/buscar
        String Palabra = "";
        ArrayList<Object[]> A = new ArrayList<>();
        A.clear();
        Object[] H = new Object[3];
        for (int i = 0; i < ListaPan.size(); i++) {
            Palabra = "";
            for (int b = 0; b < ListaPan.get(i).getNombreTipo().length(); b++) {
                if (ListaPan.get(i).getNombreTipo().charAt(b) != ' ') {
                    Palabra += ListaPan.get(i).getNombreTipo().charAt(b);
                    if (Palabra.equals(s)) {               
                       A.add(new Object[]{ListaPan.get(i).getNombreTipo(), ""+ListaPan.get(i).getCantidad(), ""+ListaPan.get(i).getPrecio()});
                       break;
                    }

                }else{
                    Palabra = "";
                }
            }
        }
        return A;
    }

    public void Uptade(int index) {//Actualizar o modificar

    }

    public void Delete() {//Eliminar
    }

    public void Listar() {
        ListaPanesMtz = new Object[getListaPan().size()][3];
        
        for (int i = 0; i < getListaPan().size(); i++) {
            ListaPanesMtz[i][0] = getListaPan().get(i).getNombreTipo();
            ListaPanesMtz[i][1] = getListaPan().get(i).getCantidad();
            ListaPanesMtz[i][2] = getListaPan().get(i).getPrecio();
        }

    }

    //Set and get del ArrayList
    public ArrayList<Pan> getListaPan() {
        return ListaPan;
    }

    public void setListaPan(ArrayList<Pan> ListaPan) {
        this.ListaPan = ListaPan;
    }

    public Object[][] getListaPanesMtz() {
        return ListaPanesMtz;
    }

    public void setListaPanesMtz(Object[][] ListaPanesMtz) {
        this.ListaPanesMtz = ListaPanesMtz;
    }
    
}
