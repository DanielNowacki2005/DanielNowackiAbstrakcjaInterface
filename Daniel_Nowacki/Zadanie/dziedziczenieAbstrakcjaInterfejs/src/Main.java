import Abstraction.*;
import Interface.*;
public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat(12,"a","4","some","race","Maybe",false);
        GoldFish gold = new GoldFish(12,"a","4","some","race","Maybe","3m^4");
        Pidgeon pi= new Pidgeon(12,"a","4","some","race","Maybe","some","12m^2");
        Snake snake = new Snake(12,"a","4","some",21,"Maybe","y","color");
        Turtle turtle = new Turtle(12,"a","4","some","race","Maybe","yes");

        AGD agd = new AGD(2,2,2,"2","2",2,",",",","");
        Computer computer = new Computer(2,2,2,"2","2",2,2,2,2,2);
        Electrionic electrionic =new Electrionic(2,2,2,"2","2",2);
        Smartfridge smartfridge =new Smartfridge(2,2,2,"2","2",2,"2",2,2,true);
        Smartphone smartphone = new Smartphone(2,2,2,"2","2",2,2,2,2);
        SmartWatch smartWatch = new SmartWatch(2,2,2,"2","2",2,2,2);

    }
}