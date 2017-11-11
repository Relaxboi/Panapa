package View;

import Controller.*;
import Model.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class View1 extends javax.swing.JFrame {

    private DefaultTableModel Consulta;
    //instancia de los modelos
    PanController paco = new PanController();
    ProveedorController Proveedor = new ProveedorController();
    //Indice
    Object indexMod_tbl = null;
    Object indexElim_tbl = null;
    Object indexModProv_tbl = null;
    //PACO es instanciar al PanController 

    public View1() {
        initComponents();
        setResizable(false);
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

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
        Registrar_Producto1 = new javax.swing.JPanel();
        nombreProvReg_txt = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        listaProveedorReg_tbl1 = new javax.swing.JTable();
        registrarProv_btn = new javax.swing.JButton();
        serviProvReg_txt = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        telefonoProvReg_txt = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        direcProvReg_txt = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        nitProvReg_txt = new javax.swing.JTextField();
        Modificar_Producto1 = new javax.swing.JPanel();
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
        Consultar_Producto1 = new javax.swing.JPanel();
        selecConsultProv_chbx = new javax.swing.JCheckBox();
        jLabel17 = new javax.swing.JLabel();
        nombreProvConsult_txt = new javax.swing.JTextField();
        consultProv_btn = new javax.swing.JButton();
        jScrollPane7 = new javax.swing.JScrollPane();
        listaProvConsult_tbl = new javax.swing.JTable();
        Eliminar_Producto1 = new javax.swing.JPanel();
        nombreEliminarProv_txt = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        selecEliminarProv_chbx = new javax.swing.JCheckBox();
        EliminarProv_btn = new javax.swing.JButton();
        jScrollPane8 = new javax.swing.JScrollPane();
        listaProvEliminar_tbl = new javax.swing.JTable();
        Ventas = new javax.swing.JPanel();

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

        javax.swing.GroupLayout Registrar_ProductoLayout = new javax.swing.GroupLayout(Registrar_Producto);
        Registrar_Producto.setLayout(Registrar_ProductoLayout);
        Registrar_ProductoLayout.setHorizontalGroup(
            Registrar_ProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Registrar_ProductoLayout.createSequentialGroup()
                .addGroup(Registrar_ProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(Registrar_ProductoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(Registrar_ProductoLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(Registrar_ProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(nombrePanReg_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(Registrar_ProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Registrar_ProductoLayout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(precioPanReg_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Registrar_ProductoLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel3)
                                .addGap(39, 39, 39)))
                        .addGroup(Registrar_ProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Registrar_ProductoLayout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(cantidadPanReg_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(Registrar_ProductoLayout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addComponent(jLabel2)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 128, Short.MAX_VALUE)
                        .addComponent(registrarPan_btn)))
                .addGap(15, 15, 15))
        );
        Registrar_ProductoLayout.setVerticalGroup(
            Registrar_ProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Registrar_ProductoLayout.createSequentialGroup()
                .addGroup(Registrar_ProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Registrar_ProductoLayout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(registrarPan_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(Registrar_ProductoLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(Registrar_ProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(Registrar_ProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel2)
                                .addComponent(jLabel3))
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(Registrar_ProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cantidadPanReg_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(precioPanReg_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nombrePanReg_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 323, Short.MAX_VALUE)
                .addContainerGap())
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
                .addGap(18, 18, 18)
                .addComponent(selecConsultPan_chbx)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nombrePanConsult_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 101, Short.MAX_VALUE)
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
                        .addComponent(selecConsultPan_chbx)
                        .addComponent(nombrePanConsult_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel8))
                    .addComponent(consultPan_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(413, Short.MAX_VALUE))
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
                        .addGap(0, 0, Short.MAX_VALUE)
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Eliminar_ProductoLayout.createSequentialGroup()
                .addGroup(Eliminar_ProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Eliminar_ProductoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(eliminarPan_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
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
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        Productos.addTab("Eliminar Producto", Eliminar_Producto);

        Panel_General.addTab("Producto", Productos);

        Proveedores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ProveedoresActualizar_panel(evt);
            }
        });

        jLabel10.setText("Nombre del Proveedor : ");

        listaProveedorReg_tbl1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane5.setViewportView(listaProveedorReg_tbl1);
        if (listaProveedorReg_tbl1.getColumnModel().getColumnCount() > 0) {
            listaProveedorReg_tbl1.getColumnModel().getColumn(0).setResizable(false);
            listaProveedorReg_tbl1.getColumnModel().getColumn(1).setResizable(false);
            listaProveedorReg_tbl1.getColumnModel().getColumn(2).setResizable(false);
            listaProveedorReg_tbl1.getColumnModel().getColumn(3).setResizable(false);
            listaProveedorReg_tbl1.getColumnModel().getColumn(4).setResizable(false);
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

        javax.swing.GroupLayout Registrar_Producto1Layout = new javax.swing.GroupLayout(Registrar_Producto1);
        Registrar_Producto1.setLayout(Registrar_Producto1Layout);
        Registrar_Producto1Layout.setHorizontalGroup(
            Registrar_Producto1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Registrar_Producto1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Registrar_Producto1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Registrar_Producto1Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(Registrar_Producto1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(nombreProvReg_txt)
                            .addGroup(Registrar_Producto1Layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addGroup(Registrar_Producto1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10)
                                    .addGroup(Registrar_Producto1Layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(jLabel19))))
                            .addComponent(serviProvReg_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(Registrar_Producto1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Registrar_Producto1Layout.createSequentialGroup()
                                .addGroup(Registrar_Producto1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(Registrar_Producto1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(Registrar_Producto1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(telefonoProvReg_txt)
                                            .addComponent(direcProvReg_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(Registrar_Producto1Layout.createSequentialGroup()
                                        .addGap(62, 62, 62)
                                        .addComponent(jLabel20)))
                                .addGroup(Registrar_Producto1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(Registrar_Producto1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(nitProvReg_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(Registrar_Producto1Layout.createSequentialGroup()
                                        .addGap(62, 62, 62)
                                        .addComponent(jLabel22))))
                            .addGroup(Registrar_Producto1Layout.createSequentialGroup()
                                .addGap(60, 60, 60)
                                .addComponent(jLabel21)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                        .addComponent(registrarProv_btn)
                        .addGap(15, 15, 15))
                    .addGroup(Registrar_Producto1Layout.createSequentialGroup()
                        .addComponent(jScrollPane5)
                        .addContainerGap())))
        );
        Registrar_Producto1Layout.setVerticalGroup(
            Registrar_Producto1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Registrar_Producto1Layout.createSequentialGroup()
                .addGroup(Registrar_Producto1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Registrar_Producto1Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(registrarProv_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(Registrar_Producto1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(Registrar_Producto1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(Registrar_Producto1Layout.createSequentialGroup()
                                .addGroup(Registrar_Producto1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel20))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(nombreProvReg_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel19)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(serviProvReg_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(Registrar_Producto1Layout.createSequentialGroup()
                                .addGroup(Registrar_Producto1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(Registrar_Producto1Layout.createSequentialGroup()
                                        .addComponent(jLabel22)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(nitProvReg_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(telefonoProvReg_txt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel21)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(direcProvReg_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 323, Short.MAX_VALUE)
                .addContainerGap())
        );

        Proveedores.addTab("Registrar Prooverdor", Registrar_Producto1);

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

        javax.swing.GroupLayout Modificar_Producto1Layout = new javax.swing.GroupLayout(Modificar_Producto1);
        Modificar_Producto1.setLayout(Modificar_Producto1Layout);
        Modificar_Producto1Layout.setHorizontalGroup(
            Modificar_Producto1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Modificar_Producto1Layout.createSequentialGroup()
                .addGroup(Modificar_Producto1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Modificar_Producto1Layout.createSequentialGroup()
                        .addGroup(Modificar_Producto1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(Modificar_Producto1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(Modificar_Producto1Layout.createSequentialGroup()
                                    .addGap(41, 41, 41)
                                    .addGroup(Modificar_Producto1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(nombreProvEdit_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel23))
                                    .addGroup(Modificar_Producto1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(Modificar_Producto1Layout.createSequentialGroup()
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(telefonoProvEdit_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(Modificar_Producto1Layout.createSequentialGroup()
                                            .addGap(62, 62, 62)
                                            .addComponent(jLabel26))))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Modificar_Producto1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(Modificar_Producto1Layout.createSequentialGroup()
                                        .addGap(32, 32, 32)
                                        .addComponent(serviProvEdit_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Modificar_Producto1Layout.createSequentialGroup()
                                        .addGap(191, 191, 191)
                                        .addComponent(direcProvEdit_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(Modificar_Producto1Layout.createSequentialGroup()
                                .addGap(65, 65, 65)
                                .addComponent(jLabel24)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel25)
                                .addGap(45, 45, 45)))
                        .addGap(12, 12, 12)
                        .addGroup(Modificar_Producto1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nitProvEdit_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Modificar_Producto1Layout.createSequentialGroup()
                                .addComponent(jLabel27)
                                .addGap(51, 51, 51)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                        .addGroup(Modificar_Producto1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(EditProv_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(GuardarEditProv_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cancelarEditProv_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(Modificar_Producto1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 652, Short.MAX_VALUE))
                    .addGroup(Modificar_Producto1Layout.createSequentialGroup()
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
        Modificar_Producto1Layout.setVerticalGroup(
            Modificar_Producto1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Modificar_Producto1Layout.createSequentialGroup()
                .addGroup(Modificar_Producto1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Modificar_Producto1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(EditProv_btn)
                        .addGap(5, 5, 5)
                        .addComponent(GuardarEditProv_btn)
                        .addGap(5, 5, 5)
                        .addComponent(cancelarEditProv_btn))
                    .addGroup(Modificar_Producto1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(Modificar_Producto1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel26)
                            .addComponent(jLabel27))
                        .addGap(47, 47, 47)
                        .addGroup(Modificar_Producto1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel25)
                            .addComponent(jLabel24))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(Modificar_Producto1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(serviProvEdit_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(direcProvEdit_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(Modificar_Producto1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(Modificar_Producto1Layout.createSequentialGroup()
                            .addGap(33, 33, 33)
                            .addComponent(nitProvEdit_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Modificar_Producto1Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jLabel23)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(Modificar_Producto1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(telefonoProvEdit_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(nombreProvEdit_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(Modificar_Producto1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Modificar_Producto1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(nombreProvConsultEdit_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel16)
                        .addComponent(selecEditProv_chbx, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(consultProvEdit_btn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
        );

        Proveedores.addTab("Modificar Prooverdor", Modificar_Producto1);

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
        jScrollPane7.setViewportView(listaProvConsult_tbl);
        if (listaProvConsult_tbl.getColumnModel().getColumnCount() > 0) {
            listaProvConsult_tbl.getColumnModel().getColumn(0).setResizable(false);
            listaProvConsult_tbl.getColumnModel().getColumn(1).setResizable(false);
            listaProvConsult_tbl.getColumnModel().getColumn(2).setResizable(false);
            listaProvConsult_tbl.getColumnModel().getColumn(3).setResizable(false);
        }

        javax.swing.GroupLayout Consultar_Producto1Layout = new javax.swing.GroupLayout(Consultar_Producto1);
        Consultar_Producto1.setLayout(Consultar_Producto1Layout);
        Consultar_Producto1Layout.setHorizontalGroup(
            Consultar_Producto1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Consultar_Producto1Layout.createSequentialGroup()
                .addGroup(Consultar_Producto1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Consultar_Producto1Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(selecConsultProv_chbx)
                        .addGap(39, 39, 39)
                        .addComponent(jLabel17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nombreProvConsult_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                        .addComponent(consultProv_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(Consultar_Producto1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane7)))
                .addContainerGap())
        );
        Consultar_Producto1Layout.setVerticalGroup(
            Consultar_Producto1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Consultar_Producto1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Consultar_Producto1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Consultar_Producto1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(selecConsultProv_chbx)
                        .addComponent(nombreProvConsult_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel17))
                    .addComponent(consultProv_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 382, Short.MAX_VALUE)
                .addContainerGap())
        );

        Proveedores.addTab("Consultar Prooverdor", Consultar_Producto1);

        jLabel18.setText("Buscar :");

        selecEliminarProv_chbx.setText("Seleccionado");
        selecEliminarProv_chbx.setEnabled(false);

        EliminarProv_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/eliminar.png"))); // NOI18N
        EliminarProv_btn.setText("Eliminar");

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
        jScrollPane8.setViewportView(listaProvEliminar_tbl);
        if (listaProvEliminar_tbl.getColumnModel().getColumnCount() > 0) {
            listaProvEliminar_tbl.getColumnModel().getColumn(0).setResizable(false);
            listaProvEliminar_tbl.getColumnModel().getColumn(1).setResizable(false);
            listaProvEliminar_tbl.getColumnModel().getColumn(2).setResizable(false);
            listaProvEliminar_tbl.getColumnModel().getColumn(3).setResizable(false);
            listaProvEliminar_tbl.getColumnModel().getColumn(4).setResizable(false);
        }

        javax.swing.GroupLayout Eliminar_Producto1Layout = new javax.swing.GroupLayout(Eliminar_Producto1);
        Eliminar_Producto1.setLayout(Eliminar_Producto1Layout);
        Eliminar_Producto1Layout.setHorizontalGroup(
            Eliminar_Producto1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Eliminar_Producto1Layout.createSequentialGroup()
                .addGroup(Eliminar_Producto1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Eliminar_Producto1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(selecEliminarProv_chbx)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel18)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nombreEliminarProv_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(EliminarProv_btn, javax.swing.GroupLayout.DEFAULT_SIZE, 332, Short.MAX_VALUE))
                    .addGroup(Eliminar_Producto1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane8)))
                .addContainerGap())
        );
        Eliminar_Producto1Layout.setVerticalGroup(
            Eliminar_Producto1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Eliminar_Producto1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(Eliminar_Producto1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombreEliminarProv_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18)
                    .addComponent(selecEliminarProv_chbx)
                    .addComponent(EliminarProv_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addComponent(jScrollPane8, javax.swing.GroupLayout.DEFAULT_SIZE, 382, Short.MAX_VALUE)
                .addContainerGap())
        );

        Proveedores.addTab("Eliminar Prooverdor", Eliminar_Producto1);

        Panel_General.addTab("Proovedores", Proveedores);

        javax.swing.GroupLayout VentasLayout = new javax.swing.GroupLayout(Ventas);
        Ventas.setLayout(VentasLayout);
        VentasLayout.setHorizontalGroup(
            VentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 681, Short.MAX_VALUE)
        );
        VentasLayout.setVerticalGroup(
            VentasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 495, Short.MAX_VALUE)
        );

        Panel_General.addTab("Ventas", Ventas);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Panel_General, javax.swing.GroupLayout.PREFERRED_SIZE, 686, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(49, Short.MAX_VALUE))
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
            paco.Create(new Pan(nombrePanReg_txt.getText().toUpperCase(), Integer.parseInt(precioPanReg_txt.getText()), Integer.parseInt(cantidadPanReg_txt.getText()), "f2"));
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
        Consulta = (DefaultTableModel) listaProveedorReg_tbl1.getModel();
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
    }

    private void nombrePanConsult_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombrePanConsult_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombrePanConsult_txtActionPerformed


    private void selecProdModif_tbl(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_selecProdModif_tbl
        // rowAtPoint -> ( EVENTO 'evt' . getPoint() 'posicion' );
        int posEditPan = 0;
        for (int i = 0; i < paco.getListaPan().size(); i++) {
            if (listaPanesEdit_tbl.getValueAt(listaPanesEdit_tbl.getSelectedRow(), 0).equals(paco.getListaPan().get(i).getNombreTipo())) {
                posEditPan = i;
            }
        }
        this.indexMod_tbl = posEditPan;
        selecEditPan_chbx.setSelected(true);
        EditPan_btn.setEnabled(true);
        nombrePanEdit_txt.setText(paco.getListaPan().get(posEditPan).getNombreTipo());

        cantidadPanEdit_txt.setText(paco.getListaPan().get(posEditPan).getCantidad() + "");
        precioPanEdit_txt.setText(paco.getListaPan().get(posEditPan).getPrecio() + "");

    }//GEN-LAST:event_selecProdModif_tbl

    private void modificarPan(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarPan
        int posEditPan = Integer.parseInt("" + this.indexMod_tbl);
        if (Val_Panes(nombrePanEdit_txt.getText(), precioPanEdit_txt.getText(), cantidadPanEdit_txt.getText())) {
            paco.Uptade(posEditPan, new Pan(
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
        Consult_General(nombrePanConsultEdit_txt.getText(), listaPanesEdit_tbl);
    }//GEN-LAST:event_consultPanEdit_btnActionPerformed

    private void Consult_General(String s, JTable Tabla){
       Consulta = (DefaultTableModel) Tabla.getModel();
        if (ValConsult(s, Proveedor.Read(s.toUpperCase()))) {
            paco.Tablas(Consulta, paco.Read(s.toUpperCase()));
        }
        Consulta = null; 
    }

    private void consultPan_btn(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultPan_btn
        Consult_General(nombrePanConsult_txt.getText(), listaPanesConsult_tbl);
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
        Consult_General(nombreProvConsult_txt.getText(), listaProvConsult_tbl);
    }//GEN-LAST:event_consultProv_btnActionPerformed

    private void nombreProvConsult_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreProvConsult_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreProvConsult_txtActionPerformed

    private void consultProvEdit_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultProvEdit_btnActionPerformed
        Consult_General(nombreProvEdit_txt.getText(), listaProveedoresEdit_tbl);
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
        Consult_General(nombrePanEliminar_txt.getText(), listaPanesEliminar_tbl);
     }//GEN-LAST:event_consultPanEliminar_btnActionPerformed

    private void LimpiarReg_Prov() {
        nombreProvReg_txt.setText(null);
        telefonoProvReg_txt.setText(null);
        serviProvReg_txt.setText(null);
        nitProvReg_txt.setText(null);
        direcProvReg_txt.setText(null);
    }

    private void selecProdEliminar_tbl(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_selecProdEliminar_tbl
        //Posicion en tabla eliminar
        int posEliminarProd = 0;
        for (int i = 0; i < paco.getListaPan().size(); i++) {
            if (listaPanesEliminar_tbl.getValueAt(listaPanesEliminar_tbl.getSelectedRow(), 0).equals(paco.getListaPan().get(i).getNombreTipo())) {
                posEliminarProd = i;
            }
        }
        //igualar posicion global con posicion local
        this.indexElim_tbl = posEliminarProd;
        selecPanEliminar_chbx.setSelected(true);
        selecPanEliminar_chbx.setText(paco.getListaPan().get(posEliminarProd).getNombreTipo());

    }//GEN-LAST:event_selecProdEliminar_tbl

    private void eliminarPan_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarPan_btnActionPerformed
        int opcEliminarPan = JOptionPane.showConfirmDialog(null, "¿ Desea Eliminar " + paco.getListaPan().get(Integer.parseInt(this.indexElim_tbl.toString())).getNombreTipo() + "?");
        switch (opcEliminarPan) {
            case (0):
                paco.Delete(Integer.parseInt(this.indexElim_tbl.toString()));
                selecPanEliminar_chbx.setText("Seleccionado");
                Listas();
                break;
        }
        selecPanEliminar_chbx.setSelected(true);

    }//GEN-LAST:event_eliminarPan_btnActionPerformed

    private void listaProveedoresEdit_tblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listaProveedoresEdit_tblMouseClicked
        int posEditProv = 0;
        for (int i = 0; i < Proveedor.getListaProveedores().size(); i++) {
            if (listaProveedoresEdit_tbl.getValueAt(listaProveedoresEdit_tbl.getSelectedRow(), 0).equals(Proveedor.getListaProveedores().get(i).getsNombre())) {
                posEditProv = i;
            }
        }
        this.indexModProv_tbl = posEditProv;
        selecEditProv_chbx.setSelected(true);
        EditProv_btn.setEnabled(true);
        nombreProvEdit_txt.setText(Proveedor.getListaProveedores().get(posEditProv).getsNombre());
        telefonoProvEdit_txt.setText(Proveedor.getListaProveedores().get(posEditProv).getsTelefono());
        serviProvEdit_txt.setText(Proveedor.getListaProveedores().get(posEditProv).getsServicio());
        direcProvEdit_txt.setText(Proveedor.getListaProveedores().get(posEditProv).getsDireccion());
        nitProvEdit_txt.setText(Proveedor.getListaProveedores().get(posEditProv).getsId());
    }//GEN-LAST:event_listaProveedoresEdit_tblMouseClicked

    /**
     * @param args the command line arguments
     */
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
    private javax.swing.JPanel Consultar_Producto1;
    private javax.swing.JButton EditPan_btn;
    private javax.swing.JButton EditProv_btn;
    private javax.swing.JButton EliminarProv_btn;
    private javax.swing.JPanel Eliminar_Producto;
    private javax.swing.JPanel Eliminar_Producto1;
    private javax.swing.JButton GuardarEditPan_btn;
    private javax.swing.JButton GuardarEditProv_btn;
    private javax.swing.JPanel Modificar_Producto;
    private javax.swing.JPanel Modificar_Producto1;
    private javax.swing.JTabbedPane Panel_General;
    private javax.swing.JTabbedPane Productos;
    private javax.swing.JTabbedPane Proveedores;
    private javax.swing.JPanel Registrar_Producto;
    private javax.swing.JPanel Registrar_Producto1;
    private javax.swing.JPanel Ventas;
    private javax.swing.JButton cancelarEditPan_btn;
    private javax.swing.JButton cancelarEditProv_btn;
    private javax.swing.JTextField cantidadPanEdit_txt;
    private javax.swing.JTextField cantidadPanReg_txt;
    private javax.swing.JButton consultPanEdit_btn;
    private javax.swing.JButton consultPanEliminar_btn;
    private javax.swing.JButton consultPan_btn;
    private javax.swing.JButton consultProvEdit_btn;
    private javax.swing.JButton consultProv_btn;
    private javax.swing.JTextField direcProvEdit_txt;
    private javax.swing.JTextField direcProvReg_txt;
    private javax.swing.JButton eliminarPan_btn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
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
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JTable listaPanesConsult_tbl;
    private javax.swing.JTable listaPanesEdit_tbl;
    private javax.swing.JTable listaPanesEliminar_tbl;
    private javax.swing.JTable listaPanesReg_tbl;
    private javax.swing.JTable listaProvConsult_tbl;
    private javax.swing.JTable listaProvEliminar_tbl;
    private javax.swing.JTable listaProveedorReg_tbl1;
    private javax.swing.JTable listaProveedoresEdit_tbl;
    private javax.swing.JTextField nitProvEdit_txt;
    private javax.swing.JTextField nitProvReg_txt;
    private javax.swing.JTextField nombreEliminarProv_txt;
    private javax.swing.JTextField nombrePanConsultEdit_txt;
    private javax.swing.JTextField nombrePanConsult_txt;
    private javax.swing.JTextField nombrePanEdit_txt;
    private javax.swing.JTextField nombrePanEliminar_txt;
    private javax.swing.JTextField nombrePanReg_txt;
    private javax.swing.JTextField nombreProvConsultEdit_txt;
    private javax.swing.JTextField nombreProvConsult_txt;
    private javax.swing.JTextField nombreProvEdit_txt;
    private javax.swing.JTextField nombreProvReg_txt;
    private javax.swing.JTextField precioPanEdit_txt;
    private javax.swing.JTextField precioPanReg_txt;
    private javax.swing.JButton registrarPan_btn;
    private javax.swing.JButton registrarProv_btn;
    private javax.swing.JCheckBox selecConsultPan_chbx;
    private javax.swing.JCheckBox selecConsultProv_chbx;
    private javax.swing.JCheckBox selecEditPan_chbx;
    private javax.swing.JCheckBox selecEditProv_chbx;
    private javax.swing.JCheckBox selecEliminarProv_chbx;
    private javax.swing.JCheckBox selecPanEliminar_chbx;
    private javax.swing.JTextField serviProvEdit_txt;
    private javax.swing.JTextField serviProvReg_txt;
    private javax.swing.JTextField telefonoProvEdit_txt;
    private javax.swing.JTextField telefonoProvReg_txt;
    // End of variables declaration//GEN-END:variables
}
