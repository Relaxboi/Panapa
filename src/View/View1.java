package View;

import Controller.*;
import Model.*;
import java.awt.HeadlessException;
import java.util.ArrayList;
import javax.swing.JCheckBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class View1 extends javax.swing.JFrame {

    private DefaultTableModel Consulta;
    //instancia de los modelos
    private ProductoController paco = new ProductoController();
    private ProveedorController Proveedor = new ProveedorController();
    private FacturaController Compra = new FacturaController();
    //Indice
    private Object indexMod_tbl = null;
    private Object indexElim_tbl = null;
    private Object indexModProv_tbl = null;
    private Object indexProdConsult_tbl = null;
    private Object indexProdVenta_tbl = null;
    private double total = 0;
    //PACO es instanciar al PanController 

    public View1() {
        initComponents();
        setResizable(false);
        setLocationRelativeTo(null);
        IconosPanel();
        ComboBox();
    }

    public void IconosPanel() {//ICONOS
        //Productos
        Panel_General.setIconAt(0, new javax.swing.ImageIcon(getClass().getResource("/Icons/groceries.png")));
        //Proveedores
        Panel_General.setIconAt(1, new javax.swing.ImageIcon(getClass().getResource("/Icons/packing.png")));
        //Ventas
        Panel_General.setIconAt(2, new javax.swing.ImageIcon(getClass().getResource("/Icons/cart.png")));
        //Estadisticas
        Panel_General.setIconAt(3, new javax.swing.ImageIcon(getClass().getResource("/Icons/estadisticas.png")));

        //Prod_Registrar
        Productos.setIconAt(0, new javax.swing.ImageIcon(getClass().getResource("/Icons/cash-register_2.png")));
        //Prod_Modificar
        Productos.setIconAt(1, new javax.swing.ImageIcon(getClass().getResource("/Icons/editar.png")));
        //Prod_Consultar
        Productos.setIconAt(2, new javax.swing.ImageIcon(getClass().getResource("/Icons/buscar.png")));
        //Prod_Eliminar
        Productos.setIconAt(3, new javax.swing.ImageIcon(getClass().getResource("/Icons/eliminar.png")));

        //Prov_Registrar
        Proveedores.setIconAt(0, new javax.swing.ImageIcon(getClass().getResource("/Icons/cash-register_2.png")));
        //Prov_Modificar
        Proveedores.setIconAt(1, new javax.swing.ImageIcon(getClass().getResource("/Icons/editar.png")));
        //Prov_Consultar
        Proveedores.setIconAt(2, new javax.swing.ImageIcon(getClass().getResource("/Icons/buscar.png")));
        //Prov_Modificar
        Proveedores.setIconAt(3, new javax.swing.ImageIcon(getClass().getResource("/Icons/eliminar.png")));

        listaProdVenta_tbl.getColumnModel().getColumn(0).setPreferredWidth(150);

    }

//obj
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jToolBar1 = new javax.swing.JToolBar();
        Panel_General = new javax.swing.JTabbedPane();
        Productos = new javax.swing.JTabbedPane();
        Registrar_Producto = new javax.swing.JPanel();
        nombrePanReg_txt = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        cantidadPanReg_txt = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        precioPanReg_txt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaPanesReg_tbl = new javax.swing.JTable();
        registrarPan_btn = new javax.swing.JButton();
        provePanReg_cmbx = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        Modificar_Producto = new javax.swing.JPanel();
        GuardarEditPan_btn = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        listaPanesEdit_tbl = new javax.swing.JTable();
        cantidadPanEdit_txt = new javax.swing.JTextField();
        precioPanEdit_txt = new javax.swing.JTextField();
        nombrePanEdit_txt = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        selecEditPan_chbx = new javax.swing.JCheckBox();
        nombrePanConsultEdit_txt = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        consultPanEdit_btn = new javax.swing.JButton();
        EditPan_btn = new javax.swing.JButton();
        cancelarEditPan_btn = new javax.swing.JButton();
        Consultar_Producto = new javax.swing.JPanel();
        selecConsultPan_chbx = new javax.swing.JCheckBox();
        jLabel8 = new javax.swing.JLabel();
        nombrePanConsult_txt = new javax.swing.JTextField();
        consultPan_btn = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        listaPanesConsult_tbl = new javax.swing.JTable();
        Eliminar_Producto = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        listaPanesEliminar_tbl = new javax.swing.JTable();
        nombrePanEliminar_txt = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        selecPanEliminar_chbx = new javax.swing.JCheckBox();
        eliminarPan_btn = new javax.swing.JButton();
        consultPanEliminar_btn = new javax.swing.JButton();
        Proveedores = new javax.swing.JTabbedPane();
        Registrar_Proveedores = new javax.swing.JPanel();
        nombreProvReg_txt = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        listaProveedorReg_tbl = new javax.swing.JTable();
        registrarProv_btn = new javax.swing.JButton();
        serviProvReg_txt = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        telefonoProvReg_txt = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        direcProvReg_txt = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        nitProvReg_txt = new javax.swing.JTextField();
        Modificar_Proveedores = new javax.swing.JPanel();
        selecEditProv_chbx = new javax.swing.JCheckBox();
        nombreProvConsultEdit_txt = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        listaProveedoresEdit_tbl = new javax.swing.JTable();
        nombreProvEdit_txt = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        serviProvEdit_txt = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        direcProvEdit_txt = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        telefonoProvEdit_txt = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        nitProvEdit_txt = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        consultProvEdit_btn = new javax.swing.JButton();
        EditProv_btn = new javax.swing.JButton();
        GuardarEditProv_btn = new javax.swing.JButton();
        cancelarEditProv_btn = new javax.swing.JButton();
        Consultar_Proveedores = new javax.swing.JPanel();
        selecConsultProv_chbx = new javax.swing.JCheckBox();
        jLabel17 = new javax.swing.JLabel();
        nombreProvConsult_txt = new javax.swing.JTextField();
        consultProv_btn = new javax.swing.JButton();
        jScrollPane7 = new javax.swing.JScrollPane();
        listaProvConsult_tbl = new javax.swing.JTable();
        Eliminar_Proveedores = new javax.swing.JPanel();
        nombreEliminarProv_txt = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        selecEliminarProv_chbx = new javax.swing.JCheckBox();
        EliminarProv_btn = new javax.swing.JButton();
        jScrollPane8 = new javax.swing.JScrollPane();
        listaProvEliminar_tbl = new javax.swing.JTable();
        consultProvEliminar_btn = new javax.swing.JButton();
        Ventas = new javax.swing.JPanel();
        jScrollPane10 = new javax.swing.JScrollPane();
        listaProdVenta_tbl = new javax.swing.JTable();
        selecProdConsultVenta_chbx = new javax.swing.JCheckBox();
        jLabel12 = new javax.swing.JLabel();
        nombrePanConsultVenta_txt = new javax.swing.JTextField();
        consultPanVenta_btn = new javax.swing.JButton();
        jScrollPane11 = new javax.swing.JScrollPane();
        listaProdConsultVentas_tbl = new javax.swing.JTable();
        jLabel13 = new javax.swing.JLabel();
        nombreProdVenta_txt = new javax.swing.JTextField();
        cantidadProdVenta_txt = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        agregarProdVenta_btn = new javax.swing.JButton();
        retirarProdVenta_btn = new javax.swing.JButton();
        selecProdVenta_chbx = new javax.swing.JCheckBox();
        comprarVenta_btn = new javax.swing.JButton();
        cancelarVenta_btn = new javax.swing.JButton();
        nombreClientVenta_txt = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        idClientVenta_txt = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        pagoClientVenta_txt = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
<<<<<<< HEAD
        Estadisticas = new javax.swing.JPanel();
        Contenedor_Stast = new javax.swing.JTabbedPane();
        Historial_ventas = new javax.swing.JPanel();
        jScrollPane12 = new javax.swing.JScrollPane();
        listaProdVenta_tbl1 = new javax.swing.JTable();
        jScrollPane13 = new javax.swing.JScrollPane();
        listaProdVenta_tbl2 = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        nombrePanConsultEdit_txt1 = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        selecEditPan_chbx1 = new javax.swing.JCheckBox();
        consultPanEdit_btn1 = new javax.swing.JButton();
        Datos_ventas = new javax.swing.JPanel();
=======
        totalProdVenta = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
>>>>>>> 389ce4a62631e225f44ef7ca85f310fee6de0c30

        jButton1.setText("jButton1");

        jToolBar1.setRollover(true);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Productos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Actualizar_panel(evt);
            }
        });

        jLabel1.setText("Nombre del Tipo de Producto : ");

        jLabel2.setText("Cantidad : ");

        jLabel3.setText("Precio : ");

        listaPanesReg_tbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Cantidad", "Precio"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(listaPanesReg_tbl);
        if (listaPanesReg_tbl.getColumnModel().getColumnCount() > 0) {
            listaPanesReg_tbl.getColumnModel().getColumn(0).setResizable(false);
            listaPanesReg_tbl.getColumnModel().getColumn(1).setResizable(false);
            listaPanesReg_tbl.getColumnModel().getColumn(2).setResizable(false);
        }

        registrarPan_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/guardar.png"))); // NOI18N
        registrarPan_btn.setText("Registrar");
        registrarPan_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarPan(evt);
            }
        });

        provePanReg_cmbx.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel11.setText("Proveedor:");

        javax.swing.GroupLayout Registrar_ProductoLayout = new javax.swing.GroupLayout(Registrar_Producto);
        Registrar_Producto.setLayout(Registrar_ProductoLayout);
        Registrar_ProductoLayout.setHorizontalGroup(
            Registrar_ProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Registrar_ProductoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Registrar_ProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 649, Short.MAX_VALUE)
                    .addGroup(Registrar_ProductoLayout.createSequentialGroup()
                        .addGroup(Registrar_ProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(nombrePanReg_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(Registrar_ProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Registrar_ProductoLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(precioPanReg_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(Registrar_ProductoLayout.createSequentialGroup()
                                .addGap(48, 48, 48)
                                .addComponent(jLabel3)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(Registrar_ProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Registrar_ProductoLayout.createSequentialGroup()
                                .addComponent(cantidadPanReg_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(provePanReg_cmbx, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(Registrar_ProductoLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel11)
                                .addGap(66, 66, 66)))
                        .addComponent(registrarPan_btn)))
                .addGap(15, 15, 15))
        );
        Registrar_ProductoLayout.setVerticalGroup(
            Registrar_ProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Registrar_ProductoLayout.createSequentialGroup()
                .addGroup(Registrar_ProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Registrar_ProductoLayout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(Registrar_ProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(registrarPan_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(provePanReg_cmbx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(Registrar_ProductoLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(Registrar_ProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(Registrar_ProductoLayout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(precioPanReg_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(Registrar_ProductoLayout.createSequentialGroup()
                                .addGroup(Registrar_ProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(Registrar_ProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel11))
                                    .addComponent(jLabel1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(Registrar_ProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(cantidadPanReg_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(nombrePanReg_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 328, Short.MAX_VALUE))
        );

        Productos.addTab("Registrar Producto", Registrar_Producto);

        GuardarEditPan_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/guardar.png"))); // NOI18N
        GuardarEditPan_btn.setText("Guardar");
        GuardarEditPan_btn.setEnabled(false);
        GuardarEditPan_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarPan(evt);
            }
        });

        listaPanesEdit_tbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Cantidad", "Precio"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        listaPanesEdit_tbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                selecProdModif_tbl(evt);
            }
        });
        jScrollPane2.setViewportView(listaPanesEdit_tbl);
        if (listaPanesEdit_tbl.getColumnModel().getColumnCount() > 0) {
            listaPanesEdit_tbl.getColumnModel().getColumn(0).setResizable(false);
            listaPanesEdit_tbl.getColumnModel().getColumn(1).setResizable(false);
            listaPanesEdit_tbl.getColumnModel().getColumn(2).setResizable(false);
        }

        cantidadPanEdit_txt.setEnabled(false);

        precioPanEdit_txt.setEnabled(false);

        nombrePanEdit_txt.setEnabled(false);

        jLabel4.setText("Nuevo Nombre :  ");

        jLabel5.setText("Nuevo Precio : ");

        jLabel6.setText("Nueva Cantidad :");

        selecEditPan_chbx.setText("Seleccionado");
        selecEditPan_chbx.setEnabled(false);

        jLabel7.setText("Buscar :");

        consultPanEdit_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/buscar.png"))); // NOI18N
        consultPanEdit_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultPanEdit_btnActionPerformed(evt);
            }
        });

        EditPan_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/editar.png"))); // NOI18N
        EditPan_btn.setText("Modificar");
        EditPan_btn.setEnabled(false);
        EditPan_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditPan_btnActionPerformed(evt);
            }
        });

        cancelarEditPan_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/cancelar.png"))); // NOI18N
        cancelarEditPan_btn.setText("Cancelar");
        cancelarEditPan_btn.setEnabled(false);
        cancelarEditPan_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarEditPan_btnmodificarPan(evt);
            }
        });

        javax.swing.GroupLayout Modificar_ProductoLayout = new javax.swing.GroupLayout(Modificar_Producto);
        Modificar_Producto.setLayout(Modificar_ProductoLayout);
        Modificar_ProductoLayout.setHorizontalGroup(
            Modificar_ProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Modificar_ProductoLayout.createSequentialGroup()
                .addGroup(Modificar_ProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Modificar_ProductoLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(selecEditPan_chbx)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel7)
                        .addGap(12, 12, 12)
                        .addComponent(nombrePanConsultEdit_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(consultPanEdit_btn))
                    .addGroup(Modificar_ProductoLayout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(Modificar_ProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nombrePanEdit_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(Modificar_ProductoLayout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addComponent(jLabel4)))
                        .addGroup(Modificar_ProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Modificar_ProductoLayout.createSequentialGroup()
                                .addGap(39, 39, 39)
                                .addComponent(jLabel5))
                            .addGroup(Modificar_ProductoLayout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addComponent(precioPanEdit_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(12, 12, 12)
                        .addGroup(Modificar_ProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cantidadPanEdit_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(Modificar_ProductoLayout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(jLabel6)))))
                .addGap(54, 54, 54)
                .addGroup(Modificar_ProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(EditPan_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(GuardarEditPan_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cancelarEditPan_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39))
            .addGroup(Modificar_ProductoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 659, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Modificar_ProductoLayout.setVerticalGroup(
            Modificar_ProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Modificar_ProductoLayout.createSequentialGroup()
                .addGroup(Modificar_ProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Modificar_ProductoLayout.createSequentialGroup()
                        .addGroup(Modificar_ProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, Modificar_ProductoLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(EditPan_btn)
                                .addGap(5, 5, 5)
                                .addComponent(GuardarEditPan_btn)))
                        .addGap(5, 5, 5)
                        .addGroup(Modificar_ProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cantidadPanEdit_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cancelarEditPan_btn)))
                    .addGroup(Modificar_ProductoLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(Modificar_ProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(consultPanEdit_btn)
                            .addGroup(Modificar_ProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(selecEditPan_chbx)
                                .addComponent(nombrePanConsultEdit_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel7)))
                        .addGap(23, 23, 23)
                        .addGroup(Modificar_ProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(Modificar_ProductoLayout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(nombrePanEdit_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(Modificar_ProductoLayout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(precioPanEdit_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 311, Short.MAX_VALUE)
                .addContainerGap())
        );

        Productos.addTab("Modificar Producto", Modificar_Producto);

        selecConsultPan_chbx.setText("Seleccionado");
        selecConsultPan_chbx.setEnabled(false);

        jLabel8.setText("Buscar :");

        nombrePanConsult_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombrePanConsult_txtActionPerformed(evt);
            }
        });

        consultPan_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/buscar.png"))); // NOI18N
        consultPan_btn.setText("Consultar");
        consultPan_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultPan_btn(evt);
            }
        });

        listaPanesConsult_tbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Cantidad", "Precio"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        listaPanesConsult_tbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listaPanesConsult_tblMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(listaPanesConsult_tbl);
        if (listaPanesConsult_tbl.getColumnModel().getColumnCount() > 0) {
            listaPanesConsult_tbl.getColumnModel().getColumn(0).setResizable(false);
            listaPanesConsult_tbl.getColumnModel().getColumn(1).setResizable(false);
            listaPanesConsult_tbl.getColumnModel().getColumn(2).setResizable(false);
        }

        javax.swing.GroupLayout Consultar_ProductoLayout = new javax.swing.GroupLayout(Consultar_Producto);
        Consultar_Producto.setLayout(Consultar_ProductoLayout);
        Consultar_ProductoLayout.setHorizontalGroup(
            Consultar_ProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Consultar_ProductoLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(selecConsultPan_chbx)
                .addGap(29, 29, 29)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nombrePanConsult_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addComponent(consultPan_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(Consultar_ProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Consultar_ProductoLayout.createSequentialGroup()
                    .addGap(13, 13, 13)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 649, Short.MAX_VALUE)
                    .addGap(14, 14, 14)))
        );
        Consultar_ProductoLayout.setVerticalGroup(
            Consultar_ProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Consultar_ProductoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Consultar_ProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Consultar_ProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(nombrePanConsult_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel8)
                        .addComponent(selecConsultPan_chbx))
                    .addComponent(consultPan_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(412, Short.MAX_VALUE))
            .addGroup(Consultar_ProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Consultar_ProductoLayout.createSequentialGroup()
                    .addContainerGap(76, Short.MAX_VALUE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
        );

        Productos.addTab("Consultar Producto", Consultar_Producto);

        listaPanesEliminar_tbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Cantidad", "Precio"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        listaPanesEliminar_tbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                selecProdEliminar_tbl(evt);
            }
        });
        jScrollPane4.setViewportView(listaPanesEliminar_tbl);
        if (listaPanesEliminar_tbl.getColumnModel().getColumnCount() > 0) {
            listaPanesEliminar_tbl.getColumnModel().getColumn(0).setResizable(false);
            listaPanesEliminar_tbl.getColumnModel().getColumn(1).setResizable(false);
            listaPanesEliminar_tbl.getColumnModel().getColumn(2).setResizable(false);
        }

        jLabel9.setText("Buscar :");

        selecPanEliminar_chbx.setText("Seleccionado");
        selecPanEliminar_chbx.setEnabled(false);

        eliminarPan_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/eliminar.png"))); // NOI18N
        eliminarPan_btn.setText("Eliminar");
        eliminarPan_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarPan_btnActionPerformed(evt);
            }
        });

        consultPanEliminar_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/buscar.png"))); // NOI18N
        consultPanEliminar_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultPanEliminar_btnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Eliminar_ProductoLayout = new javax.swing.GroupLayout(Eliminar_Producto);
        Eliminar_Producto.setLayout(Eliminar_ProductoLayout);
        Eliminar_ProductoLayout.setHorizontalGroup(
            Eliminar_ProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Eliminar_ProductoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Eliminar_ProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 652, Short.MAX_VALUE)
                    .addGroup(Eliminar_ProductoLayout.createSequentialGroup()
                        .addGap(0, 28, Short.MAX_VALUE)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(Eliminar_ProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(selecPanEliminar_chbx)
                            .addGroup(Eliminar_ProductoLayout.createSequentialGroup()
                                .addComponent(nombrePanEliminar_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(consultPanEliminar_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(44, 44, 44)
                        .addComponent(eliminarPan_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        Eliminar_ProductoLayout.setVerticalGroup(
            Eliminar_ProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Eliminar_ProductoLayout.createSequentialGroup()
                .addGroup(Eliminar_ProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Eliminar_ProductoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(eliminarPan_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Eliminar_ProductoLayout.createSequentialGroup()
                        .addContainerGap(17, Short.MAX_VALUE)
                        .addGroup(Eliminar_ProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Eliminar_ProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel9)
                                .addComponent(nombrePanEliminar_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(consultPanEliminar_btn, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(selecPanEliminar_chbx)
                        .addGap(18, 18, 18)))
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );

        Productos.addTab("Eliminar Producto", Eliminar_Producto);

        Panel_General.addTab("Productos", Productos);

        Proveedores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ProveedoresActualizar_panel(evt);
            }
        });

        jLabel10.setText("Nombre del Proveedor : ");

        listaProveedorReg_tbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Servicio/Producto", "Contacto", "Direccion", "NIT"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane5.setViewportView(listaProveedorReg_tbl);
        if (listaProveedorReg_tbl.getColumnModel().getColumnCount() > 0) {
            listaProveedorReg_tbl.getColumnModel().getColumn(0).setResizable(false);
            listaProveedorReg_tbl.getColumnModel().getColumn(1).setResizable(false);
            listaProveedorReg_tbl.getColumnModel().getColumn(2).setResizable(false);
            listaProveedorReg_tbl.getColumnModel().getColumn(3).setResizable(false);
            listaProveedorReg_tbl.getColumnModel().getColumn(4).setResizable(false);
        }

        registrarProv_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/guardar.png"))); // NOI18N
        registrarProv_btn.setText("Registrar");
        registrarProv_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarProv_btnregistrarPan(evt);
            }
        });

        jLabel19.setText("Producto/Servicio :");

        jLabel20.setText("Telefono :");

        jLabel21.setText("Direccion :");

        jLabel22.setText("NIT :");

        javax.swing.GroupLayout Registrar_ProveedoresLayout = new javax.swing.GroupLayout(Registrar_Proveedores);
        Registrar_Proveedores.setLayout(Registrar_ProveedoresLayout);
        Registrar_ProveedoresLayout.setHorizontalGroup(
            Registrar_ProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Registrar_ProveedoresLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Registrar_ProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Registrar_ProveedoresLayout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(Registrar_ProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(nombreProvReg_txt)
                            .addGroup(Registrar_ProveedoresLayout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addGroup(Registrar_ProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10)
                                    .addGroup(Registrar_ProveedoresLayout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(jLabel19))))
                            .addComponent(serviProvReg_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(Registrar_ProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Registrar_ProveedoresLayout.createSequentialGroup()
                                .addGroup(Registrar_ProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(Registrar_ProveedoresLayout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(Registrar_ProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(telefonoProvReg_txt)
                                            .addComponent(direcProvReg_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(Registrar_ProveedoresLayout.createSequentialGroup()
                                        .addGap(62, 62, 62)
                                        .addComponent(jLabel20)))
                                .addGroup(Registrar_ProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(Registrar_ProveedoresLayout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(nitProvReg_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(Registrar_ProveedoresLayout.createSequentialGroup()
                                        .addGap(62, 62, 62)
                                        .addComponent(jLabel22))))
                            .addGroup(Registrar_ProveedoresLayout.createSequentialGroup()
                                .addGap(60, 60, 60)
                                .addComponent(jLabel21)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                        .addComponent(registrarProv_btn)
                        .addGap(15, 15, 15))
                    .addGroup(Registrar_ProveedoresLayout.createSequentialGroup()
                        .addComponent(jScrollPane5)
                        .addContainerGap())))
        );
        Registrar_ProveedoresLayout.setVerticalGroup(
            Registrar_ProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Registrar_ProveedoresLayout.createSequentialGroup()
                .addGroup(Registrar_ProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Registrar_ProveedoresLayout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(registrarProv_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(Registrar_ProveedoresLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(Registrar_ProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(Registrar_ProveedoresLayout.createSequentialGroup()
                                .addGroup(Registrar_ProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel20))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(nombreProvReg_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel19)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(serviProvReg_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(Registrar_ProveedoresLayout.createSequentialGroup()
                                .addGroup(Registrar_ProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(Registrar_ProveedoresLayout.createSequentialGroup()
                                        .addComponent(jLabel22)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(nitProvReg_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(telefonoProvReg_txt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel21)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(direcProvReg_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 329, Short.MAX_VALUE)
                .addGap(12, 12, 12))
        );

        Proveedores.addTab("Registrar Prooverdor", Registrar_Proveedores);

        selecEditProv_chbx.setText("Seleccionado");
        selecEditProv_chbx.setEnabled(false);

        jLabel16.setText("Buscar :");

        listaProveedoresEdit_tbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Servicio/Producto", "Contacto", "Direccion", "NIT"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        listaProveedoresEdit_tbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listaProveedoresEdit_tblMouseClicked(evt);
            }
        });
        jScrollPane6.setViewportView(listaProveedoresEdit_tbl);
        if (listaProveedoresEdit_tbl.getColumnModel().getColumnCount() > 0) {
            listaProveedoresEdit_tbl.getColumnModel().getColumn(0).setResizable(false);
            listaProveedoresEdit_tbl.getColumnModel().getColumn(1).setResizable(false);
            listaProveedoresEdit_tbl.getColumnModel().getColumn(2).setResizable(false);
            listaProveedoresEdit_tbl.getColumnModel().getColumn(3).setResizable(false);
            listaProveedoresEdit_tbl.getColumnModel().getColumn(4).setResizable(false);
        }

        nombreProvEdit_txt.setEnabled(false);

        jLabel23.setText("Nombre del Proveedor : ");

        serviProvEdit_txt.setEnabled(false);

        jLabel24.setText("Producto/Servicio :");

        direcProvEdit_txt.setEnabled(false);

        jLabel25.setText("Direccion :");

        telefonoProvEdit_txt.setEnabled(false);

        jLabel26.setText("Telefono :");

        nitProvEdit_txt.setEnabled(false);

        jLabel27.setText("NIT :");

        consultProvEdit_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/buscar.png"))); // NOI18N
        consultProvEdit_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultProvEdit_btnActionPerformed(evt);
            }
        });

        EditProv_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/editar.png"))); // NOI18N
        EditProv_btn.setText("Modificar");
        EditProv_btn.setEnabled(false);
        EditProv_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditProv_btnActionPerformed(evt);
            }
        });

        GuardarEditProv_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/guardar.png"))); // NOI18N
        GuardarEditProv_btn.setText("Guardar");
        GuardarEditProv_btn.setEnabled(false);
        GuardarEditProv_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuardarEditProv_btnmodificarPan(evt);
            }
        });

        cancelarEditProv_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/cancelar.png"))); // NOI18N
        cancelarEditProv_btn.setText("Cancelar");
        cancelarEditProv_btn.setEnabled(false);
        cancelarEditProv_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarEditProv_btnmodificarPan(evt);
            }
        });

        javax.swing.GroupLayout Modificar_ProveedoresLayout = new javax.swing.GroupLayout(Modificar_Proveedores);
        Modificar_Proveedores.setLayout(Modificar_ProveedoresLayout);
        Modificar_ProveedoresLayout.setHorizontalGroup(
            Modificar_ProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Modificar_ProveedoresLayout.createSequentialGroup()
                .addGroup(Modificar_ProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Modificar_ProveedoresLayout.createSequentialGroup()
                        .addGroup(Modificar_ProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(Modificar_ProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(Modificar_ProveedoresLayout.createSequentialGroup()
                                    .addGroup(Modificar_ProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(Modificar_ProveedoresLayout.createSequentialGroup()
                                            .addGap(55, 55, 55)
                                            .addComponent(jLabel23))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Modificar_ProveedoresLayout.createSequentialGroup()
                                            .addContainerGap()
                                            .addComponent(nombreProvEdit_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(Modificar_ProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(Modificar_ProveedoresLayout.createSequentialGroup()
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(telefonoProvEdit_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(Modificar_ProveedoresLayout.createSequentialGroup()
                                            .addGap(62, 62, 62)
                                            .addComponent(jLabel26))))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Modificar_ProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(Modificar_ProveedoresLayout.createSequentialGroup()
                                        .addGap(32, 32, 32)
                                        .addComponent(serviProvEdit_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Modificar_ProveedoresLayout.createSequentialGroup()
                                        .addGap(191, 191, 191)
                                        .addComponent(direcProvEdit_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(Modificar_ProveedoresLayout.createSequentialGroup()
                                .addGap(65, 65, 65)
                                .addComponent(jLabel24)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel25)
                                .addGap(45, 45, 45)))
                        .addGap(12, 12, 12)
                        .addGroup(Modificar_ProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nitProvEdit_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Modificar_ProveedoresLayout.createSequentialGroup()
                                .addComponent(jLabel27)
                                .addGap(42, 42, 42)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                        .addGroup(Modificar_ProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(EditProv_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(GuardarEditProv_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cancelarEditProv_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(Modificar_ProveedoresLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 652, Short.MAX_VALUE))
                    .addGroup(Modificar_ProveedoresLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(selecEditProv_chbx)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nombreProvConsultEdit_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(consultProvEdit_btn)))
                .addContainerGap())
        );
        Modificar_ProveedoresLayout.setVerticalGroup(
            Modificar_ProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Modificar_ProveedoresLayout.createSequentialGroup()
                .addGroup(Modificar_ProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Modificar_ProveedoresLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(EditProv_btn)
                        .addGap(5, 5, 5)
                        .addComponent(GuardarEditProv_btn)
                        .addGap(5, 5, 5)
                        .addComponent(cancelarEditProv_btn))
                    .addGroup(Modificar_ProveedoresLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(Modificar_ProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel23)
                            .addComponent(jLabel26))
                        .addGap(41, 41, 41)
                        .addGroup(Modificar_ProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel25)
                            .addComponent(jLabel24))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(Modificar_ProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(serviProvEdit_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(direcProvEdit_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(Modificar_ProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(Modificar_ProveedoresLayout.createSequentialGroup()
                            .addGap(5, 5, 5)
                            .addComponent(jLabel27)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(nitProvEdit_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Modificar_ProveedoresLayout.createSequentialGroup()
                            .addGap(15, 15, 15)
                            .addGroup(Modificar_ProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(telefonoProvEdit_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(nombreProvEdit_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Modificar_ProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Modificar_ProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(nombreProvConsultEdit_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel16)
                        .addComponent(selecEditProv_chbx, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(consultProvEdit_btn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49))
        );

        Proveedores.addTab("Modificar Prooverdor", Modificar_Proveedores);

        selecConsultProv_chbx.setText("Seleccionado");
        selecConsultProv_chbx.setEnabled(false);

        jLabel17.setText("Buscar :");

        nombreProvConsult_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreProvConsult_txtActionPerformed(evt);
            }
        });

        consultProv_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/buscar.png"))); // NOI18N
        consultProv_btn.setText("Consultar");
        consultProv_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultProv_btnActionPerformed(evt);
            }
        });

        listaProvConsult_tbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Servicio/Producto", "Contacto", "Direccion", "NIT"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        listaProvConsult_tbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listaProvConsult_tblMouseClicked(evt);
            }
        });
        jScrollPane7.setViewportView(listaProvConsult_tbl);
        if (listaProvConsult_tbl.getColumnModel().getColumnCount() > 0) {
            listaProvConsult_tbl.getColumnModel().getColumn(0).setResizable(false);
            listaProvConsult_tbl.getColumnModel().getColumn(1).setResizable(false);
            listaProvConsult_tbl.getColumnModel().getColumn(2).setResizable(false);
            listaProvConsult_tbl.getColumnModel().getColumn(3).setResizable(false);
        }

        javax.swing.GroupLayout Consultar_ProveedoresLayout = new javax.swing.GroupLayout(Consultar_Proveedores);
        Consultar_Proveedores.setLayout(Consultar_ProveedoresLayout);
        Consultar_ProveedoresLayout.setHorizontalGroup(
            Consultar_ProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Consultar_ProveedoresLayout.createSequentialGroup()
                .addGroup(Consultar_ProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Consultar_ProveedoresLayout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(selecConsultProv_chbx)
                        .addGap(39, 39, 39)
                        .addComponent(jLabel17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nombreProvConsult_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                        .addComponent(consultProv_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(Consultar_ProveedoresLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane7)))
                .addContainerGap())
        );
        Consultar_ProveedoresLayout.setVerticalGroup(
            Consultar_ProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Consultar_ProveedoresLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Consultar_ProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Consultar_ProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(selecConsultProv_chbx)
                        .addComponent(nombreProvConsult_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel17))
                    .addComponent(consultProv_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 382, Short.MAX_VALUE)
                .addContainerGap())
        );

        Proveedores.addTab("Consultar Prooverdor", Consultar_Proveedores);

        jLabel18.setText("Buscar :");

        selecEliminarProv_chbx.setText("Seleccionado");
        selecEliminarProv_chbx.setEnabled(false);

        EliminarProv_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/eliminar.png"))); // NOI18N
        EliminarProv_btn.setText("Eliminar");
        EliminarProv_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarProv_btnActionPerformed(evt);
            }
        });

        listaProvEliminar_tbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Servicio/Producto", "Contacto", "Direccion", "NIT"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        listaProvEliminar_tbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listaProvEliminar_tblMouseClicked(evt);
            }
        });
        jScrollPane8.setViewportView(listaProvEliminar_tbl);
        if (listaProvEliminar_tbl.getColumnModel().getColumnCount() > 0) {
            listaProvEliminar_tbl.getColumnModel().getColumn(0).setResizable(false);
            listaProvEliminar_tbl.getColumnModel().getColumn(1).setResizable(false);
            listaProvEliminar_tbl.getColumnModel().getColumn(2).setResizable(false);
            listaProvEliminar_tbl.getColumnModel().getColumn(3).setResizable(false);
            listaProvEliminar_tbl.getColumnModel().getColumn(4).setResizable(false);
        }

        consultProvEliminar_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/buscar.png"))); // NOI18N
        consultProvEliminar_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultProvEliminar_btnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Eliminar_ProveedoresLayout = new javax.swing.GroupLayout(Eliminar_Proveedores);
        Eliminar_Proveedores.setLayout(Eliminar_ProveedoresLayout);
        Eliminar_ProveedoresLayout.setHorizontalGroup(
            Eliminar_ProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Eliminar_ProveedoresLayout.createSequentialGroup()
                .addGroup(Eliminar_ProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Eliminar_ProveedoresLayout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(Eliminar_ProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(selecEliminarProv_chbx)
                            .addGroup(Eliminar_ProveedoresLayout.createSequentialGroup()
                                .addComponent(jLabel18)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(nombreEliminarProv_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(consultProvEliminar_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(EliminarProv_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(Eliminar_ProveedoresLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane8, javax.swing.GroupLayout.DEFAULT_SIZE, 652, Short.MAX_VALUE)))
                .addContainerGap())
        );
        Eliminar_ProveedoresLayout.setVerticalGroup(
            Eliminar_ProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Eliminar_ProveedoresLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Eliminar_ProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(EliminarProv_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(consultProvEliminar_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Eliminar_ProveedoresLayout.createSequentialGroup()
                        .addGroup(Eliminar_ProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nombreEliminarProv_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel18))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(selecEliminarProv_chbx)))
                .addGap(19, 19, 19)
                .addComponent(jScrollPane8, javax.swing.GroupLayout.DEFAULT_SIZE, 371, Short.MAX_VALUE)
                .addContainerGap())
        );

        Proveedores.addTab("Eliminar Prooverdor", Eliminar_Proveedores);

        Panel_General.addTab("Proveedores", Proveedores);

        listaProdVenta_tbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Producto", "Cantidad", "SubTotal"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        listaProdVenta_tbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listaProdVenta_tblMouseClicked(evt);
            }
        });
        jScrollPane10.setViewportView(listaProdVenta_tbl);
        if (listaProdVenta_tbl.getColumnModel().getColumnCount() > 0) {
            listaProdVenta_tbl.getColumnModel().getColumn(0).setResizable(false);
            listaProdVenta_tbl.getColumnModel().getColumn(1).setResizable(false);
            listaProdVenta_tbl.getColumnModel().getColumn(2).setResizable(false);
        }

        selecProdConsultVenta_chbx.setText("Seleccionado");
        selecProdConsultVenta_chbx.setEnabled(false);

        jLabel12.setText("Buscar :");

        consultPanVenta_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/buscar.png"))); // NOI18N
        consultPanVenta_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultPanVenta_btnActionPerformed(evt);
            }
        });

        listaProdConsultVentas_tbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Producto", "Cant. Disp.", "Precio"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        listaProdConsultVentas_tbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listaProdConsultVentas_tblMouseClicked(evt);
            }
        });
        jScrollPane11.setViewportView(listaProdConsultVentas_tbl);
        if (listaProdConsultVentas_tbl.getColumnModel().getColumnCount() > 0) {
            listaProdConsultVentas_tbl.getColumnModel().getColumn(0).setResizable(false);
            listaProdConsultVentas_tbl.getColumnModel().getColumn(1).setResizable(false);
            listaProdConsultVentas_tbl.getColumnModel().getColumn(2).setResizable(false);
        }

        jLabel13.setText("Producto :");

        nombreProdVenta_txt.setEnabled(false);

        cantidadProdVenta_txt.setEnabled(false);

        jLabel14.setText("Cantidad :");

        agregarProdVenta_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/cart.png"))); // NOI18N
        agregarProdVenta_btn.setText("Agregar");
        agregarProdVenta_btn.setEnabled(false);
        agregarProdVenta_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarProdVenta_btnActionPerformed(evt);
            }
        });

        retirarProdVenta_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/box.png"))); // NOI18N
        retirarProdVenta_btn.setText("Retirar");
        retirarProdVenta_btn.setEnabled(false);
        retirarProdVenta_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                retirarProdVenta_btnActionPerformed(evt);
            }
        });

        selecProdVenta_chbx.setText("Seleccionado");
        selecProdVenta_chbx.setEnabled(false);

        comprarVenta_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/cash-register.png"))); // NOI18N
        comprarVenta_btn.setText("Comprar");
        comprarVenta_btn.setEnabled(false);
        comprarVenta_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comprarVenta_btnActionPerformed(evt);
            }
        });

        cancelarVenta_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/cancelar.png"))); // NOI18N
        cancelarVenta_btn.setText("Cancelar Compra");
        cancelarVenta_btn.setEnabled(false);
        cancelarVenta_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarVenta_btnActionPerformed(evt);
            }
        });

        nombreClientVenta_txt.setEnabled(false);

        jLabel15.setText("Cliente :");

        idClientVenta_txt.setEnabled(false);

        jLabel28.setText("Identificacion :");

        jLabel29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/network_1.png"))); // NOI18N

        pagoClientVenta_txt.setEnabled(false);

        jLabel30.setText("Dinero Recibido :");

        totalProdVenta.setFont(new java.awt.Font("Footlight MT Light", 0, 18)); // NOI18N
        totalProdVenta.setText("Total de la venta: 0.0");
        totalProdVenta.setEnabled(false);
        totalProdVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalProdVentaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout VentasLayout = new javax.swing.GroupLayout(Ventas);
        Ventas.setLayout(VentasLayout);
        VentasLayout.setHorizontalGroup(
            VentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, VentasLayout.createSequentialGroup()
                .addGroup(VentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(VentasLayout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jLabel12)
                        .addGap(12, 12, 12)
                        .addComponent(nombrePanConsultVenta_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(consultPanVenta_btn))
                    .addGroup(VentasLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(selecProdConsultVenta_chbx)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                .addGroup(VentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, VentasLayout.createSequentialGroup()
                        .addGap(0, 3, Short.MAX_VALUE)
                        .addGroup(VentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, VentasLayout.createSequentialGroup()
                                .addGroup(VentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(nombreProdVenta_txt, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)
                                    .addGroup(VentasLayout.createSequentialGroup()
                                        .addGap(40, 40, 40)
                                        .addComponent(jLabel13))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, VentasLayout.createSequentialGroup()
                                        .addComponent(jLabel15)
                                        .addGap(50, 50, 50))
                                    .addComponent(nombreClientVenta_txt))
                                .addGroup(VentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, VentasLayout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(VentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(VentasLayout.createSequentialGroup()
                                                .addComponent(idClientVenta_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(30, 30, 30)
                                                .addComponent(jLabel29))
                                            .addGroup(VentasLayout.createSequentialGroup()
                                                .addGap(12, 12, 12)
                                                .addComponent(jLabel14)))
                                        .addGap(32, 32, 32))
                                    .addGroup(VentasLayout.createSequentialGroup()
                                        .addGroup(VentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(VentasLayout.createSequentialGroup()
                                                .addGap(8, 8, 8)
                                                .addComponent(cantidadProdVenta_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(agregarProdVenta_btn))
                                            .addGroup(VentasLayout.createSequentialGroup()
                                                .addGap(34, 34, 34)
                                                .addComponent(jLabel28)))
                                        .addGap(12, 12, 12))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, VentasLayout.createSequentialGroup()
                                .addGroup(VentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, VentasLayout.createSequentialGroup()
                                        .addComponent(jLabel30)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(pagoClientVenta_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(comprarVenta_btn))
                                    .addComponent(jScrollPane10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(15, 15, 15))))
                    .addGroup(VentasLayout.createSequentialGroup()
                        .addGroup(VentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(VentasLayout.createSequentialGroup()
                                .addComponent(retirarProdVenta_btn)
                                .addGap(12, 12, 12)
                                .addComponent(selecProdVenta_chbx))
                            .addGroup(VentasLayout.createSequentialGroup()
                                .addComponent(cancelarVenta_btn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(totalProdVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())))
            .addGroup(VentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(VentasLayout.createSequentialGroup()
                    .addGap(22, 22, 22)
                    .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(373, Short.MAX_VALUE)))
        );
        VentasLayout.setVerticalGroup(
            VentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(VentasLayout.createSequentialGroup()
                .addGroup(VentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, VentasLayout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(VentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(consultPanVenta_btn)
                            .addGroup(VentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(nombrePanConsultVenta_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel12)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(selecProdConsultVenta_chbx))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, VentasLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(VentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel28)
                            .addComponent(jLabel15))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(VentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(VentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(idClientVenta_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(nombreClientVenta_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel29))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(VentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(jLabel14))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(VentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nombreProdVenta_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cantidadProdVenta_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(agregarProdVenta_btn))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(VentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(retirarProdVenta_btn)
                    .addComponent(selecProdVenta_chbx))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(VentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comprarVenta_btn)
                    .addComponent(pagoClientVenta_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel30))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(VentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancelarVenta_btn)
                    .addComponent(totalProdVenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addGroup(VentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, VentasLayout.createSequentialGroup()
                    .addContainerGap(104, Short.MAX_VALUE)
                    .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(24, 24, 24)))
        );

        Panel_General.addTab("Ventas", Ventas);

        listaProdVenta_tbl1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cliente", "Identificacion", "N# de Productos", "Total Pagado", "Dinero Entregado", "Dinero Devuelto"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane12.setViewportView(listaProdVenta_tbl1);
        if (listaProdVenta_tbl1.getColumnModel().getColumnCount() > 0) {
            listaProdVenta_tbl1.getColumnModel().getColumn(0).setResizable(false);
            listaProdVenta_tbl1.getColumnModel().getColumn(1).setResizable(false);
            listaProdVenta_tbl1.getColumnModel().getColumn(2).setResizable(false);
            listaProdVenta_tbl1.getColumnModel().getColumn(3).setResizable(false);
            listaProdVenta_tbl1.getColumnModel().getColumn(4).setResizable(false);
            listaProdVenta_tbl1.getColumnModel().getColumn(5).setResizable(false);
        }

        listaProdVenta_tbl2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Producto", "Cantidad", "SubTotal"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane13.setViewportView(listaProdVenta_tbl2);
        if (listaProdVenta_tbl2.getColumnModel().getColumnCount() > 0) {
            listaProdVenta_tbl2.getColumnModel().getColumn(0).setResizable(false);
            listaProdVenta_tbl2.getColumnModel().getColumn(1).setResizable(false);
            listaProdVenta_tbl2.getColumnModel().getColumn(2).setResizable(false);
        }

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/eliminar.png"))); // NOI18N
        jButton2.setText("Eliminar Compra");

        jLabel31.setText("Buscar :");

        selecEditPan_chbx1.setText("Seleccionado");
        selecEditPan_chbx1.setEnabled(false);

        consultPanEdit_btn1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/buscar.png"))); // NOI18N
        consultPanEdit_btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultPanEdit_btn1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Historial_ventasLayout = new javax.swing.GroupLayout(Historial_ventas);
        Historial_ventas.setLayout(Historial_ventasLayout);
        Historial_ventasLayout.setHorizontalGroup(
            Historial_ventasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Historial_ventasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Historial_ventasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane12)
                    .addGroup(Historial_ventasLayout.createSequentialGroup()
                        .addComponent(jScrollPane13, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(Historial_ventasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Historial_ventasLayout.createSequentialGroup()
                                .addComponent(jLabel31)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(nombrePanConsultEdit_txt1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(consultPanEdit_btn1))
                            .addGroup(Historial_ventasLayout.createSequentialGroup()
                                .addComponent(selecEditPan_chbx1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                                .addComponent(jButton2)))))
                .addContainerGap())
        );
        Historial_ventasLayout.setVerticalGroup(
            Historial_ventasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Historial_ventasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane12, javax.swing.GroupLayout.DEFAULT_SIZE, 227, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Historial_ventasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane13, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(Historial_ventasLayout.createSequentialGroup()
                        .addGroup(Historial_ventasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(consultPanEdit_btn1)
                            .addGroup(Historial_ventasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(nombrePanConsultEdit_txt1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel31)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(Historial_ventasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton2)
                            .addComponent(selecEditPan_chbx1))))
                .addContainerGap())
        );

        Contenedor_Stast.addTab("Historial de Ventas", Historial_ventas);

        javax.swing.GroupLayout Datos_ventasLayout = new javax.swing.GroupLayout(Datos_ventas);
        Datos_ventas.setLayout(Datos_ventasLayout);
        Datos_ventasLayout.setHorizontalGroup(
            Datos_ventasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 676, Short.MAX_VALUE)
        );
        Datos_ventasLayout.setVerticalGroup(
            Datos_ventasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 468, Short.MAX_VALUE)
        );

        Contenedor_Stast.addTab("Datos de Productos", Datos_ventas);

        javax.swing.GroupLayout EstadisticasLayout = new javax.swing.GroupLayout(Estadisticas);
        Estadisticas.setLayout(EstadisticasLayout);
        EstadisticasLayout.setHorizontalGroup(
            EstadisticasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Contenedor_Stast, javax.swing.GroupLayout.DEFAULT_SIZE, 681, Short.MAX_VALUE)
        );
        EstadisticasLayout.setVerticalGroup(
            EstadisticasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Contenedor_Stast, javax.swing.GroupLayout.DEFAULT_SIZE, 495, Short.MAX_VALUE)
        );

        Panel_General.addTab("Estadisticas", Estadisticas);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel_General, javax.swing.GroupLayout.PREFERRED_SIZE, 686, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel_General, javax.swing.GroupLayout.PREFERRED_SIZE, 522, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
// Evento del boton para registrar y tabular el producto
    private void registrarPan(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarPan
        if (Val_Panes(nombrePanReg_txt.getText(), precioPanReg_txt.getText(), cantidadPanReg_txt.getText())) {
            if (provePanReg_cmbx.getSelectedItem().toString().equals("Seleccione")) {
                paco.Create(new Producto(nombrePanReg_txt.getText().toUpperCase(), Integer.parseInt(precioPanReg_txt.getText()), Integer.parseInt(cantidadPanReg_txt.getText()), "f2"));
            } else {
                paco.Create(new Producto(nombrePanReg_txt.getText().toUpperCase(), Integer.parseInt(precioPanReg_txt.getText()), Integer.parseInt(cantidadPanReg_txt.getText()), "f2", provePanReg_cmbx.getSelectedItem().toString()));
            }
            Listas();
            VaciarReg_txt();
        }

    }//GEN-LAST:event_registrarPan
// Metodo para validar la entrada de los panes

    private Boolean Val_Panes(String nombre, String precio, String cantidad) {
        boolean V = true;
        if (nombre == null || nombre.equals("") || precio == null || precio.equals("")
                || cantidad == null || cantidad.equals("")) {

            JOptionPane.showMessageDialog(null, "Ha dejado campos vacios", "ERROR", 0);
            V = false;
        } else {
            try {
                Integer.parseInt(precio);
                Integer.parseInt(cantidad);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Digite solo valores númericos", "ERROR", 0);
                V = false;
            }
        }
        return V;
    }

// Evento del Panel de pestañas Para mantener actulaizadas las tablas cuando se cliquén las pestañas
    private void Actualizar_panel(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Actualizar_panel
        Listas();
    }//GEN-LAST:event_Actualizar_panel
//Metodo para litar todas las tablas

    public void Listas() {
        //tabla de registro
        Consulta = (DefaultTableModel) listaPanesReg_tbl.getModel();
        paco.Tablas(Consulta, paco.Listar());
        Consulta = null;
        //tabla de Modificar
        Consulta = (DefaultTableModel) listaPanesEdit_tbl.getModel();
        paco.Tablas(Consulta, paco.Listar());
        Consulta = null;
        //tabla de Consultar
        Consulta = (DefaultTableModel) listaPanesConsult_tbl.getModel();
        paco.Tablas(Consulta, paco.Listar());
        Consulta = null;
        //tabla de Eliminar
        Consulta = (DefaultTableModel) listaPanesEliminar_tbl.getModel();
        paco.Tablas(Consulta, paco.Listar());
        Consulta = null;
        Consulta = (DefaultTableModel) listaProveedorReg_tbl.getModel();
        paco.Tablas(Consulta, Proveedor.Listar());
        Consulta = null;
        //tabla de Eliminar
        Consulta = (DefaultTableModel) listaProvConsult_tbl.getModel();
        paco.Tablas(Consulta, Proveedor.Listar());
        Consulta = null;
        //tabla de Eliminar
        Consulta = (DefaultTableModel) listaProveedoresEdit_tbl.getModel();
        paco.Tablas(Consulta, Proveedor.Listar());
        Consulta = null;
        //tabla de Eliminar
        Consulta = (DefaultTableModel) listaProvEliminar_tbl.getModel();
        paco.Tablas(Consulta, Proveedor.Listar());
        Consulta = null;
        //tabla de Eliminar
        Consulta = (DefaultTableModel) listaProdConsultVentas_tbl.getModel();
        paco.Tablas(Consulta, paco.Listar());
        Consulta = null;
        Consulta = (DefaultTableModel) listaProdVenta_tbl.getModel();
        paco.Tablas(Consulta, Compra.ListarVenta());
        Consulta = null;
        //Llenar Combobox
        ComboBox();
    }

    private void ComboBox() {
        provePanReg_cmbx.removeAllItems();
        provePanReg_cmbx.addItem("Seleccione");
        for (int i = 0; i < Proveedor.getListaProveedores().size(); i++) {
            provePanReg_cmbx.addItem(Proveedor.getListaProveedores().get(i).getsNombre());
        }
    }

    private void nombrePanConsult_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombrePanConsult_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombrePanConsult_txtActionPerformed


    private void selecProdModif_tbl(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_selecProdModif_tbl
        // rowAtPoint -> ( EVENTO 'evt' . getPoint() 'posicion' );
        this.indexMod_tbl = CheckBoxProducto(listaPanesEdit_tbl, selecEditPan_chbx);
        EditPan_btn.setEnabled(true);
        nombrePanEdit_txt.setText(paco.getListaPan().get(Integer.parseInt(indexMod_tbl.toString())).getNombreTipo());
        cantidadPanEdit_txt.setText(paco.getListaPan().get(Integer.parseInt(indexMod_tbl.toString())).getCantidad() + "");
        precioPanEdit_txt.setText(paco.getListaPan().get(Integer.parseInt(indexMod_tbl.toString())).getPrecio() + "");

    }//GEN-LAST:event_selecProdModif_tbl

    private void modificarPan(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarPan
        int posEditPan = Integer.parseInt("" + this.indexMod_tbl);
        if (Val_Panes(nombrePanEdit_txt.getText(), precioPanEdit_txt.getText(), cantidadPanEdit_txt.getText())) {
            paco.Uptade(posEditPan, new Producto(
                    nombrePanEdit_txt.getText().toUpperCase(),
                    Integer.parseInt(precioPanEdit_txt.getText()),
                    Integer.parseInt(cantidadPanEdit_txt.getText()), "")
            );
            Listas();
            ObjEditPan(true);
            VaciarMod_txt();
        }
    }//GEN-LAST:event_modificarPan

    private boolean ValConsult(String nombre, ArrayList Array) {
        boolean V = true;
        if (nombre.equals("") || nombre == null) {
            JOptionPane.showMessageDialog(null, "No ha ingresado los datos", "ERROR!", 0);
            V = false;
        } else {
            if (Array.isEmpty()) {
                JOptionPane.showMessageDialog(null, "No se han encontrado coincidencias", "No Se Encontro", 1);
                V = false;
            }
        }
        return V;
    }

    private void consultPanEdit_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultPanEdit_btnActionPerformed
        Consult_GeneralPan(nombrePanConsultEdit_txt.getText(), listaPanesEdit_tbl);
    }//GEN-LAST:event_consultPanEdit_btnActionPerformed

    private void Consult_GeneralPan(String s, JTable Tabla) {
        Consulta = (DefaultTableModel) Tabla.getModel();
        if (ValConsult(s, paco.Read(s.toUpperCase()))) {
            paco.Tablas(Consulta, paco.Read(s.toUpperCase()));
        }
        Consulta = null;
    }

    private void Consult_GeneralProv(String s, JTable Tabla) {
        Consulta = (DefaultTableModel) Tabla.getModel();
        if (ValConsult(s, Proveedor.Read(s.toUpperCase()))) {
            paco.Tablas(Consulta, Proveedor.Read(s.toUpperCase()));
        }
        Consulta = null;
    }

    private void consultPan_btn(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultPan_btn
        Consult_GeneralPan(nombrePanConsult_txt.getText(), listaPanesConsult_tbl);
    }//GEN-LAST:event_consultPan_btn

    private void cancelarEditPan_btnmodificarPan(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarEditPan_btnmodificarPan
        ObjEditPan(false);

    }//GEN-LAST:event_cancelarEditPan_btnmodificarPan
    public void ObjEditPan(boolean V) {
        GuardarEditPan_btn.setEnabled(V);
        cancelarEditPan_btn.setEnabled(V);
        nombrePanEdit_txt.setEnabled(V);
        precioPanEdit_txt.setEnabled(V);
        cantidadPanEdit_txt.setEnabled(V);
        selecEditPan_chbx.setSelected(V);
    }

    private void ObjEditProv(boolean V) {
        GuardarEditProv_btn.setEnabled(V);
        cancelarEditProv_btn.setEnabled(V);
        nitProvEdit_txt.setEnabled(V);
        nombreProvEdit_txt.setEnabled(V);
        serviProvEdit_txt.setEnabled(V);
        telefonoProvEdit_txt.setEnabled(V);
        direcProvEdit_txt.setEnabled(V);
        selecEditProv_chbx.setSelected(V);
    }

    public void VaciarMod_txt() {
        nombrePanEdit_txt.setText(null);
        cantidadPanEdit_txt.setText(null);
        precioPanEdit_txt.setText(null);

    }

    public void VaciarReg_txt() {
        nombrePanReg_txt.setText(null);
        cantidadPanReg_txt.setText(null);
        precioPanReg_txt.setText(null);

    }

    private void LimpiarModProv() {
        nombreProvEdit_txt.setText(null);
        telefonoProvEdit_txt.setText(null);
        serviProvEdit_txt.setText(null);
        nitProvEdit_txt.setText(null);
        direcProvEdit_txt.setText(null);
    }

    private void EditPan_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditPan_btnActionPerformed
        int opcEditPan = JOptionPane.showConfirmDialog(null, "¿Desea Modificar el Producto?");
        switch (opcEditPan) {
            case 0:
                ObjEditPan(true);
                EditPan_btn.setEnabled(false);
                break;
        }
    }//GEN-LAST:event_EditPan_btnActionPerformed

    private void ProveedoresActualizar_panel(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ProveedoresActualizar_panel
        Listas();
    }//GEN-LAST:event_ProveedoresActualizar_panel

    private void consultProv_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultProv_btnActionPerformed
        Consult_GeneralProv(nombreProvConsult_txt.getText(), listaProvConsult_tbl);
    }//GEN-LAST:event_consultProv_btnActionPerformed

    private void nombreProvConsult_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreProvConsult_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreProvConsult_txtActionPerformed

    private void consultProvEdit_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultProvEdit_btnActionPerformed
        Consult_GeneralProv(nombreProvConsultEdit_txt.getText(), listaProveedoresEdit_tbl);
    }//GEN-LAST:event_consultProvEdit_btnActionPerformed

    private void registrarProv_btnregistrarPan(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarProv_btnregistrarPan
        if (Val_Prov(nitProvReg_txt.getText(), nombreProvReg_txt.getText(), serviProvReg_txt.getText(), telefonoProvReg_txt.getText(), direcProvReg_txt.getText())) {
            Proveedor.Create(new Proveedor(nitProvReg_txt.getText().toUpperCase(), nombreProvReg_txt.getText().toUpperCase(), serviProvReg_txt.getText().toUpperCase(),
                    telefonoProvReg_txt.getText(), direcProvReg_txt.getText().toUpperCase()));
            Listas();
            LimpiarReg_Prov();
        }
    }//GEN-LAST:event_registrarProv_btnregistrarPan

    private boolean Val_Prov(String nit, String nombre, String servi, String telefono, String direc) {
        boolean V = true;
        if (nit == null || nit.equals("") || nombre == null || nombre.equals("")
                || servi == null || servi.equals("") || telefono == null || telefono.equals("")
                || direc == null || direc.equals("")) {

            JOptionPane.showMessageDialog(null, "Ha dejado campos vacios", "ERROR", 1);
            V = false;
        }
        return V;
    }
    private void EditProv_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditProv_btnActionPerformed
        int opcEditProv = JOptionPane.showConfirmDialog(null, "¿Desea modificar el proveedor?");
        switch (opcEditProv) {
            case 0:
                ObjEditProv(true);
                EditProv_btn.setEnabled(false);
                break;
        }
    }//GEN-LAST:event_EditProv_btnActionPerformed

    private void GuardarEditProv_btnmodificarPan(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarEditProv_btnmodificarPan
        int posEditProv = Integer.parseInt("" + this.indexModProv_tbl);
        if (Val_Prov(nitProvEdit_txt.getText(), nombreProvEdit_txt.getText(), serviProvEdit_txt.getText(), telefonoProvEdit_txt.getText(), direcProvEdit_txt.getText())) {
            Proveedor.Uptade(posEditProv, new Proveedor(nitProvEdit_txt.getText().toUpperCase(), nombreProvEdit_txt.getText().toUpperCase(), serviProvEdit_txt.getText().toUpperCase(),
                    telefonoProvEdit_txt.getText(), direcProvEdit_txt.getText().toUpperCase()));
            Listas();
            ObjEditProv(false);
            LimpiarModProv();
        }
    }//GEN-LAST:event_GuardarEditProv_btnmodificarPan

    private void cancelarEditProv_btnmodificarPan(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarEditProv_btnmodificarPan
        ObjEditProv(false);
    }//GEN-LAST:event_cancelarEditProv_btnmodificarPan

    private void consultPanEliminar_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultPanEliminar_btnActionPerformed
        Consult_GeneralPan(nombrePanEliminar_txt.getText(), listaPanesEliminar_tbl);
     }//GEN-LAST:event_consultPanEliminar_btnActionPerformed

    private void LimpiarReg_Prov() {
        nombreProvReg_txt.setText(null);
        telefonoProvReg_txt.setText(null);
        serviProvReg_txt.setText(null);
        nitProvReg_txt.setText(null);
        direcProvReg_txt.setText(null);
    }

    private void selecProdEliminar_tbl(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_selecProdEliminar_tbl
        //igualar posicion global con posicion local
        this.indexElim_tbl = CheckBoxProducto(listaPanesEliminar_tbl, selecPanEliminar_chbx);
    }//GEN-LAST:event_selecProdEliminar_tbl

    private void eliminarPan_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarPan_btnActionPerformed
        try {
            int opcEliminarPan = JOptionPane.showConfirmDialog(null, "¿ Desea Eliminar " + paco.getListaPan().get(Integer.parseInt(this.indexElim_tbl.toString())).getNombreTipo() + "?");
            switch (opcEliminarPan) {
                case (0):
                    paco.Delete(Integer.parseInt(this.indexElim_tbl.toString()));
                    selecPanEliminar_chbx.setText("Seleccionado");
                    Listas();
                    break;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No hay nada seleccionado", "ERROR!", 0);
        }

        selecPanEliminar_chbx.setSelected(true);

    }//GEN-LAST:event_eliminarPan_btnActionPerformed

    private void listaProveedoresEdit_tblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listaProveedoresEdit_tblMouseClicked
        this.indexModProv_tbl = CheckBoxProv(listaProveedoresEdit_tbl, selecEditProv_chbx);
        EditProv_btn.setEnabled(true);
        nombreProvEdit_txt.setText(Proveedor.getListaProveedores().get(Integer.parseInt(indexModProv_tbl.toString())).getsNombre());
        telefonoProvEdit_txt.setText(Proveedor.getListaProveedores().get(Integer.parseInt(indexModProv_tbl.toString())).getsTelefono());
        serviProvEdit_txt.setText(Proveedor.getListaProveedores().get(Integer.parseInt(indexModProv_tbl.toString())).getsServicio());
        direcProvEdit_txt.setText(Proveedor.getListaProveedores().get(Integer.parseInt(indexModProv_tbl.toString())).getsDireccion());
        nitProvEdit_txt.setText(Proveedor.getListaProveedores().get(Integer.parseInt(indexModProv_tbl.toString())).getsId());
    }//GEN-LAST:event_listaProveedoresEdit_tblMouseClicked

    private void listaProvEliminar_tblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listaProvEliminar_tblMouseClicked
        //igualar posicion global con posicion local
        this.indexElim_tbl = CheckBoxProv(listaProvEliminar_tbl, selecEliminarProv_chbx);
    }//GEN-LAST:event_listaProvEliminar_tblMouseClicked

    private void consultPanVenta_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultPanVenta_btnActionPerformed
        Consult_GeneralPan(nombrePanConsultVenta_txt.getText(), listaProdConsultVentas_tbl);
    }//GEN-LAST:event_consultPanVenta_btnActionPerformed

    private void consultProvEliminar_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultProvEliminar_btnActionPerformed
        Consult_GeneralProv(nombreEliminarProv_txt.getText(), listaProvEliminar_tbl);
    }//GEN-LAST:event_consultProvEliminar_btnActionPerformed

    private void EliminarProv_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarProv_btnActionPerformed
        try {
            int opcEliminarProv = JOptionPane.showConfirmDialog(null, "¿ Desea Eliminar " + Proveedor.getListaProveedores().get(Integer.parseInt(this.indexElim_tbl.toString())).getsNombre() + "?");
            switch (opcEliminarProv) {
                case (0):
                    Proveedor.Delete(Integer.parseInt(this.indexElim_tbl.toString()));
                    selecEliminarProv_chbx.setText("Seleccionado");
                    Listas();
                    break;
            }
            selecPanEliminar_chbx.setSelected(true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No hay producto seleccionado", "ERROR!", 0);
        }

    }//GEN-LAST:event_EliminarProv_btnActionPerformed

    private void listaPanesConsult_tblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listaPanesConsult_tblMouseClicked
        CheckBoxProducto(listaPanesConsult_tbl, selecConsultPan_chbx);
    }//GEN-LAST:event_listaPanesConsult_tblMouseClicked

    private void listaProvConsult_tblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listaProvConsult_tblMouseClicked
        CheckBoxProv(listaProvConsult_tbl, selecConsultProv_chbx);
    }//GEN-LAST:event_listaProvConsult_tblMouseClicked

    private void listaProdConsultVentas_tblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listaProdConsultVentas_tblMouseClicked
        this.indexProdConsult_tbl = CheckBoxProducto(listaProdConsultVentas_tbl, selecProdConsultVenta_chbx);
        agregarProdVenta_btn.setEnabled(true);
        //nombreProdVenta_txt.setEnabled(true);
        cantidadProdVenta_txt.setEnabled(true);
        nombreProdVenta_txt.setText(paco.getListaPan().get(Integer.parseInt(this.indexProdConsult_tbl.toString())).getNombreTipo());
    }//GEN-LAST:event_listaProdConsultVentas_tblMouseClicked

    private void agregarProdVenta_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarProdVenta_btnActionPerformed
        try {
            if (cantidadProdVenta_txt.getText() == null || "".equals(cantidadProdVenta_txt.getText())) {
                JOptionPane.showMessageDialog(null, "Ha dejado campos vacios", "ERROR!", 0);
            } else if (Integer.parseInt(cantidadProdVenta_txt.getText()) <= 0
                    || paco.getListaPan().get(Integer.parseInt(indexProdConsult_tbl.toString())).getCantidad()
                    < Integer.parseInt(cantidadProdVenta_txt.getText())) {
                JOptionPane.showMessageDialog(null, "Verifique la cantidad disponible", "ERROR!", 0);
            } else {
                cantidadProdVenta_txt.setEnabled(false);
                selecProdConsultVenta_chbx.setSelected(false);
                cancelarVenta_btn.setEnabled(true);
                comprarVenta_btn.setEnabled(true);
                agregarProdVenta_btn.setEnabled(false);
                nombreClientVenta_txt.setEnabled(true);
                idClientVenta_txt.setEnabled(true);
                pagoClientVenta_txt.setEnabled(true);
                double Ganan = Integer.parseInt(cantidadProdVenta_txt.getText()) * paco.getListaPan().get(Integer.parseInt(indexProdConsult_tbl.toString())).getPrecio();
                total += Ganan;
                Compra.Create(new Producto(paco.getListaPan().get(Integer.parseInt(indexProdConsult_tbl.toString())).getNombreTipo(),
                        paco.getListaPan().get(Integer.parseInt(indexProdConsult_tbl.toString())).getPrecio(), Integer.parseInt(cantidadProdVenta_txt.getText()),
                        paco.getListaPan().get(Integer.parseInt(indexProdConsult_tbl.toString())).getId(),
                        paco.getListaPan().get(Integer.parseInt(indexProdConsult_tbl.toString())).getsProveedor(), Ganan));
                cantidadProdVenta_txt.setText(null);
                totalProdVenta.setText("Total de la venta: " + total);
                Listas();
            }
        } catch (HeadlessException | NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Digite valores Númericos", "ERROR!", 0);
        }
    }//GEN-LAST:event_agregarProdVenta_btnActionPerformed

    private void listaProdVenta_tblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listaProdVenta_tblMouseClicked
        this.indexProdVenta_tbl = listaProdVenta_tbl.getSelectedRow();
        selecProdVenta_chbx.setSelected(true);
        retirarProdVenta_btn.setEnabled(true);
    }//GEN-LAST:event_listaProdVenta_tblMouseClicked

    private void retirarProdVenta_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_retirarProdVenta_btnActionPerformed
        int opcEditProv = JOptionPane.showConfirmDialog(null, "¿Desea retirar este producto?");
        switch (opcEditProv) {
            case 0:
                retirarProdVenta_btn.setEnabled(false);
                total -= Compra.getCompraLista().get(Integer.parseInt(indexProdVenta_tbl.toString())).getiGanancias();
                totalProdVenta.setText("Total de la venta: " + total);
                Compra.RemoveCompra(Integer.parseInt(indexProdVenta_tbl.toString()));
                selecProdVenta_chbx.setSelected(false);
                nombreProdVenta_txt.setText(null);
                Listas();
                break;
        }
    }//GEN-LAST:event_retirarProdVenta_btnActionPerformed

    private void Cancelar() {

        Compra.getCompraLista().clear();
        cantidadProdVenta_txt.setEnabled(false);
        selecProdConsultVenta_chbx.setSelected(false);
        cancelarVenta_btn.setEnabled(false);
        comprarVenta_btn.setEnabled(false);
        agregarProdVenta_btn.setEnabled(false);
        retirarProdVenta_btn.setEnabled(false);
        selecProdVenta_chbx.setSelected(false);
        nombreEliminarProv_txt.setText(null);
        nombreClientVenta_txt.setText(null);
        nombreClientVenta_txt.setEnabled(false);
        idClientVenta_txt.setText(null);
        idClientVenta_txt.setEnabled(false);
        pagoClientVenta_txt.setText(null);
        pagoClientVenta_txt.setEnabled(false);
        Listas();

    }

    private void cancelarVenta_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarVenta_btnActionPerformed
        int opcEditProv = JOptionPane.showConfirmDialog(null, "¿Desea cancelar la compra?");
        switch (opcEditProv) {
            case 0:
                total = 0;
                totalProdVenta.setText("Total de la venta: " + total);
                Cancelar();
                JOptionPane.showMessageDialog(null, "Se cancelo la compra con éxito");
                break;
        }
    }//GEN-LAST:event_cancelarVenta_btnActionPerformed

    private void comprarVenta_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comprarVenta_btnActionPerformed
        if (Cliente()) {
            int opcEditProv = JOptionPane.showConfirmDialog(null, "¿Desea hacer la compra?");
            switch (opcEditProv) {
                case 0:
                    Compra.Create(new Factura(Compra.getCompraLista()));
                    for (int i = 0; i < Compra.getCompraLista().size(); i++) {
                        for (int b = 0; b < paco.getListaPan().size(); b++) {
                            if (paco.getListaPan().get(b).getNombreTipo().equals(Compra.getCompraLista().get(i).getNombreTipo())) {
                                paco.getListaPan().get(b).setCantidad(paco.getListaPan().get(b).getCantidad() - Compra.getCompraLista().get(i).getCantidad());
                                break;
                            }
                        }
                    }
                    Cancelar();
                    total = 0;
                    totalProdVenta.setText("Total de la venta: " + total);
                    JOptionPane.showMessageDialog(null, "La compra se realizo con éxito");
                    break;
            }
        }

    }//GEN-LAST:event_comprarVenta_btnActionPerformed


    private void consultPanEdit_btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultPanEdit_btn1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_consultPanEdit_btn1ActionPerformed

    private void totalProdVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totalProdVentaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_totalProdVentaActionPerformed


    private int CheckBoxProducto(JTable Tabla, JCheckBox Check) {
        int posConsult = 0;
        for (int i = 0; i < paco.getListaPan().size(); i++) {
            if (Tabla.getValueAt(Tabla.getSelectedRow(), 0).equals(paco.getListaPan().get(i).getNombreTipo())) {
                posConsult = i;
            }
        }
        Check.setSelected(true);
        return posConsult;
    }

    private int CheckBoxProv(JTable Tabla, JCheckBox Check) {
        int posConsult = 0;
        for (int i = 0; i < Proveedor.getListaProveedores().size(); i++) {
            if (Tabla.getValueAt(Tabla.getSelectedRow(), 0).equals(Proveedor.getListaProveedores().get(i).getsNombre())) {
                posConsult = i;
            }
        }
        Check.setSelected(true);
        return posConsult;
    }

    private boolean Cliente() {
        boolean V = true;
        try {
            if (nombreClientVenta_txt.getText() == null || nombreClientVenta_txt.getText().equals("")
                    || idClientVenta_txt.getText() == null || idClientVenta_txt.getText().equals("")
                    || pagoClientVenta_txt.getText() == null || pagoClientVenta_txt.getText().equals("")) {
                V = false;
                JOptionPane.showMessageDialog(null, "Ha dejado campos vacios", "ERROR!", 0);
            } else if (Integer.parseInt(pagoClientVenta_txt.getText()) <= 0 || Integer.parseInt(pagoClientVenta_txt.getText()) < total) {
                JOptionPane.showMessageDialog(null, "Verifique el pago", "ERROR!", 0);
                V = false;
            } else {
                Compra.Create(new Client(nombreClientVenta_txt.getText().toUpperCase(), idClientVenta_txt.getText().toUpperCase(), Integer.parseInt(pagoClientVenta_txt.getText()),
                        (Integer.parseInt(pagoClientVenta_txt.getText()) - total)));
            }
        } catch (HeadlessException | NumberFormatException e) {
            V = false;
            JOptionPane.showMessageDialog(null, "Digite valores Númericos", "ERROR!", 0);
        }
        return V;
    }

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(View1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(View1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(View1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(View1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new View1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Consultar_Producto;
    private javax.swing.JPanel Consultar_Proveedores;
    private javax.swing.JTabbedPane Contenedor_Stast;
    private javax.swing.JPanel Datos_ventas;
    private javax.swing.JButton EditPan_btn;
    private javax.swing.JButton EditProv_btn;
    private javax.swing.JButton EliminarProv_btn;
    private javax.swing.JPanel Eliminar_Producto;
    private javax.swing.JPanel Eliminar_Proveedores;
    private javax.swing.JPanel Estadisticas;
    private javax.swing.JButton GuardarEditPan_btn;
    private javax.swing.JButton GuardarEditProv_btn;
    private javax.swing.JPanel Historial_ventas;
    private javax.swing.JPanel Modificar_Producto;
    private javax.swing.JPanel Modificar_Proveedores;
    private javax.swing.JTabbedPane Panel_General;
    private javax.swing.JTabbedPane Productos;
    private javax.swing.JTabbedPane Proveedores;
    private javax.swing.JPanel Registrar_Producto;
    private javax.swing.JPanel Registrar_Proveedores;
    private javax.swing.JPanel Ventas;
    private javax.swing.JButton agregarProdVenta_btn;
    private javax.swing.JButton cancelarEditPan_btn;
    private javax.swing.JButton cancelarEditProv_btn;
    private javax.swing.JButton cancelarVenta_btn;
    private javax.swing.JTextField cantidadPanEdit_txt;
    private javax.swing.JTextField cantidadPanReg_txt;
    private javax.swing.JTextField cantidadProdVenta_txt;
    private javax.swing.JButton comprarVenta_btn;
    private javax.swing.JButton consultPanEdit_btn;
    private javax.swing.JButton consultPanEdit_btn1;
    private javax.swing.JButton consultPanEliminar_btn;
    private javax.swing.JButton consultPanVenta_btn;
    private javax.swing.JButton consultPan_btn;
    private javax.swing.JButton consultProvEdit_btn;
    private javax.swing.JButton consultProvEliminar_btn;
    private javax.swing.JButton consultProv_btn;
    private javax.swing.JTextField direcProvEdit_txt;
    private javax.swing.JTextField direcProvReg_txt;
    private javax.swing.JButton eliminarPan_btn;
    private javax.swing.JTextField idClientVenta_txt;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JTable listaPanesConsult_tbl;
    private javax.swing.JTable listaPanesEdit_tbl;
    private javax.swing.JTable listaPanesEliminar_tbl;
    private javax.swing.JTable listaPanesReg_tbl;
    private javax.swing.JTable listaProdConsultVentas_tbl;
    private javax.swing.JTable listaProdVenta_tbl;
    private javax.swing.JTable listaProdVenta_tbl1;
    private javax.swing.JTable listaProdVenta_tbl2;
    private javax.swing.JTable listaProvConsult_tbl;
    private javax.swing.JTable listaProvEliminar_tbl;
    private javax.swing.JTable listaProveedorReg_tbl;
    private javax.swing.JTable listaProveedoresEdit_tbl;
    private javax.swing.JTextField nitProvEdit_txt;
    private javax.swing.JTextField nitProvReg_txt;
    private javax.swing.JTextField nombreClientVenta_txt;
    private javax.swing.JTextField nombreEliminarProv_txt;
    private javax.swing.JTextField nombrePanConsultEdit_txt;
    private javax.swing.JTextField nombrePanConsultEdit_txt1;
    private javax.swing.JTextField nombrePanConsultVenta_txt;
    private javax.swing.JTextField nombrePanConsult_txt;
    private javax.swing.JTextField nombrePanEdit_txt;
    private javax.swing.JTextField nombrePanEliminar_txt;
    private javax.swing.JTextField nombrePanReg_txt;
    private javax.swing.JTextField nombreProdVenta_txt;
    private javax.swing.JTextField nombreProvConsultEdit_txt;
    private javax.swing.JTextField nombreProvConsult_txt;
    private javax.swing.JTextField nombreProvEdit_txt;
    private javax.swing.JTextField nombreProvReg_txt;
    private javax.swing.JTextField pagoClientVenta_txt;
    private javax.swing.JTextField precioPanEdit_txt;
    private javax.swing.JTextField precioPanReg_txt;
    private javax.swing.JComboBox<String> provePanReg_cmbx;
    private javax.swing.JButton registrarPan_btn;
    private javax.swing.JButton registrarProv_btn;
    private javax.swing.JButton retirarProdVenta_btn;
    private javax.swing.JCheckBox selecConsultPan_chbx;
    private javax.swing.JCheckBox selecConsultProv_chbx;
    private javax.swing.JCheckBox selecEditPan_chbx;
    private javax.swing.JCheckBox selecEditPan_chbx1;
    private javax.swing.JCheckBox selecEditProv_chbx;
    private javax.swing.JCheckBox selecEliminarProv_chbx;
    private javax.swing.JCheckBox selecPanEliminar_chbx;
    private javax.swing.JCheckBox selecProdConsultVenta_chbx;
    private javax.swing.JCheckBox selecProdVenta_chbx;
    private javax.swing.JTextField serviProvEdit_txt;
    private javax.swing.JTextField serviProvReg_txt;
    private javax.swing.JTextField telefonoProvEdit_txt;
    private javax.swing.JTextField telefonoProvReg_txt;
    private javax.swing.JTextField totalProdVenta;
    // End of variables declaration//GEN-END:variables
}
