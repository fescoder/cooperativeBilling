package com.fescoder.cooperativebilling.customer.infrastructure.db.repository;

import com.fescoder.cooperativebilling.customer.infrastructure.db.dbo.CustomerEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

// Query Methods funcionales para traer datos de la DB, las funciones que implementa la clase que interactúa con la DB
@Repository
public interface CustomerCrudRepository extends CrudRepository<CustomerEntity, Long> {
    // Query Methods o consultas inferidas
    // Los query Methods son consultas inferidas, por lo tanto, no es necesario el testeo
    // Sí, si son nombres compuestos y muy largos, lo cual conviene ponerle un nombre significativo y hacer un @Query y ser testeadas si decidimos que deben serla
//    @Query("select u from UserEntity u where u.name = :name")
//    UserEntity findByNameCustomQuery(@Param("name") String name);
    // Otro ejemplo de consultas
//    @Query(
//            value = "select * from user as u where u.name = :name",
//            nativeQuery = true)
//    UserEntity findByNameNativeQuery(@Param("name") String name);


}
