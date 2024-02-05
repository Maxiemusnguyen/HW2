public class Time {
    public static void main(String[] args) {
        int hour, minute, second;

        hour = 17;
        minute = 15;
        second = 30;

        int secondsSinceMidnight = hour * 3600 + minute * 60 + second;
        System.out.println("Seconds since midnight: " + secondsSinceMidnight);

        int secondsInADay = 24 * 3600;
        int secondsRemaining = secondsInADay - secondsSinceMidnight;
        System.out.println("Seconds remaining in the day: " + secondsRemaining);

        double percentagePassed = (double) secondsSinceMidnight / secondsInADay * 100;
        System.out.println("Percentage of the day passed: " + percentagePassed + "%");
    }
}
