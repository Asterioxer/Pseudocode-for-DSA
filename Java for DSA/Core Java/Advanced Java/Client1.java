import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.*;
public class Client1 {
    public static void main(String[] args) {
        try {
            Socket cs = new Socket(InetAddress.getLocalHost(), 999);
            System.out.println("Client started");
            //one way
            DataOutputStream dos = new DataOutputStream(cs.getOutputStream());
            dos.writeUTF("Hi");
            //two way
            DataInputStream dit = new DataInputStream(cs.getInputStream());
            String str = (String) dit.readUTF();
            System.out.println(str);
            //echo
            // DataOutputStream do = new DataOutputStream(cs.getOutputStream());
            // do.writeUTF("Hello Server1");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
