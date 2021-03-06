/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import conexion.Datos;
import entidad.Piezas;
import entidad.Proveedores;
import entidad.Proyectos;
import javax.swing.JOptionPane;
import scriptsSQL.CorrerScript;

/**
 *
 * @author Kepa I. González Romero
 */
public class Principal extends javax.swing.JFrame {

    Datos dato = new Datos();
    int llama;
    int regActual = 1;
    int tam;
    String codigo = "X99999";
    String txt2 = "";
    String txt3 = "";
    String txt4 = "";

    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
        vnGestion.setVisible(false);
        limpia();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        vnGestion = new javax.swing.JInternalFrame();
        pnlDoble = new javax.swing.JTabbedPane();
        pnlGestion = new javax.swing.JPanel();
        lblTituloAltas = new javax.swing.JLabel();
        lblCodigo = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        lblTercera = new javax.swing.JLabel();
        lblCuarta = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JFormattedTextField();
        txtNombre = new javax.swing.JTextField();
        txtTercera = new javax.swing.JTextField();
        txtCuarta = new javax.swing.JTextField();
        btnLimpiar = new javax.swing.JButton();
        btnInsertar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        pnlListado = new javax.swing.JPanel();
        lblTituloLista = new javax.swing.JLabel();
        lblLCodigo = new javax.swing.JLabel();
        lblL2 = new javax.swing.JLabel();
        lblL3 = new javax.swing.JLabel();
        lblL4 = new javax.swing.JLabel();
        txtLCodigo = new javax.swing.JFormattedTextField();
        txtL2 = new javax.swing.JTextField();
        txtL3 = new javax.swing.JTextField();
        txtL4 = new javax.swing.JTextField();
        numReg = new javax.swing.JTextField();
        separador = new javax.swing.JLabel();
        totalReg = new javax.swing.JTextField();
        btnConsulta = new javax.swing.JButton();
        btnInicio = new javax.swing.JButton();
        btnAnterior = new javax.swing.JButton();
        btnSigui = new javax.swing.JButton();
        btnUltimo = new javax.swing.JButton();
        btnBaja = new javax.swing.JButton();
        barraMenu = new javax.swing.JMenuBar();
        menuBD = new javax.swing.JMenu();
        btnCrearBD = new javax.swing.JMenuItem();
        btnBorrarBD = new javax.swing.JMenuItem();
        btnSalir = new javax.swing.JMenuItem();
        menuProve = new javax.swing.JMenu();
        mnGestProv = new javax.swing.JMenuItem();
        mnListProv = new javax.swing.JMenu();
        provPorCod = new javax.swing.JMenuItem();
        provPorNom = new javax.swing.JMenuItem();
        provPorDir = new javax.swing.JMenuItem();
        menuPieza = new javax.swing.JMenu();
        mnGestPieza = new javax.swing.JMenuItem();
        mnListPieza = new javax.swing.JMenu();
        piePorCod = new javax.swing.JMenuItem();
        piePorNom = new javax.swing.JMenuItem();
        menuProye = new javax.swing.JMenu();
        mnGestProye = new javax.swing.JMenuItem();
        mnListProye = new javax.swing.JMenu();
        proyPorCod = new javax.swing.JMenuItem();
        proyPorNom = new javax.swing.JMenuItem();
        proyPorCiu = new javax.swing.JMenuItem();
        menuGest = new javax.swing.JMenu();
        jMenuItem19 = new javax.swing.JMenuItem();
        jMenuItem16 = new javax.swing.JMenuItem();
        jMenuItem17 = new javax.swing.JMenuItem();
        jMenuItem18 = new javax.swing.JMenuItem();
        Ayuda = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gestión de Proyectos");
        setSize(new java.awt.Dimension(900, 442));

        vnGestion.setClosable(true);
        vnGestion.setTitle("Gestión");
        vnGestion.setComponentPopupMenu(null);
        vnGestion.setVisible(true);

        pnlDoble.setTabLayoutPolicy(javax.swing.JTabbedPane.SCROLL_TAB_LAYOUT);

        lblTituloAltas.setText("ALTAS BAJAS Y  MODIFICACIONES");

        lblCodigo.setText("Código");

        lblNombre.setText("Nombre");

        lblTercera.setText("dato3");

        lblCuarta.setText("dato4");

        txtCodigo.setColumns(6);
        try {
            txtCodigo.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("U#####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        btnLimpiar.setText("LIMPIAR");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        btnInsertar.setText("INSERTAR");
        btnInsertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertarActionPerformed(evt);
            }
        });

        btnModificar.setText("MODIFICAR");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        btnEliminar.setText("ELIMINAR");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlGestionLayout = new javax.swing.GroupLayout(pnlGestion);
        pnlGestion.setLayout(pnlGestionLayout);
        pnlGestionLayout.setHorizontalGroup(
            pnlGestionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlGestionLayout.createSequentialGroup()
                .addGroup(pnlGestionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlGestionLayout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(pnlGestionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlGestionLayout.createSequentialGroup()
                                .addGroup(pnlGestionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblCodigo)
                                    .addComponent(lblNombre)
                                    .addComponent(lblTercera)
                                    .addComponent(lblCuarta))
                                .addGap(33, 33, 33)
                                .addGroup(pnlGestionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtCuarta)
                                    .addGroup(pnlGestionLayout.createSequentialGroup()
                                        .addGroup(pnlGestionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtTercera, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(0, 225, Short.MAX_VALUE))))
                            .addGroup(pnlGestionLayout.createSequentialGroup()
                                .addGap(151, 151, 151)
                                .addComponent(lblTituloAltas))))
                    .addGroup(pnlGestionLayout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addComponent(btnLimpiar)
                        .addGap(38, 38, 38)
                        .addComponent(btnInsertar)
                        .addGap(47, 47, 47)
                        .addComponent(btnModificar)
                        .addGap(34, 34, 34)
                        .addComponent(btnEliminar)))
                .addGap(38, 38, 38))
        );
        pnlGestionLayout.setVerticalGroup(
            pnlGestionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlGestionLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTituloAltas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlGestionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCodigo)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlGestionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombre)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlGestionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTercera)
                    .addComponent(txtTercera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlGestionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCuarta)
                    .addComponent(txtCuarta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addGroup(pnlGestionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLimpiar)
                    .addComponent(btnInsertar)
                    .addComponent(btnModificar)
                    .addComponent(btnEliminar))
                .addGap(25, 25, 25))
        );

        pnlDoble.addTab("Gestión", pnlGestion);

        pnlListado.setName("Listado"); // NOI18N
        pnlListado.setVerifyInputWhenFocusTarget(false);

        lblTituloLista.setText("LISTA DE xxxxxxxxxxxx - UTILIZA LOS BOTONES PARA IR DE UN REG A OTRO");

        lblLCodigo.setText("Código de ");

        lblL2.setText("dato2");

        lblL3.setText("dato3");

        lblL4.setText("dato4");

        txtLCodigo.setEditable(false);

        txtL2.setEditable(false);

        txtL3.setEditable(false);

        txtL4.setEditable(false);

        numReg.setEditable(false);

        separador.setText("///");

        totalReg.setEditable(false);

        btnConsulta.setText("Ejecutar Consulta");
        btnConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultaActionPerformed(evt);
            }
        });

        btnInicio.setText("|<<");
        btnInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInicioActionPerformed(evt);
            }
        });

        btnAnterior.setText("<<");
        btnAnterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnteriorActionPerformed(evt);
            }
        });

        btnSigui.setText(">>");
        btnSigui.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSiguiActionPerformed(evt);
            }
        });

        btnUltimo.setText(">>|");
        btnUltimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUltimoActionPerformed(evt);
            }
        });

        btnBaja.setText("Baja");
        btnBaja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBajaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlListadoLayout = new javax.swing.GroupLayout(pnlListado);
        pnlListado.setLayout(pnlListadoLayout);
        pnlListadoLayout.setHorizontalGroup(
            pnlListadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlListadoLayout.createSequentialGroup()
                .addGroup(pnlListadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlListadoLayout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addComponent(numReg, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlListadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlListadoLayout.createSequentialGroup()
                                .addComponent(separador)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(totalReg, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlListadoLayout.createSequentialGroup()
                                .addGroup(pnlListadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnConsulta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(pnlListadoLayout.createSequentialGroup()
                                        .addComponent(btnInicio)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btnAnterior)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnSigui)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btnUltimo)))
                                .addGap(18, 18, 18)
                                .addComponent(btnBaja))))
                    .addGroup(pnlListadoLayout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(pnlListadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblLCodigo)
                            .addComponent(lblL2)
                            .addComponent(lblL3)
                            .addComponent(lblL4))
                        .addGap(42, 42, 42)
                        .addGroup(pnlListadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtLCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtL2, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtL4, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtL3, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pnlListadoLayout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addComponent(lblTituloLista)))
                .addContainerGap(141, Short.MAX_VALUE))
        );
        pnlListadoLayout.setVerticalGroup(
            pnlListadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlListadoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTituloLista, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlListadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLCodigo)
                    .addComponent(txtLCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlListadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblL2)
                    .addComponent(txtL2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlListadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblL3)
                    .addComponent(txtL3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(pnlListadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtL4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblL4))
                .addGroup(pnlListadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlListadoLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlListadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(numReg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(separador)
                            .addComponent(totalReg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnConsulta)
                        .addGap(18, 18, 18)
                        .addGroup(pnlListadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnInicio, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnAnterior, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnSigui, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnUltimo, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlListadoLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnBaja, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45))))
        );

        pnlDoble.addTab("Listado", pnlListado);

        vnGestion.getContentPane().add(pnlDoble, java.awt.BorderLayout.CENTER);

        menuBD.setText("Base de Datos");

        btnCrearBD.setText("Crear");
        btnCrearBD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearBDActionPerformed(evt);
            }
        });
        menuBD.add(btnCrearBD);

        btnBorrarBD.setText("Borrar");
        btnBorrarBD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarBDActionPerformed(evt);
            }
        });
        menuBD.add(btnBorrarBD);

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        menuBD.add(btnSalir);

        barraMenu.add(menuBD);

        menuProve.setText("Proveedores");

        mnGestProv.setText("Gestión Proveedores");
        mnGestProv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnGestProvActionPerformed(evt);
            }
        });
        menuProve.add(mnGestProv);

        mnListProv.setText("Consulta");

        provPorCod.setText("por Código");
        mnListProv.add(provPorCod);

        provPorNom.setText("por Nombre");
        mnListProv.add(provPorNom);

        provPorDir.setText("por Dirección");
        mnListProv.add(provPorDir);

        menuProve.add(mnListProv);

        barraMenu.add(menuProve);

        menuPieza.setText("Piezas");

        mnGestPieza.setText("Gestión Piezas");
        mnGestPieza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnGestPiezaActionPerformed(evt);
            }
        });
        menuPieza.add(mnGestPieza);

        mnListPieza.setText("Consultas");

        piePorCod.setText("Por Código");
        mnListPieza.add(piePorCod);

        piePorNom.setText("por Nombre");
        mnListPieza.add(piePorNom);

        menuPieza.add(mnListPieza);

        barraMenu.add(menuPieza);

        menuProye.setText("Proyectos");

        mnGestProye.setText("Gestión");
        mnGestProye.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnGestProyeActionPerformed(evt);
            }
        });
        menuProye.add(mnGestProye);

        mnListProye.setText("Consulta");

        proyPorCod.setText("por Código");
        mnListProye.add(proyPorCod);

        proyPorNom.setText("por Nombre");
        mnListProye.add(proyPorNom);

        proyPorCiu.setText("por Ciudad");
        mnListProye.add(proyPorCiu);

        menuProye.add(mnListProye);

        barraMenu.add(menuProye);

        menuGest.setText("Gestión Global");

        jMenuItem19.setText("Piezas, Proveedores y Proyectos");
        menuGest.add(jMenuItem19);

        jMenuItem16.setText("Suministros por Proveedor");
        menuGest.add(jMenuItem16);

        jMenuItem17.setText("Suministros por Piezas");
        menuGest.add(jMenuItem17);

        jMenuItem18.setText("Estadísticas");
        menuGest.add(jMenuItem18);

        barraMenu.add(menuGest);

        Ayuda.setText("Ayuda");
        barraMenu.add(Ayuda);

        setJMenuBar(barraMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(vnGestion, javax.swing.GroupLayout.PREFERRED_SIZE, 673, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 174, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(vnGestion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed

        System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void mnGestProvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnGestProvActionPerformed
        llama = 1;
        restaura();
        preparaListado();
        this.vnGestion.setTitle("GESTION DE PROVEEDORES");
        this.pnlGestion.setName("Gestion de proveedores");
        this.lblCodigo.setText("Código de Proveedor");
        this.lblNombre.setText("Nombre");
        this.lblTercera.setText("Apellido");
        this.lblCuarta.setText("Dirección");


    }//GEN-LAST:event_mnGestProvActionPerformed

    private void mnGestPiezaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnGestPiezaActionPerformed
        llama = 2;
        restaura();
        preparaListado();
        this.vnGestion.setTitle("GESTION DE PIEZAS");
        this.pnlGestion.setName("Gestion de piezas");
        this.lblCodigo.setText("Código de Pieza");
        this.lblNombre.setText("Descripción");
        this.lblTercera.setText("Precio");


    }//GEN-LAST:event_mnGestPiezaActionPerformed

    private void btnCrearBDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearBDActionPerformed
        boolean vacio = dato.compruebaBd();
        if (!vacio) {// verdadero si esta VACIA
            JOptionPane.showMessageDialog(null, "LA BASE DE DATOS EXISTE", "INFORMACIÓN", 1);
        } else {
            CorrerScript.lanza("D:\\AD\\ProyectoAD\\src\\scriptsSQL\\Creacion.sql");
            // llamo a scriptCreacion
        }
    }//GEN-LAST:event_btnCrearBDActionPerformed

    private void btnBorrarBDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarBDActionPerformed
        boolean vacio = dato.compruebaBd();
        if (!vacio) {// verdadero si esta VACIA
            CorrerScript.lanza("D:\\AD\\ProyectoAD\\src\\scriptsSQL\\scriptBorrado.sql");
        } else {
            JOptionPane.showMessageDialog(null, "LA BASE DE DATOS NO EXISTE", "ERROR", 0);
        }
    }//GEN-LAST:event_btnBorrarBDActionPerformed

    private void mnGestProyeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnGestProyeActionPerformed
        llama = 3;
        this.vnGestion.setVisible(true);
        this.vnGestion.repaint();
        this.vnGestion.setTitle("GESTION DE PROYECTOS");
        this.pnlGestion.setName("Gestion de proyectos");
        this.lblCodigo.setText("Código de Proyecto");
        this.lblNombre.setText("Nombre");
        this.lblTercera.setText("Ciudad");
        this.lblCuarta.setVisible(false);
        this.txtCuarta.setVisible(false);
    }//GEN-LAST:event_mnGestProyeActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        limpia();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnInsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertarActionPerformed
        truncaCodigo();
        switch (llama) {
            case (1):
                Proveedores prov = new Proveedores();
                // trunco si es mas largo

                truncaProvee();
                // cargo el nuevo proveedor
                prov.setCodigo(this.txtCodigo.getText());
                prov.setNombre(this.txtNombre.getText());
                prov.setApellidos(this.txtTercera.getText());
                prov.setDireccion(this.txtCuarta.getText());
                dato.altaProveedor(prov);
                break;
            case (2):
                Piezas pieza = new Piezas();
                truncaPieza();
                pieza.setCodigo(this.txtCodigo.getText());
                pieza.setNombre(this.txtNombre.getText());
                pieza.setDescripcion(this.txtTercera.getText());
                try {
                    pieza.setPrecio(Float.valueOf(this.txtCuarta.getText()));
                } catch (NumberFormatException nfEx) {
                }
                dato.altaPieza(pieza);
                break;
            case (3):
                Proyectos proye = new Proyectos();
                break;
            default:
                break;
        }
    }//GEN-LAST:event_btnInsertarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed

        truncaCodigo();
        String codigo = this.txtCodigo.getText();
        switch (llama) {

            case (1):
                dato.modiProveedor(codigo);

                break;
            case (2):
                break;
            case (3):
                break;
            default:
                break;
        }
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        truncaCodigo();
        String codigo = this.txtCodigo.getText();
        switch (llama) {
            case (1):
                Proveedores prov = dato.obtenerProv(codigo);
                dato.bajaProveedor(prov);
                break;
            case (2):
                Piezas pieza = dato.obtenerPieza(codigo);
                dato.bajaPiezas(pieza);
                break;
            case (3):
                Proyectos proye = dato.obtenerProyecto(codigo);
                dato.bajaProyecto(proye);
                break;
            default:
                break;
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnteriorActionPerformed
        // TODO add your handling code here:
        if (regActual > 1) {
            regActual--;
            preparaListado();
        }
    }//GEN-LAST:event_btnAnteriorActionPerformed

    private void btnInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInicioActionPerformed
        // TODO add your handling code here:
        regActual = 1;
        preparaListado();
    }//GEN-LAST:event_btnInicioActionPerformed

    private void btnConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnConsultaActionPerformed

    private void btnSiguiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSiguiActionPerformed
        // TODO add your handling code here:
        if (regActual < tam) {
            regActual++;
            preparaListado();
        }

    }//GEN-LAST:event_btnSiguiActionPerformed

    private void btnUltimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUltimoActionPerformed
        // TODO add your handling code here:
        regActual = tam;
        preparaListado();
    }//GEN-LAST:event_btnUltimoActionPerformed

    private void btnBajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBajaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBajaActionPerformed

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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Principal().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu Ayuda;
    private javax.swing.JMenuBar barraMenu;
    private javax.swing.JButton btnAnterior;
    private javax.swing.JButton btnBaja;
    private javax.swing.JMenuItem btnBorrarBD;
    private javax.swing.JButton btnConsulta;
    private javax.swing.JMenuItem btnCrearBD;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnInicio;
    private javax.swing.JButton btnInsertar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JMenuItem btnSalir;
    private javax.swing.JButton btnSigui;
    private javax.swing.JButton btnUltimo;
    private javax.swing.JMenuItem jMenuItem16;
    private javax.swing.JMenuItem jMenuItem17;
    private javax.swing.JMenuItem jMenuItem18;
    private javax.swing.JMenuItem jMenuItem19;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JLabel lblCuarta;
    private javax.swing.JLabel lblL2;
    private javax.swing.JLabel lblL3;
    private javax.swing.JLabel lblL4;
    private javax.swing.JLabel lblLCodigo;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblTercera;
    private javax.swing.JLabel lblTituloAltas;
    private javax.swing.JLabel lblTituloLista;
    private javax.swing.JMenu menuBD;
    private javax.swing.JMenu menuGest;
    private javax.swing.JMenu menuPieza;
    private javax.swing.JMenu menuProve;
    private javax.swing.JMenu menuProye;
    private javax.swing.JMenuItem mnGestPieza;
    private javax.swing.JMenuItem mnGestProv;
    private javax.swing.JMenuItem mnGestProye;
    private javax.swing.JMenu mnListPieza;
    private javax.swing.JMenu mnListProv;
    private javax.swing.JMenu mnListProye;
    private javax.swing.JTextField numReg;
    private javax.swing.JMenuItem piePorCod;
    private javax.swing.JMenuItem piePorNom;
    private javax.swing.JTabbedPane pnlDoble;
    private javax.swing.JPanel pnlGestion;
    private javax.swing.JPanel pnlListado;
    private javax.swing.JMenuItem provPorCod;
    private javax.swing.JMenuItem provPorDir;
    private javax.swing.JMenuItem provPorNom;
    private javax.swing.JMenuItem proyPorCiu;
    private javax.swing.JMenuItem proyPorCod;
    private javax.swing.JMenuItem proyPorNom;
    private javax.swing.JLabel separador;
    private javax.swing.JTextField totalReg;
    private javax.swing.JFormattedTextField txtCodigo;
    private javax.swing.JTextField txtCuarta;
    private javax.swing.JTextField txtL2;
    private javax.swing.JTextField txtL3;
    private javax.swing.JTextField txtL4;
    private javax.swing.JFormattedTextField txtLCodigo;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTercera;
    private javax.swing.JInternalFrame vnGestion;
    // End of variables declaration//GEN-END:variables

    private void restaura() {
        this.lblCuarta.setVisible(true);
        this.txtCuarta.setVisible(true);
        this.vnGestion.repaint();
        this.vnGestion.setVisible(true);

    }

    private void limpia() {
        this.txtCodigo.setText("");
        this.txtNombre.setText("");
        this.txtTercera.setText("");
        this.txtCuarta.setText("");
    }

    private void truncaCodigo() {
        if (this.txtCodigo.getText().length() > 6) {
            this.txtCodigo.setText(this.txtCodigo.getText().substring(0, 6));
        }
    }

    private void truncaProvee() {
        if (this.txtNombre.getText().length() > 20) {
            this.txtNombre.setText(this.txtNombre.getText().substring(0, 20));
        }
        if (this.txtTercera.getText().length() > 30) {
            this.txtTercera.setText(this.txtTercera.getText().substring(0, 30));
        }
        if (this.txtCuarta.getText().length() > 40) {
            this.txtCuarta.setText(this.txtCuarta.getText().substring(0, 40));
        }

    }

    private void truncaPieza() {
        if (this.txtNombre.getText().length() > 20) {
            this.txtNombre.setText(this.txtNombre.getText().substring(0, 20));
        }

    }

    private void preparaListado() {

        switch (llama) {
            case (1):
                lblTituloLista.setText("LISTA DE PROVEEDORES - UTILIZA LOS BOTONES PARA IR DE UN REG A OTRO");
                lblL2.setText("Nombre");
                lblL3.setText("Apellidos");
                lblL4.setText("Dirección");
                tam = dato.listaProv().size();

                pintaProv();

                break;
            case (2):
                lblTituloLista.setText("LISTA DE PIEZAS - UTILIZA LOS BOTONES PARA IR DE UN REG A OTRO");
                break;
            default:
                break;
        }
        txtLCodigo.setText(codigo);
        txtL2.setText(txt2);
        txtL3.setText(txt3);
        txtL4.setText(txt4);
        numReg.setText(String.valueOf(regActual));
        totalReg.setText(String.valueOf(tam));
    }

    private void pintaProv() {
        codigo = dato.listaProv().get(regActual-1).getCodigo();
        txt2 = dato.listaProv().get(regActual-1).getNombre();
        txt3 = dato.listaProv().get(regActual-1).getApellidos();
        txt4 = dato.listaProv().get(regActual-1).getDireccion();
       // numReg.setText(String.valueOf(regActual));
    }

}
