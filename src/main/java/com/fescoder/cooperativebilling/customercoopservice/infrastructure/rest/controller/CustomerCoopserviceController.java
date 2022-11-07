package com.fescoder.cooperativebilling.customercoopservice.infrastructure.rest.controller;

import com.fescoder.cooperativebilling.customercoopservice.application.repository.CustomerCoopserviceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("")
public class CustomerCoopserviceController {
    @Autowired
    private CustomerCoopserviceRepository service;
}
