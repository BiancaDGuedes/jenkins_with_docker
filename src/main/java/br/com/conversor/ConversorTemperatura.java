package br.com.conversor;

public class MainApp {
    public static void main(String[] args) {
        ConversorTemperatura c = new ConversorTemperatura();
        System.out.println("32F em Celsius: " + c.fahrenheitParaCelsius(32.0));
        System.out.println("100C em Fahrenheit: " + c.celsiusParaFahrenheit(100.0));
    }
}

