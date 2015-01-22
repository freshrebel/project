/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import DAL.CdDal;
import Model.Cd;
import Model.Doos;
import java.util.List;

/**
 *
 * @author Arno
 */
public class CdService
{

    public static List<Cd> selectAll()
    {
        return CdDal.selectAll();
    }

    public static Long insert(String titel, String artiest, Doos doos)
    {
        Cd cd;
        if (doos.getId() != null)
        {
            cd = new Cd(titel, artiest, doos);
        }
        else
        {
            cd = new Cd();
            cd.setTitel(titel);
            cd.setArtiest(artiest);
        }
        
        return CdDal.insert(cd);
    }

    public static Cd selectOne(int id)
    {
        Cd cd = CdDal.selectOne("SELECT c FROM Cd AS c WHERE c.id = " + id);
        return cd;
    }

    public static void update(Cd cdU)
    {
        CdDal.update(cdU);
    }

    public static void delete(Cd cdD)
    {
        CdDal.delete(cdD);
    }

    public static List<Cd> selectWhere(String titel, String artiest, Doos doos)
    {
        String query = "SELECT c FROM Cd AS c WHERE";
        if (titel.equals(""))
        {
            query = query + " c.titel LIKE '%'";
        }
        else
        {
            query = query + " c.titel LIKE '%" + titel + "%'";
        }
        if (artiest.equals(""))
        {
            query = query + " AND c.artiest LIKE '%'";
        }
        else
        {
            query = query + " AND c.artiest LIKE '%" + artiest + "%'";
        }
        if (doos != null)
        {
            query = query + " AND c.doos.id = " + doos.getId();
        }
        return CdDal.selectWhere(query);

    }
}
