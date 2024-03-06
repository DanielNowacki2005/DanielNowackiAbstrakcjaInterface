package Abstraction;

public  class Turtle extends Animal{
    private String location,sea,swims;

    public Turtle(double age, String kingdome, String type, String behiavor, String location, String sea, String swims) {
        super(age, kingdome, type, behiavor);
        this.location = location;
        this.sea = sea;
        this.swims = swims;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getSea() {
        return sea;
    }

    public void setSea(String sea) {
        this.sea = sea;
    }

    public String getSwims() {
        return swims;
    }

    public void setSwims(String swims) {
        this.swims = swims;
    }


}
