/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.ucv.examen.view;

//import pe.edu.ucv.prueba01.model.RegistrarProducto;
import java.awt.Color;
import javax.swing.border.LineBorder;
import pe.edu.ucv.examen.service.PruebadelCodigoframe;


/**
 *
 * @author User
 */
public class Principalview extends javax.swing.JFrame {
Principalview claseprincipal;
    RegistrodeVenta1 venta = new RegistrodeVenta1();
    
    PruebadelCodigoframe Controller = new PruebadelCodigoframe();
    CatalogoPrincipal  catalogo = new  CatalogoPrincipal ();
    RegistrarProducto producto = new RegistrarProducto();
    public Principalview() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        lblLogo = new javax.swing.JLabel();
        jbtnsalir = new javax.swing.JButton();
        jbtnprincipal = new javax.swing.JButton();
        jbtnVenta = new javax.swing.JButton();
        jbtnproveedor = new javax.swing.JButton();
        jbtnCatalogo = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        PanelBanner = new javax.swing.JPanel();
        lblPastelito1 = new javax.swing.JLabel();
        lblPastelito2 = new javax.swing.JLabel();
        lblPastelito3 = new javax.swing.JLabel();
        lblPastelito4 = new javax.swing.JLabel();
        lblPastelito5 = new javax.swing.JLabel();
        lblPastelito6 = new javax.swing.JLabel();
        lblPastelito7 = new javax.swing.JLabel();
        lblPastelito8 = new javax.swing.JLabel();
        lblPastelito9 = new javax.swing.JLabel();
        lblPastelito10 = new javax.swing.JLabel();
        lblPastelito13 = new javax.swing.JLabel();
        lblPastelito14 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        Contenedor2 = new javax.swing.JPanel();
        lblTituloEntrada = new javax.swing.JLabel();
        PanelDelMensaje = new javax.swing.JPanel();
        lblLinea5 = new javax.swing.JLabel();
        lblLinea1 = new javax.swing.JLabel();
        lblLinea2 = new javax.swing.JLabel();
        lblLinea3 = new javax.swing.JLabel();
        lblLinea4 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        Contenedor3 = new javax.swing.JPanel();
        lblTituloEntrada1 = new javax.swing.JLabel();
        PanelDelMensaje1 = new javax.swing.JPanel();
        lblLinea6 = new javax.swing.JLabel();
        lblLinea7 = new javax.swing.JLabel();
        lblLinea8 = new javax.swing.JLabel();
        lblLinea9 = new javax.swing.JLabel();
        lblLinea10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204), 2));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel2.setFocusCycleRoot(true);
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes3/DulcesPaula.jpg"))); // NOI18N
        lblLogo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.add(lblLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 110, 130));

        jbtnsalir.setBackground(new java.awt.Color(255, 255, 255));
        jbtnsalir.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jbtnsalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes4/cerrar-sesion-removebg-preview.jpg"))); // NOI18N
        jbtnsalir.setText("Cerrar Sesion");
        jbtnsalir.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        jbtnsalir.setBorderPainted(false);
        jbtnsalir.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes4/cerrar-sesion (1).jpg"))); // NOI18N
        jbtnsalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jbtnsalirMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jbtnsalirMouseExited(evt);
            }
        });
        jbtnsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnsalirActionPerformed(evt);
            }
        });
        jPanel2.add(jbtnsalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 600, 200, 90));

        jbtnprincipal.setBackground(new java.awt.Color(255, 255, 255));
        jbtnprincipal.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jbtnprincipal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes4/casa-silueta-negra-sin-puerta-removebg-preview.jpg"))); // NOI18N
        jbtnprincipal.setText("        Principal");
        jbtnprincipal.setBorderPainted(false);
        jbtnprincipal.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jbtnprincipal.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes4/casa.jpg"))); // NOI18N
        jbtnprincipal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jbtnprincipalMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jbtnprincipalMouseExited(evt);
            }
        });
        jbtnprincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnprincipalActionPerformed(evt);
            }
        });
        jPanel2.add(jbtnprincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 200, -1));

        jbtnVenta.setBackground(new java.awt.Color(255, 255, 255));
        jbtnVenta.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jbtnVenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes4/caja-registradora-removebg-preview.jpg"))); // NOI18N
        jbtnVenta.setText("        Venta");
        jbtnVenta.setBorderPainted(false);
        jbtnVenta.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes4/caja-registradora (1).jpg"))); // NOI18N
        jbtnVenta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jbtnVentaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jbtnVentaMouseExited(evt);
            }
        });
        jbtnVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnVentaActionPerformed(evt);
            }
        });
        jPanel2.add(jbtnVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 260, 200, 80));

        jbtnproveedor.setBackground(new java.awt.Color(255, 255, 255));
        jbtnproveedor.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jbtnproveedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes4/caja-de-pastel.jpg"))); // NOI18N
        jbtnproveedor.setText(" +Productos");
        jbtnproveedor.setBorderPainted(false);
        jbtnproveedor.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes4/Imagen2.png"))); // NOI18N
        jbtnproveedor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jbtnproveedorMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jbtnproveedorMouseExited(evt);
            }
        });
        jbtnproveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnproveedorActionPerformed(evt);
            }
        });
        jPanel2.add(jbtnproveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 350, 200, 70));

        jbtnCatalogo.setBackground(new java.awt.Color(255, 255, 255));
        jbtnCatalogo.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jbtnCatalogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes4/libro-de-recetas.jpg"))); // NOI18N
        jbtnCatalogo.setText("   Recetario");
        jbtnCatalogo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jbtnCatalogo.setBorderPainted(false);
        jbtnCatalogo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jbtnCatalogo.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes4/Imagen1.jpg"))); // NOI18N
        jbtnCatalogo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jbtnCatalogoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jbtnCatalogoMouseExited(evt);
            }
        });
        jbtnCatalogo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnCatalogoActionPerformed(evt);
            }
        });
        jPanel2.add(jbtnCatalogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 430, 200, 80));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 200, 690));

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 11, 1150, -1));

        PanelBanner.setBackground(new java.awt.Color(255, 165, 227));
        PanelBanner.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblPastelito1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes4/Pastelito-removebg-preview.jpg"))); // NOI18N
        PanelBanner.add(lblPastelito1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 70, 80));

        lblPastelito2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes4/Pastelito1-removebg-preview.jpg"))); // NOI18N
        PanelBanner.add(lblPastelito2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, 70, 70));

        lblPastelito3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes4/Pastelito3-removebg-preview.jpg"))); // NOI18N
        PanelBanner.add(lblPastelito3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 20, 70, 70));

        lblPastelito4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes4/Empana-removebg-preview.jpg"))); // NOI18N
        PanelBanner.add(lblPastelito4, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 10, 70, 70));

        lblPastelito5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes4/Alfajor-removebg-preview.jpg"))); // NOI18N
        PanelBanner.add(lblPastelito5, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 20, 70, 70));

        lblPastelito6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes4/Pastelito-removebg-preview.jpg"))); // NOI18N
        PanelBanner.add(lblPastelito6, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 10, 70, 70));

        lblPastelito7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes4/Pastelito1-removebg-preview.jpg"))); // NOI18N
        PanelBanner.add(lblPastelito7, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 20, 70, 70));

        lblPastelito8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes4/Pastelito3-removebg-preview.jpg"))); // NOI18N
        PanelBanner.add(lblPastelito8, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 10, 70, 70));

        lblPastelito9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes4/Empana-removebg-preview.jpg"))); // NOI18N
        PanelBanner.add(lblPastelito9, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 20, 70, 70));

        lblPastelito10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes4/Pastelito1-removebg-preview.jpg"))); // NOI18N
        PanelBanner.add(lblPastelito10, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 10, 70, 70));

        lblPastelito13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes4/Alfajor-removebg-preview.jpg"))); // NOI18N
        PanelBanner.add(lblPastelito13, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 10, 70, 70));

        lblPastelito14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes4/Pastelito-removebg-preview.jpg"))); // NOI18N
        PanelBanner.add(lblPastelito14, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 20, 70, 70));

        jPanel3.add(PanelBanner, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1160, 110));

        Contenedor2.setBackground(new java.awt.Color(255, 255, 255));
        Contenedor2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTituloEntrada.setFont(new java.awt.Font("Noto Sans", 1, 30)); // NOI18N
        lblTituloEntrada.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTituloEntrada.setText("¡Bienvenido al sistema, Jefe!");
        Contenedor2.add(lblTituloEntrada, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 130, 430, 60));

        PanelDelMensaje.setBackground(new java.awt.Color(255, 255, 255));
        PanelDelMensaje.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        PanelDelMensaje.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblLinea5.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        lblLinea5.setText("negocio de repostería de manera eficienta y deliciosa!");
        PanelDelMensaje.add(lblLinea5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 550, 20));

        lblLinea1.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        lblLinea1.setText("Estamos encantados de que estes aquí. Desde esta plataforma, puedes");
        PanelDelMensaje.add(lblLinea1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 550, 20));

        lblLinea2.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        lblLinea2.setText("supervisar y gestionar todos los aspectos de nuestra repostería. Si tienes");
        PanelDelMensaje.add(lblLinea2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 560, 20));

        lblLinea3.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        lblLinea3.setText("alguna solicitud especial o necesitas asistencia, estamos a tu");
        PanelDelMensaje.add(lblLinea3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 550, 20));

        lblLinea4.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        lblLinea4.setText("disposición. ¡Gracias por confiar en nosotros para llevar a cabo tu");
        PanelDelMensaje.add(lblLinea4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 540, -1));

        Contenedor2.add(PanelDelMensaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 210, 600, 130));

        jTabbedPane1.addTab("tab1", Contenedor2);

        Contenedor3.setBackground(new java.awt.Color(255, 255, 255));
        Contenedor3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTituloEntrada1.setFont(new java.awt.Font("Noto Sans", 1, 30)); // NOI18N
        lblTituloEntrada1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTituloEntrada1.setText("¡Bienvenido al sistema, Jefe!");
        Contenedor3.add(lblTituloEntrada1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 130, 430, 60));

        PanelDelMensaje1.setBackground(new java.awt.Color(255, 255, 255));
        PanelDelMensaje1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        PanelDelMensaje1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblLinea6.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        lblLinea6.setText("negocio de repostería de manera eficienta y deliciosa!");
        PanelDelMensaje1.add(lblLinea6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 550, 20));

        lblLinea7.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        lblLinea7.setText("Estamos encantados de que estes aquí. Desde esta plataforma, puedes");
        PanelDelMensaje1.add(lblLinea7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 550, 20));

        lblLinea8.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        lblLinea8.setText("supervisar y gestionar todos los aspectos de nuestra repostería. Si tienes");
        PanelDelMensaje1.add(lblLinea8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 560, 20));

        lblLinea9.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        lblLinea9.setText("alguna solicitud especial o necesitas asistencia, estamos a tu");
        PanelDelMensaje1.add(lblLinea9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 550, 20));

        lblLinea10.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        lblLinea10.setText("disposición. ¡Gracias por confiar en nosotros para llevar a cabo tu");
        PanelDelMensaje1.add(lblLinea10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 540, -1));

        Contenedor3.add(PanelDelMensaje1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 210, 600, 130));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1155, Short.MAX_VALUE)
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(Contenedor3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1155, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 592, Short.MAX_VALUE)
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                    .addGap(0, 15, Short.MAX_VALUE)
                    .addComponent(Contenedor3, javax.swing.GroupLayout.PREFERRED_SIZE, 577, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jTabbedPane1.addTab("tab2", jPanel5);

        jPanel3.add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 1160, 620));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 0, -1, 690));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1361, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 691, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnprincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnprincipalActionPerformed
 jTabbedPane1.setSelectedIndex(1);
    }//GEN-LAST:event_jbtnprincipalActionPerformed

    private void jbtnVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnVentaActionPerformed
        jTabbedPane1.setSelectedIndex(0);
        Controller.PanelesControllerVerdadero(Contenedor2, venta);
    }//GEN-LAST:event_jbtnVentaActionPerformed

    private void jbtnCatalogoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnCatalogoActionPerformed
        jbtnCatalogo.setBorder(new LineBorder(Color.WHITE));   
        jTabbedPane1.setSelectedIndex(0);
        Controller.PanelesControllerVerdadero(Contenedor2, catalogo);
    }//GEN-LAST:event_jbtnCatalogoActionPerformed

    private void jbtnsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnsalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jbtnsalirActionPerformed

    private void jbtnsalirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtnsalirMouseEntered
       jbtnsalir.setForeground(Color.WHITE);
        jbtnsalir.setBackground(Color.BLACK);
    }//GEN-LAST:event_jbtnsalirMouseEntered

    private void jbtnsalirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtnsalirMouseExited
    jbtnsalir.setBackground( Color.WHITE);
       jbtnsalir.setForeground(Color.BLACK);
    }//GEN-LAST:event_jbtnsalirMouseExited

    private void jbtnCatalogoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtnCatalogoMouseEntered
   jbtnCatalogo.setForeground(Color.WHITE);
    jbtnCatalogo.setBackground(Color.BLACK);
    }//GEN-LAST:event_jbtnCatalogoMouseEntered

    private void jbtnCatalogoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtnCatalogoMouseExited
   jbtnCatalogo.setBackground(Color.WHITE);
   jbtnCatalogo.setForeground(Color.BLACK);
    }//GEN-LAST:event_jbtnCatalogoMouseExited

    private void jbtnproveedorMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtnproveedorMouseEntered
    jbtnproveedor.setForeground(Color.WHITE);
    jbtnproveedor.setBackground(Color.BLACK);
    }//GEN-LAST:event_jbtnproveedorMouseEntered

    private void jbtnproveedorMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtnproveedorMouseExited
     jbtnproveedor.setBackground( Color.WHITE);
     jbtnproveedor.setForeground(Color.BLACK);
    }//GEN-LAST:event_jbtnproveedorMouseExited

    private void jbtnVentaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtnVentaMouseEntered
    jbtnVenta.setForeground(Color.WHITE);
    jbtnVenta.setBackground(Color.BLACK);
    }//GEN-LAST:event_jbtnVentaMouseEntered

    private void jbtnVentaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtnVentaMouseExited
   jbtnVenta.setBackground( Color.WHITE);
    jbtnVenta.setForeground(Color.BLACK);
    }//GEN-LAST:event_jbtnVentaMouseExited

    private void jbtnprincipalMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtnprincipalMouseEntered
     jbtnprincipal.setForeground(Color.WHITE);
     jbtnprincipal.setBackground(Color.BLACK);
    }//GEN-LAST:event_jbtnprincipalMouseEntered

    private void jbtnprincipalMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtnprincipalMouseExited
    jbtnprincipal.setBackground( Color.WHITE);
    jbtnprincipal.setForeground(Color.BLACK);
    }//GEN-LAST:event_jbtnprincipalMouseExited

    private void jbtnproveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnproveedorActionPerformed
      Controller.PanelesControllerVerdadero(Contenedor2, producto);
      
    }//GEN-LAST:event_jbtnproveedorActionPerformed

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
            java.util.logging.Logger.getLogger(Principalview.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principalview.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principalview.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principalview.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principalview().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Contenedor2;
    private javax.swing.JPanel Contenedor3;
    private javax.swing.JPanel PanelBanner;
    private javax.swing.JPanel PanelDelMensaje;
    private javax.swing.JPanel PanelDelMensaje1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JButton jbtnCatalogo;
    private javax.swing.JButton jbtnVenta;
    private javax.swing.JButton jbtnprincipal;
    private javax.swing.JButton jbtnproveedor;
    private javax.swing.JButton jbtnsalir;
    private javax.swing.JLabel lblLinea1;
    private javax.swing.JLabel lblLinea10;
    private javax.swing.JLabel lblLinea2;
    private javax.swing.JLabel lblLinea3;
    private javax.swing.JLabel lblLinea4;
    private javax.swing.JLabel lblLinea5;
    private javax.swing.JLabel lblLinea6;
    private javax.swing.JLabel lblLinea7;
    private javax.swing.JLabel lblLinea8;
    private javax.swing.JLabel lblLinea9;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblPastelito1;
    private javax.swing.JLabel lblPastelito10;
    private javax.swing.JLabel lblPastelito13;
    private javax.swing.JLabel lblPastelito14;
    private javax.swing.JLabel lblPastelito2;
    private javax.swing.JLabel lblPastelito3;
    private javax.swing.JLabel lblPastelito4;
    private javax.swing.JLabel lblPastelito5;
    private javax.swing.JLabel lblPastelito6;
    private javax.swing.JLabel lblPastelito7;
    private javax.swing.JLabel lblPastelito8;
    private javax.swing.JLabel lblPastelito9;
    private javax.swing.JLabel lblTituloEntrada;
    private javax.swing.JLabel lblTituloEntrada1;
    // End of variables declaration//GEN-END:variables
}
