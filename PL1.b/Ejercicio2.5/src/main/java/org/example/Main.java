package org.example;

public class Main{
    public static void main(String[] args){
        Customer Juan = new Customer(1234, "Juan", 'm');
        Account cuenta = new Account(1234, Juan, 2.5);

        System.out.println(cuenta.getId());
        System.out.println(cuenta.getCustomer());
        System.out.println(cuenta.getBalance());
        cuenta.setBalance(1);
        System.out.println(cuenta.getCustomerName());
        cuenta.deposit(500);
        System.out.println(cuenta);
        cuenta.withdraw(600);
        System.out.println(cuenta.withdraw(200));

    }
}