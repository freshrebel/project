/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Model.Cd;
import Model.Nummer;
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
public class NummerServiceTest
{
    
    public NummerServiceTest()
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
     * Test of selectAll method, of class NummerService.
     */
    @Test
    public void testSelectAll()
    {
        System.out.println("selectAll");
        List<Nummer> expResult = null;
        List<Nummer> result = NummerService.selectAll();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of insert method, of class NummerService.
     */
    @Test
    public void testInsert()
    {
        System.out.println("insert");
        String titel = "";
        String artiest = "";
        int minuten = 0;
        int seconden = 0;
        int bpm = 0;
        String genres = "";
        String labels = "";
        Cd cd = null;
        Long expResult = null;
        Long result = NummerService.insert(titel, artiest, minuten, seconden, bpm, genres, labels, cd);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of selectOne method, of class NummerService.
     */
    @Test
    public void testSelectOne()
    {
        System.out.println("selectOne");
        int id = 0;
        Nummer expResult = null;
        Nummer result = NummerService.selectOne(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of update method, of class NummerService.
     */
    @Test
    public void testUpdate()
    {
        System.out.println("update");
        Nummer nummerU = null;
        NummerService.update(nummerU);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of delete method, of class NummerService.
     */
    @Test
    public void testDelete()
    {
        System.out.println("delete");
        Nummer nummerD = null;
        NummerService.delete(nummerD);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of selectWhere method, of class NummerService.
     */
    @Test
    public void testSelectWhere()
    {
        System.out.println("selectWhere");
        String titel = "song";
        String artiest = "";
        int minuten = 0;
        int seconden = 0;
        int bpm = 0;
        String genres = "";
        String labels = "";
        Cd cd = null;
        List<Nummer> result = NummerService.selectWhere(titel, artiest, minuten, seconden, bpm, genres, labels, cd);
        if (result.size() <= 0)
        {
            fail();
        }
    }
    
}
