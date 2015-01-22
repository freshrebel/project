/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

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
public class DoosDalTest
{
    
    public DoosDalTest()
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
     * Test of SelectAll method, of class DoosDal.
     */
    @Test
    public void testSelectAll()
    {
        System.out.println("SelectAll");
        List<Doos> result = DoosDal.selectAll();
        if (result.size() < 1)
        {
            fail();
        }
        
    }

    /**
     * Test of insert method, of class DoosDal.
     */
    @Test
    public void testInsert()
    {
        System.out.println("insert");
        Doos doos = new Doos("test8", 8);
        Long result = DoosDal.insert(doos);
        if (result <= 0)
        {
            fail();
        }
    }

    /**
     * Test of selectOne method, of class DoosDal.
     */
    @Test
    public void testSelectOne()
    {
        System.out.println("selectOne");
        String query = "SELECT d FROM Doos AS d WHERE d.id = 1";
        int expResult = 1;
        Doos result = DoosDal.selectOne(query);
        assertEquals(expResult, result.getNummer());
    }

    /**
     * Test of update method, of class DoosDal.
     */
    @Test
    public void testUpdate()
    {
        System.out.println("update");
        Doos doosU = DoosDal.selectOne("SELECT d FROM Doos AS d WHERE d.id = 401");
        doosU.setCommentaar("");
        DoosDal.update(doosU);
        Doos result = DoosDal.selectOne("SELECT d FROM Doos AS d WHERE d.id = 401");
        assertEquals("", result.getCommentaar());
    }
    
}
