/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import DAL.GebruikerDal;
import Model.Gebruiker;
import java.util.List;

/**
 *
 * @author Arno
 */
public class GebruikerService
{
    public static List<Gebruiker> selectAll()
    {        
        return GebruikerDal.selectAll();
    }

    public static Long insertGebruiker(String gebruikersnaam, String wachtwoord, String type)
    {
        Gebruiker gebruiker = new Gebruiker(gebruikersnaam, wachtwoord, type);
        return GebruikerDal.insert(gebruiker);
    }

    public static String login(String gebruikersnaam, String wachtwoord)
    {
        Gebruiker gebruiker = GebruikerDal.selectOne("SELECT g FROM Gebruiker g WHERE g.gebruikersnaam = '" + gebruikersnaam + "' AND g.wachtwoord = '" + wachtwoord + "'");
        if (gebruiker.getGebruikersnaam() != null)
        {
            if (gebruiker.getGebruikersnaam().equals(gebruikersnaam))
            {
                return gebruiker.getType();
            }
            else
            {
                return "";
            }
        }
        else
        {
            return "";
        }
    }
    
    public static Gebruiker selectOne(int id)
    {
        Gebruiker gebruiker = GebruikerDal.selectOne("SELECT g FROM Gebruiker AS g WHERE g.id = " + id);
        return gebruiker;
    }
    
    public static void update(Gebruiker gebruikerU)
    {
        GebruikerDal.update(gebruikerU);
    }
    
    public static void delete(Gebruiker gebruikerD)
    {
        GebruikerDal.delete(gebruikerD);
    }
}
