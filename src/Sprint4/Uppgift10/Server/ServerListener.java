package Sprint4.Uppgift10.Server;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerListener {



    public static void main(String[] args) throws IOException {
        int port = 55555;
        ServerSocket ss = new ServerSocket(port);

        while (true) {
            try {
                Socket socketToClient = ss.accept();
                Server clientHandler = new Server(socketToClient);
                clientHandler.start();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

        }
    }
}
