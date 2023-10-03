package Sprint1.Inlämningsuppgift;

public class Palmer extends Växter  {

    private final String palmBehov = "l vatten per dag";
    //private String växtTyp1 = "Palmen ";
    private final double palmFormel = 0.5;


    public Palmer(double höjd, String namn) {
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
        return Växttyp.PALMER.växtTyp + namn + behöver + höjd * palmFormel + palmBehov;
    }
}
