package Interface;

public class SmartWatch extends Electrionic implements IElectronicInterface{
    public int size,time;

    public SmartWatch(double batterLife, double weight, double price, String chargerType, String brand, int yearOfProduction, int size, int time) {
        super(batterLife, weight, price, chargerType, brand, yearOfProduction);
        this.size = size;
        this.time = time;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
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
