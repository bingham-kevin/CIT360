package com.cit360;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.ArrayList;

public class SeedDb {
    public void seedmysql(){
        Student student1 = new Student();

        student1.setSname("Kevin");
        student1.setSgrade("A");

        Student student2 = new Student();

        student2.setSname("Lauren");
        student2.setSgrade("A+");

        Student student3 = new Student();

        student3.setSname("Daisy");
        student3.setSgrade("B+");

        ArrayList<Student> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);

        Configuration configSeed = new Configuration().configure("seed.cfg.xml").addAnnotatedClass(Student.class);
        SessionFactory factorySave = configSeed.buildSessionFactory();
        Session sessionSeed = factorySave.openSession();
        Transaction transmitSave = sessionSeed.beginTransaction();

        for (Student student : students) {
            sessionSeed.save(student);
        }

        transmitSave.commit();
        sessionSeed.close();
    }
}
