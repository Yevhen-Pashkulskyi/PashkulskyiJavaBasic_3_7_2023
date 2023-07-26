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
        System.out.println("Enter temperature to celsius:");

        double celsius = scanner.nextDouble();

        double fahrenheit = celsiusToFahrenheit.convertFromCelsius(celsius);
        System.out.println("Celsius to fahrenheit result:\t" + fahrenheit);
        double fahrenheitToCelsius = celsiusToFahrenheit.convertToCelsius(fahrenheit);
        System.out.println("Fahrenheit to celsius result:\t" + fahrenheitToCelsius);

        double kelvin = celsiusToKelvin.convertFromCelsius(celsius);
        System.out.println("Celsius to kelvin result:\t" + kelvin);
        double kelvinToCelsius = celsiusToKelvin.convertToCelsius(kelvin);
        System.out.println("Kelvin to celsius result:\t" + kelvinToCelsius);

    }
}
