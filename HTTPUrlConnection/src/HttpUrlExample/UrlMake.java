package HttpUrlExample;

import java.util.Scanner;

public class UrlMake {
    Scanner in = new Scanner(System.in);
    Integer zip = null;
    String url = "https://api.apixu.com/v1/forecast.json?key=";
    String apiKey = "d4fb5f3d39fd411cbb3205304182111";
    private String fullUrl = "";

    public String getZip(){
        System.out.print("What is your zipcode? - ");
        zip = in.nextInt();

       fullUrl = url + apiKey + "&q=" + zip + "&days=7";
       return fullUrl;
    }

}
