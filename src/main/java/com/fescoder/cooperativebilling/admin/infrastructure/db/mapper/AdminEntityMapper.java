package com.fescoder.cooperativebilling.admin.infrastructure.db.mapper;

import com.fescoder.cooperativebilling.admin.domain.Admin;
import com.fescoder.cooperativebilling.admin.infrastructure.db.dbo.AdminEntity;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface AdminEntityMapper {

//    @Mapping(source = "adminId", target = "adminIdDm")
//    @Mapping(source = "adminName", target = "adminNameDm")
//    @Mapping(source = "adminPassword", target = "adminPasswordDm")
//    @Mapping(source = "adminEmail", target = "adminEmailDm")
//    @Mapping(source = "update", target = "updateDm")
    Admin toDomain(AdminEntity adminEntity);

    List<Admin> toDomainList(List<AdminEntity> adminEntityList);

//    @InheritInverseConfiguration
    AdminEntity toDbo(Admin admin);
}
