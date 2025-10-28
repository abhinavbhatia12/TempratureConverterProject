public class TemperatureConverter {
    // F = (C × 9/5) + 32
    public double celsiusToFahrenheit(double celsius) {
        return (celsius * 9.0 / 5.0) + 32.0;
    }
    // C = (F − 32) × 5/9
    public double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32.0) * 5.0 / 9.0;
    }
    // K = C + 273.15
    public double celsiusToKelvin(double celsius) {
        return celsius + 273.15;
    }
}
