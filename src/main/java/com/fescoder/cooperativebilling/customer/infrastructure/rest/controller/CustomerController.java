package com.fescoder.cooperativebilling.customer.infrastructure.rest.controller;

import com.fescoder.cooperativebilling.customer.application.service.CustomerService;
import com.fescoder.cooperativebilling.customer.infrastructure.rest.dto.CustomerDto;
import com.fescoder.cooperativebilling.customer.infrastructure.rest.mapper.CustomerDtoMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/customers")
public class CustomerController {

    private final CustomerService service;
    private final CustomerDtoMapper mapper;

    @GetMapping()
    public ResponseEntity<List<CustomerDto>> getAllCustomers() {
        return new ResponseEntity<>(mapper.toDtoList(service.getAllCustomers()), HttpStatus.OK);
    }

}
