# Java Chat Application

This project is a simple chat application implemented in Java using socket programming. It consists of a client and a server that communicate over TCP sockets, allowing multiple clients to chat with each other in real-time.

## Project Structure

```
java-chat-app
├── src
│   ├── client
│   │   ├── ChatClient.java
│   │   └── ClientHandler.java
│   ├── server
│   │   ├── ChatServer.java
│   │   └── ServerHandler.java
├── build.gradle
└── README.md
```

## Features

- **Client-Server Architecture**: The application follows a client-server model where multiple clients can connect to a single server.
- **Real-time Messaging**: Clients can send and receive messages in real-time.
- **Broadcasting Messages**: The server can broadcast messages to all connected clients.

## Setup Instructions

1. **Clone the Repository**:
   ```
   git clone <repository-url>
   cd java-chat-app
   ```

2. **Build the Project**:
   Ensure you have Gradle installed, then run:
   ```
   gradle build
   ```

3. **Run the Server**:
   Navigate to the server directory and run:
   ```
   java -cp build/libs/java-chat-app.jar src.server.ChatServer
   ```

4. **Run the Client**:
   In a separate terminal, navigate to the client directory and run:
   ```
   java -cp build/libs/java-chat-app.jar src.client.ChatClient
   ```

## Usage Guidelines

- Once the server is running, multiple clients can connect to it.
- Each client can send messages that will be broadcasted to all other connected clients.
- Use the command line interface to interact with the chat application.

## Contributing

Feel free to contribute to this project by submitting issues or pull requests. Your contributions are welcome!

## License

This project is licensed under the MIT License. See the LICENSE file for details.