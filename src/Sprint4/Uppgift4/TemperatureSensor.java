package Sprint4.Uppgift4;

import javax.swing.*;
import java.io.IOException;
import java.net.*;
import java.util.Scanner;

public class TemperatureSensor {
    public static void main(String[] args) throws IOException {
        String temperature = "";
        String dataToSend = "";
        Scanner scan = new Scanner(System.in);
        String city = JOptionPane.showInputDialog(null, "Stad? ");
        if (city == null || city.length() == 0){
            System.exit(0);
        }

        InetAddress toAdr = InetAddress.getLocalHost();
        int toPort = 55555;
        DatagramSocket socket = new DatagramSocket();
        while (scan.hasNext()){
            temperature = scan.next();
            dataToSend = city + "," + temperature;
            byte[] data = dataToSend.getBytes();
            DatagramPacket packet = new DatagramPacket(data,data.length,toAdr,toPort);
            socket.send(packet);
        }
    }
}
