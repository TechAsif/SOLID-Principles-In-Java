package com.singleresponsibility.principle;

public class Main {
    public static void main(String args[]){

        Customer customer1 = new Customer();
        customer1.setName("Aydid");
        customer1.setAddress("Rangpur");

        Order order1 = new Order();
        order1.setItemName("Jainamaz");
        order1.setQuantity(10);
        order1.setCustomer(customer1);
        order1.prepareOrder();

        BillCalculation billCalculation = new BillCalculation(order1);
        billCalculation.calculateBill();

        Delivery delivery = new Delivery(order1);
        delivery.delivery();




    }
}
