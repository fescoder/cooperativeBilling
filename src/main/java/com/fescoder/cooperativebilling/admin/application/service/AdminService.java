package com.fescoder.cooperativebilling.admin.application.service;

import com.fescoder.cooperativebilling.admin.application.repository.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminService {
    @Autowired
    private AdminRepository repository;
}
