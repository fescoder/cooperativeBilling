package com.fescoder.cooperativebilling.customer.infrastructure.rest.dto;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter @Setter
public class CustomerDto {

    private Long customerId;
    private String houseNumber;
    private String firstName;
    private String lastName;
    private String dni;
    private String cuil;
    private String phone;
    private BigDecimal account;
    private LocalDateTime update;

}
