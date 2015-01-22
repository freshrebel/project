/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import Model.Nummer;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 *
 * @author Arno
 */
public class NummerDal
{
    public static List<Nummer> selectAll()
    {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("ProjectDesktopPU");
        EntityManager em = emf.createEntityManager();
        Query q = em.createQuery("SELECT n FROM Nummer AS n ORDER BY n.titel");
        List<Nummer> lijst = new ArrayList<Nummer>();
        lijst = q.getResultList();
        return lijst;
    }
    
    public static List<Nummer> selectWhere(String query)
    {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("ProjectDesktopPU");
        EntityManager em = emf.createEntityManager();
        Query q = em.createQuery(query);
        List<Nummer> lijst = new ArrayList<Nummer>();
        lijst = q.getResultList();
        return lijst;
    }
    
    public static Long insert(Nummer nummer)
    {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("ProjectDesktopPU");
        EntityManager em = emf.createEntityManager();
        EntityTransaction trans = em.getTransaction();
        trans.begin();
        em.persist(nummer);
        trans.commit();
        return nummer.getId();
    }
    
    public static Nummer selectOne(String query)
    {
        try
        {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("ProjectDesktopPU");
        EntityManager em = emf.createEntityManager();
        Query q = em.createQuery(query);
        return (Nummer)q.getSingleResult();
        }
        catch(Exception e)
        {
            return new Nummer();
        }
    }
    
    public static void update(Nummer nummerU)
    {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("ProjectDesktopPU");
        EntityManager em = emf.createEntityManager();
        EntityTransaction trans = em.getTransaction();
        //http://www.objectdb.com/java/jpa/persistence/update
        Nummer nummer = em.find(Nummer.class, nummerU.getId());
        trans.begin();
        nummer.setArtiest(nummerU.getArtiest());
        nummer.setBpm(nummerU.getBpm());
        nummer.setCd(nummerU.getCd());
        nummer.setGenres(nummerU.getGenres());
        nummer.setLabels(nummerU.getLabels());
        nummer.setMinuten(nummerU.getMinuten());
        nummer.setSeconden(nummerU.getSeconden());
        nummer.setTitel(nummerU.getTitel());
        trans.commit();
    }
    
    public static void delete(Nummer nummerD)
    {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("ProjectDesktopPU");
        EntityManager em = emf.createEntityManager();
        EntityTransaction trans = em.getTransaction();
        //http://www.objectdb.com/java/jpa/persistence/update
        Nummer nummer = em.find(Nummer.class, nummerD.getId());
        trans.begin();
        em.remove(nummer);
        trans.commit();
    }
}
