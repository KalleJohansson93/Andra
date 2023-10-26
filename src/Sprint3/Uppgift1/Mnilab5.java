package Sprint3.Uppgift1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Mnilab5 extends JFrame implements ActionListener {
    JPanel p = new JPanel();
    JCheckBox röd = new JCheckBox("Röd", false);
    JCheckBox gul = new JCheckBox("Gul", false);
    JCheckBox blå = new JCheckBox("Blå", false);
    JLabel label = new JLabel(" ");


    Mnilab5(){

        p.setLayout(new GridLayout(4,1));
        p.add(röd); p.add(gul); p.add(blå); p.add(label);
        add(p);

        röd.addActionListener(this);
        blå.addActionListener(this);
        gul.addActionListener(this);
        pack();
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

    public static void main(String[] args) {
        Mnilab5 m = new Mnilab5();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == röd && label.getText() == "Blå" || e.getSource() == blå && label.getText() == "Röd") {
            p.setBackground(Color.MAGENTA);
            label.setText("Lila");
        }
        else if (e.getSource() == röd){
            p.setBackground(Color.red);
            label.setText("Röd");
        }
        else if (e.getSource() == blå){
            p.setBackground(Color.blue);
            label.setText("Blå");
        }
        if (e.getSource() == gul){
            p.setBackground(Color.yellow);
            label.setText("Gul");
        }

    }
}
