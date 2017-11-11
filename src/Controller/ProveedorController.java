
package Controller;

import Model.Proveedor;
import java.util.ArrayList;


public class ProveedorController {
    ArrayList<Proveedor> ListaProveedores = new ArrayList();
    ArrayList<Object[]> Proveedores = new ArrayList();  


    public void Create(Proveedor Proveedor) {//Crea un nuevo proveedor
        ListaProveedores.add(Proveedor);
        
    }

    public ArrayList Read(String s) {//Busca leer/buscar
        String Palabra = "";
        ArrayList<Object[]> A = new ArrayList<>();
        A.clear();
        for (int i = 0; i < getListaProveedores().size(); i++) {
            Palabra = "";
            for (int b = 0; b < getListaProveedores().get(i).getsNombre().length(); b++) {
                if (getListaProveedores().get(i).getsNombre().charAt(b) != ' ') {
                    Palabra += getListaProveedores().get(i).getsNombre().charAt(b);
                    if (Palabra.equals(s)) {
                        A.add(new Object[]{getListaProveedores().get(i).getsNombre(), getListaProveedores().get(i).getsServicio(), 
                            getListaProveedores().get(i).getsTelefono(),  getListaProveedores().get(i).getsDireccion(), getListaProveedores().get(i).getsId()});
                        break;
                    }

                } else {
                    Palabra = "";
                }
            }
        }
        return A;
    }

    public void Uptade(int index, Proveedor p1) {//Actualizar o modificar
        getListaProveedores().get(index).setsNombre(p1.getsNombre());
        getListaProveedores().get(index).setsServicio(p1.getsServicio());
        getListaProveedores().get(index).setsTelefono(p1.getsTelefono());
        getListaProveedores().get(index).setsDireccion(p1.getsDireccion());
        getListaProveedores().get(index).setsId(p1.getsId());
    }

    public void Delete(int index) {//Eliminar
        getListaProveedores().remove(index);       
    }

    public ArrayList Listar() {
        getProveedores().clear();
        for (int i = 0; i < getListaProveedores().size(); i++) {
            getProveedores().add(new Object[]{getListaProveedores().get(i).getsNombre(), 
                getListaProveedores().get(i).getsServicio(), getListaProveedores().get(i).getsTelefono(), 
                getListaProveedores().get(i).getsDireccion(), getListaProveedores().get(i).getsId()});
        }
        return getProveedores();
    }
    //Set and Get
    public ArrayList<Proveedor> getListaProveedores() {
        return ListaProveedores;
    }

    public void setListaProveedores(ArrayList<Proveedor> ListaProveedores) {
        this.ListaProveedores = ListaProveedores;
    }

    public ArrayList<Object[]> getProveedores() {
        return Proveedores;
    }

    public void setProveedores(ArrayList<Object[]> Proveedores) {
        this.Proveedores = Proveedores;
    }

}
