package hillel.homework.lesson11;

public class CelsiusToKelvin extends Converter {
    private final double T_ZERO = 273.15;

    @Override
    public double convertFromCelsius(double celsius) {
        return celsius + T_ZERO;
    }

    @Override
    public double convertToCelsius(double kelvin) {
        return kelvin - T_ZERO;
    }
}
