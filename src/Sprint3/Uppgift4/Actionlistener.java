package Sprint3.Uppgift4;

import javax.swing.*;
import java.awt.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Actionlistener extends JFrame {
    JPanel panel = new JPanel();
    JLabel label = new JLabel("Filnamn:");
    JTextField textField = new JTextField();
    JButton spara = new JButton("Spara");
    JButton oppna = new JButton("Öppna");
    JButton avsluta = new JButton("Avsluta");
    JButton skrivUt = new JButton("Skriv ut");
    JTextArea textArea = new JTextArea(10,60);
    JScrollPane scroll = new JScrollPane(textField,
            JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
            JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);


    public Actionlistener(){
        textArea.setFont(new Font("Monospaced", Font.PLAIN, 12));
        panel.setLayout(new GridLayout(1,6));
        panel.add(label);
        panel.add(textField);
        panel.add(oppna);
        panel.add(spara);
        panel.add(skrivUt);
        panel.add(avsluta);
        panel.add(textArea);
        panel.add(scroll);
        add(textArea, BorderLayout.SOUTH);


        add(panel,  BorderLayout.NORTH);
        add(scroll, BorderLayout.CENTER);
        setLocation(400, 300);
        pack();
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);


        oppna.addActionListener(l -> läsInFil(textField.getText()));
        spara.addActionListener(l -> läsInFil(textField.getText()));
        avsluta.addActionListener(l -> System.exit(0));


    }

    public void läsInFil (String filnamn) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filnamn))) {
            while (reader.readLine() != null)
                reader.readLine();
        } catch (Exception e) {
            System.out.println("Fel");
        }
    }
        public void sparaFil (String filnamn){
            try (FileWriter w = new FileWriter(filnamn);) {
                textArea.write(w);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    public static void main(String[] args) {
        Actionlistener a = new Actionlistener();
    }
}
