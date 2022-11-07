package com.fescoder.cooperativebilling.coopservice.domain;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter @Setter
public class Coopservice {

    private Long coopserviceId;
    private String coopserviceName;
    private BigDecimal coopserviceValue;
    private LocalDateTime update;

}
