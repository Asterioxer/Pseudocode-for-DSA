import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.net.*;

public class ChatServer extends JFrame {
    private JTextArea chatArea;
    private JTextField messageField;
    private JButton sendButton;
    private ServerSocket serverSocket;
    private Socket clientSocket;
    private BufferedReader reader;
    private PrintWriter writer;

    public ChatServer() {
        super("Chat Server");
        chatArea = new JTextArea(20, 30);
        messageField = new JTextField(30);
        sendButton = new JButton("Send");
        add(new JScrollPane(chatArea), BorderLayout.CENTER);
        add(messageField, BorderLayout.SOUTH);
        add(sendButton, BorderLayout.EAST);

        messageField.addKeyListener(new KeyListener() {
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    sendMessage();
                }
            }

            public void keyReleased(KeyEvent e) {
            }

            public void keyTyped(KeyEvent e) {
            }
        });

        sendButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                sendMessage();
            }
        });

        try {
            serverSocket = new ServerSocket(8000);
            clientSocket = serverSocket.accept();
            reader = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
            writer = new PrintWriter(clientSocket.getOutputStream(), true);
            listenForMessages();
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

        setSize(400, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    private void listenForMessages() {
        Thread thread = new Thread(new Runnable() {
            public void run() {
                try {
                    while (true) {
                        String message = reader.readLine();
                        if (message.equalsIgnoreCase("bye") || message.equalsIgnoreCase("end")) {
                            chatArea.append("Client: " + message + "\n");
                            writer.println("Server: Chat ended");
                            chatArea.append("Server: Chat ended\n");
                            break;
                        } else {
                            chatArea.append("Client: " + message + "\n");
                        }
                    }
                } catch (IOException e) {
                    System.out.println("Error: " + e.getMessage());
                }
            }
        });
        thread.start();
    }

    private void sendMessage() {
        String message = messageField.getText();
        writer.println("Server: " + message);
        chatArea.append("Server: " + message + "\n");
        messageField.setText("");
    }

    public static void main(String[] args) {
        new ChatServer();
    }
}