package com.zalando.Inventorymanagementsystem;

public class FoodItem extends Item{

    private String expirationDate ;

    public FoodItem(int id, String name, long quantity) {
        super(id, name, quantity);
        this.expirationDate = expirationDate;
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }
}



