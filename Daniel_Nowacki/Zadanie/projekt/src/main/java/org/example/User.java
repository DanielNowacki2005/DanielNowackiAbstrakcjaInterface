package org.example;

public class User implements  IUser{
    protected String name,secondName;
    protected float debt;

    public User(String name, String secondName,float debt) {
        this.name = name;
        this.secondName = secondName;
        this.debt = debt;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }
    @Override
    public void delete(){}

    @Override
    public void add(){}
}
