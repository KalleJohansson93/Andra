package Sprint1.Enumövningar;

import Sprint1.Inlämningsuppgift.Huvudprogram;

public class Main {

    public Main (){

        for (Romersksiffra r : Romersksiffra.values()) {
            System.out.print(r);
            System.out.print(" är lika med ");
            System.out.println(r.konverter);
        }
    }

    public static void main(String[] args) {
        Main m = new Main();
    }
}
