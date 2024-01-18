package jpa.training.dao;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import jpa.training.entity.Student;
import jpa.training.utils.PersistenceUtils;

import java.util.List;

public class StudentRepo {
//    EntityManager entityManager = PersistenceUtils.getEntityManager();
        EntityManager entityManager = PersistenceUtils.getEntityManager();

    public void persist(Student student){
        System.out.println("Persist the Method using the Java persistence Method :");
        EntityTransaction tx = entityManager.getTransaction();
        tx.begin();
        entityManager.persist(student);
        tx.commit();
        System.out.println("Persist Method......");
    }

    public void findAndUpdate(int id) {
        System.out.println("Find And Update the Value");
        EntityTransaction tx = entityManager.getTransaction();
        tx.begin();
        Student find = entityManager.find(Student.class,id);
        System.out.println("Find the number :"+find);
        find.setName(find.getName() +"NAU");
        System.out.println("Update the Name :"+find);
        tx.commit();
        System.out.println("So we are Find and Update the name ");
    }

    public void findAndDelete(int id) {
        System.out.println("Find and Delete the value from the database");
        EntityTransaction tx = entityManager.getTransaction();
        tx.begin();
        Student find = entityManager.find(Student.class, id);
        System.out.println("Find: " + find);
        find.setName(find.getName() + "123");
        entityManager.remove(find);
        tx.commit();
        System.out.println("We are delete the Data from the Database");
    }
  public List<Student> findAll(){
    return entityManager.createQuery("Select s from student s order by s.age asc",Student.class).getResultList();


  }

}
