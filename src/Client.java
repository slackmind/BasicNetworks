import java.io.*;
import java.net.Socket;

public class Client {

    public static void main(String[] args) throws IOException, InterruptedException {

        Socket socket = new Socket("localhost", 12345);
        OutputStream outputStream = socket.getOutputStream();
        InputStream inputStream = socket.getInputStream();

        ObjectOutputStream oos = new ObjectOutputStream(outputStream);

        oos.writeUTF("Hello Server");

        oos.close();
        socket.close();

    }
}
