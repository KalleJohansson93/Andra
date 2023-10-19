package Sprint1.Fordon;

import java.io.Serializable;

public class Fordon implements Serializable {
    protected int hastighet;
    protected int vikt;

    public Fordon (){}

    public Fordon (int hastighet, int vikt){}


    public void ändraHastighet(int nyHastighet) {
        hastighet = nyHastighet;
    }

}
