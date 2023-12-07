package Sprint4.Uppgift6;

import Sprint4.Uppgift6.Server.Kompis;

import java.io.*;
import java.net.Socket;
import java.net.UnknownHostException;

public class Klient {

    public static void main(String[] args) throws IOException {
     int port = 55555;
     String ip = "127.0.0.1";

     try (Socket socket = new Socket(ip, port);
          ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
          ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());
          BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in)))
     {
         Kompis fromServer;
         String fromUser;

         while ((fromServer = (Kompis)ois.readObject()) != null){
             System.out.println("Server: " + fromServer.getTelNr());

             fromUser = userInput.readLine();
             if (fromUser != null){
                 System.out.println("Client: " + fromUser);
                 oos.writeObject(fromUser);
             }
         }


     } catch (UnknownHostException e) {
         throw new RuntimeException(e);
     } catch (IOException e) {
         throw new RuntimeException(e);
     } catch (ClassNotFoundException e) {
         throw new RuntimeException(e);
     }
    }
}
