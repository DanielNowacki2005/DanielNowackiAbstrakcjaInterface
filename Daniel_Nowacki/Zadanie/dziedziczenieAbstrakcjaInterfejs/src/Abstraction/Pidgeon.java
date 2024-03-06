package Abstraction;

public  class Pidgeon extends Animal{
    private String  location,color,race,owner;

    public Pidgeon(double age, String kingdome, String type, String behiavor, String location, String color, String race, String owner) {
        super(age, kingdome, type, behiavor);
        this.location = location;
        this.color = color;
        this.race = race;
        this.owner = owner;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }
}
