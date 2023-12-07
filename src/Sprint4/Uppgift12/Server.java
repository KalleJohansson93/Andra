package Sprint4.Uppgift12;

import java.io.*;
import java.net.Socket;

public class Server extends Thread {
    private Socket socket;
    private MultiWriter mw;

    public Server(Socket socket, MultiWriter mw) {
        this.socket = socket;
        this.mw = mw;
    }

    public void run() {

        try (PrintWriter pw = new PrintWriter(socket.getOutputStream());
             BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()))){
            {
                mw.addWriter(pw);
                while (true){
                    String input = br.readLine();
                    if (input == null){
                        return;
                    }
                    for (PrintWriter writer : mw.getWriters()) {
                        writer.println();
                    }
                }
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}