package Sprint1.Fordon;

public class Bil extends Fordon{
    private int antalVäxlar;
    private int nuvarandeVäxel;


    public Bil (int antalVäxlar, int nuvarandeVäxel, int vikt, int hastighet){
        super(hastighet, vikt);
        this.antalVäxlar = antalVäxlar;
        this.nuvarandeVäxel = nuvarandeVäxel;

    }

    public void växla (int nyVäxel){
        nuvarandeVäxel = nyVäxel;
        vikt = 234;
    }

    @Override
    public String toString() {
        return "Bil{" +
                "antalVäxlar=" + antalVäxlar +
                ", nuvarandeVäxel=" + nuvarandeVäxel +
                '}';
    }
}
