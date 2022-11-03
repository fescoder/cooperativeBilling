package com.fescoder.cooperativebilling.domain.serviceImpl;

import com.fescoder.cooperativebilling.domain.CustomerDm;
import com.fescoder.cooperativebilling.domain.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl {
// LÓGICA DE NEGOCIO, SERVICIO, CENTRO DE MANIPULACIÓN DE DATOS
    @Autowired
    private CustomerService service;

    public List<CustomerDm> getAllCustomers() {
        return service.getAllCustomers();
    }
}
