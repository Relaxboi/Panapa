
package Model;

public class Proveedor {
    private String sId;
    private String sNombre;
    private String sServicio;
    private String sTelefono;
    private String sDireccion;

    public Proveedor(String sId, String sNombre, String sServicio, String sTelefono, String sDireccion) {
        this.sId = sId;
        this.sNombre = sNombre;
        this.sServicio = sServicio;
        this.sTelefono = sTelefono;
        this.sDireccion = sDireccion;
    }

    public String getsId() {return sId;}

    public void setsId(String sId) {this.sId = sId;}

    public String getsNombre() {return sNombre;}

    public void setsNombre(String sNombre) {this.sNombre = sNombre;}

    public String getsServicio() {return sServicio;}

    public void setsServicio(String sServicio) {this.sServicio = sServicio;}

    public String getsTelefono() {return sTelefono;}

    public void setsTelefono(String sTelefono) {this.sTelefono = sTelefono;}

    public String getsDireccion() {return sDireccion;}

    public void setsDireccion(String sDireccion) {this.sDireccion = sDireccion;}
}
