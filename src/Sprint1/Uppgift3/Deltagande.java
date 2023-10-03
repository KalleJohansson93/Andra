package Sprint1.Uppgift3;

import java.util.ArrayList;

public class Deltagande {
    protected Kurs kurs;
    protected Student student;


    public Deltagande(Student student, Kurs kurs) {
        this.student = student;
        this.kurs = kurs;
    }

    public Kurs getKurs() {
        return kurs;
    }

    public void setKurs(Kurs kurs) {
        this.kurs = kurs;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }
}
