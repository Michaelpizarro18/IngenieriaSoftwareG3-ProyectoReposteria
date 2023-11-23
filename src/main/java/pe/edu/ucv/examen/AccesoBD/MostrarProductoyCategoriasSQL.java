package pe.edu.ucv.examen.AccesoBD;



import java.sql.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import pe.edu.ucv.examen.AccesoBD.AccesoBD;
import pe.edu.ucv.examen.Controller.Producto;


/*Metodo listar*/
public class MostrarProductoyCategoriasSQL{

  public ArrayList<Producto> MostrarTodosLosProductos() {
    ArrayList<Producto> list = new ArrayList<Producto>();
    String sql = "EXEC MostrarTodosLosProductos"; // Llama al procedimiento almacenado
    try (Connection con = AccesoBD.getConexion();
         CallableStatement cs = con.prepareCall(sql);
         ResultSet rs = cs.executeQuery()) {
        while (rs.next()) {
            Producto vo = new Producto();
            vo.setIdProducto(rs.getInt(1));
            vo.setNombre(rs.getString(2));
            vo.setPrecio(rs.getDouble(3));
            vo.setCategoria(rs.getInt(4));
            vo.setIdProveedor(rs.getInt(5)); // Asume que hay un atributo "proveedor" en Producto
            vo.setReceta(rs.getString(6));
            vo.setFoto(rs.getBytes(7));
            list.add(vo);
        }
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, ex.toString());
    }

    return list;
}
public ArrayList<Producto> MostrarProductosPorCategoria(int idCategoria) {
    ArrayList<Producto> list = new ArrayList<>();
    String sql = "{CALL ObtenerProductosPorCategoria(?)}"; 

    try (Connection con = AccesoBD.getConexion();
         CallableStatement cs = con.prepareCall(sql)) {

        cs.setInt(1, idCategoria);

        try (ResultSet rs = cs.executeQuery()) {
            while (rs.next()) {
                Producto vo = new Producto();
                vo.setIdProducto(rs.getInt("idProducto"));
                vo.setNombre(rs.getString("nombre"));
                vo.setPrecio(rs.getDouble("precio"));
                vo.setReceta(rs.getString("receta"));
                vo.setFoto(rs.getBytes("foto"));
                list.add(vo);
            }
        }
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, ex.toString());
    }

    return list;
}

}
 
