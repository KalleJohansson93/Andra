package Sprint4.Uppgift13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;

public class Url {

    URL url = new URL("https://github.com/dwyl/english-words/blob/master/words.txt?raw=true");
    String data;
    int counter = 0;

    public Url() throws IOException {


        BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));
        while ((data = reader.readLine()) != null){
            System.out.println(data);
            counter++;

        }
        System.out.println("Ord: " + counter);
    }


    public static void main(String[] args) throws IOException {
        Url u = new Url();
    }
}
