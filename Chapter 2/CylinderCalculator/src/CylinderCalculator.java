import java.util.Scanner;

public class CylinderCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the radius of the base circle (in meters): ");
        double radius = scanner.nextDouble();

        System.out.print("Enter the length of the cylinder (in meters): ");
        double length = scanner.nextDouble();

        double baseArea = Math.PI * Math.pow(radius, 2);

        double volume = baseArea * length;

        System.out.println("Base Area of the Cylinder: " + baseArea + " square meters");
        System.out.println("Volume of the Cylinder: " + volume + " cubic meters");

        scanner.close();
    }
}
