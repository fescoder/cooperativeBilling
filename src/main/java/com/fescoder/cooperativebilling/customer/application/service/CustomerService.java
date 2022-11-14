package com.fescoder.cooperativebilling.customer.application.service;

import com.fescoder.cooperativebilling.customer.domain.Customer;
import com.fescoder.cooperativebilling.customer.application.repository.CustomerRepository;
import lombok.RequiredArgsConstructor;

import java.util.List;


@RequiredArgsConstructor
public class CustomerService {

    private final CustomerRepository customerRepository;

    public List<Customer> getAllCustomers() {
        return customerRepository.getAllCustomers();
    }

}
