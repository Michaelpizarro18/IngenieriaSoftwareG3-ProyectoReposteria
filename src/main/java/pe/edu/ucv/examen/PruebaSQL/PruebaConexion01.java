
package pe.edu.ucv.examen.PruebaSQL;

import java.sql.Connection;
import pe.edu.ucv.examen.AccesoBD.AccesoBD;

public class PruebaConexion01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        try {
            Connection cn = AccesoBD.getConexion();
            System.out.println("Conexion ok.");
            cn.close(); // Cierra la conexion
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
