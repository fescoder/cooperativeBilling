package com.fescoder.cooperativebilling.customercoopservice.infrastructure.db.dbo;

import com.fescoder.cooperativebilling.admin.infrastructure.db.dbo.AdminEntity;
import com.fescoder.cooperativebilling.coopservice.infrastructure.db.dbo.CoopserviceEntity;
import com.fescoder.cooperativebilling.customer.infrastructure.db.dbo.CustomerEntity;
import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity @Getter @Setter @Builder
@AllArgsConstructor @NoArgsConstructor
@Table(name = "customers_coopservices")
public class CustomerCoopserviceEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "customer_coopservice_id")
    private Long customerCoopserviceId;

    @Column(name = "admin_id")
    private Long adminId;

    @Column(name = "customer_id")
    private Long customerId;

    @Column(name = "coopservice_id")
    private Long coopserviceId;

    private BigDecimal payment;
    private BigDecimal account;

    @Column(name = "updated_account")
    private BigDecimal updatedAccount;

    private String ticket;
    private String comment;

    @Column(name = "created_at")
    private LocalDateTime customerCoopserviceCreate;



    // (fetch = FetchType.LAZY) Se carga la clase que se usa. EDGE te carga los valores de las clases proactivamente
    @ManyToOne//(fetch = FetchType.LAZY)
    @JoinColumn(name = "customer_id", insertable = false, updatable = false)
    private CustomerEntity customerEntity;

    @ManyToOne//(fetch = FetchType.LAZY)
    @JoinColumn(name = "coopservice_id", insertable = false, updatable = false)
    private CoopserviceEntity coopserviceEntity;

    @ManyToOne//(fetch = FetchType.LAZY)
    @JoinColumn(name = "admin_id", insertable = false, updatable = false)
    private AdminEntity adminEntity;

}
