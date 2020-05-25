import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;


public class Server {

    public static void main(String[] args) throws IOException {

        ServerSocket serverSocket = new ServerSocket(12345);

        for (;;) {
            Socket socket = serverSocket.accept();

            InputStream inputStream = socket.getInputStream();

            int byteRead = inputStream.read();
            System.out.println("Streamed byte is: " + byteRead);

            OutputStream outputStream = socket.getOutputStream();
            outputStream.write(byteRead + 1);

            socket.close();

        }
    }
}
