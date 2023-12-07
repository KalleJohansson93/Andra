package Sprint4.Uppgift12;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerListener {
    private static MultiWriter mw = new MultiWriter();

    public static void main(String[] args) throws IOException {
        int port = 12345;
        ServerSocket serverSocket = new ServerSocket(55555);
        while (true) {
            try {
                 final Socket socketToClient = serverSocket.accept();
                 Server clientServer = new Server(socketToClient, mw);
                 clientServer.start();

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
