/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ptecnica;

import java.util.UUID;
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
public class HotelTest {
    
    public HotelTest() {
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
     * Test of setId method, of class Hotel.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        UUID id = UUID.randomUUID();
        Hotel instance = new Hotel("Hola","Mallorca");
        instance.setId(id);
    }

    /**
     * Test of getNombre method, of class Hotel.
     */
    @Test
    public void testGetNombre() {
        System.out.println("getNombre");
        Hotel instance = new Hotel("Hola","Mallorca");
        String expResult = "Hola";
        String result = instance.getNombre();
        assertEquals(expResult, result);
    }

    /**
     * Test of setNombre method, of class Hotel.
     */
    @Test
    public void testSetNombre() {
        System.out.println("setNombre");
        String nombre = "Madrid";
        Hotel instance = new Hotel("Hola","Mallorca");
        instance.setNombre(nombre);
    }

    /**
     * Test of getZona method, of class Hotel.
     */
    @Test
    public void testGetZona() {
        System.out.println("getZona");
        Hotel instance = new Hotel("Hola","Mallorca");
        String expResult = "Mallorca";
        String result = instance.getZona();
        assertEquals(expResult, result);
    }

    /**
     * Test of setZona method, of class Hotel.
     */
    @Test
    public void testSetZona() {
        System.out.println("setZona");
        String zona = "Mallorca";
        Hotel instance = new Hotel("Hola","Madrid");
        instance.setZona(zona);
    }

    /**
     * Test of toString method, of class Hotel.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Hotel instance = new Hotel("Hola","Mallorca");
        String expResult = "Hola";
        String result = instance.toString();
        assertEquals(expResult, result);
    }
    
}
