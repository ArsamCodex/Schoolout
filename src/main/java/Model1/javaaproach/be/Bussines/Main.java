package Model1.javaaproach.be.Bussines;


import Model1.javaaproach.be.Model.*;
import userRepository.UserRepo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.time.LocalDate;

public class Main {
    public static  void main (String [] args){

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("dataSource");
        EntityManager em = emf.createEntityManager();

        Person person = em.find(Person.class,9);
        em.getTransaction().begin();
        em.persist(person);
        System.out.println(person.toString());
        em.getTransaction().commit();

        em.close();
        emf.close();





    }
}
