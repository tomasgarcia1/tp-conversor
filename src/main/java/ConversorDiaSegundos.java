/**
 *
 * @author jantonuccio
 */
public class ConversorDiaSegundos extends Conversor {    
    private final int SECONDS_IN_ONE_DAY = 86400;

    @Override
    public String getName() {
        return this.getLabel1() +  " / " + this.getLabel2();
    }

    @Override
    public String getLabel1() {
        return "Día";
    }

    @Override
    public String getLabel2() {
        return "Segundos";
    }

    @Override
    public Double convertValue1(Double dias) {
        return dias * SECONDS_IN_ONE_DAY;
    }

    @Override
    public Double convertValue2(Double segundos) {
        return segundos / SECONDS_IN_ONE_DAY;
    }  
}
