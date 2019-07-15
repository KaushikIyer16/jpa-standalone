package com.knsi;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.sql.*;
import java.util.Arrays;
import java.util.List;

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

            School knsi = new School();
            knsi.setCode(1);
            knsi.setAddress("dfvwr");
            knsi.setName("my school");

            Teacher t1 = new Teacher(1, "sneh", knsi);
            Teacher t2 = new Teacher(2, "kaushik", knsi);

            List<Teacher> allTeach = Arrays.asList(t1, t2);
            knsi.setTeacherList(allTeach);
            em.persist(knsi);

            System.out.println(em.find(School.class, 1).getName());
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
