import java.util.*;

public class QueueExample {
    public static void main(String[] args) {
        Queue<Integer> placeInLine = new LinkedList<>();

        placeInLine.add(21);
        placeInLine.add(22);
        placeInLine.add(40);
        placeInLine.add(50);
        placeInLine.add(5);
        placeInLine.add(51);

        System.out.println(placeInLine.remove());
        System.out.println("Print all in Queue-"+ placeInLine);
        System.out.println("Get next in Queue - [" + placeInLine.peek() + "]");
    }
}