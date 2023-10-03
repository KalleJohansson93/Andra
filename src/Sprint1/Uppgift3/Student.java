package Sprint1.Uppgift3;

import java.util.ArrayList;

public class Student extends Person{
    private int studieNr;


    public Student(int persNr, int studieNr) {
        super(persNr);
        this.studieNr = studieNr;
    }

    public int getStudieNr() {
        return studieNr;
    }


}
