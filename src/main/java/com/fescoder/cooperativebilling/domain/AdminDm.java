package com.fescoder.cooperativebilling.domain;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter @Setter
public class AdminDm {
    private Long adminIdDm;
    private String adminNameDm;
    private String adminPasswordDm;
    private String adminEmailDm;
    private LocalDateTime updateDm;
}
