package Sprint4.Uppgift12;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Klient extends JFrame implements ActionListener {
    JTextArea txtArea = new JTextArea();
    JScrollPane scroll = new JScrollPane();
    JTextField txtField = new JTextField();
    PrintWriter out;
    BufferedReader in;
    String namn = "";


    public Klient () {
        namn = JOptionPane.showInputDialog(null, "Ange ditt chatt-alias");
        setTitle("Chat "+namn);
        txtArea.setEditable(false);
        add(scroll, BorderLayout.CENTER);
        add(txtArea, BorderLayout.SOUTH);
        add(txtField, BorderLayout.NORTH);
        setVisible(true);
        setSize(600,400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        txtField.addActionListener(this);


        int port = 12345;
        String ip = "127.0.0.1";

        try {
            Socket socket = new Socket(ip, 55555);
            out = new PrintWriter(socket.getOutputStream(), true);
            in = new BufferedReader(new InputStreamReader(socket.getInputStream()));

            String fromServer;

            while ((fromServer = in.readLine()) != null){
                txtArea.append(fromServer + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        try { out.println(namn + " : " + txtField.getText());
            txtField.setText("");
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Klient k = new Klient();
    }
}
