/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import DAL.CdDal;
import DAL.NummerDal;
import Model.Cd;
import Model.Nummer;
import java.util.List;

/**
 *
 * @author Arno
 */
public class NummerService
{
    public static List<Nummer> selectAll()
    {
        return NummerDal.selectAll();
    }
    
    public static Long insert(String titel, String artiest, int minuten, int seconden, int bpm, String genres, String labels, Cd cd)
    {
        Nummer nummer;
        if (cd.getId() == null)
        {
            nummer = new Nummer();
            nummer.setTitel(titel);
            nummer.setArtiest(artiest);
            nummer.setMinuten(minuten);
            nummer.setSeconden(seconden);
            nummer.setBpm(bpm);
            nummer.setGenres(genres);
            nummer.setLabels(labels);
        }
        else
        {
        nummer = new Nummer(titel, artiest, minuten, seconden, bpm, genres, labels, cd);
        }
        return NummerDal.insert(nummer);
    }
    
    public static Nummer selectOne(int id)
    {
        Nummer nummer = NummerDal.selectOne("SELECT n FROM Nummer AS n WHERE n.id = " + id);
        return nummer;
    }
    
    public static void update(Nummer nummerU)
    {
        NummerDal.update(nummerU);
    }
    
    public static void delete(Nummer nummerD)
    {
        NummerDal.delete(nummerD);
    }
    
    public static List<Nummer> selectWhere(String titel, String artiest, int minuten, int seconden, int bpm, String genres, String labels, Cd cd)
    {
        String query = "SELECT n FROM Nummer AS n WHERE ";
        if (titel != "")
        {
            query = query + "n.titel LIKE '%" + titel + "%'";
        }
        else
        {
            query = query + "n.titel LIKE '%'";
        }
        
        if (artiest != "")
        {
            query = query + " AND n.artiest LIKE '%" + artiest + "%'";
        }
        else
        {
            query = query + " AND n.artiest LIKE '%'";
        }
        
        if (minuten != 0)
        {
            query = query + " AND n.minuten = " + minuten;
        }
        else
        {
            query = query + " AND n.minuten >= 0";
        }
        
        if (seconden != 0)
        {
            query = query + " AND n.seconden = " + seconden;
        }
        else
        {
            query = query + " AND n.seconden >= 0";
        }
        
        if (bpm != 0)
        {
            query = query + " AND n.bpm = " + bpm;
        }
        else
        {
            query = query + " AND n.bpm >= 0";
        }
        
        if (genres != "")
        {
            query = query + " AND n.genres LIKE '%" + genres + "%'";
        }
        else
        {
            query = query + " AND n.genres LIKE '%'";
        }
        
        if (labels != "")
        {
            query = query + " AND n.labels LIKE '%" + labels + "%'";
        }
        else
        {
            query = query + " AND n.labels LIKE '%'";
        }
        
        if (cd != null)
        {
            query = query + " AND n.cd.id = " + cd.getId();
        }
        return NummerDal.selectWhere(query);
    }
}
