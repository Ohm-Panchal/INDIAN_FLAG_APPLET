//<applet code="Animate.java" height="400" width="400"></applet>

import java.applet.*;
import java.awt.*;
import java.sql.Time;

public class Animate extends Applet{
    public void paint(Graphics g){
        // MAIN RECTANGLE
        g.drawLine(100, 100, 250, 100);
        g.drawLine(100, 100, 100, 200);
        g.drawLine(100, 200, 250, 200);
        g.drawLine(250, 200, 250, 100);

        // PARTITIONS
        g.drawLine(100, 133, 250, 133);
        g.drawLine(100, 166, 250, 166);

        //ASHOKA CHAKRA
        g.drawOval(160, 133, 33, 33);
        g.setColor(Color.blue);
        int x1 = 177;
        int y1 = 133;
        int x2 = 177;
        int y2 = 166;
        for(int i=0; i<=5; i++){
            g.drawLine(x1, y1, x2, y2);
            x1-=3;
            y1+=3;
            x2+=3;
            y2-=3;
            try{
                Thread.sleep(100);
            }
            catch(Exception e){
                System.out.println(e.getMessage());
            }
        }
        for(int i=0; i<=5; i++){
            g.drawLine(x1, y1, x2, y2);
            x1+=3;
            y1+=3;
            x2-=3;
            y2-=3;
            try{
                Thread.sleep(100);
            }
            catch(Exception e){
                System.out.println(e.getMessage());
            }
        }

        //ORANGE PARTITION
        g.setColor(Color.ORANGE);
        int up = 100;
        int down = 100;
        for(int k=0; k<=150; k++){
            g.drawLine(up, 100, down, 133);
            up++;
            down++;
            try{
                Thread.sleep(10);
            }
            catch(Exception e){
                System.out.println(e.getMessage());
            }
        }

        //GREEN PARTIOTION
        g.setColor(Color.green);
        int up1 = 100;
        int down2 = 100;
        for(int l=0; l<=150; l++){
            g.drawLine(up1, 166, down2, 200);
            up1++;
            down2++;
            try{
                Thread.sleep(10);
            }
            catch(Exception e){
                System.out.println(e.getMessage());
            }
        }
    }
}