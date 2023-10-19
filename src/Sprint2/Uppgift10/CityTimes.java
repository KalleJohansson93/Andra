package Sprint2.Uppgift10;

import javax.swing.*;
import java.time.Instant;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class CityTimes {


    Instant i = Instant.now();
    ZoneId stockholm = ZoneId.of("Europe/Stockholm");
    ZoneId toronto = ZoneId.of("America/Toronto");
    ZoneId shanghai = ZoneId.of("Asia/Shanghai");


    public CityTimes() {

        String stad = JOptionPane.showInputDialog(null, "Stad?");

        if (stad.trim().toLowerCase().equals("stockholm")) {

            System.out.println(i.atZone(stockholm).format(DateTimeFormatter.ofPattern("HH:mm:ss")));
            System.exit(0);
        } else if (stad.trim().toLowerCase().equals("toronto")) {
            System.out.println(i.atZone(toronto).format(DateTimeFormatter.ofPattern("HH:mm:ss")));
            System.exit(0);

        } else if (stad.trim().toLowerCase().equals("shanghai")) {
            System.out.println(i.atZone(shanghai).format(DateTimeFormatter.ofPattern("HH:mm:ss")));
            System.exit(0);

        } else {
            System.out.println("Felaktig stad");
        }


    }


    public static void main(String[] args) {
        CityTimes c = new CityTimes();
    }
}
