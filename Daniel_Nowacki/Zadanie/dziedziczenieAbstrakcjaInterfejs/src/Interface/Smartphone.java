package Interface;

public class Smartphone  extends Electrionic implements IElectronicInterface{
    private double displaySize,memory,ram;

    public Smartphone(double batterLife, double weight, double price, String chargerType, String brand, int yearOfProduction, double displaySize, double memory, double ram) {
        super(batterLife, weight, price, chargerType, brand, yearOfProduction);
        this.displaySize = displaySize;
        this.memory = memory;
        this.ram = ram;
    }

    public double getDisplaySize() {
        return displaySize;
    }

    public void setDisplaySize(double displaySize) {
        this.displaySize = displaySize;
    }

    public double getMemory() {
        return memory;
    }

    public void setMemory(double memory) {
        this.memory = memory;
    }

    public double getRam() {
        return ram;
    }

    public void setRam(double ram) {
        this.ram = ram;
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
     * parametry wejściowe:
     * wartość zwracana: return sale *2
     * autor: Daniel Nowacki
     *****************************************************/
    @Override
    public  double  saleReturn(double saleAmount){
        return price *saleAmount * 2;
    }



}
