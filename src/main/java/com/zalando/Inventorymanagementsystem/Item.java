package com.zalando.Inventorymanagementsystem;

public class Item {
    private int id ;
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getQuantity() {
        return quantity;
    }

    public void setQuantity(long quantity) {
        this.quantity = quantity;
    }

    private long quantity;

    public Item(int id, String name, long quantity) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
    }
}
