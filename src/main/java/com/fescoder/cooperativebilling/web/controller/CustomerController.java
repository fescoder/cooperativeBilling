package com.fescoder.cooperativebilling.web.controller;

import com.fescoder.cooperativebilling.domain.CustomerDm;
import com.fescoder.cooperativebilling.domain.serviceImpl.CustomerServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/customers")
public class CustomerController {
    @Autowired
    private CustomerServiceImpl serviceImpl;

    @GetMapping()
    public ResponseEntity<List<CustomerDm>> getAllCustomers() {
        return new ResponseEntity<>(serviceImpl.getAllCustomers(), HttpStatus.OK);
    }
}
