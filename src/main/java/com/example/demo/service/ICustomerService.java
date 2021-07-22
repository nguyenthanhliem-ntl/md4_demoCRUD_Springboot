package com.example.demo.service;

import com.example.demo.model.Customer;

public interface ICustomerService extends IGeneralService<Customer> {
    void save(Customer customer);
}