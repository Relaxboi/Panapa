
package Controller;

import Model.Producto;
import java.util.ArrayList;

public class VentaController {
    
    private ArrayList<ArrayList<Producto>> Compra = new ArrayList();
    private ArrayList<Producto> CompraLista = new ArrayList();
    
    public void Create(ArrayList<Producto> Compra){
        
        this.Compra.add(Compra);
        
    }
    
    public void Create(Producto Compra){
        
        this.CompraLista.add(Compra);
        
    }
    
    public void Read(){
        
        
        
    }
    
    public void Listar(){
        
        
        
    }
    
    public ArrayList ListarVenta(){
        ArrayList<Object[]> Compra = new ArrayList();
        
        for(int i = 0; i < CompraLista.size(); i++){
            
            Compra.add(new Object[]{CompraLista.get(i).getNombreTipo(), CompraLista.get(i).getCantidad(), CompraLista.get(i).getPrecio()});
            
        }
        
        return Compra;
    }

    public void RemoveCompra(int Index){
        
        CompraLista.remove(Index);
        
    }

    public ArrayList<Producto> getCompraLista() {
        return CompraLista;
    }

    public void setCompraLista(ArrayList<Producto> CompraLista) {
        this.CompraLista = CompraLista;
    }
    
    
}
