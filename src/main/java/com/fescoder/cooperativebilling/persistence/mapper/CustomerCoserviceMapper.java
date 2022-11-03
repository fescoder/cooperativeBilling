package com.fescoder.cooperativebilling.persistence.mapper;

import com.fescoder.cooperativebilling.domain.CustomerCoserviceDm;
import com.fescoder.cooperativebilling.persistence.entity.CustomerCoservice;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface CustomerCoserviceMapper {

    @Mapping(source = "customerCoserviceId", target = "customerCoserviceIdDm")
    @Mapping(source = "adminId", target = "adminIdDm")
    @Mapping(source = "customerId", target = "customerIdDm")
    @Mapping(source = "coserviceId", target = "coserviceIdDm")
    @Mapping(source = "payment", target = "paymentDm")
    @Mapping(source = "account", target = "accountDm")
    @Mapping(source = "updatedAccount", target = "updatedAccountDm")
    @Mapping(source = "ticket", target = "ticketDm")
    @Mapping(source = "comment", target = "commentDm")
    @Mapping(source = "customerCoserviceCreated", target = "customerCoserviceCreatedDm")
    //@Mapping(source = "", target = "")
    CustomerCoserviceDm toCustomerCoserviceDm(CustomerCoservice customerCoservice);

    @InheritInverseConfiguration
    CustomerCoservice toCustomerCoservice(CustomerCoserviceDm customerCoserviceDm);
}
