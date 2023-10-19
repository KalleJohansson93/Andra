package Sprint2.Uppgift1;

public class Square implements Figure {
    private int length;
    private int width;

    public Square (int length, int width){
        this.length = length;
        this.width = width;
    }

    public int getArea (){
        return length * width;
    }

    public int getCircumference(){
        return length + length + width +width;
    }

}
