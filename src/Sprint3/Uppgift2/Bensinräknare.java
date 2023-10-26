package Sprint3.Uppgift2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


import static javax.swing.SwingConstants.EAST;

public class Bensinräknare extends JFrame implements ActionListener {
    Scanner scan = new Scanner(System.in);
    JLabel mätarställning = new JLabel("Ange mätarställning: ");
    JLabel gamlaMätarställningen = new JLabel("Ange mätarställning för ett år sedan: ");
    JLabel förbrukadBensin = new JLabel("Ange antal liter förbrukad bensin");
    JTextField mätarställningen = new JTextField(30);
    JTextField gamlaMätarställningens = new JTextField(30);
    JTextField förbrukadBensinen = new JTextField(30);
    JLabel undreKördaMil = new JLabel(" ");
    JLabel undreAntalLiterBensin = new JLabel(" ");
    JLabel undreFörbrukningPerMil = new JLabel(" ");

    JPanel frågor = new JPanel();
    JPanel svar = new JPanel();
    JPanel resultat = new JPanel();

    Bensinräknare(){
        setLayout(new BorderLayout());
        add(frågor, BorderLayout.WEST);
        add(svar, BorderLayout.EAST);
        add(resultat, BorderLayout.SOUTH);

        frågor.setLayout(new GridLayout(3,1));
        frågor.add(mätarställning);
        frågor.add(gamlaMätarställningen);
        frågor.add(förbrukadBensin);
        svar.setLayout(new GridLayout(3,1));
        svar.add(mätarställningen);
        svar.add(gamlaMätarställningens);
        svar.add(förbrukadBensinen);
        resultat.setLayout(new GridLayout(1,3));
        resultat.add(undreKördaMil);
        resultat.add(undreAntalLiterBensin);
        resultat.add(undreFörbrukningPerMil);

        mätarställningen.addActionListener(this);
        gamlaMätarställningens.addActionListener(this);
        förbrukadBensinen.addActionListener(this);

        setVisible(true);
        //setSize(500,500);
        pack();
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        undreKördaMil.revalidate();
        undreKördaMil.repaint();

        undreAntalLiterBensin.revalidate();
        undreAntalLiterBensin.repaint();

        undreFörbrukningPerMil.revalidate();
        undreFörbrukningPerMil.repaint();
    }




    @Override
    public void actionPerformed(ActionEvent e) {


            Scanner scMätarställning = new Scanner(mätarställningen.getText());
            Scanner scGamlaMätarställning = new Scanner(gamlaMätarställningen.getText());
            Scanner scFörbrukadBensin = new Scanner(förbrukadBensinen.getText());

            if (scMätarställning.hasNextDouble() && scGamlaMätarställning.hasNextDouble() && scFörbrukadBensin.hasNextDouble()){
                double mätare = scMätarställning.nextDouble();
                double gamlaMätarn = scGamlaMätarställning.nextDouble();
                double förbrukadeBensin = scFörbrukadBensin.nextDouble();

                double kördaMil = mätare - gamlaMätarn;

                undreKördaMil.setText(String.format("Antal körda mil: \n" + kördaMil));
                undreAntalLiterBensin.setText("Antal liter bensin: " + förbrukadBensin);
                undreFörbrukningPerMil.setText("Total förbrunkning: ");
            }



    }
    public static void main(String[] args) {
        Bensinräknare b = new Bensinräknare();
    }
}
