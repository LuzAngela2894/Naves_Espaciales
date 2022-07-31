/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfaz;

import conexion.Conexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import model.Model;

/**
 *
 * @author Luz Angela Melo Implementación de todos los métodos abstractos
 *
 */
public class DAO extends Conexion implements InterfazDAO {

    @Override
    public boolean ingresarNave(Model nave_espacial) {
        try {
            getConexion();
            PreparedStatement consulta = enlace.prepareStatement("INSERT INTO naves(id, nombre, tipo, pais, combustible, empuje) values (?,?,?,?,?,?)");
            consulta.setInt(1, nave_espacial.getId());
            consulta.setString(2, nave_espacial.getNombre());
            consulta.setString(3, nave_espacial.getTipo());
            consulta.setString(4, nave_espacial.getPais());
            consulta.setDouble(5, nave_espacial.getCombustible());
            consulta.setDouble(6, nave_espacial.getEmpuje());
            consulta.executeUpdate();
            closeConexion();
            return true;
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            return false;
        }
    }

    @Override
    public Model buscarNave(String nombre) {
        try {
            getConexion();
            PreparedStatement consulta = enlace.prepareStatement("SELECT * FROM naves where nombre=?");
            consulta.setString(1, nombre);
            //ALMACENAR LOS DATOS EN UNA VARIABLE
            ResultSet data = consulta.executeQuery();
            if (data.next()) {
                Model nave = new Model();
                nave.setId(data.getInt("id"));
                nave.setNombre(data.getString("nombre"));
                nave.setTipo(data.getString("tipo"));
                nave.setPais(data.getString("pais"));
                nave.setCombustible(data.getDouble("combustible"));
                nave.setEmpuje(data.getDouble("empuje"));
                closeConexion();
                return nave;
            } else {
                closeConexion();
                return null;
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            return null;
        }
    }

    @Override
    public boolean modificarNave(Model nave_espacial) {
        try {
            getConexion();
            PreparedStatement consulta = enlace.prepareStatement("UPDATE naves set pais=?, combustible=?, empuje=? where id=?");
            consulta.setString(1, nave_espacial.getPais());
            consulta.setDouble(2, nave_espacial.getCombustible());
            consulta.setDouble(3, nave_espacial.getEmpuje());
            consulta.setInt(4, nave_espacial.getId());
            consulta.executeUpdate();
            closeConexion();
            return true;
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            return false;
        }
    }

    @Override
    public Model buscarNaveId(Integer id) {
        try {
            getConexion();
            PreparedStatement consulta = enlace.prepareStatement("SELECT * FROM naves where id=?");
            consulta.setInt(1, id);
            //ALMACENAR LOS DATOS EN UNA VARIABLE
            ResultSet data = consulta.executeQuery();
            if (data.next()) {
                Model nave = new Model();
                nave.setId(data.getInt("id"));
                nave.setNombre(data.getString("nombre"));
                nave.setTipo(data.getString("tipo"));
                nave.setPais(data.getString("pais"));
                nave.setCombustible(data.getDouble("combustible"));
                nave.setEmpuje(data.getDouble("empuje"));
                closeConexion();
                return nave;
            } else {
                closeConexion();
                return null;
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            return null;
        }
    }

    @Override
    public boolean borrarNave(Integer id) {
        try {
            getConexion();
            PreparedStatement consulta = enlace.prepareStatement("DELETE from naves where id=?");
            consulta.setInt(1, id);
            consulta.executeUpdate();
            closeConexion();
            return true;
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            return false;
        }
    }

    @Override
    public List<Model> mostrarDatos() {
        try {
            //INSTANCIAR LA LISTA
            List<Model> naves = new ArrayList();
            getConexion();
            PreparedStatement consulta = enlace.prepareStatement("SELECT * FROM naves");
            //ALMACENAR LOS DATOS EN UNA VARIABLE
            ResultSet data = consulta.executeQuery();
            while (data.next()) {
                Model nave = new Model();
                nave.setId(data.getInt("id"));
                nave.setNombre(data.getString("nombre"));
                nave.setTipo(data.getString("tipo"));
                nave.setPais(data.getString("pais"));
                nave.setCombustible(data.getDouble("combustible"));
                nave.setEmpuje(data.getDouble("empuje"));
                naves.add(nave);
            }
            closeConexion();
            return naves;
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            return null;
        }
    }

    @Override
    public List<Model> buscarTipo(String tipo) {
        try {
            //INSTANCIAR LA LISTA
            List<Model> naves = new ArrayList();
            getConexion();
            PreparedStatement consulta = enlace.prepareStatement("SELECT * FROM naves where tipo=?");
            consulta.setString(1, tipo);
            //ALMACENAR LOS DATOS EN UNA VARIABLE
            ResultSet data = consulta.executeQuery();
            while (data.next()) {
                Model nave = new Model();
                nave.setId(data.getInt("id"));
                nave.setNombre(data.getString("nombre"));
                nave.setTipo(data.getString("tipo"));
                nave.setPais(data.getString("pais"));
                nave.setCombustible(data.getDouble("combustible"));
                nave.setEmpuje(data.getDouble("empuje"));
                naves.add(nave);
            }
            closeConexion();
            return naves;
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            return null;
        }
    }

    @Override
    public List<Model> buscarPais(String pais) {
        try {
            //INSTANCIAR LA LISTA
            List<Model> naves = new ArrayList();
            getConexion();
            PreparedStatement consulta = enlace.prepareStatement("SELECT id, nombre, tipo FROM naves where pais=?");
            consulta.setString(1, pais);
            //ALMACENAR LOS DATOS EN UNA VARIABLE
            ResultSet data = consulta.executeQuery();
            while (data.next()) {
                Model nave = new Model();
                nave.setId(data.getInt("id"));
                nave.setNombre(data.getString("nombre"));
                nave.setTipo(data.getString("tipo"));
                naves.add(nave);
            }
            closeConexion();
            return naves;
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            return null;
        }
    }

}
