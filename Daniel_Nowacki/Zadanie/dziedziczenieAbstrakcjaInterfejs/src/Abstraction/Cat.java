package Abstraction;

public  class Cat extends Animal {
    private String race,homeOrNot;
    public boolean hasOwner;

    public Cat(double age, String kingdome, String type, String behiavor, String race, String homeOrNot, boolean hasOwner) {
        super(age, kingdome, type, behiavor);
        this.race = race;
        this.homeOrNot = homeOrNot;
        this.hasOwner = hasOwner;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public String getHomeOrNot() {
        return homeOrNot;
    }

    public void setHomeOrNot(String homeOrNot) {
        this.homeOrNot = homeOrNot;
    }

    public boolean isHasOwner() {
        return hasOwner;
    }

    public void setHasOwner(boolean hasOwner) {
        this.hasOwner = hasOwner;
    }

}
