package com.fescoder.cooperativebilling.customer.application.service;

import com.fescoder.cooperativebilling.customer.application.repository.CustomerRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class CustomerServiceTest {

    // Podemos usar @Mock para crear e inyectar instancias simuladas sin tener que llamar a Mockito.mock manualmente.
    @Mock
    private CustomerRepository customerRepository; // = Mockito.mock(CustomerRepository.class):

    // Para inyectar (Mocks) campos simulados en el objeto probado automáticamente.
    @InjectMocks
    private CustomerService customerService;

    @BeforeEach
    void setUp() {

    }

    @Test
    void getAllCustomers() {



    }

}