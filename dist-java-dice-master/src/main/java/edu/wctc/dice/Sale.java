package edu.wctc.dice;

public class Sale {
    public String Customer;
    public String Country;
    public double amount;
    public double tax;
    public double shipping;

    public Sale() {
    }

    public Sale(String customer, String country, double amount, double tax) {
        this.Customer = customer;
        this.Country = country;
        this.amount = amount;
        this.tax = tax;
    }

    public Sale(String customer, String country, double amount, double tax, double shipping) {
        this.Customer = customer;
        this.Country = country;
        this.amount = amount;
        this.tax = tax;
        this.shipping = shipping;
    }

    public Sale(String[] array) {
        this.Customer = array[0];
        this.Country = array[1];
        this.amount = Double.parseDouble(array[2]);
        this.tax = Double.parseDouble(array[3]);
    }

    public double getShipping() {
        return this.shipping;
    }

    public void setShipping(double shipping) {
        this.shipping = shipping;
    }

    public String getCustomer() {
        return this.Customer;
    }

    public void setCustomer(String customer) {
        this.Customer = customer;
    }

    public String getCountry() {
        return this.Country;
    }

    public void setCountry(String country) {
        this.Country = country;
    }

    public double getAmount() {
        return this.amount;
    }

    public void setAmount(double amount) {
    }

    public double getTax() {
        return this.tax;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }
}
