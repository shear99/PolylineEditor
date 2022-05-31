package stu;

import javax.swing.*;
import java.awt.*;

public class PolylineEditor {
    public static void main(String[] args) {
        PolylineEditor gui = new PolylineEditor();
        gui.go();
    }

    public void go(){
        JFrame frame = new JFrame("Polyline Editor");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        MyDrawPanel drawPanel = new MyDrawPanel();
        Polyline pline = new Polyline();
        drawPanel.setmPolyline(pline);
        drawPanel.addMouseListener(pline);

        frame.getContentPane().add(BorderLayout.CENTER, drawPanel);

        JButton clearButton = new JButton("clear");
        frame.getContentPane().add(BorderLayout.SOUTH, clearButton);
        clearButton.addActionListener((event) -> {
            pline.clear(); drawPanel.repaint();});

        BorderLayout layout = (BorderLayout) frame.getContentPane().getLayout();
        layout.setHgap(10);
        layout.setVgap(10);

        frame.setSize(800, 800);
        frame.setVisible(true);

    }
}
