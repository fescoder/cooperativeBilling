package com.fescoder.cooperativebilling.admin.infrastructure.db.repository;

import com.fescoder.cooperativebilling.admin.infrastructure.db.dbo.AdminEntity;
import org.springframework.data.repository.CrudRepository;

public interface AdminCrudRepository extends CrudRepository<AdminEntity, Long> {
}
