
package pe.edu.ucv.examen.service;

import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.util.ArrayList;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import pe.edu.ucv.examen.AccesoBD.AccesoBD;
import pe.edu.ucv.examen.Controller.Producto;
import pe.edu.ucv.examen.AccesoBD.MostrarProductoyCategoriasSQL;
import pe.edu.ucv.examen.model.Render;


/**
 *
 * @author User
 */
public class ModelTablaRegistrarProducto {
   MostrarProductoyCategoriasSQL dao = null;


public void visualizar_ProductoVO(JTable tabla) {
    tabla.setDefaultRenderer(Object.class, new Render());
    DefaultTableModel dt = new DefaultTableModel() {
        @Override
        public boolean isCellEditable(int row, int column) {
            return false;
        }
    };
    dt.addColumn("idProducto");
    dt.addColumn("Nombre");
    dt.addColumn("Precio");
    dt.addColumn("Categoría");
    dt.addColumn("idProveedor");
    dt.addColumn("Receta");
    dt.addColumn("Foto");

    dao = new MostrarProductoyCategoriasSQL();
    
    ArrayList<Producto> list = dao.MostrarTodosLosProductos();

    if (list.size() > 0) {
        for (int i = 0; i < list.size(); i++) {
            Object fila[] = new Object[7];
            Producto vo = list.get(i);
            fila[0] = vo.getIdProducto();
            fila[1] = vo.getNombre();
            fila[2] = vo.getPrecio();
            fila[3] = vo.getCategoria();
            fila[4] = vo.getIdProveedor();
            fila[5] = vo.getReceta();

            try {
                byte[] bi = vo.getFoto();
                if (bi != null) {
                    BufferedImage image = ImageIO.read(new ByteArrayInputStream(bi));
                    ImageIcon imgi = new ImageIcon(image.getScaledInstance(60, 60, 0));
                    fila[6] = new JLabel(imgi);
                } else {
                    fila[6] = new JLabel("No imagen");
                }
            } catch (Exception ex) {
                fila[6] = new JLabel("No imagen");
            }
            dt.addRow(fila);
        }
        tabla.setModel(dt);
        tabla.setRowHeight(60);
    }
}
public void visualizar_TablaReceta(JTable tabla) {
    tabla.setDefaultRenderer(Object.class, new Render());
    DefaultTableModel dt = new DefaultTableModel() {
        @Override
        public boolean isCellEditable(int row, int column) {
            return false;
        }
    };
    dt.addColumn("idProducto");
    dt.addColumn("Nombre");
    dt.addColumn("Precio");
    dt.addColumn("Receta");
    dt.addColumn("Foto");

    dao = new MostrarProductoyCategoriasSQL();
    
    ArrayList<Producto> list = dao.MostrarTodosLosProductos();

    if (list.size() > 0) {
        for (int i = 0; i < list.size(); i++) {
            Object fila[] = new Object[5];
            Producto vo = list.get(i);
            fila[0] = vo.getIdProducto();
            fila[1] = vo.getNombre();
            fila[2] = vo.getPrecio();
            fila[3] = vo.getReceta();

            try {
                byte[] bi = vo.getFoto();
                if (bi != null) {
                    BufferedImage image = ImageIO.read(new ByteArrayInputStream(bi));
                    ImageIcon imgi = new ImageIcon(image.getScaledInstance(200, 200, 0));
                    fila[4] = new JLabel(imgi);
                } else {
                    fila[4] = new JLabel("No imagen");
                }
            } catch (Exception ex) {
                fila[4] = new JLabel("No imagen");
            }
            dt.addRow(fila);
        }
        tabla.setModel(dt);
        tabla.setRowHeight(60);
    }
}
    
    public void visualizar_TablaReceta_categoria(JTable tabla, int idCategoria) {
    tabla.setDefaultRenderer(Object.class, new Render());
    DefaultTableModel dt = new DefaultTableModel() {
        @Override
        public boolean isCellEditable(int row, int column) {
            return false;
        }
    };
    dt.addColumn("idProducto");
    dt.addColumn("Nombre");
    dt.addColumn("Precio");
    dt.addColumn("Receta");
    dt.addColumn("Foto");

    dao = new MostrarProductoyCategoriasSQL();
    
    ArrayList<Producto> list = dao.MostrarProductosPorCategoria(idCategoria);

    if (list.size() > 0) {
        for (int i = 0; i < list.size(); i++) {
            Object fila[] = new Object[5];
            Producto vo = list.get(i);
            fila[0] = vo.getIdProducto();
            fila[1] = vo.getNombre();
            fila[2] = vo.getPrecio();
            fila[3] = vo.getReceta();

            try {
                byte[] bi = vo.getFoto();
                if (bi != null) {
                    BufferedImage image = ImageIO.read(new ByteArrayInputStream(bi));
                    ImageIcon imgi = new ImageIcon(image.getScaledInstance(200, 200, 0));
                    fila[4] = new JLabel(imgi);
                } else {
                    fila[4] = new JLabel("No imagen");
                }
            } catch (Exception ex) {
                fila[4] = new JLabel("No imagen");
            }
            dt.addRow(fila);
        }
        tabla.setModel(dt);
        tabla.setRowHeight(60);
    } else {
        // Limpiar la tabla si no hay productos para mostrar
        dt.setRowCount(0);
        tabla.setModel(dt);
    }
}
}

