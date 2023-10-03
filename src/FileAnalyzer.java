import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileAnalyzer {

    //En metod som räknar ut antalet karaktärer i en fil.
    public static int fileAnalyzer(String filenameToAnalyze) throws IOException {
        int numberOfchars = 0;

        try (BufferedReader reader = new BufferedReader(new FileReader(filenameToAnalyze))) {
            int character;

            while ((character = reader.read()) != -1) {
                numberOfchars++;
            }
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Något gick fel vid analysen av filen med fileAnalyzer");
        }
        return numberOfchars;
    }
}
