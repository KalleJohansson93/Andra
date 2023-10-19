package Sprint2.Uppgift9Test;

import Sprint2.Uppgift9.Personuppgifter;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PersonuppgifterTest {


    Personuppgifter p = new Personuppgifter();

    @Test
    public void getLängdTest() {
        String s = "25, 80, 175";
        assertTrue(p.getLängd(s) == 175);
    }

    @Test
    public void ärÖverTvåMeterTest() {
        int a = 200;
        int b = 195;
        int c = 210;
        assertTrue(p.ärÖverTvåMeter(a));
        assertTrue(p.ärÖverTvåMeter(c));
        assertFalse(p.ärÖverTvåMeter(b));
    }


}
