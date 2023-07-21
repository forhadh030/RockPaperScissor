package org.example;

public class Item {
        /*
Item

What is the name of the item? (String name)
What is the description of the item? (String description)
What is the quantity of the item? (int quantity)
What is the price of the item? (double price)
What is the category of the item? (String category)
    */

    public String name;
    public String description;
    public int quantity;
    public double price;
    public String category;

    public Item(String name, String description, int quantity, double price, String category) {
        this.name = name;
        this.description = description;
        this.quantity = quantity;
        this.price = price;
        this.category = category;
    }

    public void displayItem() {
        System.out.println("I have a/an " + name + " " + category + ". It is " + description +
                " with only " + quantity + " available. It'll cost " + price + ".");
    }
}
