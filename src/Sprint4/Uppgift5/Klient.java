package Sprint4.Uppgift5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class Klient {

    public static void main(String[] args) throws IOException {
     int port = 55555;
     String ip = "127.0.0.1";
     String temp = "";

     try (Socket socket = new Socket(ip, port);
          PrintWriter pw = new PrintWriter(socket.getOutputStream(), true);
          BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
          BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in))
     )
     {

         while ((temp = userInput.readLine()) != null){
             pw.println(temp);
             temp = br.readLine();
             System.out.println(temp);
     }

     } catch (UnknownHostException e) {
         throw new RuntimeException(e);
     } catch (IOException e) {
         throw new RuntimeException(e);
     }
    }
}
