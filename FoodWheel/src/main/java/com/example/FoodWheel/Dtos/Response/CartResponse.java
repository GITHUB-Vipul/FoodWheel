package com.example.FoodWheel.Dtos.Response;

import com.example.FoodWheel.Models.FoodItem;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class CartResponse {
  int cartTotal;
  List<FoodResponse> foodItems;
}
