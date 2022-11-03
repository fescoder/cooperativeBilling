package com.fescoder.cooperativebilling.persistence;

import com.fescoder.cooperativebilling.domain.service.AdminService;
import com.fescoder.cooperativebilling.persistence.crud.AdminCrudRepository;
import com.fescoder.cooperativebilling.persistence.mapper.AdminMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class AdminRepository implements AdminService {
    @Autowired
    private AdminCrudRepository repository;
    @Autowired
    private AdminMapper mapper;
}
