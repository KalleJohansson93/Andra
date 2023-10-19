package Sprint2.Uppgift6;

import java.util.Scanner;

public class Växel {

    public int[] valörer = {1000,500,200,100,50,20,10,5,2,1};





    public void skrivaUtAntalSedlarOchMyntTillbaka(int växelSumma){
        for (int i = 0; i < valörer.length; i++) {
            while (växelSumma > valörer[i]) {
                växelSumma = -valörer[i];
            }



        }

    }

/*    public int taBortHögstaValören(int nuvarandeVäxel, int valör, int i) {
    }

    public int getAntalAvHögstaValör(int nuvarandeVäxel, int valör) {
    }*/

    public int calculateVäxel(int pris, int betalning) {
        return betalning - pris;
    }


    public void mainProgram() {

        Scanner scan = new Scanner(System.in);
        Växel växel = new Växel();

        int pris = 0;
        int betalning = 0;

        System.out.println("Vad kostar varan: ");
        if (scan.hasNextInt()) {
            pris = scan.nextInt();
        }

        System.out.println("Hur mycket betalade du: ");
        if (scan.hasNextInt()) {
            betalning = scan.nextInt();
        }

        int växelSumma = calculateVäxel(pris,betalning);

        System.out.println("Pengar tillbaka: ");
        skrivaUtAntalSedlarOchMyntTillbaka(växelSumma);







    }

    public static void main(String[] args) {
        Växel uppg = new Växel();
        uppg.mainProgram();

    }
}