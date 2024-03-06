package Interface;

public class Smartfridge extends Electrionic implements IElectronicInterface{
    private String frigetype;
    private int minimumTemperature,maximumTemperature;
    private boolean hasFreezerl;


    public Smartfridge(double batterLife, double weight, double price, String chargerType, String brand, int yearOfProduction, String frigetype, int minimumTemperature, int maximumTemperature, boolean hasFreezerl) {
        super(batterLife, weight, price, chargerType, brand, yearOfProduction);
        this.frigetype = frigetype;
        this.minimumTemperature = minimumTemperature;
        this.maximumTemperature = maximumTemperature;
        this.hasFreezerl = hasFreezerl;
    }

    public String getFrigetype() {
        return frigetype;
    }

    public void setFrigetype(String frigetype) {
        this.frigetype = frigetype;
    }

    public int getMinimumTemperature() {
        return minimumTemperature;
    }

    public void setMinimumTemperature(int minimumTemperature) {
        this.minimumTemperature = minimumTemperature;
    }

    public int getMaximumTemperature() {
        return maximumTemperature;
    }

    public void setMaximumTemperature(int maximumTemperature) {
        this.maximumTemperature = maximumTemperature;
    }

    public boolean isHasFreezerl() {
        return hasFreezerl;
    }

    public void setHasFreezerl(boolean hasFreezerl) {
        this.hasFreezerl = hasFreezerl;
    }

    /*********************************************************
     * nazwa funkcji: addToPrice
     * parametry wejściowe: newPrice -double*
     * wartość zwracana: price + newPrice - zwraca sume cene i nowa cena + 100
     * autor: Daniel Nowacki
     *****************************************************/
    @Override
    public  double  addToPrice(double newPrice){
        return price + newPrice + 100;
    }
    /*********************************************************
     * nazwa funkcji: saleReturn
     * parametry wejściowe: saleAmount -double*
     * wartość zwracana: price * newPrice * 2 - zwraca iloczyn ceny i przeceny
     * autor: Daniel Nowacki
     *****************************************************/
    @Override
    public  double  saleReturn(double saleAmount){
        return price *saleAmount * 2;
    }

}
