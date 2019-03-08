package HttpUrlExample;

import org.json.simple.JSONObject;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        //Get Weather Data
        getJSON get = new getJSON();
        UrlMake jsonUrl = new UrlMake();
        String url = jsonUrl.getZip();
        String response;
        try {
            response = get.getJSON(url);
            System.out.println("Local Weather JSON:\n" + response);
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Error: " + e);
        }

        //Read HTML from Fender.com
        HTTPGetRequest httpGet = new HTTPGetRequest();
        String httpUrl = "Https://google.com";
        String httpResponse;

        try{
            httpResponse = httpGet.httpGetRequest(httpUrl);
            System.out.println(httpResponse);
        }catch (IOException e){
            e.printStackTrace();
            System.out.println("Error: " + e);
        }
    }
}