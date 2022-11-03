package com.fescoder.cooperativebilling.persistence.crud;

import com.fescoder.cooperativebilling.persistence.entity.Admin;
import org.springframework.data.repository.CrudRepository;

public interface AdminCrudRepository extends CrudRepository<Admin, Long> {
}
