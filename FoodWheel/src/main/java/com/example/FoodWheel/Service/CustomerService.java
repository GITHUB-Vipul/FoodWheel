package com.example.FoodWheel.Service;

import com.example.FoodWheel.Dtos.Request.CustomerRequest;
import com.example.FoodWheel.Dtos.Response.CustomerResponse;
import com.example.FoodWheel.Models.Cart;
import com.example.FoodWheel.Models.Customer;
import com.example.FoodWheel.Repository.CustomerRepository;
import com.example.FoodWheel.Transformer.CustomerTransformer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {

    //------------------------------------Constructor Injection-----------------------------------
    final CustomerRepository customerRepository;
    @Autowired
    public CustomerService(CustomerRepository customerRepository)
    {
        this.customerRepository=customerRepository;
    }
    //---------------------------------------------------------------------------------------------
    public CustomerResponse addCustomer(CustomerRequest customerRequest) {

        Customer customer= CustomerTransformer.CustomerRequestToCustomer(customerRequest);
        Cart cart= Cart.builder().cardTotal(0).customer(customer).build();
        customer.setCart(cart);
        Customer savedCustomer=customerRepository.save(customer);
        return CustomerTransformer.CustomerToCustomerresponse(savedCustomer);
    }
}
