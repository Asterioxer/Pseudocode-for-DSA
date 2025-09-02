
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class UDPReceiver {
    public static void main(String[] args) {
        try {
            DatagramSocket sd = new DatagramSocket(8989);
            byte[] buffer = new byte[1024];
            DatagramPacket packet = new DatagramPacket(buffer, buffer.length);
            System.out.println("Waiting for message");
            sd.receive(packet);
            String receiving = new String (packet.getData(), 0, packet.getLength());
            System.out.println("Message Received"+ receiving);
            sd.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }    
}
