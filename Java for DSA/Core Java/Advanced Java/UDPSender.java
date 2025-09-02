
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDPSender {
    public static void main(String[] args) {
        try {
            DatagramSocket ds = new DatagramSocket();
            String message = "Hello UDP Receiver";
            byte[] buffer = message.getBytes();
            InetAddress receiveadd = InetAddress.getByName("localhost");
            int port = 8989;
            DatagramPacket packet = new DatagramPacket(buffer, buffer.length, receiveadd, port);
            ds.send(packet);
            System.out.println("Message sent "+message);
            ds.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
