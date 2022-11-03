package com.fescoder.cooperativebilling.web.controller;

import com.fescoder.cooperativebilling.domain.service.CoserviceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("")
public class CoserviceController {
    @Autowired
    private CoserviceService service;
}
