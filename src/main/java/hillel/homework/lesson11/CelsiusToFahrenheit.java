package hillel.homework.lesson11;

public class CelsiusToFahrenheit extends Converter {
    private final double COEFFICIENT_CONSTANT = 1.8;
    private final double FAHRENHEIT_CONSTANT = 32;

    @Override
    public double convertFromCelsius(double celsius) {
        return celsius * COEFFICIENT_CONSTANT + FAHRENHEIT_CONSTANT;
    }

    @Override
    public double convertToCelsius(double fahrenheit) {
        return (fahrenheit - FAHRENHEIT_CONSTANT) / COEFFICIENT_CONSTANT;
    }

}
