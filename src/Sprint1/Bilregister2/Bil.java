package Sprint1.Bilregister2;

public class Bil extends Fordon {
    private int antalVäxlar;
    private int nuvarandeVäxel;


    public Bil (int antalVäxlar, int nuvarandeVäxel, int vikt, int hastighet){
        super(hastighet, vikt);
        this.antalVäxlar = antalVäxlar;
        this.nuvarandeVäxel = nuvarandeVäxel;
        this.vikt = vikt;
        this.hastighet = hastighet;
    }



    public int växla (int nyVäxel){
        nuvarandeVäxel = nyVäxel;
        return nuvarandeVäxel;
    }

    @Override
    public void printMe() {
        System.out.println( "Bil{" +
                "antalVäxlar=" + antalVäxlar +
                ", nuvarandeVäxel=" + nuvarandeVäxel + " Vikt=" + vikt + " Hastighet=" + hastighet +
                '}');
    }
}
