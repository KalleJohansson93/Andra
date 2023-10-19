package Sprint2.Inlämningsuppgift2;

import org.junit.jupiter.api.Test;

import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class GymTest {


    Gym x = new Gym();

    Path filePathMembers = Paths.get("test/Sprint2/Inlämningsuppgift2/GymMembership.txt");
    //Path filePathMemberVisitingHistory = Paths.get("Sprint2/Inlämningsuppgift2/MemberVisitingHistory.txt");

    @Test
    public void kollaOmPersonÄrBehörigTest(){
        assertEquals(x.kollaOmPersonÄrBehörig("7608021234",filePathMembers), true);
        assertEquals(x.kollaOmPersonÄrBehörig("Diamanda",filePathMembers), true);
        assertEquals(x.kollaOmPersonÄrBehörig("Diamanda Djedi",filePathMembers), true);
        assertEquals(x.kollaOmPersonÄrBehörig("Diamande", filePathMembers), false);
    }

    @Test
    public void skrivUtPersonenTest(){

        assertEquals(x.skrivUtPersonen("Diamanda", filePathMembers), "Diamanda är behörig från 2023-01-30 och ett år framåt");
        assertEquals(x.skrivUtPersonen("Kalle Johansson", filePathMembers), "Kalle Johansson har aldrig varit kund");
        //assertEquals(x.skrivUtPersonen, "Personen är inte med i medlemsregistret");
    }

    public int räknaRaderIFil (String filNamn){
        int antalRader = 0;
        try (Scanner scan = new Scanner(new FileReader(filNamn));){
            while (scan.hasNextLine())
                antalRader++;
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return antalRader;
    }

    @Test
    public void skrivaTillFilTest(){
        String filAttLäsaFrån = "test/Sprint2/Uppgift9Test/personer.txt";
        String filAttSkrivaTil = "test/Sprint2/Uppgift9Test/GiltigaPersoner.txt";
        String person = "7608021234, Diamanda Djedi";
        String datum = "2023-01-30";
        x.skrivaPersonTillFil(person, datum);
        try(Scanner scan = new Scanner(filAttLäsaFrån)){
            PrintWriter writer = new PrintWriter(Files.newBufferedWriter(Paths.get(filAttSkrivaTil)));
            //x.skrivaPersonTillFil(person, datum);
        }
        catch (IOException e){
            System.out.println("Något fel vi filhantering");
            e.printStackTrace();
        }
        catch (Exception e){
            e.printStackTrace();
        }

        //assertEquals(x.skrivaPersonTillFil(person, datum), "Diamanda");
    }









}