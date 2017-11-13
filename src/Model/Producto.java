//Intanciando el pan
package Model;

public class Producto {

    private String nombreTipo;
    private int precio;
    private int cantidad;
    private String id;
    private String sProveedor;
    private double iGanancias;

    //Constructores - Sobrecarga
    public Producto(String nombreTipo, int precio, int cantidad, String id) {
        this.nombreTipo = nombreTipo;
        this.precio = precio;
        this.cantidad = cantidad;
        this.id = id;
    }

    public Producto() {
    }

    public Producto(String nombreTipo, int precio, int cantidad, String id, String sProveedor, double iGanancias) {
        this.nombreTipo = nombreTipo;
        this.precio = precio;
        this.cantidad = cantidad;
        this.id = id;
        this.sProveedor = sProveedor;
        this.iGanancias = iGanancias;
    }

    public Producto(String nombreTipo, int precio, int cantidad, String id, String sProveedor) {
        this.nombreTipo = nombreTipo;
        this.precio = precio;
        this.cantidad = cantidad;
        this.id = id;
        this.sProveedor = sProveedor;
    }

    public double getiGanancias() {
        return iGanancias;
    }

    public void setiGanancias(double iGanancias) {
        this.iGanancias = iGanancias;
    }

    public String getsProveedor() {
        return sProveedor;
    }

    public void setsProveedor(String sProveedor) {
        this.sProveedor = sProveedor;
    }

    public String getNombreTipo() {
        return nombreTipo;
    }

    //Set and get 
    public void setNombreTipo(String nombreTipo) {
        this.nombreTipo = nombreTipo;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

}
