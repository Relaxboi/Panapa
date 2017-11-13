package Controller;

import Model.*;
import java.util.ArrayList;

public class FacturaController {

    private ArrayList<Factura> Compra = new ArrayList();
    private ArrayList<Producto> CompraLista = new ArrayList();
    private ArrayList<Client> Cliente = new ArrayList();

    public void Create(Factura Compra) {

        this.Compra.add(Compra);

    }

    public void Create(Producto Compra) {

        this.CompraLista.add(Compra);

    }

    public void Create(Client C1) {

        this.Cliente.add(C1);

    }

    public void Read() {

    }

    public ArrayList ListarTablaProducto(int Index) {
        
        ArrayList<Object[]> Compra = new ArrayList();

        for (int i = 0; i < this.Compra.get(Index).getFactura().size(); i++) {

            Compra.add(new Object[]{this.Compra.get(Index).getFactura().get(i).getNombreTipo(), 
                this.Compra.get(Index).getFactura().get(i).getCantidad(), this.Compra.get(Index).getFactura().get(i).getiGanancias()});

        }

        return Compra;
        

    }

    public ArrayList ListarVenta() {
        ArrayList<Object[]> Compra = new ArrayList();

        for (int i = 0; i < CompraLista.size(); i++) {

            Compra.add(new Object[]{CompraLista.get(i).getNombreTipo(), CompraLista.get(i).getCantidad(), CompraLista.get(i).getiGanancias()});

        }

        return Compra;
    }

    public ArrayList ListarCliente() {
        ArrayList<Object[]> Compra = new ArrayList();
        int cantidad = 0;
        for (int b = 0; b < Cliente.size(); b++) {
            for (int i = 0; i < this.Compra.get(b).getFactura().size(); i++) {
                cantidad += this.Compra.get(b).getFactura().get(i).getCantidad();
            }
            Compra.add(new Object[]{Cliente.get(b).getsNombre(), Cliente.get(b).getsIndentificacion(), cantidad,
                Cliente.get(b).getiTotal(), Cliente.get(b).getiPago(), Cliente.get(b).getiDevolucion()});

            cantidad = 0;
        }
        return Compra;
    }

    public void RemoveCompra(int Index) {

        CompraLista.remove(Index);

    }

    public ArrayList<Producto> getCompraLista() {
        return CompraLista;
    }

    public void setCompraLista(ArrayList<Producto> CompraLista) {
        this.CompraLista = CompraLista;
    }

    public ArrayList<Factura> getCompra() {
        return Compra;
    }

    public void setCompra(ArrayList<Factura> Compra) {
        this.Compra = Compra;
    }

    public ArrayList<Client> getCliente() {
        return Cliente;
    }
    

}
