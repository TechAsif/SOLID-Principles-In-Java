package com.singleresponsibility.principle;

public class Customer {

    private String name;
    private String address;

    public Customer(){

    }

    public void setName(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
