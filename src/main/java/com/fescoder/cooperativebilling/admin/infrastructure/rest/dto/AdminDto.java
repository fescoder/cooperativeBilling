package com.fescoder.cooperativebilling.admin.infrastructure.rest.dto;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter @Setter
public class AdminDto {

    private Long adminId;
    private String adminName;
    private String adminPassword;
    private String adminEmail;
    private LocalDateTime update;

}
