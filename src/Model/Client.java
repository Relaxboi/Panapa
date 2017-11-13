
package Model;

public class Client {
    
    private String sNombre;
    private String sIndentificacion;
    private double iPago;
    private double iTotal;
    private double iDevolucion;

    public Client(String sNombre, String sIndentificacion, double iPago, double iDevolucion, double iTotal) {
        this.sNombre = sNombre;
        this.sIndentificacion = sIndentificacion;
        this.iPago = iPago;
        this.iDevolucion = iDevolucion;
        this.iTotal = iTotal;
    }

    public double getiTotal() {
        return iTotal;
    }

    public String getsNombre() {
        return sNombre;
    }

    public String getsIndentificacion() {
        return sIndentificacion;
    }

    public double getiPago() {
        return iPago;
    }

    public double getiDevolucion() {
        return iDevolucion;
    }
    
   
    
}
