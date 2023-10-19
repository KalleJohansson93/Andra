package Sprint2.Uppgift11;

import java.time.LocalTime;

public class Videobandspelare {

    public int räknaUtTidKvarPåBand (int totalTid, int användTid){
        return totalTid - användTid;
    }

    public LocalTime räknaUtTidFörProgrammet(LocalTime a, LocalTime b){
        System.out.println(a.getMinute());
        return b.minusMinutes(a.getMinute());
    }


    public Videobandspelare(){




    }


    public static void main(String[] args) {
        Videobandspelare v = new Videobandspelare();
    }
}
