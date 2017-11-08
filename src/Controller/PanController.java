package Controller;

import Model.Pan;
import java.util.ArrayList;

public class PanController {

    ArrayList<Pan> ListaPan = new ArrayList();

    public void Create(Pan Pan1) {//Crea un tipo de pan - datos en cola
        ListaPan.add(Pan1);
    }

    public void Read(String s) {//Busca leer/buscar
        String Palabra = "";
        for (int i = 0; i < ListaPan.size(); i++) {
            Palabra = "";
            for (int b = 0; b < ListaPan.get(i).getNombreTipo().length(); b++) {
                if (ListaPan.get(i).getNombreTipo().charAt(b) != ' ') {
                    Palabra += ListaPan.get(i).getNombreTipo().charAt(b);
                    if (Palabra.equals(s)) {
                        System.out.println(ListaPan.get(i).getNombreTipo());
                        break;
                    }
                
                }else{
                    Palabra = "";
                }
            }

        }
        for(int i = 0; i < 100; i++){
            System.out.println();
        }

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
