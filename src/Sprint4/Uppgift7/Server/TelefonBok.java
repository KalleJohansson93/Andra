package Sprint4.Uppgift7.Server;

import Sprint4.Uppgift7.POJOs.Kompis;

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
            if (telefonBok.get(i).getNamn().equalsIgnoreCase(namn)) {
                return telefonBok.get(i).toString();
            }
        }
        return "Person finns ej i databasen";
    }

    public Kompis getPersonByName(String s){
        for (Kompis p :telefonBok){
            if (p.getNamn().equalsIgnoreCase(s)){
                return p;
            }
        }
        return null;
    }


}
