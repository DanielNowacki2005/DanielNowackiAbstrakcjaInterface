package org.example;

import java.util.ArrayList;
import java.util.List;

public class Registry{
    protected List myList = new ArrayList();

    public Registry(List myList) {
        this.myList = myList;
    }

    public List getMyList() {
        return myList;
    }

    public void setMyList(List myList) {
        this.myList = myList;
    }
    public void add(){}
    public void delete(){}
}
