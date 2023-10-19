package Sprint2.Uppgift8;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Temperatur {
    public static void main(String[] args) {

        String s;
        double d;
        double maxValue = 0;
        double minValue = 100;
        double totalValue = 0;
        int dagar = 0;

        try (BufferedReader reader = new BufferedReader(new FileReader("src/Sprint2/Uppgift8/temp.txt"))) {
            while ((s = reader.readLine()) != null) {
                NumberFormat format = NumberFormat.getInstance(Locale.FRANCE);
                Number number = format.parse(s);
                d = number.doubleValue();
                if (d > maxValue)
                    maxValue = d;
                if (d < minValue)
                    minValue = d;
                totalValue = totalValue + d;
                dagar++;
            }

            System.out.println("Min: " + minValue);
            System.out.println("Max: " + maxValue);
            System.out.println("Medel: " + totalValue / dagar);

        } catch (Exception e) {
            System.out.println("Något gick fel");
            e.printStackTrace();
        }
    }
}

