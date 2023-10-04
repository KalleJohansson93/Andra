package Sprint1.Bilregister2;

public class Main {

    Bil b1 = new Bil(6,2, 246, 2456);
    Båt båt1 = new Båt(3000, 342, 234);
    Tåg t1 = new Tåg(8, 21, 324);
    Cykel c1 = new Cykel(21, 4, 342153, 341545);




    public static void main(String[] args) {
        Main m = new Main();
        m.b1.printMe();
        m.b1.växla(8);
        m.b1.printMe();
        System.out.println(m.b1);


    }
}
