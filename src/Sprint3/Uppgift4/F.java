package Sprint3.Uppgift4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class F extends JFrame implements ActionListener {

    JPanel p = new JPanel();
    JButton b1 = new JButton();
    JButton b2 = new JButton();
    JTextField t = new JTextField(60);

    public F (){
        add(p);
        p.add(b1);
        p.add(b2);
        p.add(t);

        //t.addActionListener(l -> System.exit(0));



        setSize(200,200);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);



    }



    public static void main(String[] args) {
        F f = new F();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
