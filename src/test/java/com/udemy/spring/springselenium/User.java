package com.udemy.spring.springselenium;

public class User {
    private Address address;
    private Salary salary;

    public User(Address address, Salary salary) {
        this.address = address;
        this.salary = salary;
    }

    public void printDetails(){
        System.out.println("The address: " + this.address.getStreet());
        System.out.println("The salary: " + this.salary.getAmount());
    }
}
