package com.gui.dvdrentalapp.customer.service;

import com.gui.dvdrentalapp.customer.api.CustomerMapper;
import com.gui.dvdrentalapp.customer.api.DTO.CustomerDTO;
import com.gui.dvdrentalapp.customer.domain.CustomerRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CustomerService {
    private final CustomerRepository customerRepository;
    private final CustomerMapper customerMapper;

    public CustomerService(CustomerRepository customerRepository, CustomerMapper customerMapper) {
        this.customerRepository = customerRepository;
        this.customerMapper = customerMapper;
    }

    public List<CustomerDTO> getAllCustomers() {

        return customerRepository
                .findAll()
                .stream()
                .map(customerMapper::toDTO)
                .toList();

    }
}
