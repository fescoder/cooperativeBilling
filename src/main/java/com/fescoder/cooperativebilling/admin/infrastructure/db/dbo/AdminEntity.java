package com.fescoder.cooperativebilling.admin.infrastructure.db.dbo;

import com.fescoder.cooperativebilling.customercoopservice.infrastructure.db.dbo.CustomerCoopserviceEntity;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity @Getter @Setter @Builder
@Table(name = "admins")
public class AdminEntity {

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



    @OneToMany(mappedBy = "adminEntity")
    private List<CustomerCoopserviceEntity> customerCoopserviceEntityList;

}
