package Controller;

import Model.Pan;
import java.util.ArrayList;

public class PanController {

    ArrayList<Pan> ListaPan = new ArrayList();

    public void Create(Pan Pan1) {//Crea un tipo de pan - datos en cola
        ListaPan.add(Pan1);
    }

    public void Read(String s) {//Busca leer/buscar
        

    }

    public void Uptade() {//Actualizar o modificar
    }

    public void Delete() {//Eliminar
    }

    //Set and get del ArrayList
    public ArrayList<Pan> getListaPan() {
        return ListaPan;
    }

    public void setListaPan(ArrayList<Pan> ListaPan) {
        this.ListaPan = ListaPan;
    }

}
