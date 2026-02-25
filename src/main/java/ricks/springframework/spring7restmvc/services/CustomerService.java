package ricks.springframework.spring7restmvc.services;

import ricks.springframework.spring7restmvc.model.Customer;

import java.util.List;
import java.util.UUID;

public interface CustomerService {

     Customer getCustomerById(UUID id);

     List<Customer> getAllCustomers();

    Customer saveNewCustomer(Customer customer);

    void updateCustomerById(UUID customerId, Customer customer);

    void deleteCustomerById(UUID customerId);
}
