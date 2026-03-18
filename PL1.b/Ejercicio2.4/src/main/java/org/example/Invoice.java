package org.example;

public class Invoice {
    private int Id;
    private Customer customer;
    private double amount;

    public Invoice(int Id, Customer customer, double amount) {
        this.Id = Id;
        this.customer = customer;
        this.amount = amount;
    }

    public int getId() {
        return Id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public int getCustomerId(){
        return customer.getId();
    }

    public String getCustomerName(){
        return customer.getName();
    }

    public int getCustomerDiscount(){
        return customer.getDiscount();
    }

    public double getAmountAfterDiscount(){
        return amount - customer.getDiscount()*amount/100;
    }

    public String toString(){
        return "Invoice[id = " + Id + ", customer = " + customer.toString() + ", amount = " + amount + "]";
    }
}
