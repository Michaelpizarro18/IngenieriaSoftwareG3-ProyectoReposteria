
package pe.edu.ucv.examen.view;

import javax.swing.JTabbedPane;
import pe.edu.ucv.examen.service.PruebadelCodigoframe;
public class CatalogoPrincipal extends javax.swing.JPanel { 

    public JTabbedPane getjTabbedPane3() {
        return jTabbedPane3;
    }
   //Eliminar el boton retroceso debido a que es lo mismo y mejor tener un solo boton.
Catalogo2 catalogoparte2 = new Catalogo2();    
Catalogo1 catologoparte1 = new Catalogo1();
private PruebadelCodigoframe codigo = new PruebadelCodigoframe();
   
public CatalogoPrincipal() {
        
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jButton5 = new javax.swing.JButton();
        jTabbedPane3 = new javax.swing.JTabbedPane();
        jPanel7 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jbtnPasteles2 = new javax.swing.JButton();
        jTextField9 = new javax.swing.JTextField();
        jbtnga6 = new javax.swing.JButton();
        jTextField10 = new javax.swing.JTextField();
        jbtnga7 = new javax.swing.JButton();
        jTextField11 = new javax.swing.JTextField();
        jbtnga8 = new javax.swing.JButton();
        jTextField12 = new javax.swing.JTextField();
        jPanel9 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jbtnPasteles3 = new javax.swing.JButton();
        jbtnPasteles4 = new javax.swing.JButton();
        jbtnPasteles5 = new javax.swing.JButton();
        jbtnPasteles6 = new javax.swing.JButton();
        jbtnPasteles7 = new javax.swing.JButton();
        jbtnPasteles8 = new javax.swing.JButton();
        jbtnPasteles9 = new javax.swing.JButton();
        jbtnPasteles10 = new javax.swing.JButton();
        jTextField13 = new javax.swing.JTextField();
        jTextField14 = new javax.swing.JTextField();
        jTextField15 = new javax.swing.JTextField();
        jTextField16 = new javax.swing.JTextField();
        jTextField17 = new javax.swing.JTextField();
        jTextField18 = new javax.swing.JTextField();
        jTextField19 = new javax.swing.JTextField();
        jTextField20 = new javax.swing.JTextField();
        jPanel11 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jbtnPasteles11 = new javax.swing.JButton();
        jbtnPasteles12 = new javax.swing.JButton();
        jbtnPasteles13 = new javax.swing.JButton();
        jbtnPasteles14 = new javax.swing.JButton();
        jbtnPasteles15 = new javax.swing.JButton();
        jbtnPasteles16 = new javax.swing.JButton();
        jTextField21 = new javax.swing.JTextField();
        jTextField22 = new javax.swing.JTextField();
        jTextField23 = new javax.swing.JTextField();
        jTextField24 = new javax.swing.JTextField();
        jTextField25 = new javax.swing.JTextField();
        jTextField26 = new javax.swing.JTextField();
        jPanel13 = new javax.swing.JPanel();
        jPanel14 = new javax.swing.JPanel();
        jbtnPasteles17 = new javax.swing.JButton();
        jbtnPasteles18 = new javax.swing.JButton();
        jbtnPasteles19 = new javax.swing.JButton();
        jbtnPasteles20 = new javax.swing.JButton();
        jbtnPasteles21 = new javax.swing.JButton();
        jbtnPasteles22 = new javax.swing.JButton();
        jTextField27 = new javax.swing.JTextField();
        jTextField28 = new javax.swing.JTextField();
        jTextField29 = new javax.swing.JTextField();
        jTextField30 = new javax.swing.JTextField();
        jTextField31 = new javax.swing.JTextField();
        jTextField32 = new javax.swing.JTextField();
        jPanel15 = new javax.swing.JPanel();
        jbtnga9 = new javax.swing.JButton();
        jbtnga10 = new javax.swing.JButton();
        jTextField33 = new javax.swing.JTextField();
        jTextField34 = new javax.swing.JTextField();
        jbtnga11 = new javax.swing.JButton();
        jTextField35 = new javax.swing.JTextField();
        jPanel16 = new javax.swing.JPanel();
        Contenedor = new javax.swing.JPanel();

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel6.setBackground(new java.awt.Color(255, 165, 227));
        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 165, 227), 5));

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes3/izquierda.png"))); // NOI18N
        jButton5.setContentAreaFilled(false);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(983, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 60, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1150, 70));

        jTabbedPane3.setBackground(new java.awt.Color(255, 204, 255));

        jPanel8.setBackground(new java.awt.Color(153, 153, 255));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jbtnPasteles2.setBackground(new java.awt.Color(255, 255, 255));
        jbtnPasteles2.setFont(new java.awt.Font("Times New Roman", 0, 30)); // NOI18N
        jbtnPasteles2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Pateles.png"))); // NOI18N
        jbtnPasteles2.setText("Pasteles");
        jbtnPasteles2.setContentAreaFilled(false);
        jbtnPasteles2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtnPasteles2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbtnPasteles2.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Pateles.png"))); // NOI18N
        jbtnPasteles2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Patelesacolor.png"))); // NOI18N
        jbtnPasteles2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jbtnPasteles2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbtnPasteles2MouseClicked(evt);
            }
        });
        jbtnPasteles2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnPasteles2ActionPerformed(evt);
            }
        });
        jPanel8.add(jbtnPasteles2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, 190, 260));
        jPanel8.add(jTextField9, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, 190, 260));

        jbtnga6.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        jbtnga6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/GalletasSincolor.png"))); // NOI18N
        jbtnga6.setText("Galletas");
        jbtnga6.setContentAreaFilled(false);
        jbtnga6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtnga6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbtnga6.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/GalletasSincolor.png"))); // NOI18N
        jbtnga6.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/GalletasConcolor.png"))); // NOI18N
        jbtnga6.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jbtnga6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnga6ActionPerformed(evt);
            }
        });
        jPanel8.add(jbtnga6, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 50, 190, 270));
        jPanel8.add(jTextField10, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 50, 190, 280));

        jbtnga7.setFont(new java.awt.Font("Times New Roman", 0, 30)); // NOI18N
        jbtnga7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Flan Sin Color.jpg"))); // NOI18N
        jbtnga7.setText("Flanes");
        jbtnga7.setContentAreaFilled(false);
        jbtnga7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtnga7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbtnga7.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Flan Sin Color.jpg"))); // NOI18N
        jbtnga7.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Flanes Logo.jpg"))); // NOI18N
        jbtnga7.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jbtnga7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnga7ActionPerformed(evt);
            }
        });
        jPanel8.add(jbtnga7, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 250, 190, 270));
        jPanel8.add(jTextField11, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 240, 190, 280));

        jbtnga8.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        jbtnga8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Gelatinanegro.png"))); // NOI18N
        jbtnga8.setText("Gelatinas");
        jbtnga8.setContentAreaFilled(false);
        jbtnga8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtnga8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbtnga8.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Gelatinanegro.png"))); // NOI18N
        jbtnga8.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Imagen1_1.png"))); // NOI18N
        jbtnga8.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jbtnga8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnga8ActionPerformed(evt);
            }
        });
        jPanel8.add(jbtnga8, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 240, 190, 280));
        jPanel8.add(jTextField12, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 240, 190, 280));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, 1150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, 588, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jTabbedPane3.addTab("tab1", jPanel7);

        jPanel10.setBackground(new java.awt.Color(153, 153, 255));
        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jbtnPasteles3.setBackground(new java.awt.Color(255, 255, 255));
        jbtnPasteles3.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jbtnPasteles3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/pastel de fresa sin color.png"))); // NOI18N
        jbtnPasteles3.setText("Pastel de Fresa");
        jbtnPasteles3.setContentAreaFilled(false);
        jbtnPasteles3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtnPasteles3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbtnPasteles3.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/pastel de fresa sin color.png"))); // NOI18N
        jbtnPasteles3.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/pastel de fresa.jpg"))); // NOI18N
        jbtnPasteles3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jbtnPasteles3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbtnPasteles3MouseClicked(evt);
            }
        });
        jbtnPasteles3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnPasteles3ActionPerformed(evt);
            }
        });
        jPanel10.add(jbtnPasteles3, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 280, 190, 250));

        jbtnPasteles4.setBackground(new java.awt.Color(255, 255, 255));
        jbtnPasteles4.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jbtnPasteles4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Pie de manzana sin Color.png"))); // NOI18N
        jbtnPasteles4.setText("Pie de Manzana");
        jbtnPasteles4.setContentAreaFilled(false);
        jbtnPasteles4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtnPasteles4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbtnPasteles4.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Pie de manzana sin Color.png"))); // NOI18N
        jbtnPasteles4.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Pay de manzana.jpg"))); // NOI18N
        jbtnPasteles4.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jbtnPasteles4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbtnPasteles4MouseClicked(evt);
            }
        });
        jbtnPasteles4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnPasteles4ActionPerformed(evt);
            }
        });
        jPanel10.add(jbtnPasteles4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, 190, 250));

        jbtnPasteles5.setBackground(new java.awt.Color(255, 255, 255));
        jbtnPasteles5.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jbtnPasteles5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Pastel de Queso Sin Color.png"))); // NOI18N
        jbtnPasteles5.setText("Pastel de Queso");
        jbtnPasteles5.setContentAreaFilled(false);
        jbtnPasteles5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtnPasteles5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbtnPasteles5.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Pastel de Queso Sin Color.png"))); // NOI18N
        jbtnPasteles5.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Pastel de queso.jpg"))); // NOI18N
        jbtnPasteles5.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jbtnPasteles5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbtnPasteles5MouseClicked(evt);
            }
        });
        jbtnPasteles5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnPasteles5ActionPerformed(evt);
            }
        });
        jPanel10.add(jbtnPasteles5, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 20, 190, 250));

        jbtnPasteles6.setBackground(new java.awt.Color(255, 255, 255));
        jbtnPasteles6.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jbtnPasteles6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Pastel de 3 leches sin color.png"))); // NOI18N
        jbtnPasteles6.setText("Pastel de 3 Leches");
        jbtnPasteles6.setContentAreaFilled(false);
        jbtnPasteles6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtnPasteles6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbtnPasteles6.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Pastel de 3 leches sin color.png"))); // NOI18N
        jbtnPasteles6.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Pastel de 3 leches.jpg"))); // NOI18N
        jbtnPasteles6.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jbtnPasteles6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbtnPasteles6MouseClicked(evt);
            }
        });
        jbtnPasteles6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnPasteles6ActionPerformed(evt);
            }
        });
        jPanel10.add(jbtnPasteles6, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 20, 190, 250));

        jbtnPasteles7.setBackground(new java.awt.Color(255, 255, 255));
        jbtnPasteles7.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jbtnPasteles7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/KEKESin Color.png"))); // NOI18N
        jbtnPasteles7.setText("Keke de Chocolate");
        jbtnPasteles7.setContentAreaFilled(false);
        jbtnPasteles7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtnPasteles7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbtnPasteles7.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/KEKESin Color.png"))); // NOI18N
        jbtnPasteles7.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/KEKE.jpg"))); // NOI18N
        jbtnPasteles7.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jbtnPasteles7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbtnPasteles7MouseClicked(evt);
            }
        });
        jbtnPasteles7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnPasteles7ActionPerformed(evt);
            }
        });
        jPanel10.add(jbtnPasteles7, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 20, 190, 250));

        jbtnPasteles8.setBackground(new java.awt.Color(255, 255, 255));
        jbtnPasteles8.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jbtnPasteles8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Pastel selva negra sin color.png"))); // NOI18N
        jbtnPasteles8.setText("Pastel Selva Negra");
        jbtnPasteles8.setContentAreaFilled(false);
        jbtnPasteles8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtnPasteles8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbtnPasteles8.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Pastel selva negra sin color.png"))); // NOI18N
        jbtnPasteles8.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Pastel Selva Negra (2).jpg"))); // NOI18N
        jbtnPasteles8.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jbtnPasteles8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbtnPasteles8MouseClicked(evt);
            }
        });
        jbtnPasteles8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnPasteles8ActionPerformed(evt);
            }
        });
        jPanel10.add(jbtnPasteles8, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 280, 190, 250));

        jbtnPasteles9.setBackground(new java.awt.Color(255, 255, 255));
        jbtnPasteles9.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jbtnPasteles9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Moka sin color.png"))); // NOI18N
        jbtnPasteles9.setText("Pastel de Moka");
        jbtnPasteles9.setContentAreaFilled(false);
        jbtnPasteles9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtnPasteles9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbtnPasteles9.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Moka sin color.png"))); // NOI18N
        jbtnPasteles9.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Moka.jpg"))); // NOI18N
        jbtnPasteles9.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jbtnPasteles9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbtnPasteles9MouseClicked(evt);
            }
        });
        jbtnPasteles9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnPasteles9ActionPerformed(evt);
            }
        });
        jPanel10.add(jbtnPasteles9, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 280, 190, 250));

        jbtnPasteles10.setBackground(new java.awt.Color(255, 255, 255));
        jbtnPasteles10.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jbtnPasteles10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Pie de limon sin color.png"))); // NOI18N
        jbtnPasteles10.setText("Pie de Limon");
        jbtnPasteles10.setContentAreaFilled(false);
        jbtnPasteles10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtnPasteles10.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbtnPasteles10.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Pie de limon sin color.png"))); // NOI18N
        jbtnPasteles10.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/pie-de-limon.jpg"))); // NOI18N
        jbtnPasteles10.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jbtnPasteles10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbtnPasteles10MouseClicked(evt);
            }
        });
        jbtnPasteles10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnPasteles10ActionPerformed(evt);
            }
        });
        jPanel10.add(jbtnPasteles10, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 280, 190, 250));
        jPanel10.add(jTextField13, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 280, 190, 250));
        jPanel10.add(jTextField14, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, 190, 250));
        jPanel10.add(jTextField15, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 20, 190, 250));
        jPanel10.add(jTextField16, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 20, 190, 250));
        jPanel10.add(jTextField17, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 20, 190, 250));
        jPanel10.add(jTextField18, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 280, 190, 250));
        jPanel10.add(jTextField19, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 280, 190, 250));
        jPanel10.add(jTextField20, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 280, 190, 250));

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1145, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, 588, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 74, Short.MAX_VALUE))
        );

        jTabbedPane3.addTab("tab2", jPanel9);

        jPanel12.setBackground(new java.awt.Color(153, 153, 255));
        jPanel12.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jbtnPasteles11.setBackground(new java.awt.Color(255, 255, 255));
        jbtnPasteles11.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jbtnPasteles11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Miloja sin Color.png"))); // NOI18N
        jbtnPasteles11.setText("Miloja");
        jbtnPasteles11.setContentAreaFilled(false);
        jbtnPasteles11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtnPasteles11.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbtnPasteles11.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Miloja sin Color.png"))); // NOI18N
        jbtnPasteles11.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Millojas.jpg"))); // NOI18N
        jbtnPasteles11.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jbtnPasteles11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbtnPasteles11MouseClicked(evt);
            }
        });
        jbtnPasteles11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnPasteles11ActionPerformed(evt);
            }
        });
        jPanel12.add(jbtnPasteles11, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 280, 190, 250));

        jbtnPasteles12.setBackground(new java.awt.Color(255, 255, 255));
        jbtnPasteles12.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jbtnPasteles12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Rosquitas Sin color.png"))); // NOI18N
        jbtnPasteles12.setText("Rosquitas");
        jbtnPasteles12.setContentAreaFilled(false);
        jbtnPasteles12.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtnPasteles12.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbtnPasteles12.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Rosquitas Sin color.png"))); // NOI18N
        jbtnPasteles12.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/rosquitas.jpg"))); // NOI18N
        jbtnPasteles12.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jbtnPasteles12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbtnPasteles12MouseClicked(evt);
            }
        });
        jbtnPasteles12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnPasteles12ActionPerformed(evt);
            }
        });
        jPanel12.add(jbtnPasteles12, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 20, 190, 250));

        jbtnPasteles13.setBackground(new java.awt.Color(255, 255, 255));
        jbtnPasteles13.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jbtnPasteles13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Alfajor sin color.png"))); // NOI18N
        jbtnPasteles13.setText("Alfajor");
        jbtnPasteles13.setContentAreaFilled(false);
        jbtnPasteles13.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtnPasteles13.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbtnPasteles13.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Alfajor sin color.png"))); // NOI18N
        jbtnPasteles13.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Alfajores.jpg"))); // NOI18N
        jbtnPasteles13.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jbtnPasteles13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbtnPasteles13MouseClicked(evt);
            }
        });
        jbtnPasteles13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnPasteles13ActionPerformed(evt);
            }
        });
        jPanel12.add(jbtnPasteles13, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 20, 190, 250));

        jbtnPasteles14.setBackground(new java.awt.Color(255, 255, 255));
        jbtnPasteles14.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jbtnPasteles14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Empanada Sin color.png"))); // NOI18N
        jbtnPasteles14.setText("Empanada Dulce");
        jbtnPasteles14.setContentAreaFilled(false);
        jbtnPasteles14.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtnPasteles14.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbtnPasteles14.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Empanada Sin color.png"))); // NOI18N
        jbtnPasteles14.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Empanadas.jpg"))); // NOI18N
        jbtnPasteles14.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jbtnPasteles14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbtnPasteles14MouseClicked(evt);
            }
        });
        jbtnPasteles14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnPasteles14ActionPerformed(evt);
            }
        });
        jPanel12.add(jbtnPasteles14, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 20, 190, 250));

        jbtnPasteles15.setBackground(new java.awt.Color(255, 255, 255));
        jbtnPasteles15.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jbtnPasteles15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Galleta Rellena sin color.png"))); // NOI18N
        jbtnPasteles15.setText("Empanada Rellena");
        jbtnPasteles15.setContentAreaFilled(false);
        jbtnPasteles15.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtnPasteles15.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbtnPasteles15.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Galleta Rellena sin color.png"))); // NOI18N
        jbtnPasteles15.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Galletas rellenas.jpg"))); // NOI18N
        jbtnPasteles15.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jbtnPasteles15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbtnPasteles15MouseClicked(evt);
            }
        });
        jbtnPasteles15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnPasteles15ActionPerformed(evt);
            }
        });
        jPanel12.add(jbtnPasteles15, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 280, 190, 250));

        jbtnPasteles16.setBackground(new java.awt.Color(255, 255, 255));
        jbtnPasteles16.setFont(new java.awt.Font("Times New Roman", 0, 19)); // NOI18N
        jbtnPasteles16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Galleta de ChocolateSin color.png"))); // NOI18N
        jbtnPasteles16.setText("Galleta de Chocolate");
        jbtnPasteles16.setContentAreaFilled(false);
        jbtnPasteles16.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtnPasteles16.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbtnPasteles16.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Galleta de ChocolateSin color.png"))); // NOI18N
        jbtnPasteles16.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Gelletas de chocolate.jpg"))); // NOI18N
        jbtnPasteles16.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jbtnPasteles16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbtnPasteles16MouseClicked(evt);
            }
        });
        jbtnPasteles16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnPasteles16ActionPerformed(evt);
            }
        });
        jPanel12.add(jbtnPasteles16, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 280, 190, 250));
        jPanel12.add(jTextField21, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 280, 190, 250));
        jPanel12.add(jTextField22, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 20, 190, 250));
        jPanel12.add(jTextField23, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 20, 190, 250));
        jPanel12.add(jTextField24, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 20, 190, 250));
        jPanel12.add(jTextField25, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 280, 190, 250));
        jPanel12.add(jTextField26, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 280, 190, 250));

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1145, Short.MAX_VALUE)
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, 588, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jTabbedPane3.addTab("tab5", jPanel11);

        jPanel14.setBackground(new java.awt.Color(153, 153, 255));
        jPanel14.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jbtnPasteles17.setBackground(new java.awt.Color(255, 255, 255));
        jbtnPasteles17.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jbtnPasteles17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Flan de Maracuya Sin color.png"))); // NOI18N
        jbtnPasteles17.setText("Flan de Maracuya");
        jbtnPasteles17.setContentAreaFilled(false);
        jbtnPasteles17.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtnPasteles17.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbtnPasteles17.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Flan de Maracuya Sin color.png"))); // NOI18N
        jbtnPasteles17.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Flan de maracuya.jpg"))); // NOI18N
        jbtnPasteles17.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jbtnPasteles17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbtnPasteles17MouseClicked(evt);
            }
        });
        jbtnPasteles17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnPasteles17ActionPerformed(evt);
            }
        });
        jPanel14.add(jbtnPasteles17, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 20, 190, 250));

        jbtnPasteles18.setBackground(new java.awt.Color(255, 255, 255));
        jbtnPasteles18.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jbtnPasteles18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Flan de coco Sin color.png"))); // NOI18N
        jbtnPasteles18.setText("Flan de Coco");
        jbtnPasteles18.setContentAreaFilled(false);
        jbtnPasteles18.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtnPasteles18.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbtnPasteles18.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Flan de coco Sin color.png"))); // NOI18N
        jbtnPasteles18.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/flan-de-coco.jpg"))); // NOI18N
        jbtnPasteles18.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jbtnPasteles18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbtnPasteles18MouseClicked(evt);
            }
        });
        jbtnPasteles18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnPasteles18ActionPerformed(evt);
            }
        });
        jPanel14.add(jbtnPasteles18, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 20, 190, 250));

        jbtnPasteles19.setBackground(new java.awt.Color(255, 255, 255));
        jbtnPasteles19.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jbtnPasteles19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Flan de chocolate sin color.png"))); // NOI18N
        jbtnPasteles19.setText("Flan de Chocolate");
        jbtnPasteles19.setContentAreaFilled(false);
        jbtnPasteles19.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtnPasteles19.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbtnPasteles19.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Flan de chocolate sin color.png"))); // NOI18N
        jbtnPasteles19.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Flan de Chocolate.png"))); // NOI18N
        jbtnPasteles19.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jbtnPasteles19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbtnPasteles19MouseClicked(evt);
            }
        });
        jbtnPasteles19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnPasteles19ActionPerformed(evt);
            }
        });
        jPanel14.add(jbtnPasteles19, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 280, 190, 220));

        jbtnPasteles20.setBackground(new java.awt.Color(255, 255, 255));
        jbtnPasteles20.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jbtnPasteles20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Flan con gelatina Sin color.png"))); // NOI18N
        jbtnPasteles20.setText("Flan con Gelatina");
        jbtnPasteles20.setContentAreaFilled(false);
        jbtnPasteles20.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtnPasteles20.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbtnPasteles20.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Flan con gelatina Sin color.png"))); // NOI18N
        jbtnPasteles20.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Flan con gelatina.jpg"))); // NOI18N
        jbtnPasteles20.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jbtnPasteles20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbtnPasteles20MouseClicked(evt);
            }
        });
        jbtnPasteles20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnPasteles20ActionPerformed(evt);
            }
        });
        jPanel14.add(jbtnPasteles20, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 280, 190, 250));

        jbtnPasteles21.setBackground(new java.awt.Color(255, 255, 255));
        jbtnPasteles21.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jbtnPasteles21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Flan napolitano Sin color.png"))); // NOI18N
        jbtnPasteles21.setText("Flan Napolitano");
        jbtnPasteles21.setContentAreaFilled(false);
        jbtnPasteles21.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtnPasteles21.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbtnPasteles21.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Flan napolitano Sin color.png"))); // NOI18N
        jbtnPasteles21.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Flan napolitano color.png"))); // NOI18N
        jbtnPasteles21.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jbtnPasteles21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbtnPasteles21MouseClicked(evt);
            }
        });
        jbtnPasteles21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnPasteles21ActionPerformed(evt);
            }
        });
        jPanel14.add(jbtnPasteles21, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 280, 190, 250));

        jbtnPasteles22.setBackground(new java.awt.Color(255, 255, 255));
        jbtnPasteles22.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jbtnPasteles22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Flan Clasico Sin color.png"))); // NOI18N
        jbtnPasteles22.setText("Flan Clasico");
        jbtnPasteles22.setContentAreaFilled(false);
        jbtnPasteles22.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtnPasteles22.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbtnPasteles22.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Flan Clasico Sin color.png"))); // NOI18N
        jbtnPasteles22.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Flan CLsico.jpg"))); // NOI18N
        jbtnPasteles22.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jbtnPasteles22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbtnPasteles22MouseClicked(evt);
            }
        });
        jbtnPasteles22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnPasteles22ActionPerformed(evt);
            }
        });
        jPanel14.add(jbtnPasteles22, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 20, 190, 250));
        jPanel14.add(jTextField27, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 280, 190, 240));
        jPanel14.add(jTextField28, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 20, 190, 250));
        jPanel14.add(jTextField29, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 20, 190, 250));
        jPanel14.add(jTextField30, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 20, 190, 250));
        jPanel14.add(jTextField31, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 280, 190, 250));
        jPanel14.add(jTextField32, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 280, 190, 250));

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, 1145, Short.MAX_VALUE)
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, 588, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jTabbedPane3.addTab("tab3", jPanel13);

        jPanel15.setBackground(new java.awt.Color(153, 153, 255));
        jPanel15.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jbtnga9.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jbtnga9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Gelatina Blanca Sin color.png"))); // NOI18N
        jbtnga9.setText("Gelatina Mosaiko");
        jbtnga9.setContentAreaFilled(false);
        jbtnga9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtnga9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbtnga9.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Gelatina Blanca Sin color.png"))); // NOI18N
        jbtnga9.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Gelatina Blanca.jpg"))); // NOI18N
        jbtnga9.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jbtnga9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnga9ActionPerformed(evt);
            }
        });
        jPanel15.add(jbtnga9, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 170, 190, 270));

        jbtnga10.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jbtnga10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Torta elada sin color.png"))); // NOI18N
        jbtnga10.setText("Torta Helada");
        jbtnga10.setContentAreaFilled(false);
        jbtnga10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtnga10.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbtnga10.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Torta elada sin color.png"))); // NOI18N
        jbtnga10.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Torta elada.jpg"))); // NOI18N
        jbtnga10.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jbtnga10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnga10ActionPerformed(evt);
            }
        });
        jPanel15.add(jbtnga10, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 160, 190, 290));
        jPanel15.add(jTextField33, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 160, 190, 290));
        jPanel15.add(jTextField34, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 170, 190, 280));

        jbtnga11.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        jbtnga11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Gelatina con leche sin color.png"))); // NOI18N
        jbtnga11.setText("Gelatina con Leche");
        jbtnga11.setContentAreaFilled(false);
        jbtnga11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbtnga11.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jbtnga11.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Gelatina con leche sin color.png"))); // NOI18N
        jbtnga11.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Gelatina con leche.jpg"))); // NOI18N
        jbtnga11.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jbtnga11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnga11ActionPerformed(evt);
            }
        });
        jPanel15.add(jbtnga11, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 170, 190, 290));
        jPanel15.add(jTextField35, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 180, 190, 280));

        jTabbedPane3.addTab("tab6", jPanel15);

        Contenedor.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Contenedor, javax.swing.GroupLayout.DEFAULT_SIZE, 1145, Short.MAX_VALUE)
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addComponent(Contenedor, javax.swing.GroupLayout.PREFERRED_SIZE, 553, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 109, Short.MAX_VALUE))
        );

        jTabbedPane3.addTab("tab7", jPanel16);

        jPanel1.add(jTabbedPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 1150, 690));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 588, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnPasteles2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtnPasteles2MouseClicked

    }//GEN-LAST:event_jbtnPasteles2MouseClicked

    private void jbtnPasteles2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnPasteles2ActionPerformed
        jTabbedPane3.setSelectedIndex(1);       
    }//GEN-LAST:event_jbtnPasteles2ActionPerformed

    private void jbtnga6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnga6ActionPerformed
         jTabbedPane3.setSelectedIndex(2);
    }//GEN-LAST:event_jbtnga6ActionPerformed

    private void jbtnga7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnga7ActionPerformed
         jTabbedPane3.setSelectedIndex(3);
    }//GEN-LAST:event_jbtnga7ActionPerformed

    private void jbtnga8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnga8ActionPerformed
         jTabbedPane3.setSelectedIndex(4);
    }//GEN-LAST:event_jbtnga8ActionPerformed

    private void jbtnPasteles3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtnPasteles3MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtnPasteles3MouseClicked

    private void jbtnPasteles3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnPasteles3ActionPerformed
   jTabbedPane3.setSelectedIndex(5);
   codigo.PanelesControllerVerdadero(Contenedor,catologoparte1);
   codigo.controlarTabbedPanes(catologoparte1.getjTabbedPane2(), Contenedor, 6);
    }//GEN-LAST:event_jbtnPasteles3ActionPerformed

    private void jbtnPasteles4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtnPasteles4MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtnPasteles4MouseClicked

    private void jbtnPasteles4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnPasteles4ActionPerformed
   jTabbedPane3.setSelectedIndex(5);
   codigo.PanelesControllerVerdadero(Contenedor,catologoparte1);
   codigo.controlarTabbedPanes(catologoparte1.getjTabbedPane2(), Contenedor, 1);
    }//GEN-LAST:event_jbtnPasteles4ActionPerformed

    private void jbtnPasteles5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtnPasteles5MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtnPasteles5MouseClicked

    private void jbtnPasteles5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnPasteles5ActionPerformed
   jTabbedPane3.setSelectedIndex(5);
   codigo.PanelesControllerVerdadero(Contenedor,catologoparte1);
   codigo.controlarTabbedPanes(catologoparte1.getjTabbedPane2(), Contenedor, 2);
    }//GEN-LAST:event_jbtnPasteles5ActionPerformed

    private void jbtnPasteles6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtnPasteles6MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtnPasteles6MouseClicked

    private void jbtnPasteles6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnPasteles6ActionPerformed
  jTabbedPane3.setSelectedIndex(5);
    codigo.PanelesControllerVerdadero(Contenedor,catologoparte1);
   codigo.controlarTabbedPanes(catologoparte1.getjTabbedPane2(), Contenedor, 0);
    }//GEN-LAST:event_jbtnPasteles6ActionPerformed

    private void jbtnPasteles7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtnPasteles7MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtnPasteles7MouseClicked

    private void jbtnPasteles7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnPasteles7ActionPerformed
  jTabbedPane3.setSelectedIndex(5);
   codigo.PanelesControllerVerdadero(Contenedor,catologoparte1);
   codigo.controlarTabbedPanes(catologoparte1.getjTabbedPane2(), Contenedor, 12);
    }//GEN-LAST:event_jbtnPasteles7ActionPerformed

    private void jbtnPasteles8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtnPasteles8MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtnPasteles8MouseClicked

    private void jbtnPasteles8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnPasteles8ActionPerformed
  jTabbedPane3.setSelectedIndex(5);
   codigo.PanelesControllerVerdadero(Contenedor,catologoparte1);
   codigo.controlarTabbedPanes(catologoparte1.getjTabbedPane2(), Contenedor, 3);
    }//GEN-LAST:event_jbtnPasteles8ActionPerformed

    private void jbtnPasteles9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtnPasteles9MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtnPasteles9MouseClicked

    private void jbtnPasteles9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnPasteles9ActionPerformed
    jTabbedPane3.setSelectedIndex(5);
   codigo.PanelesControllerVerdadero(Contenedor,catologoparte1);
   codigo.controlarTabbedPanes(catologoparte1.getjTabbedPane2(), Contenedor, 4);
    }//GEN-LAST:event_jbtnPasteles9ActionPerformed

    private void jbtnPasteles10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtnPasteles10MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtnPasteles10MouseClicked

    private void jbtnPasteles10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnPasteles10ActionPerformed
    jTabbedPane3.setSelectedIndex(5);
   codigo.PanelesControllerVerdadero(Contenedor,catologoparte1);
   codigo.controlarTabbedPanes(catologoparte1.getjTabbedPane2(), Contenedor, 5);
    }//GEN-LAST:event_jbtnPasteles10ActionPerformed

    private void jbtnPasteles11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtnPasteles11MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtnPasteles11MouseClicked

    private void jbtnPasteles11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnPasteles11ActionPerformed
   jTabbedPane3.setSelectedIndex(5);
   codigo.PanelesControllerVerdadero(Contenedor,catologoparte1);
   codigo.controlarTabbedPanes(catologoparte1.getjTabbedPane2(), Contenedor, 9);
    }//GEN-LAST:event_jbtnPasteles11ActionPerformed

    private void jbtnPasteles12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtnPasteles12MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtnPasteles12MouseClicked

    private void jbtnPasteles12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnPasteles12ActionPerformed
   jTabbedPane3.setSelectedIndex(5);
   codigo.PanelesControllerVerdadero(Contenedor,catologoparte1);
   codigo.controlarTabbedPanes(catologoparte1.getjTabbedPane2(), Contenedor, 7);
    }//GEN-LAST:event_jbtnPasteles12ActionPerformed

    private void jbtnPasteles13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtnPasteles13MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtnPasteles13MouseClicked

    private void jbtnPasteles13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnPasteles13ActionPerformed
    jTabbedPane3.setSelectedIndex(5);
   codigo.PanelesControllerVerdadero(Contenedor,catologoparte1);
   codigo.controlarTabbedPanes(catologoparte1.getjTabbedPane2(), Contenedor, 10);
    }//GEN-LAST:event_jbtnPasteles13ActionPerformed

    private void jbtnPasteles14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtnPasteles14MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtnPasteles14MouseClicked

    private void jbtnPasteles14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnPasteles14ActionPerformed
   jTabbedPane3.setSelectedIndex(5);
   codigo.PanelesControllerVerdadero(Contenedor,catologoparte1);
   codigo.controlarTabbedPanes(catologoparte1.getjTabbedPane2(), Contenedor, 11);
    }//GEN-LAST:event_jbtnPasteles14ActionPerformed

    private void jbtnPasteles15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtnPasteles15MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtnPasteles15MouseClicked

    private void jbtnPasteles15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnPasteles15ActionPerformed
   jTabbedPane3.setSelectedIndex(5);
   codigo.PanelesControllerVerdadero(Contenedor,catologoparte1);
   codigo.controlarTabbedPanes(catologoparte1.getjTabbedPane2(), Contenedor, 12);
    }//GEN-LAST:event_jbtnPasteles15ActionPerformed

    private void jbtnPasteles16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtnPasteles16MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtnPasteles16MouseClicked

    private void jbtnPasteles16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnPasteles16ActionPerformed
   jTabbedPane3.setSelectedIndex(5);
   codigo.PanelesControllerVerdadero(Contenedor,catologoparte1);
   codigo.controlarTabbedPanes(catologoparte1.getjTabbedPane2(), Contenedor, 8);
    }//GEN-LAST:event_jbtnPasteles16ActionPerformed

    private void jbtnPasteles17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtnPasteles17MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtnPasteles17MouseClicked

    private void jbtnPasteles17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnPasteles17ActionPerformed
  jTabbedPane3.setSelectedIndex(5);
  codigo.PanelesControllerVerdadero(Contenedor,catalogoparte2);
  codigo.controlarTabbedPanes(catalogoparte2.getjTabbedPane1(), Contenedor, 5);
    }//GEN-LAST:event_jbtnPasteles17ActionPerformed

    private void jbtnPasteles18MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtnPasteles18MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtnPasteles18MouseClicked

    private void jbtnPasteles18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnPasteles18ActionPerformed
     jTabbedPane3.setSelectedIndex(5);
   codigo.PanelesControllerVerdadero(Contenedor,catalogoparte2);
   codigo.controlarTabbedPanes(catalogoparte2.getjTabbedPane1(), Contenedor, 1);
    }//GEN-LAST:event_jbtnPasteles18ActionPerformed

    private void jbtnPasteles19MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtnPasteles19MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtnPasteles19MouseClicked

    private void jbtnPasteles19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnPasteles19ActionPerformed
   jTabbedPane3.setSelectedIndex(5);
   codigo.PanelesControllerVerdadero(Contenedor,catalogoparte2);
   codigo.controlarTabbedPanes(catalogoparte2.getjTabbedPane1(), Contenedor, 2);
    }//GEN-LAST:event_jbtnPasteles19ActionPerformed

    private void jbtnPasteles20MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtnPasteles20MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtnPasteles20MouseClicked

    private void jbtnPasteles20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnPasteles20ActionPerformed
     jTabbedPane3.setSelectedIndex(5);
   codigo.PanelesControllerVerdadero(Contenedor,catalogoparte2);
   codigo.controlarTabbedPanes(catalogoparte2.getjTabbedPane1(), Contenedor, 3);
    }//GEN-LAST:event_jbtnPasteles20ActionPerformed

    private void jbtnPasteles21MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtnPasteles21MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtnPasteles21MouseClicked

    private void jbtnPasteles21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnPasteles21ActionPerformed
   jTabbedPane3.setSelectedIndex(5);
   codigo.PanelesControllerVerdadero(Contenedor,catalogoparte2);
   codigo.controlarTabbedPanes(catalogoparte2.getjTabbedPane1(), Contenedor, 4);
    }//GEN-LAST:event_jbtnPasteles21ActionPerformed

    private void jbtnPasteles22MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbtnPasteles22MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtnPasteles22MouseClicked

    private void jbtnPasteles22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnPasteles22ActionPerformed
   jTabbedPane3.setSelectedIndex(5);
   codigo.PanelesControllerVerdadero(Contenedor,catalogoparte2);
   codigo.controlarTabbedPanes(catalogoparte2.getjTabbedPane1(), Contenedor, 0);
    }//GEN-LAST:event_jbtnPasteles22ActionPerformed

    private void jbtnga9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnga9ActionPerformed
  jTabbedPane3.setSelectedIndex(5);
   codigo.PanelesControllerVerdadero(Contenedor,catalogoparte2);
   codigo.controlarTabbedPanes(catalogoparte2.getjTabbedPane1(), Contenedor, 6);
    }//GEN-LAST:event_jbtnga9ActionPerformed

    private void jbtnga10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnga10ActionPerformed
     jTabbedPane3.setSelectedIndex(5);
   codigo.PanelesControllerVerdadero(Contenedor,catalogoparte2);
   codigo.controlarTabbedPanes(catalogoparte2.getjTabbedPane1(), Contenedor, 8);
    }//GEN-LAST:event_jbtnga10ActionPerformed

    private void jbtnga11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnga11ActionPerformed
     jTabbedPane3.setSelectedIndex(5);
   codigo.PanelesControllerVerdadero(Contenedor,catalogoparte2);
   codigo.controlarTabbedPanes(catalogoparte2.getjTabbedPane1(), Contenedor, 7);
    }//GEN-LAST:event_jbtnga11ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
  jTabbedPane3.setSelectedIndex(0);
    }//GEN-LAST:event_jButton5ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Contenedor;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JTabbedPane jTabbedPane3;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JTextField jTextField17;
    private javax.swing.JTextField jTextField18;
    private javax.swing.JTextField jTextField19;
    private javax.swing.JTextField jTextField20;
    private javax.swing.JTextField jTextField21;
    private javax.swing.JTextField jTextField22;
    private javax.swing.JTextField jTextField23;
    private javax.swing.JTextField jTextField24;
    private javax.swing.JTextField jTextField25;
    private javax.swing.JTextField jTextField26;
    private javax.swing.JTextField jTextField27;
    private javax.swing.JTextField jTextField28;
    private javax.swing.JTextField jTextField29;
    private javax.swing.JTextField jTextField30;
    private javax.swing.JTextField jTextField31;
    private javax.swing.JTextField jTextField32;
    private javax.swing.JTextField jTextField33;
    private javax.swing.JTextField jTextField34;
    private javax.swing.JTextField jTextField35;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JButton jbtnPasteles10;
    private javax.swing.JButton jbtnPasteles11;
    private javax.swing.JButton jbtnPasteles12;
    private javax.swing.JButton jbtnPasteles13;
    private javax.swing.JButton jbtnPasteles14;
    private javax.swing.JButton jbtnPasteles15;
    private javax.swing.JButton jbtnPasteles16;
    private javax.swing.JButton jbtnPasteles17;
    private javax.swing.JButton jbtnPasteles18;
    private javax.swing.JButton jbtnPasteles19;
    private javax.swing.JButton jbtnPasteles2;
    private javax.swing.JButton jbtnPasteles20;
    private javax.swing.JButton jbtnPasteles21;
    private javax.swing.JButton jbtnPasteles22;
    private javax.swing.JButton jbtnPasteles3;
    private javax.swing.JButton jbtnPasteles4;
    private javax.swing.JButton jbtnPasteles5;
    private javax.swing.JButton jbtnPasteles6;
    private javax.swing.JButton jbtnPasteles7;
    private javax.swing.JButton jbtnPasteles8;
    private javax.swing.JButton jbtnPasteles9;
    private javax.swing.JButton jbtnga10;
    private javax.swing.JButton jbtnga11;
    private javax.swing.JButton jbtnga6;
    private javax.swing.JButton jbtnga7;
    private javax.swing.JButton jbtnga8;
    private javax.swing.JButton jbtnga9;
    // End of variables declaration//GEN-END:variables
}
