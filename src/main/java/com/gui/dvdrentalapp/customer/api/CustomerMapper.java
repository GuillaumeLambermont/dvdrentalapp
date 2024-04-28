package com.gui.dvdrentalapp.customer.api;

import com.gui.dvdrentalapp.customer.api.DTO.CustomerDTO;
import com.gui.dvdrentalapp.customer.domain.Customer;
import org.springframework.stereotype.Component;

@Component
public class CustomerMapper {

    public CustomerDTO toDTO(Customer customer) {
        return new CustomerDTO(
                customer.getCustomer_Id(),
                customer.getStoreId(),
                customer.getFirstName(),
                customer.getLastName(),
                customer.getEmail(),
                customer.getAddressId(),
                customer.isActivebool(),
                customer.getCreateDate(),
                customer.getLastUpdate(),
                customer.getActive()
        );
    }

    public Customer toCustomer(CustomerDTO customerDTO) {
        return new Customer(
                customerDTO.store_id(),
                customerDTO.firstName(),
                customerDTO.lastName(),
                customerDTO.email(),
                customerDTO.addressId(),
                customerDTO.activebool(),
                customerDTO.createDate(),
                customerDTO.lastUpdate(),
                customerDTO.active()
        );
    }
}
