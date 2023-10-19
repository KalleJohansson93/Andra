package Sprint2.Inlämningsuppgift2ny;

import org.junit.jupiter.api.Test;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.time.LocalDate;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class GymTest {

    private Sprint2.Inlämningsuppgift2ny.Gym x = new Gym();

    @Test
    public void kollaBehörighetTest() {
        String förstaRaden = "5711121234, Hilmer Heur";
        String andraRaden = "2023-08-19";
        String andraRaden2 = "2021-08-18";
        String input = "Hilmer";
        String input2 = "Eva";
        assertEquals(x.kollaBehörighet(förstaRaden, andraRaden, input), true);
        assertEquals(x.kollaBehörighet(förstaRaden, andraRaden2, input), false);
        assertEquals(x.kollaBehörighet(förstaRaden, andraRaden, input2), false);

    }

    @Test
    public void skrivUtBehörigPersonTest() {
        String förstaRaden = "9307294711, Kalle Johansson";
        String andraRaden = "2123-08-18";
        assertEquals(x.skrivUtBehörigPerson(förstaRaden, andraRaden), "Kalle Johansson är behörig fram till 2124-08-18");
        assertNotEquals(x.skrivUtBehörigPerson(förstaRaden, andraRaden), "Kalle Johansson är behörig fram till 2123-08-18");
    }

    @Test
    public void utskriftFörObehörigaTest() {
        String input = "Hilmer Heur";
        String input2 = "Kalle";
        assertEquals(x.utskriftFörObehöriga(input), "Hilmer Heur har aldrig varit kund");
        assertEquals(x.utskriftFörObehöriga(input2), "Kalle har aldrig varit kund");
        assertNotEquals(x.utskriftFörObehöriga(input2), "Hilmer Heur har aldrig varit kund");
    }

    @Test
    public void utskriftFörFdKund() {
        String förstaRaden = "Fritjoff Flacon";
        LocalDate datum = LocalDate.of(2021, 11, 11);
        assertEquals(x.utskriftFörFdKund(förstaRaden, datum), "Fritjoff Flacon är en före detta kund. Dennes kort gick ut: 2021-11-11");
        assertNotEquals(x.utskriftFörFdKund(förstaRaden, datum), "Kalle är en före detta kund. Dennes kort gick ut: 2021-11-11");
    }


    public int räknaRaderIFil(String fil) {
        int antalRader = 0;
        try {
            BufferedReader reader = new BufferedReader(new FileReader(fil));
            while (reader.readLine() != null) {
                antalRader++;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return antalRader;
    }

    @Test
    public void skrivTillFilTest() throws IOException {
        //String filAttLäsa = "test/Sprint2/Inlämningsuppgift2ny/GymMembership.txt";
        String filAttSkrivaTill = "test/Sprint2/Inlämningsuppgift2ny/GymHistoryTest.txt";
        try (PrintWriter writer = new PrintWriter(Files.newBufferedWriter(Path.of(filAttSkrivaTill)))) {
            x.skrivTillFil("9307294711, Kalle Johansson", writer);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
        assertEquals(räknaRaderIFil(filAttSkrivaTill), 2);
        assertNotEquals(räknaRaderIFil(filAttSkrivaTill), 3);
    }

    public String scannaRaderIFil(Path fil) {
        String förstaRaden = "hej";
        try (Scanner scan = new Scanner(fil)) {
            förstaRaden = scan.nextLine();
            return förstaRaden;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return förstaRaden;
    }

    @Test
    public void scannaRadIFilTest() {
        String rad = scannaRaderIFil(Paths.get("test/Sprint2/Inlämningsuppgift2ny/GymHistoryTest.txt"));
        assertEquals(rad, "9307294711, Kalle Johansson");
        assertNotEquals(rad, "9307294711, Kalle Andersson");
    }

    @Test
    public void läsInputTest() {
        System.out.println(x.test);
        x.test = true;
        System.out.println(x.test);
        assertEquals(x.läsInput("Hej", "Diamanda"), "Diamanda");
        assertNotEquals(x.läsInput("hej", "Diamanda"), "Amanda");
    }


    @Test
    public void läsTvåRaderOchSkrivUtBehörigaMedlemmarTest() {
        Scanner scanner = null;
        try {
            scanner = new Scanner(Paths.get("test/Sprint2/Inlämningsuppgift2ny/GymMembership.txt"));
        } catch (Exception e) {
            e.printStackTrace();
        }
        PrintWriter pw = new PrintWriter(new StringWriter());
        assertTrue(x.läsTvåRaderOchSkrivUtBehörigaMedlemmar(scanner, pw, "Alhambra Aromes"));
        assertFalse(x.läsTvåRaderOchSkrivUtBehörigaMedlemmar(scanner, pw, "Kalle"));
    }
}

