package com.cit360;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.ArrayList;

public class Save {
    public void save(Student std){
        Configuration configSave = new Configuration().configure().addAnnotatedClass(Student.class);
        SessionFactory factorySave = configSave.buildSessionFactory();
        Session sessionSave = factorySave.openSession();
        Transaction transmitSave = sessionSave.beginTransaction();

        sessionSave.save(std);
        transmitSave.commit();
        sessionSave.close();
    }

}
