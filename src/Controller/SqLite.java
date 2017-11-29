package Controller;

import Model.*;
import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.ArrayList;

public class SqLite {

    //creamos la variable coneccion
    static java.sql.Statement s;
    static java.sql.ResultSet rs;
    
//metodo para crear la base de datos
    public SqLite() throws Exception {
        File file = new File("Panapa.db");
        if (!file.exists()) {
            file.createNewFile();
            if (file.exists()) {
                Crear();
            }
        }
    }
//metodo para actualizar el arraylist de los productos
    public ArrayList listaProductos() throws Exception {
        s = Conexion().createStatement();
        ArrayList<Producto> Lista = new ArrayList();
        rs = s.executeQuery("select * from PRODUCTOS");
        while (rs.next()) {
            //Recorremos el cursor conforme a las filas 
            Lista.add(new Producto(rs.getString(2), rs.getInt(3), rs.getInt(4), rs.getString(1), rs.getString(5)));
        }
        s.close();
        Conexion().close();
        return Lista;
    }
//metodo para actualizar el arraylist del cliente
    public ArrayList listaCLientes() throws Exception {
        s = Conexion().createStatement();
        ArrayList<Client> Lista = new ArrayList();
        rs = s.executeQuery("select * from CLIENTE");
        while (rs.next()) {
            //Recorremos el cursor conforme a las filas 
            Lista.add(new Client(rs.getString(1), rs.getString(2), rs.getInt(3), rs.getInt(5), rs.getInt(4)));
        }
        s.close();
        Conexion().close();
        return Lista;
    }
//metodo para actualizar el arraylist del proveedores
    public ArrayList listaProveedores() throws Exception {
        s = Conexion().createStatement();
        ArrayList<Proveedor> Lista = new ArrayList();
        rs = s.executeQuery("select * from PROVEEDORES");
        while (rs.next()) {
            //Recorremos el cursor conforme a las filas 
            Lista.add(new Proveedor(rs.getString(1), rs.getString(2), rs.getString(4), rs.getString(3), rs.getString(5)));
        }
        s.close();
        Conexion().close();
        return Lista;
    }
//metodo para actualizar el arraylist del compra
    public ArrayList listaCompra() throws Exception {
        s = Conexion().createStatement();
        ArrayList<Factura> Lista = new ArrayList();
        ArrayList<Producto> Lista1 = new ArrayList();
        boolean V = false, N = false;
        rs = s.executeQuery("select * from COMPRA");
        int i = 0;
        while (rs.next()) {
            if (i == rs.getInt(1)) {
                V = true;
            } else {
                Lista.add(new Factura(Lista1));
                Lista1.clear();
                V = false;
                i++;
            }
            Lista1.add(new Producto(rs.getString(2), rs.getInt(3), rs.getInt(4), rs.getString(5), rs.getString(6), rs.getInt(7)));
            N = true;
        }
        if (N) {
            Lista.add(new Factura(Lista1));
        }
        if (V) {
            Lista.add(new Factura(Lista1));
        }
        s.close();
        Conexion().close();
        return Lista;
    }
//metodo para insertar el arraylist de los productos a la tabla
    public void InsertarProductos(String Id, String Nombre, double Precio, int Cantidad, String Proveedor) throws Exception {
        s = Conexion().createStatement();
        s.execute("insert into PRODUCTOS values ('" + Id + "','" + Nombre + "','" + Precio + "','" + Cantidad + "','" + Proveedor + "')");
        s.close();
        Conexion().close();
        System.err.println("Se almaceno");
    }
//metodo para insertar el arraylist de los clientes a la tabla
    public void InsertarClientes(String Nombre, String Identificacion, double Pago, double Total, double Devolucion) throws Exception {
        s = Conexion().createStatement();
        s.execute("insert into CLIENTE values ('" + Nombre + "','" + Identificacion + "','" + Pago + "','" + Total + "','" + Devolucion + "')");
        s.close();
        Conexion().close();
        System.err.println("Se almaceno");
    }
//metodo para insertar el arraylist de los proveedores a la tabla
    public void InsertarProveedores(String Nit, String Nombre, String Telefono, String Servicio, String Direccion) throws Exception {
        s = Conexion().createStatement();
        s.execute("insert into PROVEEDORES values ('" + Nit + "','" + Nombre + "','" + Telefono + "','" + Servicio + "','" + Direccion + "')");
        s.close();
        Conexion().close();
        System.err.println("Se almaceno");
    }
//metodo para insertar el arraylist de los compra a la tabla
    public void InsertarCompra(int NCompra, String Nombre, double Precio, int Cantidad, String Id, String Proveedor, double Ganancia) throws Exception {
        s = Conexion().createStatement();
        s.execute("insert into COMPRA values ('" + NCompra + "','" + Nombre + "','" + Precio + "','" + Cantidad + "','" + Id + "','" + Proveedor + "','" + Ganancia + "')");
        s.close();
        Conexion().close();
        System.err.println("Se almaceno");
    }
//metodo para eliminar tabla
    public void EliminarTabla(String Tabla) throws Exception {
        s = Conexion().createStatement();
        s.execute("delete from " + Tabla);
        s.close();
        Conexion().close();
    }
//metodo para crear tablas
    private void Crear() throws Exception {
        s = Conexion().createStatement();
        s.execute("CREATE TABLE `CLIENTE` (\n"
                + "	`NOMBRE`	TEXT NOT NULL,\n"
                + "	`IDENTIFICACION`	TEXT NOT NULL,\n"
                + "	`PAGO`	INTEGER NOT NULL,\n"
                + "	`TOTAL`	INTEGER NOT NULL,\n"
                + "	`DEVOLUCION`	INTEGER NOT NULL\n"
                + ")");
        s.execute("CREATE TABLE `COMPRA` (\n"
                + "	`NCOMPRA`	INTEGER NOT NULL,\n"
                + "	`NOMBRE`	TEXT NOT NULL,\n"
                + "	`PRECIO`	INTEGER NOT NULL,\n"
                + "	`CANTIDAD`	INTEGER NOT NULL,\n"
                + "	`ID`	TEXT NOT NULL,\n"
                + "	`PROVEEDOR`	TEXT NOT NULL,\n"
                + "	`GANANCIA`	INTEGER NOT NULL\n"
                + ")");
        s.execute("CREATE TABLE `PRODUCTOS` (\n"
                + "	`ID`	TEXT NOT NULL,\n"
                + "	`NOMBRE`	TEXT NOT NULL,\n"
                + "	`PRECIO`	INTEGER NOT NULL,\n"
                + "	`CANTIDAD`	INTEGER NOT NULL,\n"
                + "	`PROVEEDOR`	TEXT NOT NULL\n"
                + ")");
        s.execute("CREATE TABLE `PROVEEDORES` (\n"
                + "	`NIT`	TEXT NOT NULL UNIQUE,\n"
                + "	`NOMBRE`	TEXT NOT NULL,\n"
                + "	`TELEFONO`	TEXT NOT NULL,\n"
                + "	`SERVICIO`	TEXT NOT NULL,\n"
                + "	`DIRECCION`	TEXT NOT NULL,\n"
                + "	PRIMARY KEY(`NIT`)\n"
                + ")");
        s.close();
        Conexion().close();
    }
//metodo para hacer la conexion
    protected Connection Conexion() throws Exception {
        Connection cn;
        //ruta de la base de datos la cual crearemos
        Class.forName("org.sqlite.JDBC");
        cn = DriverManager.getConnection("jdbc:sqlite:Panapa.db");
        if (cn != null) {
            System.out.println("Conectado");
        }
        return cn;
    }
}
