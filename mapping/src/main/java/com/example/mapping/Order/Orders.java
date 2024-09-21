package com.example.mapping.Order;

import com.example.mapping.Customer.Customer;
import jakarta.persistence.*;
@Entity
@Table(name="order2")
public class Orders {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String item;
    private Integer cost;
    @ManyToOne
    @JoinColumn(name="customer_id")
    private Customer customer;
    public Orders()
    {
    }
    public Orders(Integer id, String item, Integer cost, Customer customer) {
        this.id = id;
        this.item = item;
        this.cost = cost;
        this.customer = customer;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public Integer getCost() {
        return cost;
    }

    public void setCost(Integer cost) {
        this.cost = cost;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}
