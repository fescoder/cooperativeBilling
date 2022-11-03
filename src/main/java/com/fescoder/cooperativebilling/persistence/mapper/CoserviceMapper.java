package com.fescoder.cooperativebilling.persistence.mapper;

import com.fescoder.cooperativebilling.domain.CoserviceDm;
import com.fescoder.cooperativebilling.persistence.entity.Coservice;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface CoserviceMapper {

    @Mapping(source = "coserviceId", target = "coserviceIdDm")
    @Mapping(source = "coserviceName", target = "coserviceNameDm")
    @Mapping(source = "coserviceValue", target = "coserviceValueDm")
    @Mapping(source = "update", target = "updateDm")
    CoserviceDm toCoserviceDm(Coservice coservice);

    @InheritInverseConfiguration
    Coservice toCoservice(CoserviceDm coserviceDm);
}
