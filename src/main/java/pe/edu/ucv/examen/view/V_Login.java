package pe.edu.ucv.examen.view;
import java.awt.Color;
import java.awt.Image;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JOptionPane;
import pe.edu.ucv.examen.AccesoBD.CuentaSQL;
import pe.edu.ucv.examen.service.LoginControl;

public class V_Login extends javax.swing.JFrame {

    public V_Login() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        PanelMedio.setBackground(new Color(255,255,255,150));
      
    }    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BackPanel = new javax.swing.JPanel();
        PanelMedio = new javax.swing.JPanel();
        lblImagen = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPasswordField1 = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        txtUsuario = new javax.swing.JTextField();
        PanelIngresar = new javax.swing.JPanel();
        btnIngresar = new javax.swing.JButton();
        jCheckBox2 = new javax.swing.JCheckBox();
        PanelCerrar = new javax.swing.JPanel();
        lblCerrar = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BackPanel.setBackground(new java.awt.Color(255, 204, 255));

        PanelMedio.setBackground(new java.awt.Color(255, 255, 255));
        PanelMedio.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        PanelMedio.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes4/DulcesPaula.jpg"))); // NOI18N
        lblImagen.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        PanelMedio.add(lblImagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, 160, 160));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPasswordField1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel2.add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 290, 20));

        PanelMedio.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 350, 310, 40));

        jLabel1.setFont(new java.awt.Font("Bodoni MT", 1, 24)); // NOI18N
        jLabel1.setText("INICIO DE SESIÓN");
        PanelMedio.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 190, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI Symbol", 1, 14)); // NOI18N
        jLabel2.setText("Contraseña:");
        PanelMedio.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 320, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI Symbol", 1, 14)); // NOI18N
        jLabel3.setText("Usuario:");
        PanelMedio.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, -1, -1));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtUsuario.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        txtUsuario.setBorder(null);
        jPanel1.add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 290, 20));

        PanelMedio.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, 310, 40));

        PanelIngresar.setBackground(new java.awt.Color(153, 0, 255));
        PanelIngresar.setLayout(new java.awt.GridLayout(1, 0));

        btnIngresar.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        btnIngresar.setForeground(new java.awt.Color(255, 255, 255));
        btnIngresar.setText("INGRESAR");
        btnIngresar.setContentAreaFilled(false);
        btnIngresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnIngresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnIngresarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnIngresarMouseExited(evt);
            }
        });
        btnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarActionPerformed(evt);
            }
        });
        PanelIngresar.add(btnIngresar);

        PanelMedio.add(PanelIngresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 440, 170, 50));

        jCheckBox2.setText("Mostrar");
        jCheckBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox2ActionPerformed(evt);
            }
        });
        PanelMedio.add(jCheckBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 400, 90, -1));

        PanelCerrar.setBackground(new java.awt.Color(255, 204, 255));
        PanelCerrar.setLayout(new java.awt.GridLayout(1, 0));

        lblCerrar.setFont(new java.awt.Font("Arial Black", 1, 30)); // NOI18N
        lblCerrar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCerrar.setText("X");
        lblCerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblCerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCerrarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblCerrarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblCerrarMouseExited(evt);
            }
        });
        PanelCerrar.add(lblCerrar);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel4.setText("System made in Peru - 2023");

        javax.swing.GroupLayout BackPanelLayout = new javax.swing.GroupLayout(BackPanel);
        BackPanel.setLayout(BackPanelLayout);
        BackPanelLayout.setHorizontalGroup(
            BackPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackPanelLayout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(BackPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(BackPanelLayout.createSequentialGroup()
                        .addComponent(PanelMedio, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 58, Short.MAX_VALUE))
                    .addGroup(BackPanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(PanelCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(BackPanelLayout.createSequentialGroup()
                .addGap(207, 207, 207)
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        BackPanelLayout.setVerticalGroup(
            BackPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PanelCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(PanelMedio, javax.swing.GroupLayout.PREFERRED_SIZE, 520, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(jLabel4)
                .addContainerGap())
        );

        getContentPane().add(BackPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 570, 730));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblCerrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCerrarMouseEntered
        PanelCerrar.setBackground(new Color(238, 20, 20));
        lblCerrar.setForeground(new Color(255, 255, 255));
    }//GEN-LAST:event_lblCerrarMouseEntered

    private void lblCerrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCerrarMouseExited
        PanelCerrar.setBackground(new Color(255,204,255));
        lblCerrar.setForeground(new Color(0, 0, 0));
    }//GEN-LAST:event_lblCerrarMouseExited

    private void lblCerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCerrarMouseClicked
        System.exit(0);
    }//GEN-LAST:event_lblCerrarMouseClicked

    private void btnIngresarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIngresarMouseEntered
        PanelIngresar.setBackground(new Color(247, 226, 92));
        btnIngresar.setForeground(new Color(0,0,0));
    }//GEN-LAST:event_btnIngresarMouseEntered

    private void btnIngresarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIngresarMouseExited
        PanelIngresar.setBackground(new Color(153,0,255));
        btnIngresar.setForeground(new Color(255,255,255));
    }//GEN-LAST:event_btnIngresarMouseExited

    private void btnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarActionPerformed
       String usuario = txtUsuario.getText();
        String clave = jPasswordField1.getText();  

      LoginControl contrologin = new  LoginControl();
       contrologin.validarUsuario(usuario, clave);  
       this.dispose();    
       
   
     
    }//GEN-LAST:event_btnIngresarActionPerformed

    private void jCheckBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox2ActionPerformed
     if(jCheckBox2.isSelected())
         jPasswordField1.setEchoChar((char)0);
     else{
         jPasswordField1.setEchoChar('*');
     }
    }//GEN-LAST:event_jCheckBox2ActionPerformed
    
    
    

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
            java.util.logging.Logger.getLogger(V_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(V_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(V_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(V_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new V_Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BackPanel;
    private javax.swing.JPanel PanelCerrar;
    private javax.swing.JPanel PanelIngresar;
    private javax.swing.JPanel PanelMedio;
    private javax.swing.JButton btnIngresar;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JLabel lblCerrar;
    private javax.swing.JLabel lblImagen;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
