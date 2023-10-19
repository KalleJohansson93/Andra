package Sprint2.Inlämningsuppgift2;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Gym {

    Path filePathMembersList = Paths.get("Sprint2/Inlämningsuppgift2/GymMembership.txt");
    Path filePathMembersHistory = Paths.get("Sprint2/Inlämningsuppgift2/MembersHistory.txt");

    public boolean kollaOmPersonÄrBehörig(String namnPersnr, Path filePath) {
        String line = "";
        String line2 = "";
        try {
            Scanner scan = new Scanner(filePath);
            while (scan.hasNextLine()) {
                line = scan.nextLine();
                if (line.contains(namnPersnr)) {
                    line2 = scan.nextLine();
                    skrivaPersonTillFil(line, line2);

                    return true;
                }
            }
        } catch (IOException e) {
            System.out.println("Filen kan inte hittas");
            e.printStackTrace();
        }
        return false;
    }

    public String skrivUtPersonen (String namnPersnr, Path filePath){
        String medlemskapDatum = "";
        String namnPers = "";
        try {
            Scanner scan = new Scanner(filePath);
            while (scan.hasNextLine()) {
                namnPers = scan.nextLine();
                if (namnPers.contains(namnPersnr)) {
                    System.out.println(namnPers);  //LÄGG TILL DATUM HÄR
                    return namnPersnr + " är behörig från " + scan.nextLine() + " och ett år framåt";
                }
            }
        } catch (IOException e) {
            System.out.println("Filen kan inte hittas");
            e.printStackTrace();
        }
        return namnPersnr + " har aldrig varit kund";
    }

    public void skrivaPersonTillFil(String namnPersnr, String datum){
        try {
            PrintWriter writer = new PrintWriter(new BufferedWriter(new FileWriter(String.valueOf(filePathMembersHistory), true)));
            writer.println(namnPersnr);
            writer.print(datum);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }





    public Gym() {




    }

    public static void main(String[] args) {
        Gym g = new Gym();
    }
}
