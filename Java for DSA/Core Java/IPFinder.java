import java.net.*;
import java.util.*;
public class IPFinder {

	public static void main(String[] args) {
		String host;
		Scanner sc = new Scanner(System.in);
		InetAddress ad;
		System.out.println("Enter host name: ");
		host = sc.next();
		try {
			ad = InetAddress.getByName(host);
			System.out.println("Ip address = "+ad.toString());
	} catch(Exception e) {
			System.out.println("Error is" +e);
		}

	}

}
