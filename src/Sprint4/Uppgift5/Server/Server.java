package Sprint4.Uppgift5.Server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    public static void main(String[] args) {
        int port = 55555;
        String temp = "";
        String answer = "";
        TelefonBok telefonbok = new TelefonBok();

        try (
                ServerSocket serverSocket = new ServerSocket(port);
                Socket socket = serverSocket.accept();
                PrintWriter pw = new PrintWriter(socket.getOutputStream(), true);
                BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        ) {

            while ((temp = br.readLine()) != null) {
                answer = telefonbok.sökKompis(temp.trim());
                pw.println(answer);
            }


        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
