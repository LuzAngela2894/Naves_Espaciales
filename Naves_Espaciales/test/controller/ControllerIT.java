/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package controller;

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
public class ControllerIT {
    
    public ControllerIT() {
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
     * Test of ingresarNave method, of class Controller.
     */
    @Test
    public void testIngresarNave() {
        System.out.println("ingresarNave");
        Model nave_espacial = null;
        Controller instance = new Controller();
        boolean expResult = false;
        boolean result = instance.ingresarNave(nave_espacial);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of buscarNave method, of class Controller.
     */
    @Test
    public void testBuscarNave() {
        System.out.println("buscarNave");
        String nombre = "";
        Controller instance = new Controller();
        Model expResult = null;
        Model result = instance.buscarNave(nombre);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of modificarNave method, of class Controller.
     */
    @Test
    public void testModificarNave() {
        System.out.println("modificarNave");
        Model nave_espacial = null;
        Controller instance = new Controller();
        boolean expResult = false;
        boolean result = instance.modificarNave(nave_espacial);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of buscarNaveId method, of class Controller.
     */
    @Test
    public void testBuscarNaveId() {
        System.out.println("buscarNaveId");
        Integer id = null;
        Controller instance = new Controller();
        Model expResult = null;
        Model result = instance.buscarNaveId(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of borrarNave method, of class Controller.
     */
    @Test
    public void testBorrarNave() {
        System.out.println("borrarNave");
        Model nave_espacial = null;
        Controller instance = new Controller();
        boolean expResult = false;
        boolean result = instance.borrarNave(nave_espacial);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of mostrarDatos method, of class Controller.
     */
    @Test
    public void testMostrarDatos() {
        System.out.println("mostrarDatos");
        Controller instance = new Controller();
        List<Model> expResult = null;
        List<Model> result = instance.mostrarDatos();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of buscarTipo method, of class Controller.
     */
    @Test
    public void testBuscarTipo() {
        System.out.println("buscarTipo");
        String tipo = "";
        Controller instance = new Controller();
        List<Model> expResult = null;
        List<Model> result = instance.buscarTipo(tipo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of buscarPais method, of class Controller.
     */
    @Test
    public void testBuscarPais() {
        System.out.println("buscarPais");
        String pais = "";
        Controller instance = new Controller();
        List<Model> expResult = null;
        List<Model> result = instance.buscarPais(pais);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
