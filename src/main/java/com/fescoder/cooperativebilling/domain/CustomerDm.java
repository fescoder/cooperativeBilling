package com.fescoder.cooperativebilling.domain;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter @Setter
public class CustomerDm {
    private Long customerIdDm;
    private String houseNumberDm;
    private String firstNameDm;
    private String lastNameDm;
    private String dniDm;
    private String cuilDm;
    private String phoneDm;
    private BigDecimal accountDm;
    private LocalDateTime updateDm;
}
