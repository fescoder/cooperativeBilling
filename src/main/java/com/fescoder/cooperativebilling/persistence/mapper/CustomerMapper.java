package com.fescoder.cooperativebilling.persistence.mapper;

import com.fescoder.cooperativebilling.domain.CustomerDm;
import com.fescoder.cooperativebilling.persistence.entity.Customer;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;

import java.util.List;

// Declarado como componente de Spring para poder inyectarlo.
// unmappedTargetPolicy ignora las variables que no mapeo a la inversa
@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface CustomerMapper {
    // Acá van los atributos de la clase de dominio
    @Mapping(source = "customerId", target = "customerIdDm")
    @Mapping(source = "houseNumber", target = "houseNumberDm")
    @Mapping(source = "firstName", target = "firstNameDm")
    @Mapping(source = "lastName", target = "lastNameDm")
    @Mapping(source = "dni", target = "dniDm")
    @Mapping(source = "cuil", target = "cuilDm")
    @Mapping(source = "phone", target = "phoneDm")
    @Mapping(source = "account", target = "accountDm")
    @Mapping(source = "update", target = "updateDm")
    CustomerDm toCustomerDm(Customer customer);

    List<CustomerDm> toCustomersDm(List<Customer> customers);

    //En la conversión inversa ignoramos un atributo que existe en la clase que se referencia con la DB
    @InheritInverseConfiguration
    Customer toCustomer(CustomerDm customerDm);

}
