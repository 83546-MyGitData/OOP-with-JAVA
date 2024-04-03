package Tester;

import com.app.geometry.Point2D;
import java.util.Scanner;

public class TestPoint {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Accept coordinates of two points from the user
        System.out.println("Enter x and y coordinates of the first point:");
        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();

        System.out.println("Enter x and y coordinates of the second point:");
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();

        // Create two Point2D objects
        Point2D p1 = new Point2D(x1, y1);
        Point2D p2 = new Point2D(x2, y2);

        // Display point details
        System.out.println("Details of the first point (p1): " + p1.getDetails());
        System.out.println("Details of the second point (p2): " + p2.getDetails());

        // Check if points are equal
        if (p1.isEqual(p2)) {
            System.out.println("Both points are located at the same position.");
        } else {
            System.out.println("Points are located at different positions.");
            // Display distance between p1 and p2
            System.out.println("Distance between p1 and p2: " + p1.calculateDistance(p2));
        }

        scanner.close();
    }
}