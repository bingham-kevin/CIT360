package com.cit360;

import java.util.Scanner;

public class App
{
    public static void main( String[] args ) {

        Scanner in = new Scanner(System.in);
        System.out.println("Populate database? Yes(1) or No(2)");
        int answer = in.nextInt();
        if (answer == 1) {
            Save populate = new Save();
            populate.save();
        }else{
            System.out.println("ok");
        }
        System.out.println("Get data? Yes(1) or No(2)");
        int getdata = in.nextInt();
        if (getdata == 1){
            System.out.println("Which record do you want?");
            int record = in.nextInt();
            Retrieve getVal = new Retrieve();
            Student values = getVal.retrieve(record);
            System.out.println(values);
        }
    }
}
