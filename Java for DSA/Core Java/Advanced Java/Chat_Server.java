import java.io.*;
import java.net.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Chat_Server extends JFrame {
    private static final long serialVersionUID = 1L;
    private JTextArea chatArea;
    private JTextField inputField;
    private DataOutputStream dos;
    private DataInputStream dis;

    public Chat_Server() {
        setTitle("Chat Server");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        chatArea = new JTextArea();
        chatArea.setEditable(false);
        add(new JScrollPane(chatArea), BorderLayout.CENTER);
        inputField = new JTextField();
        add(inputField, BorderLayout.SOUTH);

        inputField.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    String message = inputField.getText();
                    dos.writeUTF(message);
                    chatArea.append("Server: " + message + "\n");
                    inputField.setText("");
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
        });

        setVisible(true);
        inputField.requestFocusInWindow(); // Ensure the input field is focused
    }

    public void startServer() {
        try {
            ServerSocket serverSocket = new ServerSocket(7777);
            chatArea.append("Server started... Waiting for client\n");
            Socket socket = serverSocket.accept();
            chatArea.append("Client connected\n");

            dis = new DataInputStream(socket.getInputStream());
            dos = new DataOutputStream(socket.getOutputStream());

            new Thread(new Runnable() {
                public void run() {
                    try {
                        String message = "";
                        while (!message.equals("bye")) {
                            message = dis.readUTF();
                            chatArea.append("Client: " + message + "\n");
                        }
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }).start();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Chat_Server server = new Chat_Server();
        server.startServer();
    }
}