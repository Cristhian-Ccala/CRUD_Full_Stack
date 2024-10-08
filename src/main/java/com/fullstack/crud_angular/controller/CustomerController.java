package com.fullstack.crud_angular.controller;

import com.fullstack.crud_angular.entity.Customer;
import com.fullstack.crud_angular.service.CustomerService;
import com.fullstack.crud_angular.service.CustomerServiceImpl;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
//http://localhost:8080/api/customers
@RequestMapping("/api/customers")
public class CustomerController {
    private final CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    //http://localhost:8080/api/customers
    @PostMapping()
    public Customer save(@RequestBody Customer customer){
        return customerService.save(customer);
    }

    //http://localhost:8080/api/customers
    @GetMapping
    public List<Customer> findAll (){
        return customerService.findAll();
    }

    //http://localhost:8080/api/customers/1
    @GetMapping("/{id}")
    public Customer findById(@PathVariable Integer id){
        return customerService.findById(id);
    }

    //http://localhost:8080/api/customers/1
    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Integer id){
        customerService.deleteById(id);
    }

    //http://localhost:8080/api/customers
    @PutMapping
    public Customer updateCustomer(@RequestBody Customer customer){
        Customer customerDb = customerService.findById(customer.getId());
        customerDb.setFirstName(customer.getFirstName());
        customerDb.setLastName(customer.getLastName());
        customerDb.setEmail(customer.getEmail());
        return customerService.update(customer);
    }
}
