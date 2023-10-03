package Sprint1.Bilregister;

import Sprint1.Bilregister.Person;

public class Main {


    Person p1 = new Person("Kalle", "Stockholm", 30);
    Person p2 = new Person("Johansson", "Morgongåva", 26);

    Car c1 = new Car("ABC123", "BMW", "3", p1);
    Car c2 = new Car ("ABC456", "Volvo", "240", p2);




    public static void main(String[] args) {
        Main m = new Main();

        m.c1.changeOwner(m.p2,m.p1);
        System.out.println(m.c1.toString());

        m.c2.changeOwner(m.p2,m.p1);
        System.out.println(m.c2.toString());



    }
}
