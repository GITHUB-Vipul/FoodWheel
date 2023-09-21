package com.example.FoodWheel.Dtos.Response;

import com.example.FoodWheel.Enum.FoodCategory;
import lombok.*;
import lombok.experimental.FieldDefaults;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class FoodResponse {

    String dishName;
    double price;
    FoodCategory category;
    boolean veg;
}
