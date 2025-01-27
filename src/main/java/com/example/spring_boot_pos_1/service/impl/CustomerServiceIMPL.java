//package com.example.spring_boot_pos_1.service.impl;
//
//import com.example.spring_boot_pos_1.dto.CustomerDTO;
//import com.example.spring_boot_pos_1.dto.request.CustomerUpdateDTO;
//import com.example.spring_boot_pos_1.entity.Customer;
//import com.example.spring_boot_pos_1.repo.CustomerRepo;
//import com.example.spring_boot_pos_1.service.CustomerService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//@Service
//public class CustomerServiceIMPL implements CustomerService {
//
//    @Autowired
//    private CustomerRepo customerRepo;
//    @Override
//    public String saveCustomer(CustomerDTO customerDTO) {
//        Customer customer = new Customer(
//                customerDTO.getCustomerId()
//                ,customerDTO.getCustomerName()
//                ,customerDTO.getCustomerAddress()
//                ,customerDTO.getCustomerSalary()
//                ,customerDTO.getContactNumber()
//                ,customerDTO.getNic()
//                ,customerDTO.isActive()
//
//        );
//        customerRepo.save(customer);
//        System.out.println(customerDTO.getCustomerAddress());
//        return customerDTO.getCustomerName();
//    }
//
//    @Override
//    public String updateCustomer(CustomerUpdateDTO customerUpdateDTO)
//    {
//        if(customerRepo.existsById(customerUpdateDTO.getCustomerId()))
//        {
//            Customer customer = customerRepo.getReferenceById(customerUpdateDTO.getCustomerId()); //get data from database
//            customer.setCustomerName(customerUpdateDTO.getCustomerName());
//            customer.setCustomerAddress(customerUpdateDTO.getCustomerAddress());
//            customer.setCoustomerSalary(customerUpdateDTO.getCustomerSalary());
//            customerRepo.save(customer);
//            return customerUpdateDTO.getCustomerName()+ " Updated Succesfully";
//        }
//        else{
//            throw new RuntimeException("no data found");
//
//        }
//
//    }
//
//    @Override
//    public CustomerDTO getCustomerById(int customerId) {
//        if(customerRepo.existsById(customerId))
//        {
//             Customer customer =customerRepo.getReferenceById(customerId);
//             CustomerDTO customerDTO = new CustomerDTO(
//                     customer.getCustomerId()
//                     ,customer.getCustomerName()
//                     ,customer.getCustomerAddress()
//                     ,customer.getCoustomerSalary()
//                     ,customer.getContactNumber()
//                     ,customer.getNic()
//
//
//
//             );
//             return customerDTO;
//
//
//        }else {
//            throw new RuntimeException("no data found");
//        }
//        return null;
//    }
//
//}

package com.example.spring_boot_pos_1.service.impl;

import com.example.spring_boot_pos_1.dto.CustomerDTO;
import com.example.spring_boot_pos_1.dto.request.CustomerUpdateDTO;
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
                customerDTO.getCustomerId(),
                customerDTO.getCustomerName(),
                customerDTO.getCustomerAddress(),
                customerDTO.getCustomerSalary(),
                customerDTO.getContactNumber(),
                customerDTO.getNic(),
                customerDTO.isActive()
        );
        customerRepo.save(customer);
        System.out.println(customerDTO.getCustomerAddress());
        return customerDTO.getCustomerName();
    }

    @Override
    public String updateCustomer(CustomerUpdateDTO customerUpdateDTO) {
        if (customerRepo.existsById(customerUpdateDTO.getCustomerId())) {
            Customer customer = customerRepo.getReferenceById(customerUpdateDTO.getCustomerId()); // Get data from the database
            customer.setCustomerName(customerUpdateDTO.getCustomerName());
            customer.setCustomerAddress(customerUpdateDTO.getCustomerAddress());
            customer.setCoustomerSalary(customerUpdateDTO.getCustomerSalary()); // Corrected typo
            customerRepo.save(customer);
            return customerUpdateDTO.getCustomerName() + " Updated Successfully";
        } else {
            throw new RuntimeException("No data found for the given customer ID");
        }
    }

    @Override
    public CustomerDTO getCustomerById(int customerId) {
        if (customerRepo.existsById(customerId)) {
            Customer customer = customerRepo.getReferenceById(customerId);
            return new CustomerDTO(
                    customer.getNic(),
                    customer.isActive(),
                    customer.getContactNumber(),
                    customer.getCoustomerSalary(),
                    customer.getCustomerAddress(),
                    customer.getCustomerName(),
                    customer.getCustomerId()
            );
        } else {
            throw new RuntimeException("No data found for the given customer ID");
        }
    }
}

