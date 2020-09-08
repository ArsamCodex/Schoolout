package userRepository;

import Model1.javaaproach.be.Model.User;

import javax.persistence.*;



public class UserRepo {

    private Long id;

    EntityManagerFactory emf = Persistence.createEntityManagerFactory("dataSource");
    EntityManager em = emf.createEntityManager();

    public  void examOutput(Long id){

        EntityTransaction et = em.getTransaction();
        et.begin();
        User user = em.find(User.class,6);
        System.out.println(user.toString());
        em.persist(id);

        et.commit();
        em.close();
        emf.close();
    }
}
