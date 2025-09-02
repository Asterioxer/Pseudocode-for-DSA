import java.io.*;
import java.net.*;
import java.util.*;

public class ChatServer {
    private static final int PORT = 12345;
    private ServerSocket serverSocket;
    private Set<PrintWriter> clientWriters = new HashSet<>();

    public static void main(String[] args) {
        new ChatServer().startServer();
    }

    public void startServer() {
        try {
            serverSocket = new ServerSocket(PORT);
            System.out.println("Chat server started on port " + PORT);
            while (true) {
                new ServerHandler(serverSocket.accept(), this).start();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public synchronized void broadcastMessage(String message) {
        for (PrintWriter writer : clientWriters) {
            writer.println(message);
        }
    }

    public synchronized void addClientWriter(PrintWriter writer) {
        clientWriters.add(writer);
    }

    public synchronized void removeClientWriter(PrintWriter writer) {
        clientWriters.remove(writer);
    }

    private class ServerHandler extends Thread {
        private Socket socket;
        private PrintWriter out;
        private BufferedReader in;
        private ChatServer server;

        public ServerHandler(Socket socket, ChatServer server) {
            this.socket = socket;
            this.server = server;
        }

        public void run() {
            try {
                in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                out = new PrintWriter(socket.getOutputStream(), true);
                server.addClientWriter(out);

                String message;
                while ((message = in.readLine()) != null) {
                    System.out.println("Received: " + message);
                    server.broadcastMessage(message);
                }
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                try {
                    socket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                server.removeClientWriter(out);
            }
        }
    }
}
