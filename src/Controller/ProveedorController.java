
package Controller;

import Model.Proveedor;
import java.util.ArrayList;


public class ProveedorController {
    ArrayList<Proveedor> ListaProveedores = new ArrayList();

    Object[][] ListaProveedorMtz = new Object[getListaPan().size()][5];


    public void Create(Proveedor Proveedor) {//Crea un tipo de pan - datos en cola
        ListaProveedores.add(Proveedor);
        
    }

    public void Read(String s) {//Busca leer/buscar
        
    }

    public void Uptade(int index) {//Actualizar o modificar

    }

    public void Delete() {//Eliminar
    }

    public void Listar() {
        ListaProveedorMtz = new Object[getListaPan().size()][3];
        
        for (int i = 0; i < getListaPan().size(); i++) {
            ListaProveedorMtz[i][0] = getListaPan().get(i).getsNombre();
            ListaProveedorMtz[i][1] = getListaPan().get(i).getsServicio();
            ListaProveedorMtz[i][2] = getListaPan().get(i).getsTelefono();
            ListaProveedorMtz[i][3] = getListaPan().get(i).getsDireccion();
        }

    }

    //Set and get del ArrayList
    public ArrayList<Proveedor> getListaPan() {return ListaProveedores;}

    public void setListaPan(ArrayList<Proveedor> ListaPan) {this.ListaProveedores = ListaPan;}

    public Object[][] getListaPanesMtz() {return ListaProveedorMtz;}

    public void setListaPanesMtz(Object[][] ListaProveedorMtz) {this.ListaProveedorMtz = ListaProveedorMtz;}
}
