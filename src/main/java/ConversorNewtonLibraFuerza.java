/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author fiore
 */
public class ConversorNewtonLibraFuerza extends Conversor  {
    
    private final Double NEWTON_TO_LIBRA = 0.224809;


    @Override
    public String getName() {
        return "Newton / Libra Fuerza";
    }

    @Override
    public String getLabel1() {
        return "Newton";
    }

    @Override
    public String getLabel2() {
        return "Libra Fuerza";
    }

    @Override
    public Double convertValue2(Double libraFuerza) {
        return libraFuerza / NEWTON_TO_LIBRA;
    }

    @Override
    public Double convertValue1(Double newton) {
        return newton * NEWTON_TO_LIBRA;
    }
    
}
