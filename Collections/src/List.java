import java.util.*;

public class List {

    public static void main(String args[]){
        // create array list

        ArrayList students = new ArrayList();

        System.out.println("There are " + students.size() + " students in this class." );

        //add elements to ArrayList students
        students.add("Bill");
        students.add("Sally");
        students.add("Daisy");
        students.add("Mike");
        students.add("Peter");
        students.add("Tom");
        System.out.println("\nThere are " + students.size() + " students in the class." );
        System.out.println(students);

        //add element at index position
        students.add(2, "Sarah");
        System.out.println("\n\"Sarah\" has been added to the class at the third position.");
        System.out.println(students);

        students.remove(4);
        System.out.println("\nRemoved the student from the fifth position (index 4).");
        System.out.println(students);

        students.remove("Peter");
        System.out.println("\nRemoved student named \"Peter\" from class list.");
        System.out.println(students);
    }
}
