import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;


public class Server {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        ServerSocket serverSocket = new ServerSocket(12345);

        for (;;) {
            Socket socket = serverSocket.accept();
            System.out.println("Connected to " + socket.getInetAddress());

            ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());
            ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());

            BasicClass bc =  (BasicClass) ois.readObject();

            System.out.println("bc.getNum() returns: " + bc.getNum());
            System.out.println("Received from client: " + bc);

            oos.close();
            socket.close();

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
