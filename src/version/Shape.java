package version;//Defines the package to which the class belongs

import java.util.ArrayList;

public class Shape {
    private ArrayList<Point> points;
    public Shape(){
        //The constructor initializes the points ArrayList when a new Shape object is created.
        this.points = new ArrayList<>();
    }

    public void addPoint(Point point){
        //The addPoint method allows you to add a Point object to the points ArrayList.
        points.add(point);
    }

    public double calculatePerimeter(){
        //initialize perimeter value that we will use to accumulate perimeter
        double perimeter =0;
        //calculates the perimeter of the shape by iterating through the points and summing the distances between points.
        for(int i=0;i< points.size()-1;i++){
            perimeter +=points.get(i).distance(points.get(i+1));
        }
        //The last point is connected to the first point to complete the shape.
        perimeter += points.get(points.size() - 1).distance(points.get(0));
        return perimeter;
    }

    public double getAverageSide(){
        //for calculating average side, firstly we find sum of all sides
        //firstly initialize the variable that we will use to accumulate the sum of all sides
        double sumOfSides = 0;
        //calculate the sum of side by iterating through the point and summing distance between them, this loop runs from first to penultimate point
        for(int i=0;i< points.size()-1;i++){
            sumOfSides+=points.get(i).distance(points.get(i+1));
        }
        //connecting last and first point
        sumOfSides += points.get(points.size()-1).distance((points.get(0)));

        //after finding total length we just divide it to number of sides and return it
        return sumOfSides/ points.size();
    }

    public double getLongestSide(){
        //This variable will be used to store the length of the longest side
        double longestSide = 0;
        //This loop iterates through the points in the ArrayList, and for each pair of consecutive points,
        // it calculates the length of the side (distance) using the distance method.
        // If the current side is longer than the longestSide found so far,
        // it updates longestSide with the length of the current side.
        for(int i=0;i<points.size()-1;i++){
            double currentSide = points.get(i).distance(points.get(i+1));
            if(currentSide>longestSide){
                longestSide=currentSide;
            }
        }
        return longestSide;
    }
}
