package Sprint1.Bilregister2;

public abstract class Fordon {
    protected int hastighet;
    protected int vikt;

    public Fordon (){}

    public Fordon (int hastighet, int vikt){}

    public abstract void printMe(); //Abstract metod


    public void ändraHastighet(int nyHastighet) {
        hastighet = nyHastighet;
    }

    @Override
    public String toString() {
        return "Fordon{" +
                "hastighet=" + hastighet +
                ", vikt=" + vikt +
                '}';
    }
}
