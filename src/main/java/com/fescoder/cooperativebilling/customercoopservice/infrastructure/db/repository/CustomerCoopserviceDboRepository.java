package com.fescoder.cooperativebilling.customercoopservice.infrastructure.db.repository;

import com.fescoder.cooperativebilling.customercoopservice.infrastructure.db.mapper.CustomerCoopserviceEntityMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class CustomerCoopserviceDboRepository implements com.fescoder.cooperativebilling.customercoopservice.application.repository.CustomerCoopserviceRepository {

    @Autowired
    private CustomerCoopserviceCrudRepository repository;
    @Autowired
    private CustomerCoopserviceEntityMapper mapper;

}
