
package Model;

import java.util.ArrayList;

public class Factura {
    
    ArrayList<Producto> Factura = new ArrayList();

    public Factura(ArrayList<Producto> P1) {
        
       Factura = (ArrayList<Producto>) P1.clone();
        
    }

    public ArrayList<Producto> getFactura() {
        return Factura;
    }

    public void setFactura(ArrayList<Producto> Factura) {
        this.Factura = Factura;
    }  
    
}
