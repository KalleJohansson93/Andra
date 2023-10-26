package Sprint3.Uppgift5;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Stensaxpåse extends JFrame implements ActionListener {

    int pcScore = 0;
    int userScore = 0;
    int pcVal;
    int userVal;
    JPanel p = new JPanel();
    JLabel score = new JLabel("Your score: " + userScore);
    JLabel scoreForPC = new JLabel("  PC score: " + pcScore);
    JButton pcSax = new JButton("Sax");
    JButton pcSten = new JButton("Sten");
    JButton pcPåse = new JButton("Påse");
    JButton sax = new JButton("Sax");
    JButton sten = new JButton("Sten");
    JButton påse = new JButton("Påse");
    JPanel knappar = new JPanel();
    JPanel scoreboard = new JPanel();

    public Stensaxpåse() {
        add(p);
        p.setLayout(new BorderLayout());
        add(knappar, BorderLayout.SOUTH);
        add(scoreboard, BorderLayout.NORTH);
        knappar.setLayout(new GridLayout(2, 3));
        setLocation(550, 400);


        knappar.add(pcSax);
        knappar.add(pcPåse);
        knappar.add(pcSten);
        knappar.add(sax);
        knappar.add(påse);
        knappar.add(sten);
        scoreboard.add(score);
        scoreboard.add(scoreForPC);

        pcSax.addActionListener(this);
        pcPåse.addActionListener(this);
        pcSten.addActionListener(this);
        sax.addActionListener(this);
        påse.addActionListener(this);
        sten.addActionListener(this);

        Dimension buttonSize = new Dimension(100, 50); // width=100, height=50
        pcSax.setPreferredSize(buttonSize);
        pcSten.setPreferredSize(buttonSize);
        pcPåse.setPreferredSize(buttonSize);
        sax.setPreferredSize(buttonSize);
        sten.setPreferredSize(buttonSize);
        påse.setPreferredSize(buttonSize);

        pack();
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public void battle(int u) {
        Random rand = new Random();
        int pc = rand.nextInt(1, 4);
        System.out.println(pc);
        if (pc == 1)
            pcSax.setBackground(Color.RED);
        if (pc == 2)
            pcSten.setBackground(Color.RED);
        if (pc == 3)
            pcPåse.setBackground(Color.RED);


        if (u == 1 && pc == 1 || u == 2 && pc == 2 || u == 3 && pc == 3) {
            System.out.println("Lika! ");
            scoreboard.setBackground(null);
        }
        if (u == 1 && pc == 3 || u == 2 && pc == 1 || u == 3 && pc == 2) {
            System.out.println("Du vann!");
            scoreboard.setBackground(Color.GREEN);
            userScore++;
            score.setText("Your score: " + userScore);
        }
        if (u == 1 && pc == 2 || u == 2 && pc == 3 || u == 3 && pc == 1) {
            System.out.println("PC vann!");
            scoreboard.setBackground(Color.RED);
            pcScore++;
            scoreForPC.setText("  PC score: " + pcScore);
        }

        Timer timer = new Timer(2000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                pcSax.setBackground(null);
                pcSten.setBackground(null);
                pcPåse.setBackground(null);
                sax.setBackground(null);
                sten.setBackground(null);
                påse.setBackground(null);
            }
        });
        timer.setRepeats(false); // Ensure the timer only runs once
        timer.start();
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == sax) {
            sax.setBackground(Color.RED);
            battle(1);
        }

        if (e.getSource() == sten) {
            sten.setBackground(Color.RED);
            battle(2);
        }

        if (e.getSource() == påse) {
            påse.setBackground(Color.RED);
            battle(3);
        }
    }


    public static void main(String[] args) {
        Stensaxpåse s = new Stensaxpåse();
    }
}

