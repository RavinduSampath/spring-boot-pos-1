package com.example.spring_boot_pos_1.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "customer")

public class Customer {
    @Id
    @Column(name="customer_id",length = 45)
    private int customerId;
    @Column(name="customer_name",length = 100,nullable = false)
    private String customerName;
    @Column(name="customer_address",length = 255)
    private String customerAddress;

    @Column(name="customer_salary",length = 10)
    private double customerSalary;


    @Column(name="contact_numbers",length = 10)
    private String contactNumber;
    @Column(name="nic",length = 10)
    private String nic;

    @Column(name="active",columnDefinition = "TINYINT default 1")
    private boolean active;




    public Customer(int customerId, String customerName, String customerAddress, double coustomerSalary, String contactNumber, String nic, boolean active) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.customerAddress = customerAddress;
        this.customerSalary = coustomerSalary;
        this.contactNumber = contactNumber;
        this.nic = nic;
        this.active = active;
    }//me all argument constracter ekk

    public Customer() {

    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public String getNic() {
        return nic;
    }

    public void setNic(String nic) {
        this.nic = nic;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getCustomerAddress() {
        return customerAddress;
    }

    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
    }

    public double getCoustomerSalary() {
        return customerSalary;
    }

    public void setCoustomerSalary(double coustomerSalary) {
        this.customerSalary = coustomerSalary;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerId=" + customerId +
                ", customerName='" + customerName + '\'' +
                ", customerAddress='" + customerAddress + '\'' +
                ", coustomerSalary=" + customerSalary +
                ", contactNumber='" + contactNumber + '\'' +
                ", nic='" + nic + '\'' +
                ", active=" + active +
                '}';
    }
}
