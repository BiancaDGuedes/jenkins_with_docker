package br.com.conversor;

public class ConversorTemperatura {
    public double fahrenheitParaCelsius(double f) { return (f - 32) * 5.0 / 9.0; }
    public double celsiusParaFahrenheit(double c) { return (c * 9.0 / 5.0) + 32; }
}