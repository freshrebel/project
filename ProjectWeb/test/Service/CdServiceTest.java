/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Model.Cd;
import Model.Doos;
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
public class CdServiceTest
{
    
    public CdServiceTest()
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
     * Test of selectAll method, of class CdService.
     */
    @Test
    public void testSelectAll()
    {
        System.out.println("selectAll");
        List<Cd> expResult = null;
        //List<Cd> result = CdService.selectAll();
        //assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of insert method, of class CdService.
     */
    @Test
    public void testInsert()
    {
        System.out.println("insert");
//        String titel = "";
//        String artiest = "";
//        Doos doos = null;
//        Long expResult = null;
//        Long result = CdService.insert(titel, artiest, doos);
//        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of selectOne method, of class CdService.
     */
    @Test
    public void testSelectOne()
    {
        System.out.println("selectOne");
        int id = 951;
        String expResult = "ArtiestTestUpdate";
        Cd result = CdService.selectOne(id);
        assertEquals(expResult, result.getArtiest());
    }

    /**
     * Test of update method, of class CdService.
     */
    @Test
    public void testUpdate()
    {
        System.out.println("update");
//        Cd cdU = null;
//        CdService.update(cdU);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of delete method, of class CdService.
     */
    @Test
    public void testDelete()
    {
        System.out.println("delete");
//        Cd cdD = null;
//        CdService.delete(cdD);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of selectWhere method, of class CdService.
     */
    @Test
    public void testSelectWhere()
    {
//        System.out.println("selectWhere");
//        String titel = "";
//        String artiest = "Pdate";
//        Doos doos = null;
//        List<Cd> result = CdService.selectWhere(titel, artiest, doos);
//        if (result.size() <= 0)
//        {
//            fail();
//        }
//        else
//        {
//            for (Cd cd : result)
//            {
//                System.out.println(cd.getTitel() + " " + cd.getArtiest() + " " + cd.getDoos());
//            }
//        }
    }
    
}
