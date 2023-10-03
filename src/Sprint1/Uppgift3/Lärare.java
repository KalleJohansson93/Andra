package Sprint1.Uppgift3;

public class Lärare extends Person{
    private int lärarNr;


    public Lärare (int lärarNr, int persNr){
        super(persNr);
        this.lärarNr = lärarNr;
    }
}
