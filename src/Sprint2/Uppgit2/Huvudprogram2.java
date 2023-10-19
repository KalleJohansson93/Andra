package Sprint2.Uppgit2;

import java.util.Scanner;

public class Huvudprogram2 {
    Bil b2 = new Bil(12000, 13000, 500);


    public static void main(String[] args) {
        Sprint2.Uppgit2.Huvudprogram2 hp = new Sprint2.Uppgit2.Huvudprogram2();
        Bil b2 = new Bil(12000, 13000, 500);
        System.out.println(b2.utskrift());

        Scanner scan = new Scanner(System.in);

        double scannedMilesLastYear = 0;
        double scannedActualMiles = 0;
        double scannedGasUsed = 0;

        while (scan.hasNextDouble())
            if (scannedMilesLastYear == 0) {
                System.out.print("Mil förra året :");
                scannedMilesLastYear = scan.nextDouble();
            }
            else if (scannedActualMiles == 0){
                System.out.print("Nuvarande miltal: ");
                scannedActualMiles = scan.nextDouble();
            }
            else if (scannedGasUsed == 0){
                System.out.print("Bensin förbrukad: ");
                scannedGasUsed = scan.nextDouble();
                Bil b3 = new Bil(scannedMilesLastYear, scannedActualMiles, scannedGasUsed);
                System.out.println(b3.utskrift());
                break;
            }
            else break;


    }

}
