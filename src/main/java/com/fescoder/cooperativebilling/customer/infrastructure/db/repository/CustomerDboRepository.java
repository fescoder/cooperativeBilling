package com.fescoder.cooperativebilling.customer.infrastructure.db.repository;

import com.fescoder.cooperativebilling.customer.application.repository.CustomerRepository;
import com.fescoder.cooperativebilling.customer.domain.Customer;
import com.fescoder.cooperativebilling.customer.infrastructure.db.dbo.CustomerEntity;
import com.fescoder.cooperativebilling.customer.infrastructure.db.mapper.CustomerEntityMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CustomerDboRepository implements CustomerRepository {

    private final CustomerCrudRepository customerRepository;

    private final CustomerEntityMapper customerMapper;

    @Override
    public List<Customer> getAllCustomers() {
        List<CustomerEntity> customerEntityEntities = (List<CustomerEntity>) customerRepository.findAll();
        return customerMapper.toDomainList(customerEntityEntities);
    }
}
