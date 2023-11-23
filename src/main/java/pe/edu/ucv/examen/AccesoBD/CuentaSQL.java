/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.edu.ucv.examen.AccesoBD;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import pe.edu.ucv.examen.Controller.Usuario;


public class CuentaSQL {
    
    
   public Usuario validarUsuario(String usuario, String clave) throws SQLException {
    Connection cn = null;
    Usuario cuenta = null;
    String sql = "EXEC ObtenerDatosCuenta ?, ?";
    PreparedStatement pstm = null;
    ResultSet rs = null;

    try {
        cn = AccesoBD.getConexion();
        pstm = cn.prepareStatement(sql);
        pstm.setString(1, usuario);
        pstm.setString(2, clave);
        rs = pstm.executeQuery();

        if (!rs.next()) {
            throw new SQLException("Contraseña Incorrecta");
        }

        cuenta = new Usuario();
        cuenta.setIdcuenta(rs.getInt("codigo"));
        cuenta.setUsuario(rs.getString("nombrecompleto"));
        cuenta.setContraseña(rs.getString("clave"));

        rs.close();
    } catch (SQLException e) {
        throw new RuntimeException(e.getMessage());
    } catch (Exception e) {
        throw new RuntimeException("Error en el proceso, inténtelo nuevamente.");
    } finally {
        try {
            if (rs != null) {
                rs.close();
            }
            if (pstm != null) {
                pstm.close();
            }
            if (cn != null) {
                cn.close();
            }
        } catch (Exception e) {
            // Manejar errores o cerrar conexiones
        }
    }
    return cuenta;
}
    
}
