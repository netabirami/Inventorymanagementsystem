package com.zalando.Inventorymanagementsystem;

import java.util.ArrayList;
import java.util.List;

public class Inventory<T>{
    public List<T> getItems() {
        return items;
    }

    private List<T> items = new ArrayList<T>();
    public void addItem (T item){
        items.add(item);
    }

    public void removeItem(T item ) throws ItemNotFoundException {
        items.remove(item);
    }
}
