package Sprint1.Bilregister2;

public class Tåg extends Fordon {
    private int antalVagnar;


    public Tåg (int antalVagnar, int hastighet, int vikt){
        super(hastighet, vikt);
        this.antalVagnar = antalVagnar;
    }

    @Override
    public void printMe() {
        System.out.println("Tåg!");
    }

    public void kopplaVagn (boolean bool){
        if (bool == true)
            antalVagnar++;
    }

}
