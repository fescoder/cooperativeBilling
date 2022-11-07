package com.fescoder.cooperativebilling.coopservice.application.service;

import com.fescoder.cooperativebilling.coopservice.application.repository.CoopserviceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CoopserviceService {

    @Autowired
    private CoopserviceRepository repository;

}
