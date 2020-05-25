import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

public class Client {

    public static void main(String[] args) throws IOException, InterruptedException {

        Socket socket = new Socket("localhost", 12345);

        OutputStream outputStream = socket.getOutputStream();

        BufferedOutputStream bos = new BufferedOutputStream(outputStream);

        System.out.println("Connected to server");

        Thread.sleep(5000);

        bos.write(182);

        System.out.println("Sent byte");

        bos.flush();

        socket.close();

    }
}
