/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import Model.Gebruiker;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.*;

/**
 *
 * @author Arno
 */
public class GebruikerDal
{

    public static List<Gebruiker> selectAll()
    {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("ProjectPU");
        EntityManager em = emf.createEntityManager();
        Query q = em.createQuery("SELECT g FROM Gebruiker AS g");
        List<Gebruiker> lijst = new ArrayList<Gebruiker>();
        lijst = q.getResultList();
        return lijst;
    }
    
    public static Long insert(Gebruiker gebruiker)
    {
        Long id = (long) 0;
        try
        {
            EntityManagerFactory emf = Persistence.createEntityManagerFactory("ProjectPU");
            EntityManager em = emf.createEntityManager();
            EntityTransaction trans = em.getTransaction();
            trans.begin();
            em.persist(gebruiker);
            trans.commit();
            id = gebruiker.getId();
        }
        catch (Exception e)
        {

        }

        return id;
    }

    public static Gebruiker selectOne(String query)
    {
        try
        {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("ProjectPU");
        EntityManager em = emf.createEntityManager();
        Query q = em.createQuery(query);
        return (Gebruiker)q.getSingleResult();
        }
        catch(Exception e)
        {
            return new Gebruiker();
        }
    }
    
    public static void update(Gebruiker gebruikerU)
    {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("ProjectPU");
        EntityManager em = emf.createEntityManager();
        EntityTransaction trans = em.getTransaction();
        //http://www.objectdb.com/java/jpa/persistence/update
        Gebruiker gebruiker = em.find(Gebruiker.class, gebruikerU.getId());
        trans.begin();
        gebruiker.setGebruikersnaam(gebruikerU.getGebruikersnaam());
        gebruiker.setType(gebruikerU.getType());
        gebruiker.setWachtwoord(gebruikerU.getWachtwoord());
        trans.commit();
    }
    
    public static void delete(Gebruiker gebruikerD)
    {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("ProjectPU");
        EntityManager em = emf.createEntityManager();
        EntityTransaction trans = em.getTransaction();
        //http://www.objectdb.com/java/jpa/persistence/update
        Gebruiker gebruiker = em.find(Gebruiker.class, gebruikerD.getId());
        trans.begin();
        em.remove(gebruiker);
        trans.commit();
    }
}
