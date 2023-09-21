package com.example.FoodWheel.Dtos.Request;

import lombok.*;
import lombok.experimental.FieldDefaults;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level= AccessLevel.PRIVATE)
public class CustomerRequest {
    String name;
    String email;
    String address;
    String mobileNo;
}
