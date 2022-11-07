package com.fescoder.cooperativebilling.customer.application.repository;

import com.fescoder.cooperativebilling.customer.domain.Customer;

import java.util.List;

// Lógica de negocio
// + Query methods de la otra interfaz para implementar
public interface CustomerRepository {
    // Aca van los métodos que se tienen que implementar, las reglas del dominio que implementa la clase que interactúa
    // con la DB... ESCRIBIR ACA LOS MÉTODOS QUE SE NECESITAN.
    List<Customer> getAllCustomers();
}
