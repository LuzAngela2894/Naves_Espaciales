/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package interfaz;

import java.util.List;
import model.Model;

/**
 *
 * @author Luz Angela Melo
 *
 */
public interface InterfazDAO {

    //DATOS DE UNA SOLA NAVE ESPACIAL
    public boolean ingresarNave(Model nave_espacial);
    
    //DATOS DE UNA SOLA NAVE ESPACIAL
    public Model buscarNave(String nombre);

    //DATOS DE UNA SOLA NAVE ESPACIAL
    public boolean modificarNave(Model nave_espacial);
    
    //DATOS DE UNA SOLA NAVE ESPACIAL
    public Model buscarNaveId(Integer id);

    //DATOS DE UNA SOLA NAVE ESPACIAL
    public boolean borrarNave(Integer id);

    //DATOS DE VARIAS NAVES ESPACIALES
    public List<Model> mostrarDatos();    

    //DATOS DE VARIAS NAVES ESPACIALES
    public List<Model> buscarTipo(String tipo);

    //DATOS DE VARIAS NAVES ESPACIALES
    public List<Model> buscarPais(String pais);
}
