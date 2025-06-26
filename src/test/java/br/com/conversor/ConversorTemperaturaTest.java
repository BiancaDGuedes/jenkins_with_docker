package br.com.conversor;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ConversorTemperaturaTest {
    private ConversorTemperatura c = new ConversorTemperatura();

    @Test
    void testFahrenheitParaCelsius() {
        assertEquals(0.0, c.fahrenheitParaCelsius(32.0));
    }
    
    @Test
    void testCelsiusParaFahrenheit() {
        assertEquals(212.0, c.celsiusParaFahrenheit(100.0));
    }
}
