package Sprint2.Uppgift2;

import Sprint2.Uppgit2.Bil;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BilTest {

    Bil b1 = new Bil(12000,13000,500);

    @Test
    public void getFörbrukningTest(){
        Assertions.assertEquals(b1.getFörbrukning(), 0.5);
        System.out.println(b1.getFörbrukning());
    }

    @Test
    public void getMilesSinceLastYearTest(){
        Assertions.assertEquals(b1.getMilesSinceLastYear(), 1000);
    }

    @Test
    public void utskriftTest(){
        System.out.println(b1.utskrift());
        Assertions.assertEquals(b1.utskrift(), "Antal körda mil: 1000.0\n" +
                "Antal liter bensin: 500.0\n" +
                "Förbrukning per mil: 0.5");
    }


}
