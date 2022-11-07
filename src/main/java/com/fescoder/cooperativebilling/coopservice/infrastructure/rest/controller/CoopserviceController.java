package com.fescoder.cooperativebilling.coopservice.infrastructure.rest.controller;

import com.fescoder.cooperativebilling.coopservice.application.service.CoopserviceService;
import com.fescoder.cooperativebilling.coopservice.infrastructure.rest.mapper.CoopserviceDtoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/coopservices")
public class CoopserviceController {

    @Autowired
    private CoopserviceService service;
    @Autowired
    private CoopserviceDtoMapper mapper;

}
