package com.fescoder.cooperativebilling.persistence.mapper;

import com.fescoder.cooperativebilling.domain.AdminDm;
import com.fescoder.cooperativebilling.persistence.entity.Admin;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface AdminMapper {

    @Mapping(source = "adminId", target = "adminIdDm")
    @Mapping(source = "adminName", target = "adminNameDm")
    @Mapping(source = "adminPassword", target = "adminPasswordDm")
    @Mapping(source = "adminEmail", target = "adminEmailDm")
    @Mapping(source = "update", target = "updateDm")
    AdminDm toAdminDm(Admin admin);

    @InheritInverseConfiguration
    Admin toAdmin(AdminDm adminDm);
}
