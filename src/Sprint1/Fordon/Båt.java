package Sprint1.Fordon;

public class Båt extends Fordon{
    private int dödVikt;


    public Båt (int dödVikt, int hastighet, int vikt){
        super(hastighet, vikt);
        this.dödVikt = dödVikt;
    }



    public void svänga (boolean håll){
        String riktning = "Höger";
        if (håll == true)
            riktning = "Vänster";

        System.out.println("Svänger " + riktning);
    }
}
