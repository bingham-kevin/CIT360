package JSONexample;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CreateJSON {
    public void create(){

        //Create JSON Object for Student
        Scanner in = new Scanner(System.in);

        System.out.print("Enter student name - ");
        String name = in.next();

        JSONObject student = new JSONObject();
        student.put("name", name);

        //Create JSON Array to hold data for semester
        JSONArray semester = new JSONArray();

        System.out.print("Enter year - ");
        Integer year = in.nextInt();

        System.out.print("Enter semester - ");
        String curSemester = in.next();

        JSONObject semesterObj = new JSONObject();
        semesterObj.put("semester", curSemester);
        semesterObj.put("year", year);

        //Create JSON Array to hold courses and grades
        JSONArray courses = new JSONArray();

        while(true) {
            System.out.print("Enter course name (Type 'Q' to quit) - ");
            String course = in.next();
            if (course.toLowerCase().equals("q")){
                break;
            }else {
                System.out.print("Enter grade percent - ");
                Integer grade = in.nextInt();
                JSONObject courseObj = new JSONObject();
                courseObj.put("grade", grade);
                courseObj.put("name", course);
                courses.add(courseObj);
            }
        }

        //Insert courses object into semester JSON Array
        semesterObj.put("courses", courses);
        semester.add(semesterObj);

        //Insert semester JSON Array into student JSON Object
        student.put("semester", semester);

        try(FileWriter save = new FileWriter("semester.json")){
            save.write(student.toString());
            save.flush();
        }catch (IOException e){
            e.printStackTrace();
        }

        System.out.println(student.toJSONString());
    }
}
