import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) {
        try (ServerSocket serverSocket = new ServerSocket(8000);)
        {
        System.out.println("Server started!");


        Socket socket = serverSocket.accept();
        System.out.println("Client connected");

        BufferedWriter writer = new BufferedWriter(
                new OutputStreamWriter(socket.getOutputStream()));

        writer.write("HELLO FROM SERVER");
        writer.newLine();
        writer.flush();

        writer.close();
        socket.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
