package com.cit360;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.ArrayList;

public class App
{
    public static void main( String[] args ){

        Student student1 = new Student();

        student1.setSid(1);
        student1.setSname("Kevin");
        student1.setSgrade("A");


        Student student2 = new Student();

        student2.setSid(2);
        student2.setSname("Lauren");
        student2.setSgrade("A+");

        Student student3 = new Student();

        student3.setSid(3);
        student3.setSname("Daisy");
        student3.setSgrade("B+");

        ArrayList<Student> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);

        Configuration config = new Configuration().configure().addAnnotatedClass(Student.class);
        SessionFactory factory = config.buildSessionFactory();
        Session session = factory.openSession();
        Transaction transmit = session.beginTransaction();

        for (Student student : students) {

            session.save(student);
        }

        transmit.commit();
    }
}
