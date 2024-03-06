package Abstraction;

public  class Snake extends Animal{
    private int lenght;
    private String roaming,color,pattern;

    public Snake(double age, String kingdome, String type, String behiavor, int lenght, String roaming, String color, String pattern) {
        super(age, kingdome, type, behiavor);
        this.lenght = lenght;
        this.roaming = roaming;
        this.color = color;
        this.pattern = pattern;
    }

    public int getLenght() {
        return lenght;
    }

    public void setLenght(int lenght) {
        this.lenght = lenght;
    }

    public String getRoaming() {
        return roaming;
    }

    public void setRoaming(String roaming) {
        this.roaming = roaming;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getPattern() {
        return pattern;
    }

    public void setPattern(String pattern) {
        this.pattern = pattern;
    }

}
