package com.singleresponsibility.principle;

import java.util.Random;

public class BillCalculation {
    private Order order;

    public BillCalculation(Order order){
        this.order = order;
    }

    public void calculateBill(){
        Random random = new Random();
        int totalAmout = random.nextInt(100)*this.order.getQuantity();
        this.order.setTotalBill(totalAmout);
        System.out.println("Order With Order Id "+ this.order.getOrderId()+ " has a total bill amount of "+this.order.getTotalBill());
    }
}
