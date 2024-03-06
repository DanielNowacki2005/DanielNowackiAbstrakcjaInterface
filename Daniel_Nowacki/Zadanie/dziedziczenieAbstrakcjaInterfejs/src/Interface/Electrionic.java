package Interface;
public class Electrionic implements IElectronicInterface{

    protected double batterLife,weight,price ;
    protected String chargerType ,brand;
    protected int yearOfProduction;

    public Electrionic(double batterLife, double weight, double price, String chargerType, String brand, int yearOfProduction) {
        this.batterLife = batterLife;
        this.weight = weight;
        this.price = price;
        this.chargerType = chargerType;
        this.brand = brand;
        this.yearOfProduction = yearOfProduction;
    }

    public double getBatterLife() {
        return batterLife;
    }

    public void setBatterLife(double batterLife) {
        this.batterLife = batterLife;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getChargerType() {
        return chargerType;
    }

    public void setChargerType(String chargerType) {
        this.chargerType = chargerType;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    public void setYearOfProduction(int yearOfProduction) {
        this.yearOfProduction = yearOfProduction;
    }

    /*********************************************************
     * nazwa funkcji: addToPrice
     * parametry wejściowe: newPrice -double*
     * wartość zwracana: price + newPrice - zwraca sume cene i nowa cena
     * autor: Daniel Nowacki
     *****************************************************/
    @Override
    public  double  addToPrice(double newPrice){
        return price + newPrice;
    }
    /*********************************************************
     * nazwa funkcji: saleReturn
     * parametry wejściowe: saleAmount -double*
     * wartość zwracana: price + newPrice - zwraca iloczyn ceny i przeceny
     * autor: Daniel Nowacki
     *****************************************************/
    @Override
    public  double  saleReturn(double saleAmount){
        return price *saleAmount;
    }
    /*********************************************************
     * nazwa funkcji: sayHello
     * parametry wejściowe: none
     * wartość zwracana: none says hello in cmd
     * autor: Daniel Nowacki
     *****************************************************/
    public void sayHello(){
        System.out.println("hello");
    }


}
