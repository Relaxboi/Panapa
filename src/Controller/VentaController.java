
package Controller;

import Model.Ventas;
import java.util.ArrayList;

public class VentaController {
    
    private ArrayList<ArrayList<Ventas>> Compra = new ArrayList();
    
    public void Create(ArrayList<Ventas> Compra){
        
        this.Compra.add(Compra);
        
    }
    
    public void Read(){
        
        
        
    }
    
    public void Listar(){
        
        
        
    }

    public ArrayList<ArrayList<Ventas>> getCompra() {
        return Compra;
    }

    public void setCompra(ArrayList<ArrayList<Ventas>> Compra) {
        this.Compra = Compra;
    }
    
}
