package Abstraction;

public abstract class Animal {
    protected double age;
    protected String kingdome, type,behiavor;

    public Animal(double age, String kingdome, String type, String behiavor) {
        this.age = age;
        this.kingdome = kingdome;
        this.type = type;
        this.behiavor = behiavor;
    }

    public double getAge() {
        return age;
    }

    public void setAge(double age) {
        this.age = age;
    }

    public String getKingdome() {
        return kingdome;
    }

    public void setKingdome(String kingdome) {
        this.kingdome = kingdome;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String behiavor() {
        return behiavor;
    }

    public void setBehiavor(String behiavor) {
        this.behiavor = behiavor;
    }
    /*********************************************************
     * nazwa funkcji: age
     * parametry wejściowe:
     * wartość zwracana: adds 1 to age
     * autor: Daniel Nowacki
     *****************************************************/
    public void age(){
        setAge(getAge()+1);
    }
    /*********************************************************
     * nazwa funkcji: setSocialBehiavor
     * parametry wejściowe: newBehiavior String
     * wartość zwracana:  - changes behiavior
     * autor: Daniel Nowacki
     *****************************************************/
    public void changeBehiavior(String newBehiavior){
        setBehiavor(newBehiavior);
    }
}
