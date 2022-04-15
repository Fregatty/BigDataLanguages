package src.lab6_2;

import java.util.TreeMap;

public class Program {
    public static void main(String[] args) {

        LineSegment a = new LineSegment(
                new Point(1, 1), new Point(3, 2)
        );
        LineSegment b = new LineSegment(
                new Point(1,2), new Point(3,1)
        );
        LineSegment c = new LineSegment(
                new Point(4, 1), new Point(5, 3)
        );
        LineSegment d = new LineSegment(
                new Point(4,5), new Point(5,1)
        );
        TreeMap<Float, Float> tree = new TreeMap<>();
        AddToTree(tree, a.FindIntersection(b));
        AddToTree(tree, c.FindIntersection(d));
        AddToTree(tree, a.FindIntersection(d));
        AddToTree(tree, b.FindIntersection(c));
        System.out.println(tree);
        System.out.println("X: " + tree.firstEntry().getKey() + " Y: " + tree.firstEntry().getValue());
    }

    public static void AddToTree(TreeMap<Float, Float> tree, Point p){
        if (p != null) tree.put(p.getX(), p.getY());
    }
}
