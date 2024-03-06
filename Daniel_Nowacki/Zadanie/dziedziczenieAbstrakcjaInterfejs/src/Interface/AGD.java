package Interface;

public class AGD extends Electrionic implements  IElectronicInterface{
    private String type,sizeMeters,variantyType;

    public AGD(double batterLife, double weight, double price, String chargerType, String brand, int yearOfProduction, String type, String sizeMeters, String variantyType) {
        super(batterLife, weight, price, chargerType, brand, yearOfProduction);
        this.type = type;
        this.sizeMeters = sizeMeters;
        this.variantyType = variantyType;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSizeMeters() {
        return sizeMeters;
    }

    public void setSizeMeters(String sizeMeters) {
        this.sizeMeters = sizeMeters;
    }

    public String getVariantyType() {
        return variantyType;
    }

    public void setVariantyType(String variantyType) {
        this.variantyType = variantyType;
    }
    /*********************************************************
     * nazwa funkcji: addToPrice
     * parametry wejściowe: newPrice -double*
     * wartość zwracana: price + newPrice - zwraca sume cene i nowa cena + 200
     * autor: Daniel Nowacki
     *****************************************************/
    @Override
    public  double  addToPrice(double newPrice){
        return price + newPrice + 200;
    }
    /*********************************************************
     * nazwa funkcji: saleReturn
     * parametry wejściowe: saleAmount -double*
     * wartość zwracana: price * newPrice * 3 - zwraca iloczyn ceny i przeceny
     * autor: Daniel Nowacki
     *****************************************************/
    @Override
    public  double  saleReturn(double saleAmount){
        return price *saleAmount * 3;
    }
}
