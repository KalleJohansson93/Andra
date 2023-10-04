package Sprint1.Inlämningsuppgift;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KaktusarTest {

    Kaktusar kaktus = new Kaktusar(0.2, "Igge");

    @Test
    void getNamn() {
        String expectedNamn = "Igge";
        String actualNamn = kaktus.getNamn();
        Assertions.assertEquals(expectedNamn, actualNamn);
    }

    @Test
    void vattna() {
        assert kaktus.Vattna().equals("Kaktusen Igge behöver 2cl mineralvatten per dag");
    }
}