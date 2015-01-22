/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import Model.Gebruiker;
import java.util.List;
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
public class GebruikerDalTest
{
    
    public GebruikerDalTest()
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
     * Test of insert method, of class GebruikerDal.
     */
    @Test
    public void testInsert()
    {
        System.out.println("insertGebruiker");
        Gebruiker gebruiker = new Gebruiker("arno", "arnod", "admin");
        Long result = GebruikerDal.insert(gebruiker);
        if (result <= 0)
        {
            fail();
        }
    }

    /**
     * Test of selectOne method, of class GebruikerDal.
     */
    @Test
    public void testSelectOne()
    {
        System.out.println("selectOne");
        String query = "SELECT g FROM Gebruiker AS g WHERE g.gebruikersnaam = 'arno2' AND g.wachtwoord = 'deckx2'";
        Gebruiker result = GebruikerDal.selectOne(query);
        if (result.getId() == null)
        {
            fail();
        }
    }

    /**
     * Test of selectAll method, of class GebruikerDal.
     */
    @Test
    public void testSelectAll()
    {
        System.out.println("selectAll");
        List<Gebruiker> result = GebruikerDal.selectAll();
        if (result.size() < 1)
        {
            fail();
        }
    }

    /**
     * Test of update method, of class GebruikerDal.
     */
    @Test
    public void testUpdate()
    {
        System.out.println("update");
        Gebruiker gebruikerU = GebruikerDal.selectOne("SELECT g FROM Gebruiker AS g WHERE g.id = 501");
        gebruikerU.setType("gebruiker");
        GebruikerDal.update(gebruikerU);
        Gebruiker result = GebruikerDal.selectOne("SELECT g FROM Gebruiker AS g WHERE g.id = 501");
        assertEquals("gebruiker", result.getType());
    }

    /**
     * Test of delete method, of class GebruikerDal.
     */
    @Test
    public void testDelete()
    {
        System.out.println("delete");
        Gebruiker gebruikerD = GebruikerDal.selectOne("SELECT g FROM Gebruiker AS g WHERE g.id = 551");
        GebruikerDal.delete(gebruikerD);
        Gebruiker result = GebruikerDal.selectOne("SELECT g FROM Gebruiker AS g WHERE g.id = 551");
        if (result.getId() != null)
        {
            fail();
        }
        
    }
    
}
