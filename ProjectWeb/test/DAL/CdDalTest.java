/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import Model.Cd;
import Model.Doos;
import Service.DoosService;
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
public class CdDalTest
{
    
    public CdDalTest()
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
     * Test of selectAll method, of class CdDal.
     */
    @Test
    public void testSelectAll()
    {
        System.out.println("selectAll");
        List<Cd> result = CdDal.selectAll();
        if (result.size() <= 0)
        {
            fail();
        }
    }

    /**
     * Test of insert method, of class CdDal.
     */
    @Test
    public void testInsert()
    {
        System.out.println("insert");
        Doos doos = DoosService.selectOne(1);
        Cd cd = new Cd("Test2", "ArtiestTest2", doos);
        Long result = CdDal.insert(cd);
        if (result <= 0)
        {
            fail();
        }
    }

    /**
     * Test of selectOne method, of class CdDal.
     */
    @Test
    public void testSelectOne()
    {
        System.out.println("selectOne");
        String query = "SELECT c FROM Cd AS c WHERE c.id = 951";
        Cd result = CdDal.selectOne(query);
        if (!(result.getArtiest().equals("ArtiestTestUpdate") && result.getTitel().equals("TestUpdate")))
        {
            fail();
        }
    }

    /**
     * Test of update method, of class CdDal.
     */
    @Test
    public void testUpdate()
    {
        System.out.println("update");
        Cd cdU = CdDal.selectOne("SELECT c FROM Cd AS c WHERE c.id = 951");
        cdU.setArtiest("ArtiestTestUpdate");
        CdDal.update(cdU);
        Cd result = CdDal.selectOne("SELECT c FROM Cd AS c WHERE c.id = 951");
        if (!result.getArtiest().equals("ArtiestTestUpdate"))
        {
            fail();
        }
    }

    /**
     * Test of delete method, of class CdDal.
     */
    @Test
    public void testDelete()
    {
        System.out.println("delete");
        Doos doos = DoosService.selectOne(1);
        Cd cdD = new Cd("TestDelete", "ArtiestTestDelete", doos);
        CdDal.insert(cdD);
        CdDal.delete(cdD);
        Cd result = CdDal.selectOne("SELECT c FROM Cd AS c WHERE c.id = " + cdD.getId());
        if (result.getId() != null)
        {
            fail();
        }
    }

    /**
     * Test of selectWhere method, of class CdDal.
     */
    @Test
    public void testSelectWhere()
    {
        System.out.println("selectWhere");
        String query = "SELECT c FROM Cd AS c WHERE c.titel LIKE '%'";
        List<Cd> result = CdDal.selectWhere(query);
        if (result.size() <= 0)
        {
            fail();
        }
        else
        {
            for (Cd cd : result)
            {
                System.out.println(cd.getTitel());
            }
        }
    }
    
}
