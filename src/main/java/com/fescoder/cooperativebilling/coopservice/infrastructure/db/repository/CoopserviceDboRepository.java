package com.fescoder.cooperativebilling.coopservice.infrastructure.db.repository;

import com.fescoder.cooperativebilling.coopservice.infrastructure.db.mapper.CoopserviceEntityMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class CoopserviceDboRepository implements com.fescoder.cooperativebilling.coopservice.application.repository.CoopserviceRepository {
    @Autowired
    private CoopserviceCrudRepository repository;
    @Autowired
    private CoopserviceEntityMapper mapper;
}
