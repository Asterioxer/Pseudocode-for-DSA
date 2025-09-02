import java.io.*;
import java.net.*;
public class Server1 {
    public static void main(String[] args) throws Exception {
        try {
            ServerSocket ss = new ServerSocket(999);
            System.out.println("Server started...Waiting for client");
            Socket s = ss.accept();
            System.out.println("Client connected");
            //one way
            DataInputStream dis = new DataInputStream(s.getInputStream());
            String str = (String) dis.readUTF();
            System.out.println(str);
            //two way
            DataOutputStream dout = new DataOutputStream(s.getOutputStream());
            dout.writeUTF("Hi");
            //echo
            // DataInputStream it = new DataInputStream(s.getInputStream());
            // String st = (String) it.readUTF();
            // System.out.println(st);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
