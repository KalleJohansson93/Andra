import java.io.*;
import java.util.Random;

public class Dice {

    // En metod som skapar 1000 random genererade tärningsslag och skriver in det i en fil.
    public static void createFile(String filnamn) {
        Random random = new Random();
        try (PrintWriter print = new PrintWriter(new BufferedWriter(new FileWriter(filnamn, true)))) {
            for (int i = 0; i < 1000; i++) {
                int randomDiceNumber = random.nextInt(1, 7);
                print.print(randomDiceNumber);
            }
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Något gick fel vid läsning av filen");
        }
    }

    // En metod som skapar en lång array av sifrrorna i filen som skapades av creatFile.
    public static int[] createArray(String filenameToArray) throws IOException {
        int[] allNumbersList = new int[1000];
        try (BufferedReader reader = new BufferedReader(new FileReader(filenameToArray))) {
            for (int i = 0; i < 1000; i++) {
                int sortering = Character.getNumericValue(reader.read());
                allNumbersList[i] = sortering;
            }
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Något gick fel när createArray försökte läsa från filen");
        }
        return allNumbersList;
    }

    //En metod som analyserar den långa arrayen från creatArray och räknar ut hur frekvent varje tärningsslag är.
    public static int[] analyzeArray(int[] analyzeTheArray) {
        int[] result = {0, 0, 0, 0, 0, 0};
        for (int i : analyzeTheArray) {
            if (i == 1)
                result[0]++;
            else if (i == 2)
                result[1]++;
            else if (i == 3)
                result[2]++;
            else if (i == 4)
                result[3]++;
            else if (i == 5)
                result[4]++;
            else if (i == 6)
                result[5]++;
        }
        return result;
    }
}
