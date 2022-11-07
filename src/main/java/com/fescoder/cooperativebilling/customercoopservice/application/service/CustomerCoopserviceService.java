package com.fescoder.cooperativebilling.customercoopservice.application.service;

import com.fescoder.cooperativebilling.customercoopservice.application.repository.CustomerCoopserviceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerCoopserviceService {

    @Autowired
    private CustomerCoopserviceRepository repository;

}
