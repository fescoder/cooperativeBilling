package com.fescoder.cooperativebilling.customercoopservice.infrastructure.rest.mapper;

import com.fescoder.cooperativebilling.customercoopservice.domain.CustomerCoopservice;
import com.fescoder.cooperativebilling.customercoopservice.infrastructure.rest.dto.CustomerCoopserviceDto;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface CustomerCoopserviceDtoMapper {

    CustomerCoopserviceDto toDto(CustomerCoopservice customerCoopservice);

    List<CustomerCoopserviceDto> toDtoList(List<CustomerCoopservice> customerCoopserviceList);

    CustomerCoopservice toDomain(CustomerCoopserviceDto customerCoopserviceDto);

}
