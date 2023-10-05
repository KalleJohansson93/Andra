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
        växter.add(olof);
        växter.add(igge);
        växter.add(meatloaf);


        //Ger användaren växtens näringsbehov alternativt ger felmeddelande och erbjuder en lista över alla tillgängliga växter
        String växtSomSkaVattnas = JOptionPane.showInputDialog(null, "Vilken växt ska få näring?");
        int counter = 0;
        for (Växter växt : växter) {
            counter++;
            if (växt.getNamn().toLowerCase().equals(växtSomSkaVattnas.toLowerCase().trim())) {  //Polymorfism
                JOptionPane.showMessageDialog(null, växt.Vattna()); //Polymorfism
                break;
            } else if (växtSomSkaVattnas.toLowerCase().equals("status")) {
                StringBuilder allaVäxter = new StringBuilder();
                for (Växter v : växter) {
                    allaVäxter.append(v.getNamn()).append("\n"); //Polymorfism
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