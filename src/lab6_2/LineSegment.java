package src.lab6_2;

public class LineSegment {
    Point start;
    Point end;

    public LineSegment(Point start, Point end){
        this.start = start;
        this.end = end;
    }

    public Point getStart() {
        return start;
    }

    public Point getEnd() {
        return end;
    }

    public Point FindIntersection(LineSegment b){
        float t = ((this.start.getX() - b.start.getX()) * (b.start.getY() - b.end.getY()) - (this.start.getY() - b.start.getY()) * (b.start.getX() - b.end.getX()))
                / ((this.start.getX()- this.end.getX()) * (b.start.getY() - b.end.getY()) - (this.start.getY() - this.end.getY()) * (b.start.getX() - b.end.getX()));
        float u = ((this.start.getX() - b.start.getX()) * (this.start.getY() - this.end.getY()) - (this.start.getY() - b.start.getY()) * (this.start.getX() - this.end.getX()))
                / ((this.start.getX()- this.end.getX()) * (b.start.getY() - b.end.getY()) - (this.start.getY() - this.end.getY()) * (b.start.getX() - b.end.getX()));

        if ((t >= 0 && t <= 1.0) && (u >= 0 && u <= 1.0)) {
            return new Point((this.start.getX() + t * (this.end.getX() - this.start.getX())), (this.start.getY() + t * (this.end.getY() - this.start.getY())));
        }

        return null;

    }
}
