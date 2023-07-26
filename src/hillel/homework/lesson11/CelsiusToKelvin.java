package hillel.homework.lesson11;

public class CelsiusToKelvin extends Converter {
    private final double TO = 273.15;

    @Override
    public double convertFromCelsius(double celsius) {
        return celsius + TO;
    }

    @Override
    public double convertToCelsius(double kelvin) {
        return kelvin - TO;
    }
}
