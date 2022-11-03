package com.fescoder.cooperativebilling.persistence.entity;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@Entity @Getter @Setter @Builder
@Table(name = "coservices")
public class Coservice {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "coservice_id")
    private Long coserviceId;

    @Column(name = "coservice_name")
    private String coserviceName;

    @Column(name = "coservice_value")
    private BigDecimal coserviceValue;

    @Column(name = "updated_at")
    private LocalDateTime update;

    @Column(name = "created_at")
    private LocalDateTime create;



    @OneToMany(mappedBy = "coservice")
    private List<CustomerCoservice> customerCoserviceList;

}
