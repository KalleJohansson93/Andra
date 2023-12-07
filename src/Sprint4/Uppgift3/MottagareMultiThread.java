package Sprint4.Uppgift3;

import javax.swing.*;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.MulticastSocket;

public class MottagareMultiThread implements Runnable{

    Thread aktivitet = new Thread(this);
    MulticastSocket so;
    JTextArea txtArea;

    MottagareMultiThread (MulticastSocket sock, JTextArea txtAr){
        byte[] data = new byte[1024];
        while (true) {
            try {
                DatagramPacket packet = new DatagramPacket(data, data.length);
                so.receive(packet);
                String medd = new String(data, 0, packet.getLength());
                synchronized (this) {
                    txtArea.append(medd + "`\n");
                }
            }
            catch (IOException e) {
                break;
            }
        }
    }

    @Override
    public void run() {

    }
}
