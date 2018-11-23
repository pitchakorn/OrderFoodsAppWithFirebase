package com.example.topnt.firebasetest.Model;

public class Order {
    private String NameOrder;
    private String Price;

    public Order() {

    }

    public Order(String nameOrder, String price) {
        NameOrder = nameOrder;
        Price = price;
    }

    public String getNameOrder() {
        return NameOrder;
    }

    public void setNameOrder(String nameOrder) {
        NameOrder = nameOrder;
    }

    public String getPrice() {
        return Price;
    }

    public void setPrice(String price) {
        Price = price;
    }


}
