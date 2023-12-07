package Sprint4.Uppgift6.Server;

import java.io.*;
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

            oos.writeObject(new Kompis("", "Vems adress??"));

            while ((inputLine = ois.readObject()) != null){
                outputKompis = telefonbok.getPersonByName(((String)inputLine).trim());
                if (outputKompis == null){
                    oos.writeObject(new Kompis("", "Denna person finns inte i databasen"));

                }
                else {
                    oos.writeObject(outputKompis);
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
