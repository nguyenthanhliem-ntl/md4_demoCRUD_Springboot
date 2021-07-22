package com.example.demo.repository;

import com.example.demo.model.Customer;

public interface ICustomerRepository extends IGeneralRepository<Customer> {
    void save(Customer customer);
}