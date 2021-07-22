package com.example.demo.repository;

import com.example.demo.model.Customer;

import java.util.List;

public interface IGeneralRepository<T> {
    List<Customer> findAll();

    Customer findById(Long id);

    void save(T t);

    void remove(Long id);
}