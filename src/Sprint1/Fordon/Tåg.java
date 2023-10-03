package Sprint1.Fordon;

public class Tåg extends Fordon{
    private int antalVagnar;


    public Tåg (int antalVagnar, int hastighet, int vikt){
        super(hastighet, vikt);
        this.antalVagnar = antalVagnar;
    }


    public void kopplaVagn (boolean bool){
        if (bool == true)
            antalVagnar++;
    }

}
