public class ClientHandler {
    private ChatClient chatClient;

    public ClientHandler(ChatClient chatClient) {
        this.chatClient = chatClient;
    }

    public void handleInput() {
        // Logic to handle user input and send it to the server
    }

    public void updateChat(String message) {
        // Logic to update the chat interface with the received message
    }
}