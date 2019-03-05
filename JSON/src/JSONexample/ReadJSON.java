package JSONexample;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import java.io.FileReader;

public class ReadJSON {
    public void readFile() {
        JSONParser parser = new JSONParser();
        try {
            JSONObject parse = (JSONObject) parser.parse(new FileReader("semester.json"));
            System.out.println("\nStudent Name: " + parse.get("name"));

            JSONArray semester = (JSONArray) parse.get("semester");
            JSONObject coursesArray = (JSONObject) semester.get(0);
            JSONArray courses = (JSONArray) coursesArray.get("courses");
            for ( int i =0; i < courses.size(); i++) {
                JSONObject className = (JSONObject) courses.get(i);
                System.out.println("Class Title: " + className.get("name"));
                System.out.println("Current Grade: " + className.get("grade") + "\n");
                }
            System.out.println("\n\nJSON Objects and Arrays");
            System.out.println(parse);
            System.out.println(semester);
            System.out.println(coursesArray);
            System.out.println(courses);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
