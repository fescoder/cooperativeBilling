package com.fescoder.cooperativebilling.persistence;

import com.fescoder.cooperativebilling.domain.service.CustomerCoserviceService;
import com.fescoder.cooperativebilling.persistence.crud.CustomerCoserviceCrudRepository;
import com.fescoder.cooperativebilling.persistence.mapper.CustomerCoserviceMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class CustomerCoserviceRepository implements CustomerCoserviceService {
    @Autowired
    private CustomerCoserviceCrudRepository repository;
    @Autowired
    private CustomerCoserviceMapper mapper;
}
