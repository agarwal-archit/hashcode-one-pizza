package com.hashcode.attempt.system;

import java.util.List;

/**
 * @author Archit Agarwal on 13/02/22
 */
public class Input {

    private int numCustomer;
    private List<Customer> customers;

    public int getNumCustomer() {

        return numCustomer;
    }

    public void setNumCustomer(final int numCustomer) {

        this.numCustomer = numCustomer;
    }

    public List<Customer> getCustomers() {

        return customers;
    }

    public void setCustomers(final List<Customer> customers) {

        this.customers = customers;
    }
}
