import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;


public class Server {

    public static void main(String[] args) throws IOException {

        ServerSocket serverSocket = new ServerSocket(12345);

        for (;;) {
            Socket socket = serverSocket.accept();

            InputStream inputStream = socket.getInputStream();

            BufferedInputStream bis = new BufferedInputStream(inputStream);
            System.out.println("Streamed byte is: " + bis .read());

            socket.close();

        }
    }
}
