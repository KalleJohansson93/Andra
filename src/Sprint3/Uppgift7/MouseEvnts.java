package Sprint3.Uppgift7;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MouseEvnts extends JFrame{

    JPanel p = new JPanel();
    JButton b = new JButton();
    //b.addM
    MouseAdapter m = new MouseAdapter() {
        @Override
        public void mouseClicked(MouseEvent e) {
            super.mouseClicked(e);
        }
    };

    @Override
    public synchronized void addMouseListener(MouseListener l) {
        super.addMouseListener(l);
    }

    public MouseEvnts(){
        add(p);
        p.add(b);
        b.setSize(400,400);





        setSize(500,500);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }


    public static void main(String[] args) {
        MouseEvnts m = new MouseEvnts();
    }
}
