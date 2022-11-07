package com.fescoder.cooperativebilling.admin.domain;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter @Setter
public class Admin {

    private Long adminId;
    private String adminName;
    private String adminPassword;
    private String adminEmail;
    private LocalDateTime update;

}
