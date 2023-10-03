public class Elevator {
    //Klass som skapar hissar, returnerar våning och förflyttar hissarna mellan våning -2 till 10
    private int level;

    public Elevator(int newLevel) {
        if (newLevel < -2 || newLevel > 10) {
            throw new IllegalArgumentException("Felaktig våning. Välj våning mellan -2 till 10");
        } else {
            this.level = newLevel;
        }
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    //Instansmetod som flyttar hissen mellan våningarna -2 till 10
    public void goTo(int newlevel) {
        if (newlevel < -2 || newlevel > 10) {
            System.out.println("Felaktig våning. Välj våning mellan -2 till 10. Hissen står kvar på våning " + level);
        } else if (level < newlevel) {
            System.out.println("Hissen åker upp till våning " + newlevel);
            this.level = newlevel;
        } else if (level > newlevel) {
            System.out.println("Hissen åken ner till våning " + newlevel);
            this.level = newlevel;
        } else if (newlevel == level) {
            System.out.println("Hissen står redan på våning " + newlevel);
        }
    }

    public int where() {
        return level;
    }
}