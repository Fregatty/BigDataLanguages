package src.lab6_2;

import java.util.ArrayList;

public class Line {
    float slope;
    ArrayList<Point> points;
    boolean duplicate = false;

    public Line(float slope) {
        this.slope = slope;
        this.points = new ArrayList<>();
    }

    public void addPoint(Point point) {
        this.points.add(point);
    }

    public float getSlope() {
        return slope;
    }

    public boolean getDuplicate() {
        return duplicate;
    }
    public void setDuplicate(boolean duplicate) {
        this.duplicate = duplicate;
    }
}
