package com.fescoder.cooperativebilling.domain;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter @Setter
public class CoserviceDm {
    private Long coserviceIdDm;
    private String coserviceNameDm;
    private BigDecimal coserviceValueDm;
    private LocalDateTime updateDm;
}
