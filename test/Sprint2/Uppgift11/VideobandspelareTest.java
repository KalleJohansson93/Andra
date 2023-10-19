package Sprint2.Uppgift11;

import org.junit.jupiter.api.Test;

import java.time.LocalTime;

import static org.junit.jupiter.api.Assertions.*;

class VideobandspelareTest {

    Videobandspelare x = new Videobandspelare();


    @Test
    public void kvarvarandeTidPåBand(){
        //LocalTime totalaMinuterPåBand = LocalTime.of(2,30);
        //LocalTime användaMinuterPåBand = LocalTime.of(1,0);
        int totalaMinuterPåBand = 150;
        int användaMinuterPåBand = 60;
        assertEquals(x.räknaUtTidKvarPåBand(totalaMinuterPåBand, användaMinuterPåBand), 90);
    }

    @Test
    public void räknaUtTidFörProgram(){
        LocalTime programStart = LocalTime.of(17,30);
        LocalTime programSlut = LocalTime.of(19,00);
        assertEquals(x.räknaUtTidFörProgrammet(programStart, programSlut), "01:00");
    }


}