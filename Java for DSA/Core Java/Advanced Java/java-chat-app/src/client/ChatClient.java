import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.net.*;

public class ChatClient extends JFrame {
    private JTextArea chatArea;
    private JTextField messageField;
    private PrintWriter out;
    private BufferedReader in;
    private Socket socket;

    public ChatClient(String serverAddress, int serverPort) {
        setTitle("Chat Client");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        chatArea = new JTextArea();
        chatArea.setEditable(false);
        messageField = new JTextField();
        messageField.addActionListener(new SendMessageListener());
        add(new JScrollPane(chatArea), BorderLayout.CENTER);
        add(messageField, BorderLayout.SOUTH);
        setVisible(true);
        
        connect(serverAddress, serverPort);
    }

    public void connect(String serverAddress, int serverPort) {
        try {
            socket = new Socket(serverAddress, serverPort);
            out = new PrintWriter(socket.getOutputStream(), true);
            in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            new Thread(this::receiveMessages).start();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void sendMessage(String message) {
        out.println(message);
        messageField.setText(""); // Clear the input field after sending
    }

    public void receiveMessages() {
        String message;
        try {
            while ((message = in.readLine()) != null) {
                chatArea.append("Received: " + message + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void disconnect() throws IOException {
        in.close();
        out.close();
        socket.close();
    }

    private class SendMessageListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String message = messageField.getText();
            sendMessage(message);
        }
    }

    public static void main(String[] args) {
        new ChatClient("localhost", 12345);
    }
}
