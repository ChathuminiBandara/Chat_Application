package lk.ijse;

import java.io.DataInputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(3000);
            System.out.println("Server Socket Created...!");
            Socket socket = serverSocket.accept();
            DataInputStream dataInputStream = new DataInputStream(socket.getInputStream());
            String message = dataInputStream.readUTF();
            System.out.println("Server Received...!");
            socket.close();
            serverSocket.close();

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
