package com.example.mapping.Customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    CustomerService service;
    @PostMapping("/post")
    public String post(@RequestBody Customer obj)
    {
        service.save(obj);
        return "saved successfully";
    }
    @GetMapping("/get")
    public List<Customer> getAll()
    {
        return service.findAll();
    }
}
