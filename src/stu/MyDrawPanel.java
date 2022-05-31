package stu;

import javax.swing.*;
import java.awt.*;

public class MyDrawPanel extends JPanel {
    private Polyline mPolyline;

    public void setmPolyline(Polyline pline) {
        mPolyline = pline;
    }

    public void paintComponent(Graphics g) {
        g.setColor(Color.white);
        g.fillRect(0, 0, this.getWidth(), this.getHeight());

        g.setColor(Color.black);
        Graphics2D g2 = (Graphics2D) g;
        g2.setStroke(new BasicStroke(3));

        int numlines = mPolyline.getNumPts() - 1;
        for (int i = 0; i < numlines; i++) {
            Point p0 = mPolyline.getPoint(i);
            Point p1 = mPolyline.getPoint(i + 1);
            g.drawLine((int) p0.getX(), (int) p0.getY(), (int) p1.getX(), (int) p1.getY());
        }


        g.setColor(Color.RED);
        int numpts = mPolyline.getNumPts();
        for (int i = 0; i < numpts; i++) {
            Point p = mPolyline.getPoint(i);
            g.fillRect((int)p.getX()-5, (int)p.getY()-5, 10, 10);

        }

    }
}
