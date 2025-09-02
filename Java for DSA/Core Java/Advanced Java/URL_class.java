import java.net.*;

public class URL_class {
    public static void main(String[] args) {
        try {
            URI uri = new URI("https://www.gec.edu.in/index.html");
            URL url = uri.toURL();
            System.out.println("Protocol: "+url.getProtocol());
            System.out.println("Host Name: "+url.getHost());
            System.out.println("Port Number: "+url.getPort());
            System.out.println("File Name: "+url.getFile());
        } catch (Exception e) {
            System.out.println(e);
        }
    }    
}
