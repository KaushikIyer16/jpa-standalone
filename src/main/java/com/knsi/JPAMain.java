package com.knsi;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

/**
 * Created by kaushik.i on 15/07/19.
 */
public class JPAMain {

    public static void main(String[] args) {
        EntityManager em = Persistence.createEntityManagerFactory("test").createEntityManager();
        EntityTransaction et = null;
        try{
            et = em.getTransaction();
            // Begin the transaction
            et.begin();

            Sample sample = new Sample(1, "knsi");
            em.persist(sample);

            et.commit();
        }catch (Exception e) {
            if (et != null) {
                et.rollback();
            }
            // Print the Exception
            e.printStackTrace();
        }finally {
            em.close();
        }
    }
}
