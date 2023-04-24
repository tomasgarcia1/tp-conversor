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
    private static final double CONVERT_FACTOR_1 = 9.0 / 5.0;
    private static final double CONVERT_FACTOR_2 = 5.0 / 9.0;
    private static final double CONVERT_OFFSET = 32.0;

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
    public Double convertValue2(Double celsius) {
        return (celsius * CONVERT_FACTOR_1) + CONVERT_OFFSET;
    }

    @Override
    public Double convertValue1(Double fahrenheit) {
        return (fahrenheit - CONVERT_OFFSET) * CONVERT_FACTOR_2;
    }
}