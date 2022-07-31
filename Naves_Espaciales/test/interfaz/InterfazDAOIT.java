/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package interfaz;

import java.util.List;
import model.Model;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Luz Angela Melo
 */
public class InterfazDAOIT {
    
    public InterfazDAOIT() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of ingresarNave method, of class InterfazDAO.
     */
    @Test
    public void testIngresarNave() {
        System.out.println("ingresarNave");
        Model nave_espacial = null;
        InterfazDAO instance = new InterfazDAOImpl();
        boolean expResult = false;
        boolean result = instance.ingresarNave(nave_espacial);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of buscarNave method, of class InterfazDAO.
     */
    @Test
    public void testBuscarNave() {
        System.out.println("buscarNave");
        String nombre = "";
        InterfazDAO instance = new InterfazDAOImpl();
        Model expResult = null;
        Model result = instance.buscarNave(nombre);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of modificarNave method, of class InterfazDAO.
     */
    @Test
    public void testModificarNave() {
        System.out.println("modificarNave");
        Model nave_espacial = null;
        InterfazDAO instance = new InterfazDAOImpl();
        boolean expResult = false;
        boolean result = instance.modificarNave(nave_espacial);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of buscarNaveId method, of class InterfazDAO.
     */
    @Test
    public void testBuscarNaveId() {
        System.out.println("buscarNaveId");
        Integer id = null;
        InterfazDAO instance = new InterfazDAOImpl();
        Model expResult = null;
        Model result = instance.buscarNaveId(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of borrarNave method, of class InterfazDAO.
     */
    @Test
    public void testBorrarNave() {
        System.out.println("borrarNave");
        Integer id = null;
        InterfazDAO instance = new InterfazDAOImpl();
        boolean expResult = false;
        boolean result = instance.borrarNave(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of mostrarDatos method, of class InterfazDAO.
     */
    @Test
    public void testMostrarDatos() {
        System.out.println("mostrarDatos");
        InterfazDAO instance = new InterfazDAOImpl();
        List<Model> expResult = null;
        List<Model> result = instance.mostrarDatos();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of buscarTipo method, of class InterfazDAO.
     */
    @Test
    public void testBuscarTipo() {
        System.out.println("buscarTipo");
        String tipo = "";
        InterfazDAO instance = new InterfazDAOImpl();
        List<Model> expResult = null;
        List<Model> result = instance.buscarTipo(tipo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of buscarPais method, of class InterfazDAO.
     */
    @Test
    public void testBuscarPais() {
        System.out.println("buscarPais");
        String pais = "";
        InterfazDAO instance = new InterfazDAOImpl();
        List<Model> expResult = null;
        List<Model> result = instance.buscarPais(pais);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class InterfazDAOImpl implements InterfazDAO {

        public boolean ingresarNave(Model nave_espacial) {
            return false;
        }

        public Model buscarNave(String nombre) {
            return null;
        }

        public boolean modificarNave(Model nave_espacial) {
            return false;
        }

        public Model buscarNaveId(Integer id) {
            return null;
        }

        public boolean borrarNave(Integer id) {
            return false;
        }

        public List<Model> mostrarDatos() {
            return null;
        }

        public List<Model> buscarTipo(String tipo) {
            return null;
        }

        public List<Model> buscarPais(String pais) {
            return null;
        }
    }
    
}
