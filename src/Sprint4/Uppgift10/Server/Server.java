package Sprint4.Uppgift10.Server;

import Sprint4.Uppgift10.POJOs.Initiator;
import Sprint4.Uppgift10.POJOs.Kompis;
import Sprint4.Uppgift10.POJOs.Response;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server extends Thread {

    int port = 55555;
    TelefonBok telefonbok = new TelefonBok();

    Socket clientSocket;

    public Server(Socket clientSocket) throws IOException {
        this.clientSocket = clientSocket;
    }



    ObjectOutputStream oos = new ObjectOutputStream(clientSocket.getOutputStream());
    ObjectInputStream ois = new ObjectInputStream(clientSocket.getInputStream());


    {
        Object inputLine;
        Kompis outputKompis;

        oos.writeObject(new Initiator());

        while (true) {
            try {
                if (((inputLine = ois.readObject()) != null)) break;
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            }
            outputKompis = telefonbok.getPersonByName(((String) inputLine).trim());
            if (outputKompis == null) {
                oos.writeObject(new Response(false));

            } else {
                oos.writeObject(new Response(true, outputKompis));
            }
        }
    }
}
