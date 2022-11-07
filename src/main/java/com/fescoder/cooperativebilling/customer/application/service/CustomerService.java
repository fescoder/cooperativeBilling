package com.fescoder.cooperativebilling.customer.application.service;

import com.fescoder.cooperativebilling.customer.domain.Customer;
import com.fescoder.cooperativebilling.customer.application.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CustomerService {

// LÓGICA DE NEGOCIO, SERVICIO, CENTRO DE MANIPULACIÓN DE DATOS
    @Autowired
    private CustomerRepository repository;

    public List<Customer> getAllCustomers() {
        return repository.getAllCustomers();
    }

}
