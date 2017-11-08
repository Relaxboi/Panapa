package Controller;

import Model.Pan;
import java.util.ArrayList;

public class PanController {

    ArrayList<Pan> ListaPan = new ArrayList();
    Object[][] ListaPanesMtz = new Object[getListaPan().size()][3];

    public void Create(Pan Pan1) {//Crea un tipo de pan - datos en cola
        ListaPan.add(Pan1);
    }

    public void Read() {//Busca leer/buscar

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
