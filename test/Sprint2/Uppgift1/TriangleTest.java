package Sprint2.Uppgift1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TriangleTest {

    Triangle t1 = new Triangle (2,5);
    @Test
    public void getAreaTest(){
        Assertions.assertEquals(t1.getArea(),5);
        System.out.println(t1.getArea());
        System.out.println(t1.getCircumference());
    }


    @Test
    public void getCircumferenceTest(){
        Assertions.assertEquals(t1.getCircumference(),9);
    }

}
