package com.zalando.Inventorymanagementsystem;


public class InventorymanagementsystemApplication {

    public static void main(String[] args) {
        Inventory inventory = new Inventory();

        Item pant = new Item(1, "Pant", 4);
        Item shirt = new Item(2, "Shirt", 4);
        Item trouser = new Item(3, "Trouser", 4);
        Item frock = new Item(11,"Frock",5);
        Item lipstick = new Item(9,"lipStick",3);


        inventory.addItem(pant);
        inventory.addItem(shirt);
        inventory.addItem(trouser);
        inventory.addItem(frock);
        inventory.addItem(lipstick);

        for (Item item : inventory.getItems()) {
            System.out.println(item.getName());
        }
        System.out.println("Before removing #############");

        try {
            inventory.removeItemById(2);
        } catch (ItemNotFoundException e) {
            System.out.println("Item not found " + e);
        }

        System.out.println("After removing #############");

        for (Item item : inventory.getItems()) {
            System.out.println(item.getName());
        }
    }
}
