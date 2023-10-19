package Sprint2.Uppgift1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CircleTest {

    Circle c1 = new Circle(8);

    @Test
    public void getAreaTest(){
        Assertions.assertEquals(c1.getArea(), 8*8*3);
    }

    @Test
    public void getCircumferenceTest(){
        Assertions.assertEquals(c1.getCircumference(),(8+8)*3);
        System.out.println(c1.getCircumference());
        System.out.println(c1.getArea());
    }

}
