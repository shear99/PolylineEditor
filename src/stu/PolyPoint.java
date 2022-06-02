package stu;

public class PolyPoint {
    private double posX, posY;
    private boolean moveAble = true;
    private boolean edgePoint = false;

    public PolyPoint(double x, double y) {
        posX = x;
        posY = y;
    }

    public double getX() {
        return posX;
    }
    public double getY() {
        return posY;
    }

    public void setX(double x) {
        posX = x;
    }
    public void setY(double y) {
        posY = y;
    }

    public boolean getMoveAble() {
        return moveAble;
    }
    public void setMoveAble(boolean m) {
        moveAble = m;
    }

    public boolean getEgdePoint(){ return edgePoint;}
    public void setEdgePoint(boolean e) {edgePoint = e;}

}
