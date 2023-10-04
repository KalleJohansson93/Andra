package Sprint1.Inlämningsuppgift;

public class KöttätandeVäxter extends Växter {

    private final String köttätandeväxtBehov = "l proteindryck per dag";
    private final double proteindryckFormel = 0.2;
    private final double proteindryckBasnivå = 0.1;

    public KöttätandeVäxter(double höjd, String namn) {
        super.höjd = höjd;
        super.namn = namn;
    }

    //getter som är till för att komma åt dom inkapslade variablerna i den här klassen
    @Override
    public String getNamn() { //Polymorfism när man kallar på den här metoden
        return namn;
    }

    @Override
    public String Vattna() { //Polymorfism när man kallar på den här metoden
        return Växttyp.KÖTTÄTANDEVÄXTER.växtTyp + namn + behöver + (höjd * proteindryckFormel + proteindryckBasnivå) + köttätandeväxtBehov;
    }
}
