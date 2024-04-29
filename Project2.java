import java.util.Scanner;

public class Project2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter temperature value: ");
        double temperature = scanner.nextDouble();

        System.out.print("Enter original unit of measurement (Celsius/C, Fahrenheit/F, Kelvin/K): ");
        String originalUnit = scanner.next().toUpperCase();

        double celsius = 0, fahrenheit = 0, kelvin = 0;

        switch (originalUnit) {
            case "C":
            case "CELSIUS":
                celsius = temperature;
                fahrenheit = celsiusToFahrenheit(celsius);
                kelvin = celsiusToKelvin(celsius);
                break;
            case "F":
            case "FAHRENHEIT":
                fahrenheit = temperature;
                celsius = fahrenheitToCelsius(fahrenheit);
                kelvin = celsiusToKelvin(celsius);
                break;
            case "K":
            case "KELVIN":
                kelvin = temperature;
                celsius = kelvinToCelsius(kelvin);
                fahrenheit = celsiusToFahrenheit(celsius);
                break;
            default:
                System.out.println("Invalid unit of measurement.");
                
        }

        System.out.println("Temperature in Celsius: " + celsius);
        System.out.println("Temperature in Fahrenheit: " + fahrenheit);
        System.out.println("Temperature in Kelvin: " + kelvin);

        scanner.close();
    }

    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public static double celsiusToKelvin(double celsius) {
        return celsius + 273.15;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    public static double kelvinToCelsius(double kelvin) {
        return kelvin - 273.15;
    }
}
