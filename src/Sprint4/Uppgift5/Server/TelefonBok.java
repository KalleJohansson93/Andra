package Sprint4.Uppgift5.Server;

import java.util.ArrayList;
import java.util.List;

public class TelefonBok {

    List<Kompis> telefonBok = new ArrayList<>();

    public TelefonBok() {

        Kompis k1 = new Kompis("Odd", "070626550");
        Kompis k2 = new Kompis("Fredde", "070797808");
        Kompis k3 = new Kompis("Jonas", "073626550");

        telefonBok.add(k1);
        telefonBok.add(k2);
        telefonBok.add(k3);
    }

    public List<Kompis> getTelefonbok () {
        return telefonBok;
    }

    public String sökKompis (String namn){
        for (int i = 0; i < telefonBok.size(); i++) {
            System.out.println(telefonBok.get(i).getNamn());

            if (telefonBok.get(i).getNamn().equalsIgnoreCase(namn)) {
                return telefonBok.get(i).toString();
            }
        }
        return "Person finns ej i databasen";
    }
}
