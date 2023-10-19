package Sprint2.Uppgift6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class VäxelTest {

    Växel växel = new Växel();

    @Test
    public void calulateVäxel(){
        int pris = 79;
        int betalning = 100;
        assertTrue(växel.calculateVäxel(pris,betalning) == 21);
    }

/*    @Test
    public void getAntalAvHögstaValörTest(){
        int nuvarandeVäxel = 21;
        int valör = 10;
        assertTrue(växel.getAntalAvHögstaValör(nuvarandeVäxel,valör) == 2);
    }

    @Test
    public void taBortHögstaValörTest(){
        int nuvarandeVäxel = 21;
        int valör = 10;
        assertTrue(växel.taBortHögstaValören(nuvarandeVäxel,valör,3) == 3);
    }*/




}
