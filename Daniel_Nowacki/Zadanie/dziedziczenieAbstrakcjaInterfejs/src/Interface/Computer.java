package Interface;

public class Computer extends Electrionic implements IElectronicInterface{
    private int ramAmountGb,cpuHz,cpuCoreAmount,gpuMemoryAmountGB;

    public Computer(double batterLife, double weight, double price, String chargerType, String brand, int yearOfProduction, int ramAmountGb, int cpuHz, int cpuCoreAmount, int gpuMemoryAmountGB) {
        super(batterLife, weight, price, chargerType, brand, yearOfProduction);
        this.ramAmountGb = ramAmountGb;
        this.cpuHz = cpuHz;
        this.cpuCoreAmount = cpuCoreAmount;
        this.gpuMemoryAmountGB = gpuMemoryAmountGB;
    }

    public int getRamAmountGb() {
        return ramAmountGb;
    }

    public void setRamAmountGb(int ramAmountGb) {
        this.ramAmountGb = ramAmountGb;
    }

    public int getCpuHz() {
        return cpuHz;
    }

    public void setCpuHz(int cpuHz) {
        this.cpuHz = cpuHz;
    }

    public int getCpuCoreAmount() {
        return cpuCoreAmount;
    }

    public void setCpuCoreAmount(int cpuCoreAmount) {
        this.cpuCoreAmount = cpuCoreAmount;
    }

    public int getGpuMemoryAmountGB() {
        return gpuMemoryAmountGB;
    }

    public void setGpuMemoryAmountGB(int gpuMemoryAmountGB) {
        this.gpuMemoryAmountGB = gpuMemoryAmountGB;
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
    /*********************************************************
     * nazwa funkcji: addRam8GbAndIncreasePrice
     * parametry wejściowe: newPrice -double*
     * wartość zwracana: price + newPrice - zwraca sume cene i nowa cena + 100 oraz zwiększa ram 8Gb
     * autor: Daniel Nowacki
     *****************************************************/
    public void addRam8GbAndIncreasePrice(double newPrice){
        setRamAmountGb(getRamAmountGb()+8);
        setPrice(addToPrice(newPrice));
    }
}
