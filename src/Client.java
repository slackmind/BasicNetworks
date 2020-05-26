import java.io.*;
import java.net.Socket;

public class Client {

    public static void main(String[] args) throws IOException, InterruptedException {

        Socket socket = new Socket("localhost", 12345);
        OutputStream outputStream = socket.getOutputStream();
        InputStream inputStream = socket.getInputStream();

        ObjectOutputStream oos = new ObjectOutputStream(outputStream);
        ObjectInputStream ois = new ObjectInputStream(inputStream);

        BasicClass basicClass = new BasicClass(42);

        oos.writeObject(basicClass);
        oos.flush();

        oos.close();
        socket.close();

    }
}
