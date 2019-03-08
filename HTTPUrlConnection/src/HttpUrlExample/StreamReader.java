package HttpUrlExample;

import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

public class StreamReader {
    public static String streamReader(InputStream inStream) throws IOException {

        byte[] buffer = new byte[1024];
        ByteArrayOutputStream byteArray = new ByteArrayOutputStream();
        BufferedOutputStream out = null;
        try{
            int length = 0;
            out = new BufferedOutputStream(byteArray);
            while ((length = inStream.read(buffer)) > 0){
                out.write(buffer, 0 , length);
            }
            out.flush();
            return byteArray.toString();
        }catch (IOException e){
            e.printStackTrace();
            return null;
        }finally {
            if(out != null){
                out.close();
            }
        }
    }
}
