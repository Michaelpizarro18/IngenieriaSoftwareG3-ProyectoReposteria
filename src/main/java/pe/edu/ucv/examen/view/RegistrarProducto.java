
package pe.edu.ucv.examen.view;
import java.awt.Image;
import java.io.File;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import pe.edu.ucv.examen.AccesoBD.BuscarIdProductoSQL;
import pe.edu.ucv.examen.Controller.Producto;
import pe.edu.ucv.examen.model.LimpiarCajasdetexto;
import pe.edu.ucv.examen.model.LlenarCombobox;
import pe.edu.ucv.examen.service.ModelTablaRegistrarProducto;
import pe.edu.ucv.examen.AccesoBD.AgregarProductoSQL;
import pe.edu.ucv.examen.service.EliminarProducto;
import pe.edu.ucv.examen.service.Modificar;
import pe.edu.ucv.examen.AccesoBD.MostrarProductoyCategoriasSQL;
import pe.edu.ucv.examen.model.CajasdeTextoModel;
public class RegistrarProducto extends javax.swing.JPanel {
 
   MostrarProductoyCategoriasSQL dao;
   Producto vo = new Producto ();
   ModelTablaRegistrarProducto t = new ModelTablaRegistrarProducto();
   LimpiarCajasdetexto limpiar = new LimpiarCajasdetexto();   
    int codigo = 0;   
    LlenarCombobox llenarcombo =  new LlenarCombobox();
    CajasdeTextoModel desactivarcajas = new CajasdeTextoModel();
    public RegistrarProducto() {
        initComponents();
         t.visualizar_ProductoVO(tabla);
         desactivarcajas .DesactivarCajas(txtruta,txtid,jtxtNombrereceta);    
         t.visualizar_TablaReceta(jtblareceta);     
         jtxarecibereceta.setEnabled(false);
         jtxtidcategoria.setEnabled(false);
        cargarDatosProveedor();
        cargarDatosCategoria();
        jtxarecibereceta.setLineWrap(true);
        jtxarecibereceta.setWrapStyleWord(true);
        jtxareceta.setLineWrap(true);
        jtxareceta.setWrapStyleWord(true);
     
//        jtxareceta.setRows(20); // ajusta según sea necesario
//        jtxareceta.setColumns(40); // ajusta según sea necesario
     
    }
     private void cargarDatosProveedor() {
        llenarcombo.PonerDatosCBX(jcbxProveedor);
    }
 private void cargarDatosCategoria() {
       llenarcombo.PonerDatosCBXCategoria(jcbxCategoria);
       llenarcombo.PonerDatosCBXCategoria(jcbxbuscarporcategoria);
    }
   
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        jbtnRegistrar = new javax.swing.JButton();
        jbtnEditar = new javax.swing.JButton();
        jbtnEliminar = new javax.swing.JButton();
        jbtnNewProductos = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtnombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtprecio = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtruta = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        txtid = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jcbxCategoria = new javax.swing.JComboBox<>();
        jcbxProveedor = new javax.swing.JComboBox<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        jtxareceta = new javax.swing.JTextArea();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jcbxbuscarporcategoria = new javax.swing.JComboBox<>();
        jbtnbuscar = new javax.swing.JButton();
        jtxtidcategoria = new javax.swing.JTextField();
        jPanel13 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtblareceta = new javax.swing.JTable();
        jtxtNombrereceta = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jlbelimagen = new javax.swing.JLabel();
        jLabelprecio = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jtxarecibereceta = new javax.swing.JTextArea();

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 165, 227));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1150, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1150, 30));

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel7.setBackground(new java.awt.Color(153, 0, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 1, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("REGISTRO DE PRODUCTOS");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(329, 329, 329)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1150, 80));

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabla);

        jbtnRegistrar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jbtnRegistrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes4/verificar.png"))); // NOI18N
        jbtnRegistrar.setText("  Registrar");
        jbtnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnRegistrarActionPerformed(evt);
            }
        });

        jbtnEditar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jbtnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes4/editar.png"))); // NOI18N
        jbtnEditar.setText("  Editar");
        jbtnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnEditarActionPerformed(evt);
            }
        });

        jbtnEliminar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jbtnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes4/eliminar.png"))); // NOI18N
        jbtnEliminar.setText("  Eliminar");
        jbtnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnEliminarActionPerformed(evt);
            }
        });

        jbtnNewProductos.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jbtnNewProductos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes4/verificar_1.png"))); // NOI18N
        jbtnNewProductos.setText("Recetario+ Productos");
        jbtnNewProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnNewProductosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(0, 12, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 638, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jbtnRegistrar)
                        .addGap(5, 5, 5)
                        .addComponent(jbtnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbtnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbtnNewProductos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 378, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jbtnNewProductos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbtnRegistrar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE)
                    .addComponent(jbtnEditar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbtnEliminar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(23, 23, 23))
        );

        jPanel4.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 670, 480));

        jPanel9.setBackground(new java.awt.Color(153, 102, 255));

        jPanel10.setBackground(new java.awt.Color(255, 204, 255));
        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setText("Nombre: ");
        jPanel10.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 80, 30));
        jPanel10.add(txtnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 60, 340, 50));

        jLabel3.setText("Precio");
        jPanel10.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 70, 30));
        jPanel10.add(txtprecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 120, 340, 50));

        jLabel4.setText("Categoria:");
        jPanel10.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 60, 40));

        jLabel5.setText("Proveedor:");
        jPanel10.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 190, -1, 40));

        jLabel6.setText("Receta");
        jPanel10.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 50, 30));
        jPanel10.add(txtruta, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 390, 210, 40));

        jButton1.setText("Foto");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel10.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 390, 160, 40));
        jPanel10.add(txtid, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 340, 40));

        jLabel8.setText("Id:");
        jPanel10.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 60, 40));

        jPanel10.add(jcbxCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 190, 120, 40));

        jcbxProveedor.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcbxProveedorItemStateChanged(evt);
            }
        });
        jPanel10.add(jcbxProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 190, 140, 40));

        jtxareceta.setColumns(10);
        jtxareceta.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jtxareceta.setLineWrap(true);
        jtxareceta.setRows(10);
        jtxareceta.setTabSize(2);
        jtxareceta.setWrapStyleWord(true);
        jScrollPane3.setViewportView(jtxareceta);

        jPanel10.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 250, 340, 110));

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, 434, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, 442, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );

        jPanel4.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 80, 480, 500));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 577, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jTabbedPane1.addTab("tab1", jPanel3);

        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel11.setBackground(new java.awt.Color(153, 0, 255));

        jLabel7.setFont(new java.awt.Font("Segoe UI Black", 1, 30)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Recetario de Productos Nuevos");

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1150, Short.MAX_VALUE)
            .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel11Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel7)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
            .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel11Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel7)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jPanel6.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1150, 80));

        jPanel12.setBackground(new java.awt.Color(255, 255, 255));
        jPanel12.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes3/izquierda.png"))); // NOI18N
        jButton2.setContentAreaFilled(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel12.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 160, 70));

        jcbxbuscarporcategoria.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcbxbuscarporcategoriaItemStateChanged(evt);
            }
        });
        jPanel12.add(jcbxbuscarporcategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 20, 130, 40));

        jbtnbuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes4/lupa.png"))); // NOI18N
        jbtnbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnbuscarActionPerformed(evt);
            }
        });
        jPanel12.add(jbtnbuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 20, 90, 40));
        jPanel12.add(jtxtidcategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 20, 120, 40));

        jPanel6.add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 1150, 70));

        jPanel13.setBackground(new java.awt.Color(153, 102, 255));
        jPanel13.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jtblareceta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jtblareceta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtblarecetaMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jtblareceta);

        jPanel13.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 510, 380));
        jPanel13.add(jtxtNombrereceta, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 10, 220, 50));

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Nombre:");
        jPanel13.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 20, 70, 30));
        jPanel13.add(jlbelimagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 110, 200, 240));

        jLabelprecio.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelprecio.setForeground(new java.awt.Color(255, 255, 255));
        jPanel13.add(jLabelprecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 10, 90, 50));

        jtxarecibereceta.setColumns(20);
        jtxarecibereceta.setLineWrap(true);
        jtxarecibereceta.setRows(20);
        jtxarecibereceta.setWrapStyleWord(true);
        jScrollPane4.setViewportView(jtxarecibereceta);

        jPanel13.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 90, 290, 260));

        jPanel6.add(jPanel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 1150, 400));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("tab2", jPanel5);

        jPanel1.add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1150, 580));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         JFileChooser j = new JFileChooser();
        FileNameExtensionFilter fil = new FileNameExtensionFilter("JPG, PNG & GIF","jpg","png","gif");
        j.setFileFilter(fil);        
       int s = j.showOpenDialog(this);
        if(s == JFileChooser.APPROVE_OPTION){
            String ruta = j.getSelectedFile().getAbsolutePath();
            txtruta.setText(ruta);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jbtnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnRegistrarActionPerformed
          AgregarProductoSQL agregar = new   AgregarProductoSQL();    
        String nombre = txtnombre.getText();       
        double precio = Double.parseDouble(txtprecio.getText());
        String nombreSeleccionado = (String) jcbxProveedor.getSelectedItem();    
        int idProveedor = (int) jcbxProveedor.getClientProperty(nombreSeleccionado);
        String nombrecategoria = (String) jcbxCategoria.getSelectedItem();    
        int idcategoria = (int) jcbxCategoria.getClientProperty(nombrecategoria);         
        String receta = jtxareceta.getText();
        File ruta = new File(txtruta.getText());     
        agregar.agregar(nombre, precio,idcategoria, idProveedor,receta,ruta);      
        t.visualizar_ProductoVO(tabla);
        limpiar.Limpiar(txtid,txtnombre,txtprecio,txtruta);     
        limpiar.LimpiarCombobox(jcbxCategoria,jcbxProveedor);
        limpiar.limpiar(jtxareceta);
    }//GEN-LAST:event_jbtnRegistrarActionPerformed

    private void tablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaMouseClicked
    int clic = tabla.rowAtPoint(evt.getPoint());
    codigo = (int) tabla.getValueAt(clic, 0);
    String nombre = (String) tabla.getValueAt(clic, 1);
    double precio = (double) tabla.getValueAt(clic, 2);
    int categoria = (int) tabla.getValueAt(clic, 3);
    int idProveedor = (int) tabla.getValueAt(clic, 4);
    String receta = (String) tabla.getValueAt(clic, 5);
    // Rellenar los campos de texto
    txtid.setText(String.valueOf(codigo));
    txtnombre.setText(nombre);
    txtprecio.setText(String.valueOf(precio));
    jtxareceta.setText(receta);
    txtruta.setText("");
    // Seleccionar automáticamente el valor en jcbxCategoria
    for (int i = 0; i < jcbxCategoria.getItemCount(); i++) {
        String nombreCategoria = (String) jcbxCategoria.getItemAt(i);
        int idCategoria = (int) jcbxCategoria.getClientProperty(nombreCategoria);
        if (idCategoria == categoria) {
            jcbxCategoria.setSelectedIndex(i);
            break;
        }
    }
    // Seleccionar automáticamente el valor en jcbxProveedor
    for (int i = 0; i < jcbxProveedor.getItemCount(); i++) {
        String nombreProveedor = (String) jcbxProveedor.getItemAt(i);
        int idProveedorCombo = (int) jcbxProveedor.getClientProperty(nombreProveedor);
        if (idProveedorCombo == idProveedor) {
            jcbxProveedor.setSelectedIndex(i);
            break;
        }
    }
    }//GEN-LAST:event_tablaMouseClicked

    private void jbtnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnEditarActionPerformed
    Modificar modificar = new Modificar();
    int id = Integer.parseInt(txtid.getText());
    String nombre = txtnombre.getText();
    double precio = Double.parseDouble(txtprecio.getText());
    // Obtener el ID de la categoría seleccionada del JComboBox
     String nombrecategoria = (String) jcbxCategoria.getSelectedItem();    
     int idcategoria = (int) jcbxCategoria.getClientProperty(nombrecategoria);    
    // Obtener el ID del proveedor seleccionado del JComboBox
     String nombreSeleccionado = (String) jcbxProveedor.getSelectedItem();    
    int idProveedor = (int) jcbxProveedor.getClientProperty(nombreSeleccionado);
    String receta = jtxareceta.getText();
    File ruta = new File(txtruta.getText());
    String ruta2 = txtruta.getText().trim();
    if (ruta2.length() != 0) {
        modificar.modificar(nombre, precio, idcategoria, idProveedor, receta, ruta, id);
        t.visualizar_ProductoVO(tabla);
    } else {
        modificar.modificar2(nombre, precio,idcategoria, idProveedor, receta, id);
        t.visualizar_ProductoVO(tabla);
    }

    }//GEN-LAST:event_jbtnEditarActionPerformed

    private void jbtnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnEliminarActionPerformed
      int id = Integer.parseInt(txtid.getText());     
      int a = JOptionPane.showConfirmDialog(null, "Desea eliminar este producto","Mensaje",JOptionPane.OK_CANCEL_OPTION);
      EliminarProducto eliminar = new EliminarProducto();
        if(a == 0){
            eliminar.eliminar(id,codigo);          
        }
        t.visualizar_ProductoVO(tabla);      
        limpiar.Limpiar(txtid,txtnombre,txtprecio,txtruta);     
        limpiar.LimpiarCombobox(jcbxCategoria,jcbxProveedor);
        limpiar.limpiar(jtxareceta);
    }//GEN-LAST:event_jbtnEliminarActionPerformed

    private void jbtnNewProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnNewProductosActionPerformed
       jTabbedPane1.setSelectedIndex(1);
    }//GEN-LAST:event_jbtnNewProductosActionPerformed

    private void jtblarecetaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtblarecetaMouseClicked
    int clic = jtblareceta.rowAtPoint(evt.getPoint());
    String nombre = (String) jtblareceta.getValueAt(clic, 1);
    String receta = (String) jtblareceta.getValueAt(clic, 3);
    double precio = (double) jtblareceta.getValueAt(clic, 2);
    int i = jtblareceta.getSelectedRow();
    jtxtNombrereceta.setText(nombre);
    jtxarecibereceta.setText(receta);
    jLabelprecio.setText(String.valueOf(precio) + " s/");
    Object imagenObject = jtblareceta.getValueAt(i, 4);
    if (imagenObject instanceof ImageIcon) {
        ImageIcon imagen1 = (ImageIcon) imagenObject;
        // Escalar la imagen para que se ajuste al JLabel
        Image image2 = imagen1.getImage().getScaledInstance(jlbelimagen.getWidth(), jlbelimagen.getHeight(),
                Image.SCALE_SMOOTH);
        ImageIcon image3 = new ImageIcon(image2);
        // Establecer el ImageIcon en el JLabel
        jlbelimagen.setIcon(image3);
    } else if (imagenObject instanceof JLabel) {
        JLabel label = (JLabel) imagenObject;
        // Puedes obtener el ícono del JLabel y establecerlo en tu otro JLabel
        Icon icon = label.getIcon();
        jlbelimagen.setIcon(icon);
    } else {
        System.out.println("No hay imagen");
    }
//    t.visualizar_TablaReceta(jtblareceta);  
    }//GEN-LAST:event_jtblarecetaMouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
     jTabbedPane1.setSelectedIndex(0);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jcbxProveedorItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcbxProveedorItemStateChanged

    }//GEN-LAST:event_jcbxProveedorItemStateChanged

    private void jbtnbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnbuscarActionPerformed
     int idCategoria = Integer.parseInt(jtxtidcategoria.getText());
    // Mostrar productos por la categoría seleccionada
   t.visualizar_TablaReceta_categoria(jtblareceta, idCategoria);  
    }//GEN-LAST:event_jbtnbuscarActionPerformed

    private void jcbxbuscarporcategoriaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcbxbuscarporcategoriaItemStateChanged
        BuscarIdProductoSQL buscarproducto = new BuscarIdProductoSQL();
        String categoria = (String) jcbxbuscarporcategoria.getSelectedItem();
  buscarproducto.obtenerIdCategoriaYMostrar(categoria, jtxtidcategoria);
    }//GEN-LAST:event_jcbxbuscarporcategoriaItemStateChanged

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelprecio;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JButton jbtnEditar;
    private javax.swing.JButton jbtnEliminar;
    private javax.swing.JButton jbtnNewProductos;
    private javax.swing.JButton jbtnRegistrar;
    private javax.swing.JButton jbtnbuscar;
    private javax.swing.JComboBox<String> jcbxCategoria;
    private javax.swing.JComboBox<String> jcbxProveedor;
    private javax.swing.JComboBox<String> jcbxbuscarporcategoria;
    private javax.swing.JLabel jlbelimagen;
    private javax.swing.JTable jtblareceta;
    private javax.swing.JTextArea jtxareceta;
    private javax.swing.JTextArea jtxarecibereceta;
    private javax.swing.JTextField jtxtNombrereceta;
    private javax.swing.JTextField jtxtidcategoria;
    private javax.swing.JTable tabla;
    private javax.swing.JTextField txtid;
    private javax.swing.JTextField txtnombre;
    private javax.swing.JTextField txtprecio;
    private javax.swing.JTextField txtruta;
    // End of variables declaration//GEN-END:variables
}
