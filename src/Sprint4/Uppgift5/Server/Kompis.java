package Sprint4.Uppgift5.Server;

public class Kompis {

    String namn;
    String telNr;

    public Kompis() {
    }

    public Kompis(String namn, String telNr) {
        this.namn = namn;
        this.telNr = telNr;
    }

    public String getNamn() {
        return namn;
    }

    public void setNamn(String namn) {
        this.namn = namn;
    }

    public String getTelNr() {
        return telNr;
    }

    public void setTelNr(String telNr) {
        this.telNr = telNr;
    }


    @Override
    public String toString() {
        return "Kompis{" +
                "namn='" + namn + '\'' +
                ", telNr='" + telNr + '\'' +
                '}';
    }
}
