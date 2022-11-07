package com.fescoder.cooperativebilling.customercoopservice.infrastructure.db.repository;

import com.fescoder.cooperativebilling.customercoopservice.infrastructure.db.dbo.CustomerCoopserviceEntity;
import org.springframework.data.repository.CrudRepository;

public interface CustomerCoopserviceCrudRepository extends CrudRepository<CustomerCoopserviceEntity, Long> {
}
