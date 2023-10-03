package Sprint1.Enumövningar;

public enum Romersksiffra {
    I(1),
    V(5),
    X(10),
    L(50),
    C(100),
    D(500),
    M(1000);

    public final int konverter;

    Romersksiffra (int c){
        konverter = c;
    }


}
