/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

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
public class DoosServiceTest
{
    
    public DoosServiceTest()
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
     * Test of selectAll method, of class DoosService.
     */
    @Test
    public void testSelectAll()
    {
        System.out.println("selectAll");
        List<Doos> result = DoosService.selectAll();
        if (result.size() < 1)
        {
            fail();
        }
    }

    /**
     * Test of insert method, of class DoosService.
     */
    @Test
    public void testInsert()
    {
        System.out.println("insert");
        String commentaar = "test9";
        int nummer = 9;
        Long result = DoosService.insert(commentaar, nummer);
        if (result <= 0)
        {
            fail();
        }
    }

    /**
     * Test of selectOne method, of class DoosService.
     */
    @Test
    public void testSelectOne()
    {
        System.out.println("selectOne");
        int id = 1;
        int expResult = 1;
        Doos result = DoosService.selectOne(id);
        assertEquals(expResult, result.getNummer());
        
    }

    /**
     * Test of update method, of class DoosService.
     */
    @Test
    public void testUpdate()
    {
        System.out.println("update");
        Doos doosU = DoosService.selectOne(401);
        doosU.setCommentaar("test");
        DoosService.update(doosU);
        Doos doos = DoosService.selectOne(401);
        assertEquals("test", doos.getCommentaar());
    }
    
}
