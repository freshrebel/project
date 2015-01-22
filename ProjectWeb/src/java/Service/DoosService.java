/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import DAL.DoosDal;
import Model.Doos;
import java.util.List;

/**
 *
 * @author Arno
 */
public class DoosService
{
    public static List<Doos> selectAll()
    {        
        return DoosDal.selectAll();
    }
    
    public static Long insert(String commentaar, int nummer)
    {
        Doos doos = new Doos(commentaar, nummer);
        return DoosDal.insert(doos);
    }
    
    public static Doos selectOne(int id)
    {
        Doos doos = DoosDal.selectOne("SELECT d FROM Doos AS d WHERE d.id = " + id);
        return doos;
    }
    
    public static void update(Doos doosU)
    {
        DoosDal.update(doosU);
    }
    
    public static void delete(Doos doosD)
    {
        DoosDal.delete(doosD);
    }
    
}
