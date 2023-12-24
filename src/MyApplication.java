import version.Point;//import the "Point" and "Shape" classes from the version package
import version.Shape;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MyApplication {
    public static void main(String[] args) throws FileNotFoundException {
        //Reads coordinate from the file using a "Scanner"
        File file = new File("C:\\Users\\Нургиса\\IdeaProjects\\untitled2\\src\\source.txt");

        Scanner sc = new Scanner(file);
        Shape shape = new Shape();

        while (sc.hasNext()) {
            double x = sc.nextDouble();
            double y = sc.nextDouble();

            // A new Point object is created and the points added to the "Shape" using the addPoint methods
            Point point = new Point(x, y);
            shape.addPoint(point);
        }

        System.out.println("Perimeter " + shape.calculatePerimeter());//print perimeter
        System.out.println("Longest side " + shape.getLongestSide());//print longest side
        System.out.println("Average side " + shape.getAverageSide());//print average side
    }
}