//Intanciando el pan
package Model;

public class Pan {
    
    private String nombreTipo;
    private int precio;
    private int cantidad;
    private String id;
    
    //Constructores - Sobrecarga
    public Pan(String nombreTipo, int precio, int cantidad, String id){
        this.nombreTipo = nombreTipo;
        this.precio = precio;
    }
    public Pan(){}

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
