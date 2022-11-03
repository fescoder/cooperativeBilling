package com.fescoder.cooperativebilling.persistence;

import com.fescoder.cooperativebilling.domain.CustomerDm;
import com.fescoder.cooperativebilling.domain.service.CustomerService;
import com.fescoder.cooperativebilling.persistence.crud.CustomerCrudRepository;
import com.fescoder.cooperativebilling.persistence.entity.Customer;
import com.fescoder.cooperativebilling.persistence.mapper.CustomerMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

// CENTRO DE COMUNICACIÓN CON LA DB
@Repository
public class CustomerRepository implements CustomerService {
    @Autowired
    private CustomerCrudRepository repository;
    @Autowired
    private CustomerMapper mapper;

    @Override
    public List<CustomerDm> getAllCustomers() {
        List<Customer> customers = (List<Customer>) repository.findAll();
        return mapper.toCustomersDm(customers);
    }
}
