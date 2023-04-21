/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Tomas
 */
public class ConversorKilogramoLibra extends Conversor {

      private final Double kilogramoLibra = 0.45 ;    
        private final Double libraKilogramo = 2.2;
    
    @Override
    public String getName() {
       return "Kilogramo / Libra";
    }

    @Override
    public String getLabel1() {
        return "Kilogramo";
    }

    @Override
    public String getLabel2() {
        return "Libra";
    }

    @Override
    public Double convertValue2(Double kilogramo) {
      return kilogramo * kilogramoLibra;
    }

    @Override
    public Double convertValue1(Double libra) {
       return libra * libraKilogramo;
    }
    
}
