package Sprint1.Fordon;

import java.io.Serializable;

public class Bil extends Fordon implements Serializable {
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
