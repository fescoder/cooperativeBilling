package com.fescoder.cooperativebilling.customer.infrastructure.db.repository;

import com.fescoder.cooperativebilling.customer.domain.Customer;
import com.fescoder.cooperativebilling.customer.infrastructure.db.dbo.CustomerEntity;
import com.fescoder.cooperativebilling.customer.infrastructure.db.mapper.CustomerEntityMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

// CENTRO DE COMUNICACIÓN CON LA DB
@Repository
public class CustomerDboRepository implements com.fescoder.cooperativebilling.customer.application.repository.CustomerRepository {
    @Autowired
    private CustomerCrudRepository repository;
    @Autowired
    private CustomerEntityMapper mapper;

    @Override
    public List<Customer> getAllCustomers() {
        List<CustomerEntity> customerEntityEntities = (List<CustomerEntity>) repository.findAll();
        return mapper.toDomainList(customerEntityEntities);
    }
}
