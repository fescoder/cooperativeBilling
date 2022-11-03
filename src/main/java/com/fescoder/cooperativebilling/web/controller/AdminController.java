package com.fescoder.cooperativebilling.web.controller;

import com.fescoder.cooperativebilling.domain.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("")
public class AdminController {
    @Autowired
    private AdminService service;
}
