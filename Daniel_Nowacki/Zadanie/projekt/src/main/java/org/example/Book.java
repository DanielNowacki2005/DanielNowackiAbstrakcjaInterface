package org.example;

public class Book extends Author{
    protected String title,type;
    int id;

    public Book(String name, String secondName, String title, String type, int id) {
        super(name, secondName);
        this.title = title;
        this.type = type;
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public void add() {
        super.add();
    }
    @Override
    public void delete() {
        super.add();
    }
}
