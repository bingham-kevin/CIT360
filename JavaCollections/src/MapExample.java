import java.util.*;

public class MapExample {

    public static void main(String args[]){
        HashMap<String, String> map = new HashMap<>();

        map.put("firstName", "Kevin");
        map.put("lasName", "Bingham");
        map.put("city", "Los Angeles");

        System.out.println(map);
    }
}