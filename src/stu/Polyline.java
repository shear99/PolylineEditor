package stu;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.nio.channels.Pipe;
import java.util.ArrayList;

// 폴리라인의 정보를 가지고 있는 클래스
// 마우스 이벤트를 처리하는 MouseAdapter 의 subclass 정의
public class Polyline  extends MouseAdapter {
    private ArrayList<Point> mPts = new ArrayList<Point>();     // 폴리라인을 구성하는 점들을 ArrayList 로 저장
    private boolean mClosed = false;

    public void clear() {
        mPts.clear();
    }

    public boolean isClosed() {
        return mClosed;
    }

    public void setClosed() {
        mClosed = true;
    }

    public int getNumPts() {
        return mPts.size();
    }

    public Point getPoint(int i) {
        return mPts.get(i);
    }

    // Overwrite
    public void mousePressed(MouseEvent e) {
        int x = e.getX();
        int y = e.getY();
        mPts.add(new Point(x, y));
        ((JPanel)e.getSource()).repaint();
    }
}
