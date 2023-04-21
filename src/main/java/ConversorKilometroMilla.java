/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Tomas
 */
public class ConversorKilometroMilla extends Conversor{

    private final Double kilometroMilla  = 1.61;    
    private final Double millaKilometro  = 0.62;

    @Override
    public String getName() {
        return "Kilometro / Milla";
    }

    @Override
    public String getLabel1() {
        return "Kilometro";
    }

    @Override
    public String getLabel2() {
        return "Milla";
    }

    @Override
    public Double convertValue2(Double kilometro) {
       return kilometro * kilometroMilla;
    }

    @Override
    public Double convertValue1(Double milla) {
       return milla * millaKilometro;
    }
    
}
