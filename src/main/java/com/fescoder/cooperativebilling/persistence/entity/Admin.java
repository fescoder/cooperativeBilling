package com.fescoder.cooperativebilling.persistence.entity;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import net.bytebuddy.asm.Advice;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity @Getter @Setter @Builder
@Table(name = "admins")
public class Admin {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "admin_id")
    private Long adminId;

    @Column(name = "admin_name")
    private String adminName;

    @Column(name = "admin_password")
    private String adminPassword;

    @Column(name = "admin_email")
    private String adminEmail;

    @Column(name = "updated_at")
    private LocalDateTime update;

    @Column(name = "created_at")
    private LocalDateTime create;



    @OneToMany(mappedBy = "admin")
    private List<CustomerCoservice> customerCoserviceList;

}
