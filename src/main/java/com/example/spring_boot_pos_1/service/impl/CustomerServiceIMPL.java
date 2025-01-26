package com.example.spring_boot_pos_1.service.impl;

import com.example.spring_boot_pos_1.dto.CustomerDTO;
import com.example.spring_boot_pos_1.entity.Customer;
import com.example.spring_boot_pos_1.repo.CustomerRepo;
import com.example.spring_boot_pos_1.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceIMPL implements CustomerService {

    @Autowired
    private CustomerRepo customerRepo;
    @Override
    public String saveCustomer(CustomerDTO customerDTO) {
        Customer customer = new Customer(
                customerDTO.getCustomerId()
                ,customerDTO.getCustomerName()
                ,customerDTO.getCustomerAddress()
                ,customerDTO.getCustomerSalary()
                ,customerDTO.getContactNumber()
                ,customerDTO.getNic()
                ,customerDTO.isActive()

        );
        customerRepo.save(customer);
        System.out.println(customerDTO.getCustomerAddress());
        return customerDTO.getCustomerName();
    }

}
