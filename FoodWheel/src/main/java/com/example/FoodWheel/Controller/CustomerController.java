package com.example.FoodWheel.Controller;

import com.example.FoodWheel.Dtos.Request.CustomerRequest;
import com.example.FoodWheel.Dtos.Response.CustomerResponse;
import com.example.FoodWheel.Service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customer")
public class CustomerController {
   // -----------------------Constructor Injection------------------------------
    final CustomerService customerService;
    @Autowired
    public CustomerController(CustomerService customerService)
    {
        this.customerService=customerService;
    }
    //------------------------------------------------------------------------------

    // ----------------------------------add customer--------------------------------
    @PostMapping("/add")
    public ResponseEntity addCustomer(@RequestBody CustomerRequest customerRequest)
    {
        CustomerResponse customerResponse= customerService.addCustomer(customerRequest);
        return new ResponseEntity(customerResponse, HttpStatus.CREATED);
    }
    //---------------------------------------------------------------------------------
}
