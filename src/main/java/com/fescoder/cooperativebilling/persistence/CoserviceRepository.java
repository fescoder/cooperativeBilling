package com.fescoder.cooperativebilling.persistence;

import com.fescoder.cooperativebilling.domain.service.CoserviceService;
import com.fescoder.cooperativebilling.persistence.crud.CoserviceCrudRepository;
import com.fescoder.cooperativebilling.persistence.mapper.CoserviceMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class CoserviceRepository implements CoserviceService {
    @Autowired
    private CoserviceCrudRepository repository;
    @Autowired
    private CoserviceMapper mapper;
}
