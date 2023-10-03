package Sprint1.Uppgift3;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Lärare l1 = new Lärare(930729, 100);
        Lärare l2 = new Lärare(465, 5465);
        Kurs k1 = new Kurs("Java");
        Kurs k2 = new Kurs("Matte");
        Student s1 = new Student(1, 11);
        Student s2 = new Student(2, 22);
        Student s3 = new Student(3, 33);

        ArrayList<Student> allaStudenter = new ArrayList<>();
        allaStudenter.add(s1);
        allaStudenter.add(s2);
        allaStudenter.add(s3);

        Deltagande d1 = new Deltagande(s1, k1);
        Deltagande d2 = new Deltagande(s1, k2);
        Deltagande d3 = new Deltagande(s2, k1);
        Deltagande d4 = new Deltagande(s2, k2);
        Deltagande d5 = new Deltagande(s3, k1);

        ArrayList<Deltagande> allaDeltagande = new ArrayList<>();
        allaDeltagande.add(d1);
        allaDeltagande.add(d2);
        allaDeltagande.add(d3);
        allaDeltagande.add(d4);
        allaDeltagande.add(d5);

        for (Student s : allaStudenter) {
            System.out.println("Student: " + s.getStudieNr());
            for (Deltagande d : allaDeltagande) {
                if (d.getStudent() == s)
                    System.out.println(d.getKurs().getKursNamn());
            }
        }


        for (Student ss : allaStudenter) {
            System.out.println("\nStudent: " + ss.getStudieNr());
            for (Deltagande d : allaDeltagande) {
                if (d.getStudent() == ss)
                    System.out.println("Kurs: " + d.getKurs().getKursNamn());
            }
        }
        //System.out.println();

    }


}




