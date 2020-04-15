import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) {
        try (ServerSocket serverSocket = new ServerSocket(8000);) {
            System.out.println("Server started!");
            while (true)
            try (Socket socket = serverSocket.accept();
                 BufferedWriter writer =
                         new BufferedWriter(
                                 new OutputStreamWriter(socket.getOutputStream()));
                 BufferedReader reader =
                         new BufferedReader(
                                 new InputStreamReader(
                                         socket.getInputStream()));
            ) {
                String request = reader.readLine();
                String response = "HELLO FROM SERVER: " + request.length();
                System.out.println(request);
                System.out.println(response);
                writer.write(response);
                writer.newLine();
                writer.flush();
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
