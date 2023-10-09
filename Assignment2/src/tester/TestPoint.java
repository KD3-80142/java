package tester;

import com.app.geometry.Point2D;
import java.util.Scanner;

public class TestPoint {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input for the first point (p1)
        System.out.print("Enter the x-coordinate for the first point (p1): ");
        double x1 = scanner.nextDouble();
        System.out.print("Enter the y-coordinate for the first point (p1): ");
        double y1 = scanner.nextDouble();
        Point2D p1 = new Point2D(x1, y1);

        // Input for the second point (p2)
        System.out.print("Enter the x-coordinate for the second point (p2): ");
        double x2 = scanner.nextDouble();
        System.out.print("Enter the y-coordinate for the second point (p2): ");
        double y2 = scanner.nextDouble();
        Point2D p2 = new Point2D(x2, y2);

        // Display point details
        System.out.println("Details of p1: " + p1.getDetails());
        System.out.println("Details of p2: " + p2.getDetails());

        // Check if points are equal
        if (p1.isEqual(p2)) {
            System.out.println("p1 and p2 are located at the same position.");
        } else {
            double distance = p1.calculateDistance(p2);
            System.out.println("p1 and p2 are located at different positions.");
            System.out.println("Distance between p1 and p2: " + distance);
        }

        scanner.close();
    }
}
