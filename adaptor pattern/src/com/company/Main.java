package com.company;

public class Main {
    public static void main(String[] args) {
        OldCustomer oldCustomer = new OldCustomer();
        oldCustomer.setName("Almaz");
        oldCustomer.setAge("25");
        oldCustomer.setAddress("Baitursynova,23,010000,Nur-Sultan");

        Customer customer = new CustomerAdapter(oldCustomer);
        System.out.println(customer.getName());
        System.out.println(customer.getAge());
        System.out.println(customer.getAddress());
    }

}

