/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ptecnica;

import java.util.ArrayList;
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
public class ClienteTest {
    
    public ClienteTest() {
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
     * Test of setId method, of class Cliente.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        UUID id = UUID.randomUUID();
        Cliente instance = new Cliente("Alex", "123@gmail.com", 123456789);
        instance.setId(id);
    
    }

    /**
     * Test of getNombre method, of class Cliente.
     */
    @Test
    public void testGetNombre() {
        System.out.println("getNombre");
        Cliente instance = new Cliente("Alex", "123@gmail.com", 123456789);
        String expResult = "Alex";
        String result = instance.getNombre();
        assertEquals(expResult, result);
     
    }

    /**
     * Test of setNombre method, of class Cliente.
     */
    @Test
    public void testSetNombre() {
        System.out.println("setNombre");
        String nombre = "Hola";
        Cliente instance = new Cliente("Alex", "123@gmail.com", 123456789);
        instance.setNombre(nombre);

    }

    /**
     * Test of getMail method, of class Cliente.
     */
    @Test
    public void testGetMail() {
        System.out.println("getMail");
        Cliente instance = new Cliente("Alex", "123@gmail.com", 123456789);
        String expResult = "123@gmail.com";
        String result = instance.getMail();
        assertEquals(expResult, result);

    }

    /**
     * Test of setMail method, of class Cliente.
     */
    @Test
    public void testSetMail() {
        System.out.println("setMail");
        String mail = "121212@hotmail.es";
        Cliente instance = new Cliente("Alex", "123@gmail.com", 123456789);
        instance.setMail(mail);

    }

    /**
     * Test of getNumero_telefono method, of class Cliente.
     */
    @Test
    public void testGetNumero_telefono() {
        System.out.println("getNumero_telefono");
        Cliente instance = new Cliente("Alex", "123@gmail.com", 123456789);
        int expResult = 123456789;
        int result = instance.getNumero_telefono();
        assertEquals(expResult, result);

    }

    /**
     * Test of setNumero_telefono method, of class Cliente.
     */
    @Test
    public void testSetNumero_telefono() {
        System.out.println("setNumero_telefono");
        int numero_telefono = 999999999;
        Cliente instance = new Cliente("Alex", "123@gmail.com", 123456789);
        instance.setNumero_telefono(numero_telefono);
    }

    /**
     * Test of getListaReservas method, of class Cliente.
     */
    @Test
    public void testGetListaReservas() {
        System.out.println("getListaReservas");
        Cliente instance = new Cliente("Alex", "123@gmail.com", 123456789);
        ArrayList<Hotel> expResult = new ArrayList<Hotel>();
        ArrayList<Hotel> result = instance.getListaReservas();
        assertEquals(expResult, result);

    }

    /**
     * Test of setListaReservas method, of class Cliente.
     */
    @Test
    public void testSetListaReservas() {
        System.out.println("setListaReservas");
        ArrayList<Hotel> listaReservas = new ArrayList<Hotel>();
        listaReservas.add(new Hotel("Hola","Mallorca"));
        Cliente instance = new Cliente("Alex", "123@gmail.com", 123456789);
        instance.setListaReservas(listaReservas);

    }

    /**
     * Test of reservarHotel method, of class Cliente.
     */
    @Test
    public void testReservarHotel() {
        System.out.println("reservarHotel");
        Hotel hotel = new Hotel("Hola","Mallorca");
        Cliente instance = new Cliente("Alex", "123@gmail.com", 123456789);
        instance.reservarHotel(hotel);

    }

    /**
     * Test of toString method, of class Cliente.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Cliente instance = new Cliente("Alex", "123@gmail.com", 123456789);
        String expResult = "Alex";
        String result = instance.toString();
        assertEquals(expResult, result);
    }
    
}
