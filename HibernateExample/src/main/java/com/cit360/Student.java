package com.cit360;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student{

    @Id
    private int sid;
    private String sname;
    private String sgrade;

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
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
}