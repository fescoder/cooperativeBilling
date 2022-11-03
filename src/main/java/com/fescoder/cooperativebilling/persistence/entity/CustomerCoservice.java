package com.fescoder.cooperativebilling.persistence.entity;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity @Getter @Setter @Builder
@Table(name = "customers_coservices")
public class CustomerCoservice {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "customer_coservice_id")
    private Long customerCoserviceId;

    @Column(name = "admin_id")
    private Long adminId;

    @Column(name = "customer_id")
    private Long customerId;

    @Column(name = "coservice_id")
    private Long coserviceId;

    private BigDecimal payment;
        private BigDecimal account;

    @Column(name = "updated_account")
    private BigDecimal updatedAccount;

    private String ticket;
    private String comment;

    @Column(name = "created_at")
    private LocalDateTime customerCoserviceCreated;



    // (fetch = FetchType.LAZY) Se carga la clase que se usa. EDGE te carga los valores de las clases proactivamente
    @ManyToOne//(fetch = FetchType.LAZY)
    @JoinColumn(name = "customer_id", insertable = false, updatable = false)
    private Customer customer;

    @ManyToOne//(fetch = FetchType.LAZY)
    @JoinColumn(name = "coservice_id", insertable = false, updatable = false)
    private Coservice coservice;

    @ManyToOne//(fetch = FetchType.LAZY)
    @JoinColumn(name = "admin_id", insertable = false, updatable = false)
    private Admin admin;

}
