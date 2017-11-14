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

    public ArrayList Read(String s) {
        String Palabra = "";
        ArrayList<Object[]> A = new ArrayList<>();
        A.clear();
        int cantidad = 0;
        for (int i = 0; i < Cliente.size(); i++) {
            Palabra = "";
            cantidad = 0;
            for (int h = 0; h < this.Compra.get(i).getFactura().size(); h++) {
                    cantidad += this.Compra.get(i).getFactura().get(h).getCantidad();
                }
            for (int b = 0; b < Cliente.get(i).getsNombre().length(); b++) {              
                if (Cliente.get(i).getsNombre().charAt(b) != ' ') {
                    Palabra += Cliente.get(i).getsNombre().charAt(b);
                    if (Palabra.equals(s)) {
                        A.add(new Object[]{Cliente.get(i).getsNombre(), Cliente.get(i).getsIndentificacion(), cantidad,
                            Cliente.get(i).getiTotal(), Cliente.get(i).getiPago(), Cliente.get(i).getiDevolucion()});
                        break;
                    }

                } else {
                    Palabra = "";
                }
            }
        }
        return A;
    }

    public ArrayList ListarTablaProducto(int Index) {

        ArrayList<Object[]> Compra = new ArrayList();
        double ganan = 0;
        int cantidad = 0;
        int pos = -1;
        boolean V = true;
        ArrayList<Integer> posicion = new ArrayList();
        for (int i = 0; i < this.Compra.get(Index).getFactura().size(); i++) {
            for (int h = 0; h < posicion.size(); h++) {
                if (i == posicion.get(h)) {
                    pos = i;
                    break;
                }
            }
            if (pos == i) {
                continue;

            }
            for (int b = 0; b < this.Compra.get(Index).getFactura().size(); b++) {
                if (this.Compra.get(Index).getFactura().get(i).getNombreTipo().equals(this.Compra.get(Index).getFactura().get(b).getNombreTipo())) {
                    ganan += this.Compra.get(Index).getFactura().get(b).getiGanancias();
                    cantidad += this.Compra.get(Index).getFactura().get(b).getCantidad();
                    V = false;
                    posicion.add(b);
                }
            }
            if (V) {
                Compra.add(new Object[]{this.Compra.get(Index).getFactura().get(i).getNombreTipo(),
                    this.Compra.get(Index).getFactura().get(i).getCantidad(), this.Compra.get(Index).getFactura().get(i).getiGanancias()});
            } else {
                Compra.add(new Object[]{this.Compra.get(Index).getFactura().get(i).getNombreTipo(),
                    cantidad, ganan});
            }
            V = true;
            ganan = 0;
            cantidad = 0;
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

    public void RemoveVenta(int Index) {

        Cliente.remove(Index);
        Compra.remove(Index);

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
