package com.example.springBatch.config;

import com.example.springBatch.entity.Customer;
import org.springframework.batch.item.ItemProcessor;

public class CustomerProcessor implements ItemProcessor<Customer, Customer> {


    @Override
    public Customer process(Customer customer) throws Exception {
        return customer;
    }


}
