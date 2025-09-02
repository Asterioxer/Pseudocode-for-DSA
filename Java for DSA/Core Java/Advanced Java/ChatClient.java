import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.net.*;

public class ChatClient extends JFrame {
    private JTextArea chatArea;
    private JTextField messageField;
    private JButton sendButton;
    private Socket clientSocket;
    private BufferedReader reader;
    private PrintWriter writer;

    public ChatClient() {
        super("Chat Client");
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
            clientSocket = new Socket("localhost", 8000);
            reader = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
            writer = new PrintWriter(clientSocket.getOutputStream(), true);
            listenForMessages();
        } catch (UnknownHostException e) {
            System.out.println("Unknown host: " + e.getMessage());
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
                        if (message.equalsIgnoreCase("Server: Chat ended")) {
                            chatArea.append(message + "\n");
                            break;
                        } else {
                            chatArea.append(message + "\n");
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
        if (message.equalsIgnoreCase("bye") || message.equalsIgnoreCase("end")) {
            writer.println(message);
            chatArea.append("Client: " + message + "\n");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Error: " + e.getMessage());
            }
            System.exit(0);
        } else {
            writer.println(message);
            chatArea.append("Client: " + message + "\n");
        }
        messageField.setText("");
    }

    public static void main(String[] args) {
        new ChatClient();
    }
}