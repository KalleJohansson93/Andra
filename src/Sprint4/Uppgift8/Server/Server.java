package Sprint4.Uppgift8.Server;

import Sprint4.Uppgift8.POJOs.Initiator;
import Sprint4.Uppgift8.POJOs.Kompis;
import Sprint4.Uppgift8.POJOs.Response;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) {
        int port = 55555;
       // TelefonBok telefonbok = new TelefonBok();
        Protokoll p = new Protokoll();

        try (
                ServerSocket serverSocket = new ServerSocket(port);
                Socket socket = serverSocket.accept();
                ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
                ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());
        ) {
            String inputLine = "";
            Protokoll protocol = new Protokoll();
            oos.writeObject(protocol.processInput(inputLine));

            while ((inputLine = (String)ois.readObject()) != null){
                oos.writeObject(protocol.processInput(inputLine));
            }

        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
