package com.example.FoodWheel.Transformer;


import com.example.FoodWheel.Dtos.Request.CustomerRequest;
import com.example.FoodWheel.Dtos.Response.CartResponse;
import com.example.FoodWheel.Dtos.Response.CustomerResponse;
import com.example.FoodWheel.Models.Customer;



// Utility Class --- A class which has  all the member variable and method are static ,A class never instantiate
public class CustomerTransformer {

    public static Customer CustomerRequestToCustomer(CustomerRequest customerRequest)
    {
       return Customer.builder()
               .name(customerRequest.getName())
               .email(customerRequest.getEmail())
               .address(customerRequest.getAddress())
               .mobileNo(customerRequest.getMobileNo())
               .build();
    }

    public static CustomerResponse CustomerToCustomerresponse(Customer customer) {
        CartResponse cartResponse= CartTransformer.CartToCartResponse(customer.getCart());
        return CustomerResponse.builder().name(customer.getName())
                .email(customer.getEmail())
                .address(customer.getAddress())
                .mobileNo(customer.getMobileNo())
                .cart(cartResponse)
                .build();

    }
}
