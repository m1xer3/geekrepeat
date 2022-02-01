package ru.danilsibgatullin.services;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import java.util.List;
import java.util.function.Consumer;
import ru.danilsibgatullin.models.Student;
import java.util.function.Function;

public class StudentService {


    private EntityManagerFactory emFactory;


    public StudentService(EntityManagerFactory emFactory) {
        this.emFactory = emFactory;
    }


    public Student getOneStudent(Long id){
        return executeForEntityManger(em -> em.find(Student.class,id));
    }

    public List<Student> getAllStudents(){
        return executeForEntityManger(em-> em.createQuery("select s from Student s").getResultList());
    }


    public void addStudent(Student student){
        executeInTransaction(em-> em.persist(student));
    }

    public void removeStudent(Student student){
        executeInTransaction(em->em.remove(student));
    }

    private <R> R executeForEntityManger(Function<EntityManager, R> function){
        EntityManager em = emFactory.createEntityManager();
        try{
            return function.apply(em);
        }finally {
            em.close();
        }
    }

    private void executeInTransaction (Consumer<EntityManager> consumer){
        EntityManager em = emFactory.createEntityManager();
        try{
            em.getTransaction().begin();
            consumer.accept(em);
            em.getTransaction().commit();
        }catch (Exception e){
            em.getTransaction().rollback();
        }
        finally {
            em.close();
        }
    }

}
