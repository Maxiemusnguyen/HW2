public class LaborDayDate {
    public static void main(String[] args) {
        String day, month;
        int date, year;

        day = "Monday";
        date = 2;
        month = "September";
        year = 2019;

        System.out.println("Day of the week: " + day);
        System.out.println("Day of the month: " + date);
        System.out.println("Month: " + month);
        System.out.println("Year: " + year);

        System.out.println("American format: " + day + ", " + month + " " + date + ", " + year);

        System.out.println("European format: " + day + " " + date + " " + month + " " + year);
    }
}
