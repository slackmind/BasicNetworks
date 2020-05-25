import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class Client {

    public static void main(String[] args) throws IOException, InterruptedException {

        Socket socket = new Socket("localhost", 12345);
        OutputStream outputStream = socket.getOutputStream();

        System.out.println("Connected to server");
        Thread.sleep(5000);
        outputStream.write(182);
        System.out.println("Sent byte");

        InputStream inputStream = socket.getInputStream();

        System.out.println("Received sent byte + 1 =" + inputStream.read());


        socket.close();

    }
}
