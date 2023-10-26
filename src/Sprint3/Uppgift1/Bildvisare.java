package Sprint3.Uppgift1;

import Sprint3.förstaTest;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Bildvisare extends JFrame implements ActionListener {

    ImageIcon i = new ImageIcon("C:\\Users\\Kalle\\Pictures\\Sample Pictures\\Chrysanthemum.jpg");
    ImageIcon i2 = new ImageIcon("C:\\Users\\Kalle\\Pictures\\Sample Pictures\\Desert.jpg");
    JLabel label = new JLabel(i);
    JLabel label2 = new JLabel(i2);
    JButton button = new JButton("Start");
    JButton button2 = new JButton("Stop");
    JPanel panel = new JPanel();


    Bildvisare() {
        add(panel);
        panel.add(label);
        panel.add(label2);
        panel.add(button);
        panel.add(button2);
        button.addActionListener(this);
        pack();
        //setSize(600, 400);
        setLocation(400, 200);
        setVisible(true);
        panel.setLayout(new GridLayout());
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        Bildvisare f = new Bildvisare();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (label.getIcon() == i){
            label.setIcon(i2);
        }
        else {
            label.setIcon(i);
        }

    }
}