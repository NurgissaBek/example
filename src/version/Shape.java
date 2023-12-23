package version;

import java.util.ArrayList;

public class Shape {
    private ArrayList<Point> points;
    public Shape(){
        this.points = new ArrayList<>();
    }

    public void addPoint(Point point){
        points.add(point);
    }

    public double calculatePerimeter(){
        double perimeter =0;
        for(int i=0;i< points.size()-1;i++){
            perimeter +=points.get(i).distance(points.get(i+1));
        }
        perimeter += points.get(points.size() - 1).distance(points.get(0));
        return perimeter;
    }

    public double getAverageSide(){
        double sumOfSides = 0;
        for(int i=0;i< points.size()-1;i++){
            sumOfSides+=points.get(i).distance(points.get(i+1));
        }
        sumOfSides += points.get(points.size()-1).distance((points.get(0)));

        return sumOfSides/ points.size();
    }

    public double getLongestSide(){
        double longestSide = 0;
        for(int i=0;i<points.size()-1;i++){
            double currentSide = points.get(i).distance(points.get(i+1));
            if(currentSide>longestSide){
                longestSide=currentSide;
            }
        }
        return longestSide;
    }
}
