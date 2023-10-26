package Sprint3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static javax.swing.SwingConstants.*;

public class förstaTest extends JFrame implements ActionListener {


    JLabel label = new JLabel("Spel");
    JButton button = new JButton("Start");
    JButton button2 = new JButton("Stop");
    JButton button3 = new JButton("Hej");
    JPanel panel = new JPanel();


    förstaTest() {
        panel.setLayout(new BorderLayout());
        add(panel);
        panel.add(label, BorderLayout.EAST);
        panel.add(button, BorderLayout.WEST);
        panel.add(button2, BorderLayout.SOUTH);
        panel.add(button3, BorderLayout.NORTH);
        button2.setSize(1000,1000);
        button2.setBackground(Color.BLACK);
        panel.setBackground(Color.GREEN);
        button2.addActionListener(this);
        button.addActionListener(this);
        //pack();
        setSize(600, 400);
        setLocation(400, 200);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        förstaTest f = new förstaTest();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (label.getText() == "Spel"){
            label.setText("Inte spela");
        }
        else {
            label.setText("Spel");
        }



    }
}
