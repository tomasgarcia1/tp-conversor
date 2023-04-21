/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Serena
 */
public class ConversorCelsiusFahrenheit extends Conversor {

    @Override
    public String getName() {
        return "Celsius / Fahrenheit";
    }

    @Override
    public String getLabel1() {
        return "Celsius";
    }

    @Override
    public String getLabel2() {
        return "Fahrenheit";
    }

    @Override
    public Double convertValue2(Double celsius) {
        return (celsius - 32) * 5 / 9;
    }

    @Override
    public Double convertValue1(Double fahrenheit) {
        return (fahrenheit * 9 / 5) + 32;
    }
}