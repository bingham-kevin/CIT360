package com.cit360;

import java.util.Scanner;

public class App
{
    public static void main( String[] args ) {
        Scanner in = new Scanner(System.in);
        System.out.println("Would you like to prepopulate the database with three records? Yes(1) or No(2)");
        int pop = in.nextInt();
        if (pop == 1) {
            SeedDb newDb = new SeedDb();
            newDb.seedmysql();
        }else{
            System.out.println("Existing database in use.");
        }

        System.out.println("Thee student's have been populated into the database.");
        System.out.println("Add student's grade? Yes(1) or No(2)");
        int answer = in.nextInt();
        if (answer == 1) {
            Student newStudent = new Student();
            newStudent.setId();
            System.out.println("What is the student's name?");
            String studentName = in.next();
            newStudent.setSname(studentName);

            System.out.println("What is the student's grade?");
            String studentGrade = in.next();
            newStudent.setSgrade(studentGrade)
            ;
            Save populate = new Save();
            populate.save(newStudent);
        }

        System.out.println("Get data? Yes(1) or No(2)");
        int getdata = in.nextInt();
        if (getdata == 1){
            System.out.println("Which record do you want?");
            int record = in.nextInt();
            Retrieve getVal = new Retrieve();
            Student values = getVal.retrieve(record);
            System.out.println(values);
        }else{
            System.out.println("Ok, bye!");
        }
    }
}
