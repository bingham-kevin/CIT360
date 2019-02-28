package com.cit360;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Retrieve {
    public Student retrieve(int id){
        Configuration configGet = new Configuration().configure("retrieve.cfg.xml").addAnnotatedClass(Student.class);
        SessionFactory factoryGet = configGet.buildSessionFactory();
        Session sessionGet = factoryGet.openSession();

        Student data = (Student) sessionGet.get(Student.class, id );
        sessionGet.close();

        return data;
    }
}
