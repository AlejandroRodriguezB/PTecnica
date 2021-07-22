/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ptecnica;

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author AlejandroRodriguezB
 */
public class LogitravelTest {
    
    public LogitravelTest() {
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
     * Test of getClientes method, of class Logitravel.
     */
    @Test
    public void testGetClientes() {
        System.out.println("getClientes");
        Logitravel instance = new Logitravel();
        ArrayList<Cliente> expResult = new ArrayList<Cliente>();
        ArrayList<Cliente> result = instance.getClientes();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setClientes method, of class Logitravel.
     */
    @Test
    public void testSetClientes() {
        System.out.println("setClientes");
        ArrayList<Cliente> listaClientes = null;
        Logitravel instance = new Logitravel();
        instance.setClientes(listaClientes);
        
    }

    /**
     * Test of getHoteles method, of class Logitravel.
     */
    @Test
    public void testGetHoteles() {
        System.out.println("getHoteles");
        Logitravel instance = new Logitravel();
        ArrayList<Hotel> expResult = new ArrayList<Hotel>();
        ArrayList<Hotel> result = instance.getHoteles();
        assertEquals(expResult, result);
    }

    /**
     * Test of setHoteles method, of class Logitravel.
     */
    @Test
    public void testSetHoteles() {
        System.out.println("setHoteles");
        ArrayList<Hotel> hoteles = null;
        Logitravel instance = new Logitravel();
        instance.setHoteles(hoteles);
    }

    /**
     * Test of addCliente method, of class Logitravel.
     */
    @Test
    public void testAddCliente() {
        System.out.println("addCliente");
        Cliente cliente = null;
        Logitravel instance = new Logitravel();
        instance.addCliente(cliente);
    }

    /**
     * Test of addHoteles method, of class Logitravel.
     */
    @Test
    public void testAddHoteles() {
        System.out.println("addHoteles");
        Hotel hotel = null;
        Logitravel instance = new Logitravel();
        instance.addHoteles(hotel);
    }

    /**
     * Test of enviaRecomendaciones method, of class Logitravel.
     */
    @Test
    public void testEnviaRecomendaciones() {
        System.out.println("enviaRecomendaciones");
        Logitravel instance = new Logitravel();
        instance.enviaRecomendaciones();
    }
    
}
