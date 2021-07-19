package com.singleresponsibility.principle;

public class Delivery {
    Order order;
    public Delivery(Order order){
        this.order = order;
    }

    public void delivery(){
        System.out.println("Delivering The Order");
        System.out.println("Order with order id as "
        +this.order.getOrderId()+" being delivered to "+this.order.getCustomer().getName());
        System.out.println("Order is to be delivered to "+this.order.getCustomer().getAddress());
    }


}
