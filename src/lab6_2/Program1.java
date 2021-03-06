package src.lab6_2;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class Program1 {
    public static void main(String[] args) throws IOException {
        ArrayList<Point> pointsArray = new ArrayList<>();
        Path file = Paths.get("src/lab6_2/data/output.txt");
        pointsArray.add(new Point(1, 1));
        pointsArray.add(new Point(2, 2));
        pointsArray.add(new Point(1, 4));
        pointsArray.add(new Point(4, 4));
        HashMap<Line, Integer> linePoints = new HashMap<>();
        ArrayList<Line> lines = new ArrayList<>();

        for (int i = 0; i < pointsArray.size(); i++){
            for (int j = i + 1; j < pointsArray.size(); j++){
                float slope;
                slope = getSlope(pointsArray.get(i), pointsArray.get(j));
                Line line = new Line(slope);
                line.addPoint(pointsArray.get(i));
                line.addPoint(pointsArray.get(j));
                for (int z = j + 1; z < pointsArray.size(); z++){
                    slope = getSlope(pointsArray.get(i), pointsArray.get(z));
                    if (Float.compare(line.getSlope(), slope) == 0) {
                        line.addPoint(pointsArray.get(z));
                    }
                }
                lines.add(line);
            }
        }
        lines.sort((o1, o2)->o2.points.size()-o1.points.size());
        for (int i = 0; i < lines.size(); i++){
            for (int j = i + 1; j < lines.size(); j++){
                if (lines.get(i).points.containsAll(lines.get(j).points)){
                    lines.get(j).setDuplicate(true);
                }
            }
        }
        for (Line j: lines) {
            if (!j.getDuplicate()) {
                System.out.println(j);
                linePoints.put(j, j.points.size());
            }
        }

        Files.writeString(file,"");
        for (Map.Entry<Line, Integer> entry : linePoints.entrySet()) {
            Files.writeString(file, entry.getKey().toString() + " number of points: " + entry.getValue() + "\n",
                    StandardOpenOption.APPEND);
        }

    }
    public static float getSlope(Point a, Point b){
        if (b.getX() - a.getX() == 0) {
            return 90;
        }
        else {
            return (b.getY() - a.getY()) / (b.getX() - a.getX());
        }
    }
}
