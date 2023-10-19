package Sprint2.Inlämningsuppgift2ny;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.time.LocalDate;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

// Program för ett gym som kollar upp kunders medlemskap från fil och skriver ut i konsol. Skriver även besökshistorik till en fil
public class Gym {
    private final Path filePathMembersList = Paths.get("src/Sprint2/Inlämningsuppgift2ny/GymMembership.txt");
    private final Path filePathMembersVisitorHistory = Paths.get("src/Sprint2/Inlämningsuppgift2ny/MembersVisitorHistory.txt");
    protected boolean test = false;
    private boolean kollaBehörigheten = false;
    private final String oväntatFel = "Något oväntat fel inträffade";
    private final String felVidFilhantering = "Fel vid filhantering";

    public boolean läsTvåRaderOchSkrivUtBehörigaMedlemmar(Scanner scanner, PrintWriter w, String input) {
        String förstaRaden;
        String andraRaden;
        if (input.length() < 3) {
            System.out.println("Input måste vara minst tre tecken lång");
            System.exit(0);
        }
        if (scanner.hasNext()) {
            förstaRaden = scanner.nextLine();
            if (scanner.hasNext()) {
                andraRaden = scanner.nextLine();
                if (kollaBehörighet(förstaRaden, andraRaden, input)) {
                    skrivTillFil(förstaRaden, w);
                    System.out.println(skrivUtBehörigPerson(förstaRaden, andraRaden));
                    return true;
                }
            }
        }
        return false;
    }

    public boolean kollaBehörighet(String förstaRaden, String andraRaden, String input) {
        LocalDate datum = LocalDate.parse(andraRaden).plusYears(1);
        if (förstaRaden.toLowerCase().contains(input.toLowerCase())) {
            if (datum.isAfter(LocalDate.now())) {
                return true;
            } else {
                System.out.println(utskriftFörFdKund(förstaRaden, datum));
            }
        }
        return false;
    }

    public String utskriftFörFdKund(String förstaRaden, LocalDate datum) {
        kollaBehörigheten = true;
        return förstaRaden + " är en före detta kund. Dennes kort gick ut: " + datum;
    }

    public String skrivUtBehörigPerson(String förstaRaden, String andraRaden) {
        förstaRaden = förstaRaden.substring(förstaRaden.indexOf(" ") + 1);
        LocalDate datum = LocalDate.parse(andraRaden).plusYears(1);
        return förstaRaden + " är behörig fram till " + datum;
    }

    public String utskriftFörObehöriga(String input) {
        return input + " har aldrig varit kund";
    }

    public void skrivTillFil(String förstaRaden, PrintWriter writer) {
        writer.println(förstaRaden);
        writer.println(LocalDate.now());
    }

    public String läsInput(String prompt, String optionalTestParameter) {
        while (true) {
            try {
                if (test) {
                    try (Scanner scanner = new Scanner(optionalTestParameter)) {
                        System.out.println(prompt);
                        return scanner.nextLine();
                    }
                } else {
                    try (Scanner scanner = new Scanner(System.in)) {
                        System.out.println(prompt);
                        return scanner.nextLine();
                    }
                }
            } catch (InputMismatchException e) {
                System.out.println("Fel inmatning");
            } catch (NoSuchElementException e) {
                System.out.println("Indata saknas");
            } catch (Exception e) {
                System.out.println(oväntatFel);
                e.printStackTrace();
            }
        }
    }


    public void mainProgram() {

        String input = läsInput("Skriv in namn eller personnummer: ", "").trim();

        try {
            if (!Files.exists(filePathMembersVisitorHistory)) {
                Files.createFile(filePathMembersVisitorHistory);
            }
        } catch (IOException e) {
            System.out.println(felVidFilhantering);
            e.printStackTrace();
        } catch (Exception e) {
            System.out.println(oväntatFel);
            e.printStackTrace();
        }

        try (PrintWriter writer = new PrintWriter(Files.newBufferedWriter(filePathMembersVisitorHistory, StandardOpenOption.APPEND));
             Scanner scan = new Scanner(filePathMembersList)) {
            while (scan.hasNext()) {
                läsTvåRaderOchSkrivUtBehörigaMedlemmar(scan, writer, input);
                if (läsTvåRaderOchSkrivUtBehörigaMedlemmar(scan, writer, input)) {
                    kollaBehörigheten = true;
                }
            }
            if (kollaBehörigheten == false) {
                System.out.println(utskriftFörObehöriga(input));
            }
        } catch (IOException e) {
            System.out.println(felVidFilhantering);
            e.printStackTrace();
        } catch (Exception e) {
            System.out.println(oväntatFel);
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Gym g = new Gym();
        g.mainProgram();
    }
}