package com.example.mapping.Order;

import com.example.mapping.Customer.Customer;
import com.example.mapping.Customer.CustomerRepo;
import org.hibernate.query.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/order")
public class OrderController {

    BCryptPasswordEncoder pass=new BCryptPasswordEncoder();
    @Autowired
    OrderRepo repo;
    @Autowired
    CustomerRepo repo1;
    @PostMapping("/post/{id}")
    public Orders post(@RequestBody Orders obj, @PathVariable Integer id)
    {
        Customer c1=repo1.findById(id).get();
        obj.setCustomer(c1);
        repo.save(obj);
        return obj;
    }
    @GetMapping("/get")
    public List<Orders> get()
    {
        return repo.findAll();
    }

    @GetMapping("/get/{id}")
    public List<Orders> getallbycustomer(@PathVariable Integer id)
    {
        return repo.findAllByCustomer_id(id);
    }
}
