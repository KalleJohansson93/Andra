package Sprint1.Inlämningsuppgift;

public abstract class Växter implements Vattna {


    protected double höjd;
    protected String namn;
    protected final String behöver = " behöver ";

    abstract public String getNamn(); //Del av polymorfism som fortsätter ner tilll underklasserna
}
