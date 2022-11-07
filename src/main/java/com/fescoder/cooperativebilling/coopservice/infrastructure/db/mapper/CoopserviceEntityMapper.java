package com.fescoder.cooperativebilling.coopservice.infrastructure.db.mapper;

import com.fescoder.cooperativebilling.coopservice.domain.Coopservice;
import com.fescoder.cooperativebilling.coopservice.infrastructure.db.dbo.CoopserviceEntity;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface CoopserviceEntityMapper {

//    @Mapping(source = "coopserviceId", target = "coopserviceIdDm")
//    @Mapping(source = "coopserviceName", target = "coopserviceNameDm")
//    @Mapping(source = "coopserviceValue", target = "coopserviceValueDm")
//    @Mapping(source = "update", target = "updateDm")
    Coopservice toDomain(CoopserviceEntity coopserviceEntity);

    List<Coopservice> toDomainList(List<CoopserviceEntity> coopserviceEntityList);

//    @InheritInverseConfiguration
    CoopserviceEntity toDbo(Coopservice coopservice);
}
