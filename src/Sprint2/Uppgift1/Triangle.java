package Sprint2.Uppgift1;

public class Triangle implements Figure{

    int height;
    int width;

    public Triangle (int height, int width){
        this.height = height;
        this.width = width;
    }

    public int getArea(){
        return width * height / 2;
    }

    public int getCircumference(){
        return width + height + height;
    }

}
