package pe.edu.ucv.examen.view;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Vector;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.DefaultTableModel;
import pe.edu.ucv.examen.AccesoBD.AccesoBD;
import pe.edu.ucv.examen.AccesoBD.CargarTablaventaSQL;
import pe.edu.ucv.examen.AccesoBD.EliminarVentaSQL;
import pe.edu.ucv.examen.AccesoBD.RegistrarVenta;
import pe.edu.ucv.examen.model.CajasdeTextoModel;
import pe.edu.ucv.examen.model.ComboboxItemVenta;
import pe.edu.ucv.examen.model.Llenarcomboventas;
import pe.edu.ucv.examen.model.ModelTabla;
import pe.edu.ucv.examen.service.RegistrarVentaService;


/**
 *
 * @author User
 */
public class RegistrodeVenta1 extends javax.swing.JPanel {

    ModelTabla model = new ModelTabla();
    private DefaultTableModel modelito;
    CajasdeTextoModel cajasdetexto = new CajasdeTextoModel();
    Llenarcomboventas comboventas = new Llenarcomboventas();
    private int filaSeleccionada;
   CargarTablaventaSQL ventaDAO = new CargarTablaventaSQL();
  
    public RegistrodeVenta1() {
        initComponents();
        modelito = new DefaultTableModel();
        model.inicializarModelo(modelito);
        cajasdetexto.DesactivarCajas(txtIDCompra, txtIDProducto, txtPrecio, txtSubtotal, txtTotalFinal);
        tblDatos.setModel(modelito);
        cargarDatosProductos();
         cargarDatosDesdeDAO();
        txtCantidad.getDocument().addDocumentListener(new MyDocumentListener());
        txtPrecio.getDocument().addDocumentListener(new MyDocumentListener());
        txtDescuento.getDocument().addDocumentListener(new MyDocumentListener());
         txtFecha.setText(fechaactual());
         txtFecha.setEnabled(false);
       
    }

private void cargarDatosProductos() {
        comboventas.PonerDatosCBXProducto(cbxproducto);
    }
 private void cargarDatosDesdeDAO() {
      ventaDAO.cargarDatosEnTabla(modelito, txtTotalFinal, txtIDCompra,filaSeleccionada); 
    }
   
    public class MyDocumentListener implements DocumentListener {

        @Override
        public void insertUpdate(DocumentEvent e) {
            calcularResultado();
        }

        @Override
        public void removeUpdate(DocumentEvent e) {
            calcularResultado();
        }

        @Override
        public void changedUpdate(DocumentEvent e) {
            calcularResultado();
        }

       private void calcularResultado() {
    try {
        int num1 = (txtCantidad.getText().isEmpty()) ? 1 : Integer.parseInt(txtCantidad.getText());
        double num2 = (txtPrecio.getText().isEmpty()) ? 1 : Double.parseDouble(txtPrecio.getText());
        double num3 = (txtDescuento.getText().isEmpty() || txtDescuento.getText().equals("0")) ? 1 : Double.parseDouble(txtDescuento.getText());

        double resultado = num1 * num2;
        double descuento = (num3 / 100);
        double result = (resultado * descuento);
        double TOTAL = (resultado - result);

        // Formatear el resultado a dos decimales
        DecimalFormat df = new DecimalFormat("#.##");
        String resultadoFormateado = df.format(TOTAL);

        txtSubtotal.setText(resultadoFormateado);
    } catch (NumberFormatException ex) {
        txtSubtotal.setText("Error");
    }
}
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        PanelFondo = new javax.swing.JPanel();
        PanelUp = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jbtnGuardar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        txtIDCompra = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtIDProducto = new javax.swing.JTextField();
        cbxproducto = new javax.swing.JComboBox<>();
        txtFecha = new javax.swing.JTextField();
        txtCantidad = new javax.swing.JTextField();
        txtPrecio = new javax.swing.JTextField();
        txtDescuento = new javax.swing.JTextField();
        txtSubtotal = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        btnAgregarATabla = new javax.swing.JButton();
        PanelDown = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDatos = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        txtTotalFinal = new javax.swing.JTextField();
        btnQuitarDeTabla = new javax.swing.JButton();
        jbtneditar = new javax.swing.JButton();

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PanelFondo.setBackground(new java.awt.Color(204, 204, 204));
        PanelFondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PanelUp.setBackground(new java.awt.Color(153, 0, 255));
        PanelUp.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 1, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("REGISTRO DE VENTAS");
        PanelUp.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 10, -1, -1));

        PanelFondo.add(PanelUp, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1160, 70));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jbtnGuardar.setBackground(new java.awt.Color(255, 255, 255));
        jbtnGuardar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jbtnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes4/verificar_1.png"))); // NOI18N
        jbtnGuardar.setText("Guardar");
        jbtnGuardar.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jbtnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnGuardarActionPerformed(evt);
            }
        });
        jPanel2.add(jbtnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 120, 60));

        btnBuscar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes4/lupa.png"))); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        jPanel2.add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 0, 140, 60));

        btnLimpiar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes4/limpieza-de-datos.png"))); // NOI18N
        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });
        jPanel2.add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 0, 170, 60));

        btnEliminar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes4/eliminar.png"))); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        jPanel2.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 0, 140, 60));

        txtIDCompra.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtIDCompra.setText("Actual");
        txtIDCompra.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.add(txtIDCompra, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 20, 100, 40));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("ID VENTA:");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 0, -1, -1));

        PanelFondo.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 1160, 60));

        jPanel3.setBackground(new java.awt.Color(153, 102, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setText("Cod. Producto:");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setText("Producto:");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 90, -1, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setText("Cantidad:");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 90, -1, -1));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel11.setText("Precio:");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 90, -1, -1));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel12.setText("Descuento:");
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 90, -1, -1));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel13.setText("Subtotal:");
        jPanel3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 90, -1, -1));

        txtIDProducto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.add(txtIDProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 100, 40));

        cbxproducto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "----Seleccione----" }));
        cbxproducto.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbxproductoItemStateChanged(evt);
            }
        });
        jPanel3.add(cbxproducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 120, 160, 40));

        txtFecha.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.add(txtFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 70, 40));

        txtCantidad.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtCantidad.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.add(txtCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 120, 90, 40));

        txtPrecio.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPrecio.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.add(txtPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 120, 100, 40));

        txtDescuento.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtDescuento.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.add(txtDescuento, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 120, 100, 40));

        txtSubtotal.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtSubtotal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.add(txtSubtotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 120, 110, 40));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel15.setText("Fecha:");
        jPanel3.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        btnAgregarATabla.setBackground(new java.awt.Color(255, 255, 255));
        btnAgregarATabla.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes4/anadir-al-carrito.png"))); // NOI18N
        btnAgregarATabla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarATablaActionPerformed(evt);
            }
        });
        jPanel3.add(btnAgregarATabla, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 120, 60, 50));

        PanelFondo.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 1160, 180));

        PanelDown.setBackground(new java.awt.Color(255, 204, 255));
        PanelDown.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblDatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "PRODUCT", "CANTIDAD", "PRECIO", "DESCUENTO", "SUBTOTAL"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblDatos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDatosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblDatos);

        PanelDown.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, 930, 200));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("TOTAL");
        PanelDown.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 240, -1, -1));

        txtTotalFinal.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtTotalFinal.setText("0.0");
        txtTotalFinal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        PanelDown.add(txtTotalFinal, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 230, 150, 40));

        btnQuitarDeTabla.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes4/borrar.png"))); // NOI18N
        btnQuitarDeTabla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuitarDeTablaActionPerformed(evt);
            }
        });
        PanelDown.add(btnQuitarDeTabla, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 20, 60, 50));

        jbtneditar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jbtneditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes4/editar.png"))); // NOI18N
        jbtneditar.setText("Editar ");
        jbtneditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtneditarActionPerformed(evt);
            }
        });
        PanelDown.add(jbtneditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, 50));

        PanelFondo.add(PanelDown, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 310, 1160, 290));

        jPanel1.add(PanelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1160, 600));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnGuardarActionPerformed
  RegistrarVentaService service = new RegistrarVentaService();
       try (Connection conexion = AccesoBD.getConexion()) {
        service.registrarVentaYDetalle(conexion, tblDatos, Double.parseDouble(txtTotalFinal.getText()));
        modelito.setRowCount(0);
        txtTotalFinal.setText("0");
        txtSubtotal.setText("0");
        txtDescuento.setText("0");
        txtCantidad.setText("");
        cbxproducto.setSelectedIndex(0);
        cbxproducto.requestFocus();
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(this, "Error al registrar la venta y detalle de venta: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }

    }//GEN-LAST:event_jbtnGuardarActionPerformed

    private void btnAgregarATablaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarATablaActionPerformed
        String producto = (String) cbxproducto.getSelectedItem();
        String cantidad = txtCantidad.getText();
        String precio = txtPrecio.getText();
        String descuento = txtDescuento.getText();
        String subtotal = txtSubtotal.getText();
        // Agregar la nueva fila a la tabla
        Object[] fila = {producto, cantidad, precio, descuento, subtotal};
        modelito.addRow(fila);
         cajasdetexto.calcularYMostrarTotal(txtTotalFinal, modelito);
        // Limpiar campos
        ModelTabla limpiar = new ModelTabla();
        limpiar.limpiarCampos(txtIDProducto, txtCantidad, txtDescuento, txtSubtotal);

    }//GEN-LAST:event_btnAgregarATablaActionPerformed

    private void btnQuitarDeTablaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuitarDeTablaActionPerformed
        int selectedRow = tblDatos.getSelectedRow();
        if (selectedRow != -1) {
            DefaultTableModel model = (DefaultTableModel) tblDatos.getModel();
            double subtotalEliminar = Double.parseDouble(model.getValueAt(selectedRow, 4).toString());
            // Eliminar la fila seleccionada
            model.removeRow(selectedRow);
            // Calcular y mostrar el nuevo total de subtotales después de eliminar la fila
           cajasdetexto.calcularYMostrarTotal(txtTotalFinal, modelito);
        }
    }//GEN-LAST:event_btnQuitarDeTablaActionPerformed

    private void cbxproductoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbxproductoItemStateChanged
        String prod = (String) cbxproducto.getSelectedItem();
        ComboboxItemVenta.cargarDatosProducto(prod, txtIDProducto, txtPrecio);
    }//GEN-LAST:event_cbxproductoItemStateChanged

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
           int id = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el idVenta para actualizar"));
          ventaDAO.cargarDatosEnTabla(modelito, txtTotalFinal, txtIDCompra,id);       
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void tblDatosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDatosMouseClicked
        int selectedRow = tblDatos.getSelectedRow();
        if (selectedRow != -1) {
            // Obtener los datos de la fila seleccionada
            DefaultTableModel model = (DefaultTableModel) tblDatos.getModel();
            String producto = (String) model.getValueAt(selectedRow, 0);
            String cantidad = model.getValueAt(selectedRow, 1).toString();
            String precio = model.getValueAt(selectedRow, 2).toString();
            String descuento = model.getValueAt(selectedRow, 3).toString();
            String subtotal = model.getValueAt(selectedRow, 4).toString();
            // Establecer los datos en los campos
            cbxproducto.setSelectedItem(producto);
            txtCantidad.setText(cantidad);
            txtPrecio.setText(precio);
            txtDescuento.setText(descuento);
            txtSubtotal.setText(subtotal);
        }
    }//GEN-LAST:event_tblDatosMouseClicked

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        txtIDCompra.setText("Actual");
        cbxproducto.setSelectedIndex(0);
        txtCantidad.setText("0");
        txtDescuento.setText("0");
        modelito.removeRow(0);
        txtTotalFinal.setText("0.0");
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
       int idVenta = Integer.parseInt(JOptionPane.showInputDialog(null, "Desea eliminar este producto"));     
       EliminarVentaSQL.eliminarVenta(idVenta);     
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void jbtneditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtneditarActionPerformed
            int row = tblDatos.getSelectedRow();
// Asegúrate de que haya una fila seleccionada
    if (row != -1) {    
    // Obtiene los valores de la fila seleccionada
   String nuevoProducto = cbxproducto.getSelectedItem().toString();
    String cantidad = txtCantidad.getText().trim(); 
    String descuento = txtDescuento.getText().trim();
    String subtotal = txtSubtotal.getText().trim();
//    String total = txtTotal.getText().trim();
    // Actualiza los valores directamente en el modelo
    modelito.setValueAt(nuevoProducto, row, 0);
    modelito.setValueAt(cantidad, row, 1);
    modelito.setValueAt(descuento, row, 3);
    modelito.setValueAt(subtotal, row, 4);
    
//    modelito.setValueAt(total, row, 6);
      int nuevoIndice = obtenerIndiceEnComboBox(nuevoProducto, cbxproducto);
    cbxproducto.setSelectedIndex(nuevoIndice);
    cajasdetexto.calcularYMostrarTotal(txtTotalFinal, modelito);
}
    }//GEN-LAST:event_jbtneditarActionPerformed
public static String fechaactual(){
     Date fecha = new Date();
     SimpleDateFormat formatofecha = new SimpleDateFormat("dd/MM/YYYY");
     return formatofecha.format(fecha);
 }
private int obtenerIndiceEnComboBox(String elemento, JComboBox<String> comboBox) {
    for (int i = 0; i < comboBox.getItemCount(); i++) {
        if (comboBox.getItemAt(i).equals(elemento)) {
            return i;
        }
    }
    return -1;
}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelDown;
    private javax.swing.JPanel PanelFondo;
    private javax.swing.JPanel PanelUp;
    private javax.swing.JButton btnAgregarATabla;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnQuitarDeTabla;
    private javax.swing.JComboBox<String> cbxproducto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbtnGuardar;
    private javax.swing.JButton jbtneditar;
    private javax.swing.JTable tblDatos;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtDescuento;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtIDCompra;
    private javax.swing.JTextField txtIDProducto;
    private javax.swing.JTextField txtPrecio;
    private javax.swing.JTextField txtSubtotal;
    private javax.swing.JTextField txtTotalFinal;
    // End of variables declaration//GEN-END:variables
}
