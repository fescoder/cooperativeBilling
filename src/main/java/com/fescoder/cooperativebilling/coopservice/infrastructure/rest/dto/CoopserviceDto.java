package com.fescoder.cooperativebilling.coopservice.infrastructure.rest.dto;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter @Setter
public class CoopserviceDto {

    private Long coopserviceId;
    private String coopserviceName;
    private BigDecimal coopserviceValue;
    private LocalDateTime update;

}
