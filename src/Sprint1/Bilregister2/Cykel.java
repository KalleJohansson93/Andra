package Sprint1.Bilregister2;

public class Cykel extends Fordon {
    private int antalVäxlar;
    private int nuvarandeVäxel;

    public Cykel (int antalVäxlar, int nuvarandeVäxel, int hastighet, int vikt){
        super(hastighet, vikt);
        this.antalVäxlar = antalVäxlar;
        this.nuvarandeVäxel = nuvarandeVäxel;
    }

    @Override
    public void printMe() {
        System.out.println("Cykel!");
    }

    public void växla(int nyVäxel){
        nuvarandeVäxel = nyVäxel;
    }
}
