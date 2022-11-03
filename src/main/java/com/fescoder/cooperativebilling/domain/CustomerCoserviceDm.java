package com.fescoder.cooperativebilling.domain;

import com.fescoder.cooperativebilling.persistence.entity.Admin;
import com.fescoder.cooperativebilling.persistence.entity.Coservice;
import com.fescoder.cooperativebilling.persistence.entity.Customer;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter @Setter
public class CustomerCoserviceDm {
    private Long customerCoserviceIdDm;
    private Long adminIdDm;
    private Long customerIdDm;
    private Long coserviceIdDm;
    private BigDecimal paymentDm;
    private BigDecimal accountDm;
    private BigDecimal updatedAccountDm;
    private String ticketDm;
    private String commentDm;
    private LocalDateTime customerCoserviceCreatedDm;

    private Customer customerDm;
    private Coservice coserviceDm;
    private Admin adminDm;
}
