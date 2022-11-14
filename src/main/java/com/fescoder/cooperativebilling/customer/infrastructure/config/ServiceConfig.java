package com.fescoder.cooperativebilling.customer.infrastructure.config;

import com.fescoder.cooperativebilling.customer.application.repository.CustomerRepository;
import com.fescoder.cooperativebilling.customer.application.service.CustomerService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ServiceConfig {

    @Bean
    public CustomerService customerService(CustomerRepository customerRepository) {
        return new CustomerService(customerRepository);
    }

}
