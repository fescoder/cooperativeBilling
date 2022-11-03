package com.fescoder.cooperativebilling.persistence.crud;

import com.fescoder.cooperativebilling.persistence.entity.Customer;
import org.springframework.data.repository.CrudRepository;

// Query Methods funcionales para traer datos de la DB, las funciones que implementa la clase que interactúa con la DB
public interface CustomerCrudRepository extends CrudRepository<Customer, Long> {
    // Query Methods
    // Los query Methods son consultas inferidas, por lo tanto, no es necesario el testeo
    // Sí, si son nombres compuestos y muy largos, lo cual conviene ponerle un nombre significativo y hacer un @Query
}
