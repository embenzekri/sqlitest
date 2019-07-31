package com.sqli.cart;

public class Product {
    private String name;
    private int quantity;
    private int price;

    public Product(String name, int quantity, int price) {
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int computePrice() {
        return quantity * price;
    }
}
