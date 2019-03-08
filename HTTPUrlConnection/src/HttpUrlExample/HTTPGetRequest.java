package HttpUrlExample;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

import static HttpUrlExample.StreamReader.streamReader;

public class HTTPGetRequest {
    public String httpGetRequest(String address) throws IOException {
        InputStream stream = null;
        try{
            URL getUrl = new URL(address);
            HttpURLConnection connection = (HttpURLConnection) getUrl.openConnection();
            connection.setReadTimeout(10000);
            connection.setConnectTimeout(15000);
            connection.setRequestMethod("GET");
            connection.setDoInput(true);
            connection.connect();

            int respCode = connection.getResponseCode();
            if(respCode != 200){
                throw new IOException("Response code is " +  respCode);
            }

            stream = connection.getInputStream();
            System.out.println("\n\n");
              for(int i = 0;i<10;i++){
                  System.out.println(connection.getHeaderFieldKey(i)+"="+connection.getHeaderField(i));
              }
            System.out.println("\n\n");
            String result = streamReader(stream);
            return result;

        }catch(Exception e){
            e.printStackTrace();
            return null;
        }
        finally {
            if(stream != null){
                stream.close();
            }
        }
    }
}
