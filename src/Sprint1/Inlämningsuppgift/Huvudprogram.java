package Sprint1.Inlämningsuppgift;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Huvudprogram {
    public Huvudprogram() {

        Palmer laura = new Palmer(5, "Laura");
        Palmer olof = new Palmer(1, "Olof");
        Kaktusar igge = new Kaktusar(0.2, "Igge");
        KöttätandeVäxter meatloaf = new KöttätandeVäxter(0.7, "Meatloaf");

        List<Växter> växter = new ArrayList<>();
        växter.add(laura);
        växter.add(olof);                    // FINAL    FRÅGOR    OVERRIDE
        växter.add(igge);                 // Växter igge = new kaktusar
        växter.add(meatloaf);


        //Frågar vilken växt det gäller och antingen visar den växtens näringsbehov eller skriver felmeddelande och
        // erbjuder användaren att se alla tillgängliga växter genom att skriva status i dialogruta
        String växtSomSkaVattnas = JOptionPane.showInputDialog(null, "Vilken växt ska få näring?");
        int counter = 0;
        for (Växter v : växter) {
            counter++;
            if (v.getNamn().toLowerCase().equals(växtSomSkaVattnas.toLowerCase().trim())) {  //Polymorfism
                JOptionPane.showMessageDialog(null, v.Vattna()); //Polymorfism
                break;
            } else if (växtSomSkaVattnas.toLowerCase().equals("status")) {
                StringBuilder allaVäxter = new StringBuilder();
                for (Växter x : växter) {
                    allaVäxter.append(x.getNamn()).append("\n"); //Polymorfism
                }
                JOptionPane.showMessageDialog(null, allaVäxter);
                break;
            } else if (counter == växter.size()) {
                JOptionPane.showMessageDialog(null, "Den växten finns tyvärr inte i databasen \n" +
                        "Skriv in \"status\" i dialogrutan för att se tillgängliga växter i databasen");
                break;
            }
        }
    }

    public static void main(String[] args) {
        Huvudprogram hp = new Huvudprogram();
    }
}