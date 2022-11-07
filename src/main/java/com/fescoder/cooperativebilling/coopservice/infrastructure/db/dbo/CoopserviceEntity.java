package com.fescoder.cooperativebilling.coopservice.infrastructure.db.dbo;

import com.fescoder.cooperativebilling.customercoopservice.infrastructure.db.dbo.CustomerCoopserviceEntity;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@Entity @Getter @Setter //@Builder
@Table(name = "coopservices")
public class CoopserviceEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "coopservice_id")
    private Long coopserviceId;

    @Column(name = "coopservice_name")
    private String coopserviceName;

    @Column(name = "coopservice_value")
    private BigDecimal coopserviceValue;

    @Column(name = "updated_at")
    private LocalDateTime update;

    @Column(name = "created_at")
    private LocalDateTime create;



    @OneToMany(mappedBy = "coopserviceEntity")
    private List<CustomerCoopserviceEntity> customerCoopserviceEntityList;

}
