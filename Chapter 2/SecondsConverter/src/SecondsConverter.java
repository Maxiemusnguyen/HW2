import java.util.Scanner;

public class SecondsConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the total number of seconds: ");
        int totalSeconds = scanner.nextInt();

        int hours = totalSeconds / 3600;
        int minutes = (totalSeconds % 3600) / 60;
        int seconds = totalSeconds % 60;

        System.out.println("Total seconds: " + totalSeconds);
        System.out.println("Converted time: " + hours + " hours, " + minutes + " minutes, " + seconds + " seconds");

        scanner.close();
    }
}
