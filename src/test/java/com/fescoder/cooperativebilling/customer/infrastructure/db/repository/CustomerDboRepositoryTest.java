package com.fescoder.cooperativebilling.customer.infrastructure.db.repository;

import com.fescoder.cooperativebilling.customer.domain.Customer;
import com.fescoder.cooperativebilling.customer.infrastructure.db.dbo.CustomerEntity;
import com.fescoder.cooperativebilling.customer.infrastructure.db.mapper.CustomerEntityMapper;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
class CustomerDboRepositoryTest {

    @Autowired
    private CustomerCrudRepository customerCrudRepository;
    @Autowired
    private CustomerEntityMapper customerEntityMapper;

    private CustomerDboRepository customerDboRepository;

    @BeforeEach
    void setUp() {

        String name = "fes";

        CustomerEntity customer = CustomerEntity.builder()
                .houseNumber("1")
                .firstName(name)
                .lastName("coder")
                .dni("11111111")
                .cuil("22111111112")
                .phone("1234567890")
                .account(BigDecimal.valueOf(10000.00))
                .update(LocalDateTime.now())
                .build();

        CustomerEntity customerCreated = customerCrudRepository.save(customer);

    }

    // No HACE FALTA PROBAR EL MÉTODO SAVE... FUNCIONA DE POR SI, PROBAR MIS MÉTODOS
    @Test
    void create_customer() {

        String name = "fes";

        CustomerEntity customer = CustomerEntity.builder()
                .houseNumber("1")
                .firstName(name)
                .lastName("coder")
                .dni("11111111")
                .cuil("22111111112")
                .phone("1234567890")
                .account(BigDecimal.valueOf(10000.00))
                .update(LocalDateTime.now())
                .build();

        CustomerEntity customerCreated = customerCrudRepository.save(customer);

        assertEquals(name, customerCreated.getFirstName());



    }

    @Test
    void getAllCustomers() {

        customerDboRepository = new CustomerDboRepository(customerCrudRepository, customerEntityMapper);

        List<Customer> customers = customerDboRepository.getAllCustomers();

        assertEquals(1, customers.size());
    }
}