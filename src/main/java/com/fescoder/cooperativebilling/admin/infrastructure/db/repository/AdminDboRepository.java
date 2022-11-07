package com.fescoder.cooperativebilling.admin.infrastructure.db.repository;

import com.fescoder.cooperativebilling.admin.infrastructure.db.mapper.AdminEntityMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class AdminDboRepository implements com.fescoder.cooperativebilling.admin.application.repository.AdminRepository {
    @Autowired
    private AdminCrudRepository repository;
    @Autowired
    private AdminEntityMapper mapper;
}
