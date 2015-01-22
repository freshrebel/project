/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import Model.Doos;
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
public class DoosDal
{
    public static List<Doos> selectAll()
    {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("ProjectPU");
        EntityManager em = emf.createEntityManager();
        Query q = em.createQuery("SELECT d FROM Doos AS d ORDER BY d.nummer");
        List<Doos> lijst = new ArrayList<Doos>();
        lijst = q.getResultList();
        return lijst;
    }
    
    public static Long insert(Doos doos)
    {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("ProjectPU");
        EntityManager em = emf.createEntityManager();
        EntityTransaction trans = em.getTransaction();
        trans.begin();
        em.persist(doos);
        trans.commit();
        return doos.getId();
    }
    
    public static Doos selectOne(String query)
    {
        try
        {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("ProjectPU");
        EntityManager em = emf.createEntityManager();
        Query q = em.createQuery(query);
        return (Doos)q.getSingleResult();
        }
        catch(Exception e)
        {
            return new Doos();
        }
    }
    
    public static void update(Doos doosU)
    {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("ProjectPU");
        EntityManager em = emf.createEntityManager();
        EntityTransaction trans = em.getTransaction();
        //http://www.objectdb.com/java/jpa/persistence/update
        Doos doos = em.find(Doos.class, doosU.getId());
        trans.begin();
        doos.setCommentaar(doosU.getCommentaar());
        trans.commit();
    }
    
    public static void delete(Doos doosD)
    {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("ProjectPU");
        EntityManager em = emf.createEntityManager();
        EntityTransaction trans = em.getTransaction();
        //http://www.objectdb.com/java/jpa/persistence/update
        Doos doos = em.find(Doos.class, doosD.getId());
        trans.begin();
        em.remove(doos);
        trans.commit();
    }
}
