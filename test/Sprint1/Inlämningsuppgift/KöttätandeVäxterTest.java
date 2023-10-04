package Sprint1.Inlämningsuppgift;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KöttätandeVäxterTest {

    KöttätandeVäxter köttätandeVäxter = new KöttätandeVäxter(0.7, "Meatloaf");

    @Test
    void getNamn() {
        assert (köttätandeVäxter.getNamn().equals("Meatloaf"));
    }

    @Test
    void vattna() {
        assert (köttätandeVäxter.Vattna().equals("Köttätande växten Meatloaf behöver 0.24l proteindryck per dag"));
    }
}