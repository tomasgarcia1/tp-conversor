/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Serena
 */
public class ConversorCelsiusFahrenheit extends Conversor {

    private static final String NAME = "Celsius / Fahrenheit";
    private static final String LABEL_1 = "Celsius";
    private static final String LABEL_2 = "Fahrenheit";
    private static final double CONVERT = 32.0;

    @Override
    public String getName() {
        return NAME;
    }

    @Override
    public String getLabel1() {
        return LABEL_1;
    }

    @Override
    public String getLabel2() {
        return LABEL_2;
    }

    @Override
    public Double convertValue1(Double celsius) {
        return (celsius * 9 / 5) + CONVERT;
    }

    @Override
    public Double convertValue2(Double fahrenheit) {
        return (fahrenheit - CONVERT) * 5 / 9;
    }
}
