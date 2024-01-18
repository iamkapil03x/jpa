package jpa.training.utils;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class PersistenceUtils {
   public static EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("default-mysql");
   public static EntityManager getEntityManager(){
       return entityManagerFactory.createEntityManager();
   }
}