package com.cit360;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import static javax.persistence.GenerationType.IDENTITY;

@Entity
public class Student{

    @Id
    @GeneratedValue(strategy = IDENTITY)
    private int id;
    private String sname;
    private String sgrade;

    public int getId() {
        return id;
    }

    public void setId() {
        this.id = id;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getSgrade() {
        return sgrade;
    }

    public void setSgrade(String sgrade) {
        this.sgrade = sgrade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", sname='" + sname + '\'' +
                ", sgrade='" + sgrade + '\'' +
                '}';
    }
}