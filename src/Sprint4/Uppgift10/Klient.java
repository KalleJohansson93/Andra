package Sprint4.Uppgift10;

import Sprint4.Uppgift10.POJOs.Initiator;
import Sprint4.Uppgift10.POJOs.Response;

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
         Object fromServer;
         String fromUser;
         BufferedReader stdIn = new BufferedReader(new InputStreamReader(System.in));

         while ((fromServer = ois.readObject()) != null){

             if (fromServer instanceof Initiator){
                 System.out.println("Connection setup complete");
             } else if (fromServer instanceof Response response) {
                 if (!response.getSucces()){
                     System.out.println("Personen finns inte i databasen");
                 }
                 else {
                     System.out.println(response.getPerson().toString());
                 }
             }
             System.out.println("Vilken person vill du kolla upp?");

             fromUser = stdIn.readLine();
             if (fromUser != null){
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
