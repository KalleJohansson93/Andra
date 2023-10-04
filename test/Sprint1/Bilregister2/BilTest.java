package Sprint1.Bilregister2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BilTest {

    Bil bil = new Bil(6, 3, 2000, 50);
    @Test
    void växla() {
        int expectedVäxel = 4;
        int actualVäxel = bil.växla(4);
        Assertions.assertEquals(expectedVäxel, actualVäxel);
    }
}