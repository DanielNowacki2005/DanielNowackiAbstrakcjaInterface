package Abstraction;

public  class GoldFish extends Animal{
    private String aquariumType,locatin,space;

    public GoldFish(double age, String kingdome, String type, String behiavor, String aquariumType, String locatin, String space) {
        super(age, kingdome, type, behiavor);
        this.aquariumType = aquariumType;
        this.locatin = locatin;
        this.space = space;
    }

    public String getAquariumType() {
        return aquariumType;
    }

    public void setAquariumType(String aquariumType) {
        this.aquariumType = aquariumType;
    }

    public String getLocatin() {
        return locatin;
    }

    public void setLocatin(String locatin) {
        this.locatin = locatin;
    }

    public String getSpace() {
        return space;
    }

    public void setSpace(String space) {
        this.space = space;
    }

}
