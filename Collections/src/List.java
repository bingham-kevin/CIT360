import java.util.*;

public class List {

    public static void main(String args[]){
        // create array list

        ArrayList list1 = new ArrayList();

        System.out.println("List1 has " + list1.size() + " elements in it." );

        //add elements to ArrayList list1
        list1.add("Item1");
        list1.add("Item2");
        list1.add("Item3");
        list1.add("Item4");
        list1.add("Item5");
        list1.add("Item6");
        System.out.println("\nList1 has " + list1.size() + " elements in it." );
        System.out.println(list1);

        //add element at index position
        list1.add(2, "New Item");
        System.out.println("\n\"New Item\" has been added at the third position.");
        System.out.println(list1);

        list1.remove(4);
        System.out.println("\nRemoved the fifth item.");
        System.out.println(list1);

        list1.remove("Item5");
        System.out.println("\nRemoved item named \"Item5\".");
        System.out.println(list1);
    }
}
