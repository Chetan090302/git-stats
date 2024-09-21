package com.example.mapping.Customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {

    @Autowired
    CustomerRepo repo;
    public void save(Customer obj) {
        repo.save(obj);
    }

    public List<Customer> findAll() {
        return repo.findAll();
    }
    public Customer find(Integer id)
    {
        return repo.findById(id).get();
    }
}
