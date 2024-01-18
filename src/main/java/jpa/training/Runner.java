package jpa.training;

import jpa.training.dao.StudentRepo;
import jpa.training.entity.Student;

public class Runner {
    static StudentRepo studentRepo = new StudentRepo();

    public static void main(String[] args) {
//        save();
        studentRepo.findAndUpdate(1);
        studentRepo.findAndDelete(3);
        System.out.println("Operation Compilation are Successful");
    }
    private static void save(){
        Student student1 = new Student("Anil",2300,34);
        Student student2 = new Student("Sunil",3300,14);
        Student student3 = new Student("Sathak",4300,24);
        Student student4 = new Student("Anees",5300,44);
        studentRepo.persist(student1);
        System.out.println("Successfully save in Database :"+student1);
        studentRepo.persist(student2);
        System.out.println("Successfully save in Database :"+student2);
        studentRepo.persist(student3);
        System.out.println("Successfully save in Database :"+student3);
        studentRepo.persist(student4);
        System.out.println("Successfully save in Database :"+student4);
    }
}
