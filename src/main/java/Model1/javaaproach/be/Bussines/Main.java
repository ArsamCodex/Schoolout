package Model1.javaaproach.be.Bussines;


import Model1.javaaproach.be.Model.Course;
import Model1.javaaproach.be.Model.Exam;
import Model1.javaaproach.be.Model.Gender;
import Model1.javaaproach.be.Model.Person;
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
        Person person = new Person().setFamilyName("Armin").setFirstName("parsa").setGender(Gender.MALE);
        EntityTransaction et = em.getTransaction();
        et.begin();
        em.persist(person);

        et.commit();
        em.close();
        emf.close();
//
//        System.out.println(person.toString());
//        UserRepo ur = new UserRepo();
//        ur.examOutput(10L);



    }
}
