import java.util.Scanner;

public class ReverseDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number between 0 and 999: ");
        int number = scanner.nextInt();

        if (number < 0 || number >= 1000) {
            System.out.println("Invalid input. Please enter a number between 0 and 999.");
        } else {
            int ones = number % 10;
            int tens = (number / 10) % 10;
            int hundreds = (number / 100) % 10;

            System.out.printf("Reverse order of digits: %d%d%d%n", ones, tens, hundreds);
        }

        scanner.close();
    }
}
