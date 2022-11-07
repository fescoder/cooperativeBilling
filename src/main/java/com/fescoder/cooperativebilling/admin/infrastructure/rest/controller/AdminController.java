package com.fescoder.cooperativebilling.admin.infrastructure.rest.controller;

import com.fescoder.cooperativebilling.admin.application.service.AdminService;
import com.fescoder.cooperativebilling.admin.infrastructure.rest.mapper.AdminDtoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/admins")
public class AdminController {

    @Autowired
    private AdminService service;
    @Autowired
    private AdminDtoMapper mapper;

}
