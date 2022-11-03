package com.fescoder.cooperativebilling.domain.service;

import com.fescoder.cooperativebilling.domain.CustomerDm;

import java.util.List;

// + Query methods de la otra interfaz para implementar
public interface CustomerService {
    // Aca van los métodos que se tienen que implementar, las reglas del dominio que implementa la clase que interactúa
    // con la DB... ESCRIBIR ACA LOS MÉTODOS QUE SE NECESITAN.
    List<CustomerDm> getAllCustomers();
}
