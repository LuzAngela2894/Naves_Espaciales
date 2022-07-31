/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package model;

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
public class ModelIT {
    
    public ModelIT() {
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
     * Test of getId method, of class Model.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Model instance = new Model();
        Integer expResult = null;
        Integer result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setId method, of class Model.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        Integer id = null;
        Model instance = new Model();
        instance.setId(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNombre method, of class Model.
     */
    @Test
    public void testGetNombre() {
        System.out.println("getNombre");
        Model instance = new Model();
        String expResult = "";
        String result = instance.getNombre();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNombre method, of class Model.
     */
    @Test
    public void testSetNombre() {
        System.out.println("setNombre");
        String nombre = "";
        Model instance = new Model();
        instance.setNombre(nombre);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTipo method, of class Model.
     */
    @Test
    public void testGetTipo() {
        System.out.println("getTipo");
        Model instance = new Model();
        String expResult = "";
        String result = instance.getTipo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTipo method, of class Model.
     */
    @Test
    public void testSetTipo() {
        System.out.println("setTipo");
        String tipo = "";
        Model instance = new Model();
        instance.setTipo(tipo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPais method, of class Model.
     */
    @Test
    public void testGetPais() {
        System.out.println("getPais");
        Model instance = new Model();
        String expResult = "";
        String result = instance.getPais();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPais method, of class Model.
     */
    @Test
    public void testSetPais() {
        System.out.println("setPais");
        String pais = "";
        Model instance = new Model();
        instance.setPais(pais);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCombustible method, of class Model.
     */
    @Test
    public void testGetCombustible() {
        System.out.println("getCombustible");
        Model instance = new Model();
        Double expResult = null;
        Double result = instance.getCombustible();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCombustible method, of class Model.
     */
    @Test
    public void testSetCombustible() {
        System.out.println("setCombustible");
        Double combustible = null;
        Model instance = new Model();
        instance.setCombustible(combustible);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEmpuje method, of class Model.
     */
    @Test
    public void testGetEmpuje() {
        System.out.println("getEmpuje");
        Model instance = new Model();
        Double expResult = null;
        Double result = instance.getEmpuje();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEmpuje method, of class Model.
     */
    @Test
    public void testSetEmpuje() {
        System.out.println("setEmpuje");
        Double empuje = null;
        Model instance = new Model();
        instance.setEmpuje(empuje);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
