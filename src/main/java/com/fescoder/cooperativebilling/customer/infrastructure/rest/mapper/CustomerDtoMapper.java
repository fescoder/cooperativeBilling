package com.fescoder.cooperativebilling.customer.infrastructure.rest.mapper;

import com.fescoder.cooperativebilling.customer.domain.Customer;
import com.fescoder.cooperativebilling.customer.infrastructure.rest.dto.CustomerDto;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface CustomerDtoMapper {

    CustomerDto toDto(Customer customer);

    List<CustomerDto> toDtoList(List<Customer> customerList);

    Customer toDomain(CustomerDto customerDto);
}
