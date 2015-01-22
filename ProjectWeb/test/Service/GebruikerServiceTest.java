/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Arno
 */
public class GebruikerServiceTest
{
    
    public GebruikerServiceTest()
    {
    }
    
    @BeforeClass
    public static void setUpClass()
    {
    }
    
    @AfterClass
    public static void tearDownClass()
    {
    }
    
    @Before
    public void setUp()
    {
    }
    
    @After
    public void tearDown()
    {
    }

    /**
     * Test of insertGebruiker method, of class GebruikerService.
     */
    @Test
    public void testInsertGebruiker()
    {
        System.out.println("insertGebruiker");
        String gebruikersnaam = "arno";
        String wachtwoord = "deckx";
        String type = "admin";
        Long result = GebruikerService.insertGebruiker(gebruikersnaam, wachtwoord, type);
        if (result <= 0)
        {
            fail();
        }
    }

    /**
     * Test of login method, of class GebruikerService.
     */
    @Test
    public void testLogin()
    {
        System.out.println("login");
        String gebruikersnaam = "arno2";
        String wachtwoord = "deckx2";
        String expResult = "admin";
        String result = GebruikerService.login(gebruikersnaam, wachtwoord);
        assertEquals(expResult, result);
    }
    
}
