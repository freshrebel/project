/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import Model.Cd;
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
public class CdDal
{
    public static List<Cd> selectAll()
    {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("ProjectPU");
        EntityManager em = emf.createEntityManager();
        Query q = em.createQuery("SELECT c FROM Cd AS c ORDER BY c.titel");
        List<Cd> lijst = new ArrayList<Cd>();
        lijst = q.getResultList();
        return lijst;
    }
    
    public static List<Cd> selectWhere(String query)
    {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("ProjectPU");
        EntityManager em = emf.createEntityManager();
        Query q = em.createQuery(query);
        List<Cd> lijst = new ArrayList<Cd>();
        lijst = q.getResultList();
        return lijst;
    }
    
    public static Long insert(Cd cd)
    {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("ProjectPU");
        EntityManager em = emf.createEntityManager();
        EntityTransaction trans = em.getTransaction();
        trans.begin();
        em.persist(cd);
        trans.commit();
        return cd.getId();
    }
    
    public static Cd selectOne(String query)
    {
        try
        {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("ProjectPU");
        EntityManager em = emf.createEntityManager();
        Query q = em.createQuery(query);
        return (Cd)q.getSingleResult();
        }
        catch(Exception e)
        {
            return new Cd();
        }
    }
    
    public static void update(Cd cdU)
    {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("ProjectPU");
        EntityManager em = emf.createEntityManager();
        EntityTransaction trans = em.getTransaction();
        //http://www.objectdb.com/java/jpa/persistence/update
        Cd cd = em.find(Cd.class, cdU.getId());
        trans.begin();
        cd.setArtiest(cdU.getArtiest());
        if (!(cdU.getDoos() == null))
        {
            cd.setDoos(cdU.getDoos());
        }
        cd.setTitel(cdU.getTitel());
        trans.commit();
    }
    
    public static void delete(Cd cdD)
    {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("ProjectPU");
        EntityManager em = emf.createEntityManager();
        EntityTransaction trans = em.getTransaction();
        //http://www.objectdb.com/java/jpa/persistence/update
        Cd cd = em.find(Cd.class, cdD.getId());
        trans.begin();
        em.remove(cd);
        trans.commit();
    }
}
