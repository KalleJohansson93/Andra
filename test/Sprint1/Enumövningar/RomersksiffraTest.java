package Sprint1.Enumövningar;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RomersksiffraTest {

    @Test
    void values() {
        int result = Romersksiffra.I.konverter;
        assertEquals(1, result);
    }

    @Test
    void valueOf() {
    }
}