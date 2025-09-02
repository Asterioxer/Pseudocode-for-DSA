import java.net.*;
import java.io.*;
public class URL_connection {
    public static void main(String[] args) {
        try {
            URI urc = new URI("https://www.gec.edu.in");
            URL url = urc.toURL();
            URLConnection urlcon = url.openConnection();
            BufferedReader br = new BufferedReader(new InputStreamReader(urlcon.getInputStream()));
            String line;
            while((line = br.readLine()) != null) {
                System.out.println("Line: "+line);
            }
            br.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
