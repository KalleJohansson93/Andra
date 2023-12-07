package Sprint4.Uppgift3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.*;

public class ChatMultiThread extends JFrame implements ActionListener {
    String namn;
    InetAddress iadr;
    int port;
    MulticastSocket so;
    JTextArea txtArea  = new JTextArea();
    JScrollPane scroll = new JScrollPane(txtArea);
    JTextField textField = new JTextField();
    JButton button = new JButton("Koppla ner");
    InetSocketAddress group;
    NetworkInterface netIf = NetworkInterface.getByName("wlan2");


    public ChatMultiThread(String användarnamn, String gruppadr, int portNummer) throws IOException {

        namn = användarnamn;
        iadr = InetAddress.getByName(gruppadr);
        port = portNummer;
        group = new InetSocketAddress(iadr,port);

        so = new MulticastSocket(port);
        so.joinGroup(group, netIf);
        //new MottagareMultiThread(so, txtArea);

        sändMedd("UPPKOPPLAD");

        setTitle("Chat " + namn);
        txtArea.setEditable(false);
        add(button, BorderLayout.NORTH);
        add(scroll, BorderLayout.CENTER);
        add(textField, BorderLayout.SOUTH);
        button.addActionListener(this);
        textField.addActionListener(this);
        setSize(400,250);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    private void sändMedd(String s){
        byte[] data = (namn + ": " + s).getBytes();
        DatagramPacket packet = new DatagramPacket(data, data.length, iadr, port);
        try {
            so.send(packet);
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == textField){
            sändMedd(textField.getText());
            textField.setText("");
        }
        else if (e.getSource() == button) {
            sändMedd("NEDKOPPLAD");
            try {
                so.leaveGroup(group, netIf);
                so.close();
                dispose();
                System.exit(0);
            }
            catch (IOException ie) {
                ie.printStackTrace();
                so.close();
                dispose();
                System.exit(0);
            }
        }

    }


    public static void main(String[] args) throws IOException {
        String namn = "Kalle";
        ChatMultiThread c = new ChatMultiThread(namn,"234.235.236.237", 12540);
    }
}
