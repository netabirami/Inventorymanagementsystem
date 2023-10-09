package com.zalando.Inventorymanagementsystem;

import java.util.ArrayList;
import java.util.List;

public class Inventory {
    public List<Item> getItems() {
        return items;
    }

    private List<Item> items = new ArrayList<>();
    public void addItem (Item item){
        items.add(item);
    }

    public void removeItemById(int id) throws ItemNotFoundException {
        boolean found = false;
        items = items.stream()
                .filter(item -> item.getId() != id)
                .toList();

        for (Item item : items) {
            if (item.getId() == id) {
                found = true;
                break;
            }
        }

        if (!found) {
            throw new ItemNotFoundException("Item with ID " + id + " not found.");
        }
    }
}
