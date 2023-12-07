package Sprint4.Uppgift15;

public class Main {

    public static void main(String[] args) {
        Generic<String> g1 = new Generic<>();

        g1.Put("Hej");
        g1.Put("På");
        System.out.println(g1.Size());
        System.out.println(g1.Take());
        System.out.println(g1.Take());

        Generic<Integer> g2 = new Generic<>();
        g2.Put(654);
        g2.Put(6654);
        System.out.println(g2.Size());
        System.out.println(g2.Take());
        System.out.println(g2.Take());
        g2.Put(4565656);
        System.out.println(g2.Take());



    }

}
