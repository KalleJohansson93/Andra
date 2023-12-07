package Sprint4.Uppgift1;
// server skickar till kient
//klient skriver ut

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.net.UnknownHostException;

public class Klient {
    public static void main(String[] args) {

        int port = 55555;
        String hostName = "127.0.0.1";

        try (Socket socket = new Socket(hostName, port);
             BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()))
        ) {
            String fromServer = "";

            while ((fromServer = br.readLine()) != null) {
                System.out.println(fromServer);
            }

        } catch (UnknownHostException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
