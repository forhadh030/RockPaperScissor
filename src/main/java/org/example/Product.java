package org.example;

public class Product {
    /*
    Product
        What is the name of the product? (String name)
        What is the price of the product? (double price)
        What is the description of the product? (String description)
        What is the quantity of the product? (int quantity)
        What is the category of the product? (String category)
     */

    protected String name;
    protected double price;
    protected String description;
    protected int quantity;
    protected String category;

    public Product(String name, double price, String description, int quantity, String category) {
        this.name = name;
        this.price = price;
        this.description = description;
        this.quantity = quantity;
        this.category = category;
    }

    public void prodInfo() {
        System.out.println("Now on sale " + name + " only for " + price + ". It's a " + description +
                " with only " + quantity + " left in stock." + " Category: " + category + ".");
    }
}
