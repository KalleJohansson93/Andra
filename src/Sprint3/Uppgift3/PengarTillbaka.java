package Sprint3.Uppgift3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PengarTillbaka extends JFrame implements ActionListener {

    JLabel pris = new JLabel("Vad kostar varan? ");
    JLabel betalning = new JLabel("Hur mycket betalade du? ");
    JLabel växel = new JLabel("Växel tillbaka:            ");
    JTextField prisInput = new JTextField(10);
    JTextField betalningInput = new JTextField(10);
    JPanel p = new JPanel();





    public PengarTillbaka(){
        //setLayout(new FlowLayout());
        p.add(pris);
        p.add(prisInput);
        p.add(betalning);
        p.add(betalningInput);
        p.add(växel);

        add(p);

        betalningInput.addActionListener(this);
        prisInput.addActionListener(this);



        setVisible(true);
        //setSize(500,500);
        pack();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public String växla (int betalning, int pris){
        return String.format(String.valueOf(betalning - pris));
    }



    public static void main(String[] args) {
        PengarTillbaka p = new PengarTillbaka();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int bet = Integer.parseInt(betalningInput.getText());
        int pris = Integer.parseInt(prisInput.getText());
        växel.setText("Växel tillbaka: " + växla(bet,pris));

    }
}
