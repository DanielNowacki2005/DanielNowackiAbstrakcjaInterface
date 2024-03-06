package org.example;

import java.util.Date;

public class Borrowed extends User{
    Date borred,borroweEnds;

    public Borrowed(String name, String secondName, float debt, Date borred, Date borroweEnds) {
        super(name, secondName, debt);
        this.borred = borred;
        this.borroweEnds = borroweEnds;
    }

    public Date getBorred() {
        return borred;
    }

    public void setBorred(Date borred) {
        this.borred = borred;
    }

    public Date getBorroweEnds() {
        return borroweEnds;
    }

    public void setBorroweEnds(Date borroweEnds) {
        this.borroweEnds = borroweEnds;
    }
    public void extend(){}
    @Override
    public void add(){}
    @Override
    public void delete(){}
}
