package com.zalando.Inventorymanagementsystem;


import java.util.List;

public class InventorymanagementsystemApplication {
    public static void main(String[] args) {
        Inventory<FoodItem> foodItemInventory = new Inventory<>();
        FoodItem pasta = new FoodItem(1,"Pasta",2);
        FoodItem pizza = new FoodItem(2,"Pizza",3);
        foodItemInventory .addItem(pasta);
        foodItemInventory .addItem(pizza);


        Inventory<ElectronicItem> electronicItemInventory = new Inventory<>();
        ElectronicItem laptop = new ElectronicItem(5,"laptop",2);
        ElectronicItem mouse = new ElectronicItem(7, "mouse",3);
        electronicItemInventory.addItem(laptop);
        electronicItemInventory.addItem(mouse);

        Inventory<KitchenItem> kitchenItemInventory = new Inventory<>();
        KitchenItem spoon = new KitchenItem(11,"spoon",30);
        KitchenItem waterGlass = new KitchenItem(12,"waterGlass",12);
        kitchenItemInventory.addItem(spoon);
        kitchenItemInventory.addItem(waterGlass);

        List<FoodItem> foodItems = foodItemInventory.getItems();
        List<ElectronicItem> electronicItems =electronicItemInventory.getItems();
        System.out.println("Food Inventory Item");
        for (FoodItem food : foodItems){
            System.out.println(food.getName()+" :$"+foodItems);

            System.out.println("Electronic item");
            for (ElectronicItem electronicItem : electronicItems){
                System.out.println(electronicItem.getName()+ electronicItem);
            }
        }


    }

}
