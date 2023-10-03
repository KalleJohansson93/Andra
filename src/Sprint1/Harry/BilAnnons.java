package Sprint1.Harry;

public class BilAnnons extends FordonsAnnons{
    private String färg;


    public BilAnnons(String färg, String rubrik, String beskrivning, int pris){
        this.färg = färg;
        this.rubrik = rubrik;
        this.beskrivning = beskrivning;
        this.pris = pris;
    }

    @Override
    public String toString() {
        return rubrik + '\n' +
                beskrivning + '\'' +
                ", färg='" + färg + '\'' +
                ", pris=" + pris;
    }

    public void getAnnonsText(BilAnnons bil){
        System.out.println(bil);
    }
}
