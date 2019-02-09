import java.util.*;

public class TreeExample {
    public static void main(String[] args) {
        TreeSet<String> students = new TreeSet<String>();

        students.add("Bill");
        students.add("Sally");
        students.add("Daisy");
        students.add("Mike");
        students.add("Peter");
        students.add("Tom");
        students.add("Tom");

        System.out.println(students);

        students.remove("Mike");
        System.out.println(students);
    }
}