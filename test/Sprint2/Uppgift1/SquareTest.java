package Sprint2.Uppgift1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquareTest {

    Square s1 = new Square (10,5);


    @Test
    public void getAreaTest(){

        Assertions.assertEquals(s1.getArea(),50);

    }

    @Test
    public void getCirumferenceTest(){
        System.out.println(s1.getCircumference());
        System.out.println(s1.getArea());
        Assertions.assertEquals(s1.getCircumference(), 30);

    }


}