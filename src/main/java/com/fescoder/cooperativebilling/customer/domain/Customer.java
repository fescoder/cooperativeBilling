package com.fescoder.cooperativebilling.customer.domain;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter @Setter
public class Customer {

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
