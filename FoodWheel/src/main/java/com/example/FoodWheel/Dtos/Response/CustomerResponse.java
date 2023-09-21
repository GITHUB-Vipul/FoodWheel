package com.example.FoodWheel.Dtos.Response;


import lombok.*;
import lombok.experimental.FieldDefaults;

@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Builder
@Data
public class CustomerResponse {

    String name;
    String email;
    String mobileNo;
    String address;
    CartResponse cart;
}
