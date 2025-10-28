import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TemperatureConverterTest {
    private static final double EPS = 1e-6;

    @Test
    void testCelsiusToFahrenheit() {
        TemperatureConverter t = new TemperatureConverter();
        assertEquals(32.0, t.celsiusToFahrenheit(0.0), EPS);       // 0°C -> 32°F
        assertEquals(212.0, t.celsiusToFahrenheit(100.0), EPS);    // 100°C -> 212°F
        assertEquals(14.0, t.celsiusToFahrenheit(-10.0), EPS);     // -10°C -> 14°F
    }

    @Test
    void testFahrenheitToCelsius() {
        TemperatureConverter t = new TemperatureConverter();
        assertEquals(0.0, t.fahrenheitToCelsius(32.0), EPS);       // 32°F -> 0°C
        assertEquals(100.0, t.fahrenheitToCelsius(212.0), EPS);    // 212°F -> 100°C
        assertEquals(-10.0, t.fahrenheitToCelsius(14.0), EPS);     // 14°F -> -10°C
    }

    @Test
    void testCelsiusToKelvin() {
        TemperatureConverter t = new TemperatureConverter();
        assertEquals(273.15, t.celsiusToKelvin(0.0), EPS);         // 0°C -> 273.15 K
        assertEquals(373.15, t.celsiusToKelvin(100.0), EPS);       // 100°C -> 373.15 K
        assertEquals(0.0, t.celsiusToKelvin(-273.15), EPS);        // -273.15°C -> 0 K
    }
}
