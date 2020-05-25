import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

public class Client {

    public static void main(String[] args) throws IOException {

        Socket socket = new Socket("localhost", 12345);

        OutputStream outputStream = socket.getOutputStream();

        outputStream.write(42);
        
        socket.close();

    }
}
