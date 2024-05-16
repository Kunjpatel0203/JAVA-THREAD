import java.awt.*;
import java.awt.event.*;

public class Moving_Banner extends Frame implements Runnable {
   int x=300, y=200, flag=1;

    Moving_Banner() {
        setSize(500, 500);
        setVisible(true);
        setLayout(new FlowLayout());
     }

    public void run() {
        while (true) {
            repaint();
            try {
                Thread.sleep(1000);
            } catch (Exception e) {

            }
        }

    }

    public void paint(Graphics g) {
        x = x + 10 * flag;
        if (x > 500) {
            flag = -1;
			
        }
        if (x < 20) {
           flag = 1;
		   
        }
		g.drawString("Fatema Vhora", x,y);
	
    }

    public static void main(String[] args) {
        Moving_Banner f = new Moving_Banner();
        Thread t = new Thread(f);
        t.start();

    }

}