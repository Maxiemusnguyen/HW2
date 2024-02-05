import java.util.Scanner;

public class PaintCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the length of the room (in feet): ");
        double length = scanner.nextDouble();

        System.out.print("Enter the width of the room (in feet): ");
        double width = scanner.nextDouble();

        System.out.print("Enter the height of the room (in feet): ");
        double height = scanner.nextDouble();

        System.out.print("Enter the number of windows: ");
        int numWindows = scanner.nextInt();

        System.out.print("Enter the number of doors: ");
        int numDoors = scanner.nextInt();

        double ceilingSquareFootage = length * width;
        double wallSquareFootage = 2 * (length + width) * height;
        double totalSquareFootage = ceilingSquareFootage + wallSquareFootage;

        double windowSquareFootage = numWindows * 15;
        double doorSquareFootage = numDoors * 21;

        double paintableSquareFootage = totalSquareFootage - windowSquareFootage - doorSquareFootage;

        int gallonsNeeded = (int) Math.ceil(paintableSquareFootage / 350);
        double quartsNeeded = (paintableSquareFootage % 350) / 350.0 * 4; // 1 gallon = 4 quarts

        System.out.println("Gallons of paint needed: " + gallonsNeeded);
        System.out.println("Quarts of paint needed: " + quartsNeeded);

        scanner.close();
    }
}
