package Sprint4.Uppgift2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.*;
import java.util.ArrayList;
import java.util.List;

public class Citat {
    final static String quote1 = "Dreams and deception is a powerful combination";
    final static String quote2 = "Whatever your're thinking, think bigger.";
    final static String quote3 = "Maybe swearing will help?";
    public Citat(){





    }
    public static void main(String[] args) throws IOException, InterruptedException {
        //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<String> quoteList = new ArrayList<>();
        quoteList.add(quote1);
        quoteList.add(quote2);
        quoteList.add(quote3);
        int listCounter = 0;

        InetAddress toAdr = InetAddress.getLocalHost();
        int toPort = 55555;
        DatagramSocket socket = new DatagramSocket();
        while (true){
            byte[] data = quoteList.get(listCounter).getBytes();
            DatagramPacket packet = new DatagramPacket(data,data.length,toAdr,toPort);
            socket.send(packet);
            listCounter = (listCounter + 1) % 3;
            Thread.sleep(3000);
        }
    }
}
