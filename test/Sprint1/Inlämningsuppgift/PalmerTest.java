package Sprint1.Inlämningsuppgift;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalmerTest {

    Palmer palm = new Palmer(1, "Olof");

    @Test
    void getNamn() {
        String expectedNamn = "Olof";
        String actualNamn = palm.getNamn();
        Assertions.assertEquals(expectedNamn, actualNamn);
    }

    @Test
    void vattna() {
        String expectedString = "Palmen Olof behöver 0.5l vatten per dag";
        String actualString = palm.Vattna();
        Assertions.assertEquals(expectedString, actualString);
    }
}