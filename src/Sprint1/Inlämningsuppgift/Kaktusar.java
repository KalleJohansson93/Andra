package Sprint1.Inlämningsuppgift;

public class Kaktusar extends Växter {

    private final String kaktusBehov = " behöver 2cl mineralvatten per dag";
    //private String växtTyp = "Kaktusen ";

    public Kaktusar(double höjd, String namn) {
        super.höjd = höjd;
        super.namn = namn;
    }

    @Override
    //getter som är till för att komma åt dom inkapslade variablerna i den här klassen
    public String getNamn() { //Polymorfism när man kallar på den här metoden
        return namn;
    }

    @Override
    public String Vattna() { //Polymorfism när man kallar på den här metoden
        return Växttyp.KAKTUSAR.växtTyp + namn + kaktusBehov;
    }
}
