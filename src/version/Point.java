package version;//Defines the package to which the class belongs

public class Point {
    //These variables represent the x and y coordinates of the point.
    private double x;
    private double y;

    public Point(double x, double y){
        //The constructor initializes a Point object with the provided x and y coordinates.
        this.x=x;
        this.y=y;
    }

    public double distance(Point destination){
        //calculate distance between the current point and a specified destination point using mathematical formula
        return Math.sqrt(Math.pow(destination.x - this.x, 2) + Math.pow(destination.y - this.y, 2));
    }
}
