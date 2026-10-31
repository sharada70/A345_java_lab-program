
import java.net.*;
import java.io.*;

class Server {
    public static void main(String[] args) throws Exception {
        ServerSocket ss = new ServerSocket(5000);
        System.out.println("Server waiting...");

        Socket s = ss.accept();
        DataInputStream in = new DataInputStream(s.getInputStream());

        String msg = in.readUTF();
        System.out.println("Client says: " + msg);

        s.close();
        ss.close();
    }
}
