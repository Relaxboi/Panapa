package Controller;

import Model.Pan;
import java.util.ArrayList;

public class PanController {

    ArrayList<Pan> ListaPan = new ArrayList();
<<<<<<< HEAD
=======
    Object[][] ListaPanesMtz = new Object[getListaPan().size()][3];
>>>>>>> 906ec165da5992407200f07a939fbef75ce29488

    public void Create(Pan Pan1) {//Crea un tipo de pan - datos en cola
        ListaPan.add(Pan1);
    }

    public void Read(String s) {//Busca leer/buscar
        

    }

    public void Uptade(int index) {//Actualizar o modificar

    }

    public void Delete() {//Eliminar
    }

<<<<<<< HEAD
=======
    public void Listar() {
        ListaPanesMtz = new Object[getListaPan().size()][3];
        
        for (int i = 0; i < getListaPan().size(); i++) {
            ListaPanesMtz[i][0] = getListaPan().get(i).getNombreTipo();
            ListaPanesMtz[i][1] = getListaPan().get(i).getCantidad();
            ListaPanesMtz[i][2] = getListaPan().get(i).getPrecio();
        }

    }

>>>>>>> 906ec165da5992407200f07a939fbef75ce29488
    //Set and get del ArrayList
    public ArrayList<Pan> getListaPan() {
        return ListaPan;
    }

    public void setListaPan(ArrayList<Pan> ListaPan) {
        this.ListaPan = ListaPan;
    }

<<<<<<< HEAD
=======
    public Object[][] getListaPanesMtz() {
        return ListaPanesMtz;
    }

    public void setListaPanesMtz(Object[][] ListaPanesMtz) {
        this.ListaPanesMtz = ListaPanesMtz;
    }
    
    

>>>>>>> 906ec165da5992407200f07a939fbef75ce29488
}
