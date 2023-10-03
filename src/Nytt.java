import javax.swing.*;
import java.io.*;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


public class Nytt {
    public static void main(String[] args) throws IOException {

        int[] numbers = {1, 5, 3, 4, 5};

        Scanner scan = new Scanner(new File("Individuell reflektion av branschen.txt"));
        BufferedReader reader = new BufferedReader(new FileReader("Individuell reflektion av branschen.txt"));

        int wordCount = 0;
        String rad = scan.next();

        while (scan.hasNext()) {
            System.out.println(rad);
            rad = scan.next();
            if (rad.equals("och")) {
                wordCount++;
            }

            System.out.println(wordCount);
        }
    }


}

/*
        InputStreamReader inputstreamreader = new InputStreamReader(System.in);

        System.out.println("Namn");
        while (true) {
            int charhater = inputstreamreader.read();
            if (charhater == -1){
        break;}
            System.out.println(charhater);
    char character = (char) characterInDecimal;


}
*/




