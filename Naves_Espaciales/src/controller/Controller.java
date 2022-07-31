/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import model.Model;
import java.util.List;
import interfaz.DAO;
import interfaz.InterfazDAO;

/**
 *
 * @author Luz Angela Melo
 */
public class Controller {
    
    private InterfazDAO interfaz;

    //LLENAR EL ARREGLO (CONSTRUCTOR)
    public Controller() {
        interfaz = new DAO();
    }

    //INGRESAR NAVE PASANDO POR PARÁMETRO
    public boolean ingresarNave(Model nave_espacial) {
        return interfaz.ingresarNave(nave_espacial);
    }

    //BUSCAR NAVE POR PARÁMETRO (NOMBRE)
    public Model buscarNave(String nombre) {
        return interfaz.buscarNave(nombre);
    }

    //MODIFICAR NAVE POR PARÁMETRO (ID)
    public boolean modificarNave(Model nave_espacial) {
        return interfaz.modificarNave(nave_espacial);
    }

    //BUSCAR NAVE POR PARÁMETRO (ID)
    public Model buscarNaveId(Integer id) {
        return interfaz.buscarNaveId(id);
    }

    //BORRAR NAVE POR PARÁMETRO (ID)
    public boolean borrarNave(Model nave_espacial) {
        return interfaz.borrarNave(nave_espacial.getId());
    }

    //MOSTRAR DATOS DE NAVES
    public List<Model> mostrarDatos() {
        return interfaz.mostrarDatos();
    }

    //CONSULTAS SQL
    public List<Model> buscarTipo(String tipo) {
        return interfaz.buscarTipo(tipo);
    }
    
    public List<Model> buscarPais(String pais) {
        return interfaz.buscarPais(pais);
    }
}
