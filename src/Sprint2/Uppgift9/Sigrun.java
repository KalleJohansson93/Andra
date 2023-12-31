package Sprint2.Uppgift9;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;


    public class Sigrun {

        Path outFilePath = Paths.get("src/Sprint2/Uppgift9/tallPeople.txt");
        Path inFilePath = Paths.get("src/Sprint2/Uppgift9/personer.txt");

        public int getLength(String line){
            String[] stringarr =  line.split(",");
            return Integer.parseInt(stringarr[2].trim());
        }

        public boolean isMoreThanTwoMeter(int i){
            //snabbvariant av if
            return (i > 199) ? true : false;
        }

        public void readTwoLinesWriteToFileIfTall(Scanner sc, PrintWriter w){
            String firstLine = "";
            String secondLine = "";
            if(sc.hasNext()){
                firstLine = sc.nextLine();
                //System.out.println(firstLine);
                if (sc.hasNext()){
                    secondLine = sc.nextLine();
                    //System.out.println(secondLine);

                    int length = getLength(secondLine);
                    boolean tall = isMoreThanTwoMeter(length);
                    if (tall){
                        w.print(firstLine + "\n" +
                                secondLine+ "\n");
                    }
                }
            }
        }

        public Sigrun() {

            try(PrintWriter w = new PrintWriter(Files.newBufferedWriter(outFilePath));
                Scanner fileScanner = new Scanner(inFilePath);){

                while(fileScanner.hasNext()){
                    readTwoLinesWriteToFileIfTall(fileScanner, w);
                }
            }
            catch (FileNotFoundException e){
                System.out.println("Filen kunde inte hittas");
                e.printStackTrace();
                System.exit(0);
            }
            catch (IOException e){
                System.out.println("Det gick inte att skriva till fil");
                e.printStackTrace();
                System.exit(0);
            }
            catch (Exception e){
                System.out.println("Något gick fel");
                e.printStackTrace();
                System.exit(0);
            }
            //finally behövs inte när vi har try-with-resources
        }

        public static void main(String[] args){
            Sigrun ö = new Sigrun();
        }
    }

