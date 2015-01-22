/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import Model.Cd;
import Model.Nummer;
import Service.CdService;
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
public class NummerDalTest
{
    
    public NummerDalTest()
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
     * Test of selectAll method, of class NummerDal.
     */
    @Test
    public void testSelectAll()
    {
        System.out.println("selectAll");
        List<Nummer> result = NummerDal.selectAll();
        if (result.size() <= 0)
        {
            fail();
        }
    }

    /**
     * Test of selectWhere method, of class NummerDal.
     */
    @Test
    public void testSelectWhere()
    {
        System.out.println("selectWhere");
        String query = "SELECT n FROM Nummer AS n WHERE n.titel LIKE '%'";
        List<Nummer> result = NummerDal.selectWhere(query);
        if (result.size() <= 0)
        {
            fail();
        }
    }

    /**
     * Test of insert method, of class NummerDal.
     */
    @Test
    public void testInsert()
    {
        System.out.println("insert");
        Cd cd = CdService.selectOne(901);
        Nummer nummer = new Nummer("TestSongUpdate", "ArtiestTestUpdate", 3, 14, 305, "genre1;genre2", "label1;label2", cd);
        Long result = NummerDal.insert(nummer);
        if (result <= 0)
        {
            fail();
        }
    }

    /**
     * Test of selectOne method, of class NummerDal.
     */
    @Test
    public void testSelectOne()
    {
        System.out.println("selectOne");
        String query = "SELECT n FROM Nummer AS n WHERE n.id = '1251'";
        String expResult = "TestSong1";
        Nummer result = NummerDal.selectOne(query);
        if (!result.getTitel().equals(expResult))
        {
            fail();
        }
    }

    /**
     * Test of update method, of class NummerDal.
     */
    @Test
    public void testUpdate()
    {
        System.out.println("update");
        Nummer nummerU = NummerDal.selectOne("SELECT n FROM Nummer AS n WHERE n.id = '1301'");
        nummerU.setArtiest("ArtiestTestUpdated");
        NummerDal.update(nummerU);
        Nummer result = NummerDal.selectOne("SELECT n FROM Nummer AS n WHERE n.id = '1301'");
        if (!result.getArtiest().equals("ArtiestTestUpdated"))
        {
           fail(); 
        }
    }

    /**
     * Test of delete method, of class NummerDal.
     */
    @Test
    public void testDelete()
    {
        System.out.println("delete");
        Cd cd = CdService.selectOne(901);
        Nummer nummer = new Nummer("TestSongDelete", "ArtiestTestDelete", 3, 14, 305, "genre1;genre2", "label1;label2", cd);
        NummerDal.insert(nummer);
        NummerDal.delete(nummer);
        Nummer result = NummerDal.selectOne("SELECT n FROM Nummer AS n WHERE n.id = '" + nummer.getId() + "'");
        if (result.getId() != null)
        {
            fail();
        }
    }
    
}
