import version.Point;
import version.Shape;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MyApplication {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("C:\\Users\\Нургиса\\IdeaProjects\\untitled2\\src\\source.txt");

        Scanner sc = new Scanner(file);
        Shape shape = new Shape();

        while (sc.hasNext()) {
            double x = sc.nextDouble();
            double y = sc.nextDouble();

            Point point = new Point(x, y);
            shape.addPoint(point);
        }

        System.out.println("Perimeter " + shape.calculatePerimeter());
        System.out.println("Longest side " + shape.getLongestSide());
        System.out.println("Average side " + shape.getAverageSide());
    }
}