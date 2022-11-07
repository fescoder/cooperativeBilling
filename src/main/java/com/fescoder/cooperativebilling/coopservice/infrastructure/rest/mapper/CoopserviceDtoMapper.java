package com.fescoder.cooperativebilling.coopservice.infrastructure.rest.mapper;

import com.fescoder.cooperativebilling.coopservice.domain.Coopservice;
import com.fescoder.cooperativebilling.coopservice.infrastructure.rest.dto.CoopserviceDto;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface CoopserviceDtoMapper {

    CoopserviceDto toDto(Coopservice coopservice);

    List<CoopserviceDto> toDtoList(List<Coopservice> coopserviceList);

    Coopservice toDomain(CoopserviceDto coopserviceDto);

}
