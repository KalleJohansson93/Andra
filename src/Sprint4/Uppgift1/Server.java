package Sprint4.Uppgift1;

// server skickar till kient
//klient skriver ut
import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    public static void main(String[] args) {

        int port = 55555;
        String outpout = "Hej";

        try (
                ServerSocket sSocket = new ServerSocket(port);
                Socket clientSocket = sSocket.accept();
                PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true)
        ) {
            while (true) {
                out.println(outpout);
                Thread.sleep(2000);
            }

        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
