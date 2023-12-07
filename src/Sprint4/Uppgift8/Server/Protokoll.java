package Sprint4.Uppgift8.Server;

import Sprint4.Uppgift8.Server.TelefonBok;
import Sprint4.Uppgift8.POJOs.Initiator;
import Sprint4.Uppgift8.POJOs.Response;
import Sprint4.Uppgift8.POJOs.Kompis;

public class Protokoll {

    private static int BEFOREINITIALIZING = 0;
    private static int AFTERINITIALZING = 1;

    private int state = BEFOREINITIALIZING;
    private TelefonBok t = new TelefonBok();
    Kompis dbResponse;

    public Object processInput(String theInput){
        Object theOutput = null;

        if (state == BEFOREINITIALIZING){
            theOutput = new Initiator();
            state = AFTERINITIALZING;
        } else if (state == AFTERINITIALZING) {
            dbResponse = t.getPersonByName((String)theInput);
            if (dbResponse == null){
                theOutput =new Response(false);
            }
            else {
                theOutput = new Response(true, dbResponse);
            }
        }
        return "Hej";
    }

}
