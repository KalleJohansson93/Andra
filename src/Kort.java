public class Kort {

    private int kortfarg;
    private String kortFargen;
    private int value;
    private String valueOf;

    public int getKortfarg() {
        return kortfarg;
    }

    public void setKortfarg(int kortfarg) {
        this.kortfarg = kortfarg;
        if (kortfarg == 0)
            kortFargen = "Spader";
        else if (kortfarg == 1) {
            kortFargen = "Ruter";
        }
        else if (kortfarg == 2) {
            kortFargen = "Klöver";
        }
        else if (kortfarg == 3) {
            kortFargen = "Hjärter";
        }
        else {
            System.out.println("Fel");
        }
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
        if (value == 11)
            valueOf = "Knekt";
        else if (value == 12) {
            valueOf = "Dam";
        }
        else if (value == 13) {
            valueOf = "Kung";
        }
        else if (value == 14) {
            valueOf = "Ess";
        }
        else valueOf = String.valueOf(value);
    }


    @Override
    public String toString() {
        return "Kort = " + kortFargen + " " + valueOf + '}';
    }
}
