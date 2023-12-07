package Sprint4.Uppgift14;

import javax.swing.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.awt.Font;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Proerties extends JFrame {


    public Proerties(){
       Properties p = new Properties();

        try {
            p.load(new FileInputStream("src/Sprint4/Uppgift14/Properties.properties"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


        String mess = p.getProperty("message", "Hello!");
        JLabel l = new JLabel(mess, JLabel.CENTER);
        add(l);
        l.setOpaque(true);
        String fName = p.getProperty("fontName", "Serif");
        String fStyle = p.getProperty("fontStyle", "PLAIN");
        int ifStyle;
        if (fStyle.equals("BOLD")){
            ifStyle = Font.BOLD;
        }
        else if(fStyle.equals("ITALIC")){
            ifStyle = Font.ITALIC;
        }
        else ifStyle = Font.PLAIN;

        int fSize = Integer.parseInt(p.getProperty("fontSize", "24"));
        l.setFont(new Font(fName, ifStyle, fSize));
        setSize(400,150);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);


    }

    public static void main(String[] args) {
        Proerties t = new Proerties();
    }
}
