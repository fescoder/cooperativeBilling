package com.fescoder.cooperativebilling.customercoopservice.domain;

import com.fescoder.cooperativebilling.admin.infrastructure.db.dbo.AdminEntity;
import com.fescoder.cooperativebilling.coopservice.infrastructure.db.dbo.CoopserviceEntity;
import com.fescoder.cooperativebilling.customer.infrastructure.db.dbo.CustomerEntity;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter @Setter
public class CustomerCoopservice {

    private Long customerCoopserviceId;
    private Long adminId;
    private Long customerId;
    private Long coopserviceId;
    private BigDecimal payment;
    private BigDecimal account;
    private BigDecimal updatedAccount;
    private String ticket;
    private String comment;
    private LocalDateTime customerCoopserviceCreate;

    private CustomerEntity customerEntity;
    private CoopserviceEntity coopserviceEntity;
    private AdminEntity adminEntity;

}
