import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(8000);
        System.out.println("Server started!");

        Socket socket = serverSocket.accept();
        System.out.println("Client connected");


        BufferedOutputStream writer =
                new BufferedOutputStream(socket.getOutputStream());
        writer.

    }
}
