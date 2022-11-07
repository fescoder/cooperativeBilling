package com.fescoder.cooperativebilling.admin.infrastructure.rest.mapper;

import com.fescoder.cooperativebilling.admin.domain.Admin;
import com.fescoder.cooperativebilling.admin.infrastructure.rest.dto.AdminDto;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface AdminDtoMapper {

    AdminDto toDto(Admin admin);

    List<AdminDto> toDtoList(List<Admin> adminList);

    Admin toDomain(AdminDto adminDto);

}
