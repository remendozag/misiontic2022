/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package datos;

import dominio.Equipo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class EquipoDAO {
     private static final String SQL_SELECT = "SELECT equipo_codigo, equipo_nombre, equipo_entrenador "
            + " FROM Equipo";

    private static final String SQL_SELECT_BY_ID = "SELECT equipo_codigo, equipo_nombre, equipo_entrenador "
            + " FROM Equipo WHERE equipo_codigo = ?";

    private static final String SQL_INSERT = "INSERT INTO Equipo(equipo_codigo, equipo_nombre, equipo_entrenador ) "
            + " VALUES(?, ?, ?)";

    private static final String SQL_UPDATE = "UPDATE Equipo "
            + " SET equipo_codigo=?, equipo_nombre=?, equipo_entrenador=? WHERE equipo_codigo";

    private static final String SQL_DELETE = "DELETE FROM Equipo WHERE equipo_codigo = ?";

    public List<Equipo> listar() {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Equipo equipo = null;
        List<Equipo> equipos = new ArrayList<>();
        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_SELECT);
            rs = stmt.executeQuery();
            while (rs.next()) {
                int equipoCodigo = rs.getInt("equipo_codigo");
                String equipoNombre = rs.getString("equipo_nombre");
                String equipoEntrenador = rs.getString("equipo_entrenador");

                equipo = new Equipo(equipoCodigo, equipoNombre, equipoEntrenador);
                equipos.add(equipo);
            }
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            Conexion.close(rs);
            Conexion.close(stmt);
            Conexion.close(conn);
        }
        return equipos;
    }
    
     public Equipo encontrar(Equipo equipo) {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_SELECT_BY_ID);
            stmt.setInt(1, equipo.getEquipoCodigo());
            rs = stmt.executeQuery();
            rs.absolute(1);//nos posicionamos en el primer registro devuelto

            String equipoNombre = rs.getString("equipo_nombre");
            String equipoEntrenador = rs.getString("equipo_entrenador");

            equipo.setNombre(equipoNombre);
            equipo.setEntrenador(equipoEntrenador);

        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            Conexion.close(rs);
            Conexion.close(stmt);
            Conexion.close(conn);
        }
        return equipo;
    }

    public int insertar(Equipo equipo) {
        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;
        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_INSERT);
            stmt.setString(1, equipo.getNombre());
            stmt.setString(2, equipo.getEntrenador());

            rows = stmt.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            Conexion.close(stmt);
            Conexion.close(conn);
        }
        return rows;
    }

    public int actualizar(Equipo equipo) {
        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;
        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_UPDATE);
            stmt.setString(1, equipo.getNombre());
            stmt.setString(2, equipo.getEntrenador());

            rows = stmt.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            Conexion.close(stmt);
            Conexion.close(conn);
        }
        return rows;
    }

    public int eliminar(Equipo equipo) {
        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;
        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_DELETE);
            stmt.setInt(1, equipo.getEquipoCodigo());

            rows = stmt.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            Conexion.close(stmt);
            Conexion.close(conn);
        }
        return rows;
    }


}
