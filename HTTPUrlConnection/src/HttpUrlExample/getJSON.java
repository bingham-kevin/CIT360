package HttpUrlExample;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;


public class getJSON {
    private int timeout = 10000;

    public String getJSON(String url) throws IOException {
        HttpURLConnection con = null;
        try {
            URL urlJson = new URL(url);
            con = (HttpURLConnection) urlJson.openConnection();
            con.setRequestMethod("GET");
            con.setRequestProperty("Content-length", "0");
            con.setUseCaches(false);
            con.setAllowUserInteraction(false);
            con.setConnectTimeout(timeout);
            con.setReadTimeout(timeout);
            con.connect();
            int status = con.getResponseCode();

            if(status != 200){
                throw new IOException("Response code is " +  status);
                }

                BufferedReader bufferRead = new BufferedReader(new InputStreamReader(con.getInputStream()));
                StringBuilder jsonStrings = new StringBuilder();
                String line;
                while ((line = bufferRead.readLine()) != null) {
                    jsonStrings.append(line);
                }
                bufferRead.close();
                return jsonStrings.toString();

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (con != null) {
                try {
                    con.disconnect();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
        return null;
    }
}
