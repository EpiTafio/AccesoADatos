/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import conexion.Datos;
import entidad.Proveedores;
import javax.swing.JOptionPane;
import scriptsSQL.CorrerScript;

/**
 *
 * @author Kepa I. González Romero
 */
public class Principal extends javax.swing.JFrame {

    Datos dato = new Datos();
    int llama;

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
        lblCodigo = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        lblTercera = new javax.swing.JLabel();
        lblCuarta = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtTercera = new javax.swing.JTextField();
        txtCuarta = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        btnLimpiar = new javax.swing.JButton();
        btnInsertar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        pnlListado = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        barraMenu = new javax.swing.JMenuBar();
        menuBD = new javax.swing.JMenu();
        btnCrearBD = new javax.swing.JMenuItem();
        btnBorrarBD = new javax.swing.JMenuItem();
        btnSalir = new javax.swing.JMenuItem();
        menuProve = new javax.swing.JMenu();
        mnGestProv = new javax.swing.JMenuItem();
        mnListProv = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        menuPieza = new javax.swing.JMenu();
        mnGestPieza = new javax.swing.JMenuItem();
        mnListPieza = new javax.swing.JMenu();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        menuProye = new javax.swing.JMenu();
        mnGestProye = new javax.swing.JMenuItem();
        mnListProye = new javax.swing.JMenu();
        jMenuItem13 = new javax.swing.JMenuItem();
        jMenuItem14 = new javax.swing.JMenuItem();
        jMenuItem15 = new javax.swing.JMenuItem();
        menuGest = new javax.swing.JMenu();
        jMenuItem19 = new javax.swing.JMenuItem();
        jMenuItem16 = new javax.swing.JMenuItem();
        jMenuItem17 = new javax.swing.JMenuItem();
        jMenuItem18 = new javax.swing.JMenuItem();
        Ayuda = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gestión de Proyectos");
        setSize(new java.awt.Dimension(500, 300));

        vnGestion.setClosable(true);
        vnGestion.setTitle("Gestión");
        vnGestion.setComponentPopupMenu(null);
        vnGestion.setVisible(true);

        pnlDoble.setTabLayoutPolicy(javax.swing.JTabbedPane.SCROLL_TAB_LAYOUT);

        lblCodigo.setText("Código");

        lblNombre.setText("Nombre");

        lblTercera.setText("jLabel3");

        lblCuarta.setText("jLabel4");

        txtCodigo.setText("jTextField1");

        txtNombre.setText("jTextField2");

        txtTercera.setText("jTextField3");

        txtCuarta.setText("jTextField4");

        jLabel5.setText("ALTAS BAJAS Y  MODIFICACIONES");

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
                                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtTercera, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtCuarta)))
                            .addGroup(pnlGestionLayout.createSequentialGroup()
                                .addGap(151, 151, 151)
                                .addComponent(jLabel5))))
                    .addGroup(pnlGestionLayout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addComponent(btnLimpiar)
                        .addGap(38, 38, 38)
                        .addComponent(btnInsertar)
                        .addGap(47, 47, 47)
                        .addComponent(btnModificar)
                        .addGap(34, 34, 34)
                        .addComponent(btnEliminar)))
                .addGap(176, 176, 176))
        );
        pnlGestionLayout.setVerticalGroup(
            pnlGestionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlGestionLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(pnlGestionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLimpiar)
                    .addComponent(btnInsertar)
                    .addComponent(btnModificar)
                    .addComponent(btnEliminar))
                .addGap(25, 25, 25))
        );

        pnlDoble.addTab("Gestión", pnlGestion);

        pnlListado.setVerifyInputWhenFocusTarget(false);

        jLabel1.setText("LISTA DE xxxxxxxxxxxx - UTILIZA FFJDDHDLFLGDFHGLDHFLG");

        jLabel2.setText("jLabel2");

        jLabel3.setText("jLabel3");

        jLabel4.setText("jLabel4");

        jLabel6.setText("jLabel6");

        jTextField1.setText("jTextField1");

        jTextField2.setText("jTextField2");

        jTextField3.setText("jTextField3");

        jTextField4.setText("jTextField4");

        jTextField5.setText("jTextField5");

        jLabel7.setText("///");

        jTextField6.setText("jTextField6");

        javax.swing.GroupLayout pnlListadoLayout = new javax.swing.GroupLayout(pnlListado);
        pnlListado.setLayout(pnlListadoLayout);
        pnlListadoLayout.setHorizontalGroup(
            pnlListadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlListadoLayout.createSequentialGroup()
                .addGroup(pnlListadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlListadoLayout.createSequentialGroup()
                        .addGap(226, 226, 226)
                        .addComponent(jLabel1))
                    .addGroup(pnlListadoLayout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(pnlListadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6))
                        .addGap(42, 42, 42)
                        .addGroup(pnlListadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pnlListadoLayout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(173, Short.MAX_VALUE))
        );
        pnlListadoLayout.setVerticalGroup(
            pnlListadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlListadoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlListadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlListadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlListadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(pnlListadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlListadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(71, Short.MAX_VALUE))
        );

        pnlDoble.addTab("Listado", pnlListado);

        javax.swing.GroupLayout vnGestionLayout = new javax.swing.GroupLayout(vnGestion.getContentPane());
        vnGestion.getContentPane().setLayout(vnGestionLayout);
        vnGestionLayout.setHorizontalGroup(
            vnGestionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlDoble, javax.swing.GroupLayout.PREFERRED_SIZE, 738, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        vnGestionLayout.setVerticalGroup(
            vnGestionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(vnGestionLayout.createSequentialGroup()
                .addComponent(pnlDoble, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 13, Short.MAX_VALUE))
        );

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

        jMenuItem5.setText("por Código");
        mnListProv.add(jMenuItem5);

        jMenuItem6.setText("por Nombre");
        mnListProv.add(jMenuItem6);

        jMenuItem7.setText("por Dirección");
        mnListProv.add(jMenuItem7);

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

        jMenuItem9.setText("Por Código");
        mnListPieza.add(jMenuItem9);

        jMenuItem10.setText("por Nombre");
        mnListPieza.add(jMenuItem10);

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

        jMenuItem13.setText("por Código");
        mnListProye.add(jMenuItem13);

        jMenuItem14.setText("por Nombre");
        mnListProye.add(jMenuItem14);

        jMenuItem15.setText("por Ciudad");
        mnListProye.add(jMenuItem15);

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
            .addComponent(vnGestion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(vnGestion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed

        System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void mnGestProvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnGestProvActionPerformed
       llama=1;
       restaura();
      
        this.vnGestion.setTitle("GESTION DE PROVEEDORES");
        this.pnlGestion.setName("Gestion de proveedores");
        this.lblCodigo.setText("Código de Proveedor");
        this.lblNombre.setText("Nombre");
        this.lblTercera.setText("Apellido");
    }//GEN-LAST:event_mnGestProvActionPerformed

    private void mnGestPiezaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnGestPiezaActionPerformed
       llama=2;
       restaura();
        this.vnGestion.setTitle("GESTION DE PIEZAS");
        this.pnlGestion.setName("Gestion de proyectos");
        this.lblCodigo.setText("Código de Proyecto");
        this.lblNombre.setText("Nombre");
        this.lblTercera.setText("Ciudad");

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
        llama=3;
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
        switch(llama){
            case(1):
                Proveedores prov=new Proveedores();
                prov.setCodigo(this.txtCodigo.getText());
                prov.setNombre(this.txtNombre.getText());
                prov.setApellidos(this.txtTercera.getText());
                prov.setDireccion(this.txtCuarta.getText());
                dato.altaProveedor(prov);
                break;
            case (2):
                
                break;
            default:
                break;
        }
    }//GEN-LAST:event_btnInsertarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEliminarActionPerformed

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
    private javax.swing.JMenuItem btnBorrarBD;
    private javax.swing.JMenuItem btnCrearBD;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnInsertar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JMenuItem btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem14;
    private javax.swing.JMenuItem jMenuItem15;
    private javax.swing.JMenuItem jMenuItem16;
    private javax.swing.JMenuItem jMenuItem17;
    private javax.swing.JMenuItem jMenuItem18;
    private javax.swing.JMenuItem jMenuItem19;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JLabel lblCuarta;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblTercera;
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
    private javax.swing.JTabbedPane pnlDoble;
    private javax.swing.JPanel pnlGestion;
    private javax.swing.JPanel pnlListado;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtCuarta;
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
    private void limpia(){
    this.txtCodigo.setText("");
    this.txtNombre.setText("");
    this.txtTercera.setText("");
    this.txtCuarta.setText("");
    }

}
