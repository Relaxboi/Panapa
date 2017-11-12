
package Model;

public class Ventas {
    
    private String sProducto;
    private double iPrecio;
    private int iCantidad;
    private double iGanancias;

    public Ventas(String sProducto, double iPrecio, int iCantidad, double iGanancias) {
        this.sProducto = sProducto;
        this.iPrecio = iPrecio;
        this.iCantidad = iCantidad;
        this.iGanancias = iGanancias;
    }

    public String getsProducto() {
        return sProducto;
    }

    public void setsProducto(String sProducto) {
        this.sProducto = sProducto;
    }

    public double getiPrecio() {
        return iPrecio;
    }

    public void setiPrecio(double iPrecio) {
        this.iPrecio = iPrecio;
    }

    public int getiCantidad() {
        return iCantidad;
    }

    public void setiCantidad(int iCantidad) {
        this.iCantidad = iCantidad;
    }

    public double getiGanancias() {
        return iGanancias;
    }

    public void setiGanancias(double iGanancias) {
        this.iGanancias = iGanancias;
    }
    
    
    
}
