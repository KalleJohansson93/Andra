package Sprint4.Uppgift7.Server;

import Sprint4.Uppgift7.POJOs.Initiator;
import Sprint4.Uppgift7.POJOs.Kompis;
import Sprint4.Uppgift7.POJOs.Response;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) {
        int port = 55555;
        TelefonBok telefonbok = new TelefonBok();

        try (
                ServerSocket serverSocket = new ServerSocket(port);
                Socket socket = serverSocket.accept();
                ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
                ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());
        ) {
            Object inputLine;
            Kompis outputKompis;

            oos.writeObject(new Initiator());

            while ((inputLine = ois.readObject()) != null){
                outputKompis = telefonbok.getPersonByName(((String)inputLine).trim());
                if (outputKompis == null){
                    oos.writeObject(new Response(false));

                }
                else {
                    oos.writeObject(new Response(true, outputKompis));
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
