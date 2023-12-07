package Sprint4.Uppgift2;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class CitatReceiver {
    public static void main(String[] args) throws IOException {
        int minPort = 55555;
        DatagramSocket socket = new DatagramSocket(minPort);
        byte[] data = new byte[256];
        while (true){
            DatagramPacket packet = new DatagramPacket(data, data.length);
            socket.receive(packet);
            String message = new String(packet.getData(),0, packet.getLength());
            System.out.println(message);
        }
    }
}