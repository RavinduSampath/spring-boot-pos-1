package com.example.spring_boot_pos_1.service;

import com.example.spring_boot_pos_1.dto.CustomerDTO;

public interface CustomerService {
    public String saveCustomer(CustomerDTO customerDTO);
}
