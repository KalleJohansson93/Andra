package Sprint2.Uppgift1;

public class Circle {

    int radie;

    public Circle (int radie){
        this.radie = radie;
    }

    public int getArea(){
        return radie*radie*3;
    }

    public int getCircumference(){
        return (radie + radie) * 3;
    }
}
