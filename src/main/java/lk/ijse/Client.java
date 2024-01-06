package lk.ijse;

import java.io.DataOutputStream;
import java.net.Socket;

public class Client {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("localhost",3000);
            System.out.println("Socket Created....!");
            DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());
            String message = "Hello Server";
            dataOutputStream.writeUTF(message);
            dataOutputStream.close();
            socket.close();

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
