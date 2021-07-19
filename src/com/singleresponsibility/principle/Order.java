package com.singleresponsibility.principle;

import java.util.Random;

public class Order {
    private Customer customer;
    private String orderId;
    private String itemName;
    private int quantity;
    private int totalBill;

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        Random random = new Random();
        this.orderId = orderId+ "-" + random.nextInt(500);
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
        setOrderId(itemName);
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getTotalBill() {
        return totalBill;
    }

    public void setTotalBill(int totalBill) {
        this.totalBill = totalBill;
    }

    public void prepareOrder(){
        System.out.println("Preparing order for customer _ "+this.customer.getName()+" Who has orderded _ "+this.getItemName());
    }
}
