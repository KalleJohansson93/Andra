package Sprint2.Uppgift9;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Personuppgifter {

    public String filAttLäsa = "Sprint2/Uppgift9/personer.txt";
    public String filAttSkrivaTill = "Sprint2/Uppgift9/långapersoner.txt";
    public int längdd = 0;


        public int getLängd(String längdData){
            längdData.substring(längdData.length() - 3);
            int längd = Integer.parseInt(längdData.substring(längdData.length() - 3));
            return längd;

        }

        public boolean ärÖverTvåMeter(int längd){
            return längd > 199;
        }

        public int personÖverTvåMeter(String filAttLäsa){
            int längd = 0;
            String s = "";
            int counter = 0;
            try {
                Scanner scan = new Scanner(new FileReader(filAttLäsa));
                if (scan.hasNextLine()){
                    counter++;
                    s = scan.nextLine();
                    längd = getLängd(s);
                    if (ärÖverTvåMeter(längd))
                        return counter;
                }
            } catch (FileNotFoundException e) {
               // throw new RuntimeException(e);
            }


            return counter;
        }


        public Personuppgifter() {

        }


    public static void main(String[] args) {
            Personuppgifter x = new Personuppgifter();
            int i = x.personÖverTvåMeter(x.filAttLäsa);
        System.out.println(i);
    }
}

