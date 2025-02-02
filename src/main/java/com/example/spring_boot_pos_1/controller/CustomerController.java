package com.example.spring_boot_pos_1.controller;

import com.example.spring_boot_pos_1.dto.CustomerDTO;
import com.example.spring_boot_pos_1.dto.request.CustomerUpdateDTO;
import com.example.spring_boot_pos_1.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/customer")
@CrossOrigin

public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @PostMapping("/save")
    public String saveCustomer(@RequestBody CustomerDTO customerDTO) {
        customerService.saveCustomer(customerDTO);
        return "Customer saved";
    }
    @PutMapping("/update")
    public String updateCustomer(@RequestBody CustomerUpdateDTO customerUpdateDTO ) {
        String response = customerService.updateCustomer(customerUpdateDTO);
        return "Customer updated " + response;

    }
    @GetMapping
            (path="/get-by-id" ,params = "id")
    public CustomerDTO getCustomerById(@RequestParam(value = "id" ) int customerId) {
       // System.out.println("customerId " + customerId);
        CustomerDTO customerDTO = customerService.getCustomerById(customerId);
        return customerDTO;
    }
    @GetMapping(
            path = "/get-all-customers"
    )
    public List<CustomerDTO> getAllCustomers() {
        List<CustomerDTO> allCustomers = customerService.getAllCustomers();
        return allCustomers;
    }

}
