package com.example.spring_boot_pos_1.service;

import com.example.spring_boot_pos_1.dto.CustomerDTO;
import com.example.spring_boot_pos_1.dto.request.CustomerUpdateDTO;

public interface CustomerService {
    public String saveCustomer(CustomerDTO customerDTO);

    String updateCustomer(CustomerUpdateDTO customerUpdateDTO);

    CustomerDTO getCustomerById(int customerId);
}
