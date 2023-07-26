package hillel.homework.lesson11.demonstration;

import hillel.homework.lesson11.CelsiusToFahrenheit;
import hillel.homework.lesson11.CelsiusToKelvin;
import hillel.homework.lesson11.Converter;

import java.util.Scanner;

public class DemonstrationConverter {
    public static void main(String[] args) {
        Converter celsiusToKelvin = new CelsiusToKelvin();
        Converter celsiusToFahrenheit = new CelsiusToFahrenheit();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter temperature to celsius, separated by comma :");

        double celsius = scanner.nextDouble();

        double fahrenheit = celsiusToFahrenheit.convertFromCelsius(celsius);
        System.out.printf("Celsius to fahrenheit result:\t %.2f %n", fahrenheit);
        double fahrenheitToCelsius = celsiusToFahrenheit.convertToCelsius(fahrenheit);
        System.out.printf("Fahrenheit to celsius result:\t %.2f %n", fahrenheitToCelsius);

        double kelvin = celsiusToKelvin.convertFromCelsius(celsius);
        System.out.printf("Celsius to kelvin result:\t %.2f %n", kelvin);
        double kelvinToCelsius = celsiusToKelvin.convertToCelsius(kelvin);
        System.out.printf("Kelvin to celsius result:\t %.2f %n", kelvinToCelsius);
    }
}
