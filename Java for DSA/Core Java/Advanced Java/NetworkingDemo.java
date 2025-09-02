import java.net.*;
import java.util.*;
public class NetworkingDemo {
    public static void main(String[] args) throws UnknownHostException{
        String url = "www.google.com";

        InetAddress inetadd = InetAddress.getByName(url);

        System.out.println("Address : " + Arrays.toString(inetadd.getAddress()));
        System.out.println("Host Address : " + inetadd.getHostAddress());

        //Utility routine to check if the InetAddress is a wildcard address.
        //Overrides:
        //isAnyLocalAddress in class InetAddress
        //Returns:
        //a boolean indicating if the InetAddress is a wildcard address.
        System.out.println("isAnyLocalAddress : " + inetadd.isAnyLocalAddress());
    }
}
 