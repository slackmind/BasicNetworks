import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;


public class Server {

    public static void main(String[] args) throws IOException {

        ServerSocket serverSocket = new ServerSocket(12345);

        for (;;) {
            Socket socket = serverSocket.accept();

            System.out.println("Connected to " + socket.getInetAddress());

            InputStream inputStream = socket.getInputStream();

            for (;;) {
                int readByte = inputStream.read();
                System.out.println("Read byte: " + readByte);
                if (readByte == -1) break;
            }
            /*
            ObjectInputStream ois = new ObjectInputStream(inputStream);

            String message = ois.readUTF();

            System.out.println(message);

            ois.close();
            socket.close();
            */
        }
    }
}
