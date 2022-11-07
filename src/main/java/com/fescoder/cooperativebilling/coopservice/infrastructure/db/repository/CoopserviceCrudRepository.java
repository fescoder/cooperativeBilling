package com.fescoder.cooperativebilling.coopservice.infrastructure.db.repository;

import com.fescoder.cooperativebilling.coopservice.infrastructure.db.dbo.CoopserviceEntity;
import org.springframework.data.repository.CrudRepository;

public interface CoopserviceCrudRepository extends CrudRepository<CoopserviceEntity, Long> {
}
