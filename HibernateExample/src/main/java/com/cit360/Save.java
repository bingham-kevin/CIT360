package com.cit360;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.ArrayList;

public class Save {
    public void save(){
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

        Configuration configSave = new Configuration().configure().addAnnotatedClass(Student.class);
        SessionFactory factorySave = configSave.buildSessionFactory();
        Session sessionSave = factorySave.openSession();
        Transaction transmitSave = sessionSave.beginTransaction();

        for (Student student : students) {
            sessionSave.save(student);
        }

        transmitSave.commit();
        sessionSave.close();
    }

}
