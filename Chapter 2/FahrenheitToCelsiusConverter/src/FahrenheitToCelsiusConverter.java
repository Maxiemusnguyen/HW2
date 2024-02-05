public class FahrenheitToCelsiusConverter {
    public static void main(String[] args) {
        double fahrenheit = 100.0;

        double celsius = (fahrenheit - 32) * 5/9;

        System.out.println("Temperature in Fahrenheit: " + fahrenheit);
        System.out.println("Temperature in Celsius: " + celsius);
    }
}
