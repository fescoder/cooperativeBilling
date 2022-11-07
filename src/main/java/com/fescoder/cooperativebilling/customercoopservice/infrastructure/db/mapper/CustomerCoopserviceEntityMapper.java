package com.fescoder.cooperativebilling.customercoopservice.infrastructure.db.mapper;

import com.fescoder.cooperativebilling.customercoopservice.domain.CustomerCoopservice;
import com.fescoder.cooperativebilling.customercoopservice.infrastructure.db.dbo.CustomerCoopserviceEntity;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface CustomerCoopserviceEntityMapper {

//    @Mapping(source = "customerCoopserviceId", target = "customerCoopserviceIdDm")
//    @Mapping(source = "adminId", target = "adminIdDm")
//    @Mapping(source = "customerId", target = "customerIdDm")
//    @Mapping(source = "coopserviceId", target = "coopserviceIdDm")
//    @Mapping(source = "payment", target = "paymentDm")
//    @Mapping(source = "account", target = "accountDm")
//    @Mapping(source = "updatedAccount", target = "updatedAccountDm")
//    @Mapping(source = "ticket", target = "ticketDm")
//    @Mapping(source = "comment", target = "commentDm")
//    @Mapping(source = "customerCoopserviceCreated", target = "customerCoopserviceCreatedDm")
    CustomerCoopservice toDomain(CustomerCoopserviceEntity customerCoopserviceEntity);

    List<CustomerCoopservice> toDomainList(List<CustomerCoopservice> customerCoopserviceList);

//    @InheritInverseConfiguration
    CustomerCoopserviceEntity toDbo(CustomerCoopservice customerCoopservice);
}
