package Sprint1.Fordon;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main implements Serializable {

    Bil b1 = new Bil(6,3, 246, 2456);
    Båt båt1 = new Båt(3000, 342, 234);
    Tåg t1 = new Tåg(8, 21, 324);
    Cykel c1 = new Cykel(21, 4, 342153, 341545);

    ArrayList<Fordon> fordons = new ArrayList<>(Arrays.asList(b1,båt1,c1,t1));



    public Main(){/*
        try {ObjectOutputStream out= new ObjectOutputStream(new FileOutputStream("f.ser"));
            out.writeObject(fordons);
            out.flush();
        } catch (Exception e) {
            e.printStackTrace();
        }*/


        try { ObjectInputStream in= new ObjectInputStream(new FileInputStream("f.ser"));
            ArrayList nybillista = (ArrayList)in.readObject();
            System.out.println("Serielaserad" + nybillista);
        } catch (Exception e) {
            e.printStackTrace();
        }


    }

    public static void main(String[] args) {
        Main m = new Main();
        //System.out.println(m.b1);




    }
}
