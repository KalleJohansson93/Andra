package Sprint4.Uppgift7.POJOs;

import java.io.Serializable;

public class Response implements Serializable {

    private boolean succes;
    private Kompis person;

    public Response(){
    }

    public Response(boolean succes){
        this.succes = succes;
    }

    public Response (boolean succes, Kompis person){
        this.succes = succes;
        this.person = person;
    }

    public boolean getSucces() {
        return succes;
    }

    public void setSucces(boolean succes) {
        this.succes = succes;
    }

    public Kompis getPerson() {
        return person;
    }

    public void setPerson(Kompis person) {
        this.person = person;
    }
}
