package com.example.FoodWheel.Transformer;

import com.example.FoodWheel.Dtos.Response.CartResponse;
import com.example.FoodWheel.Models.Cart;

import java.util.ArrayList;

// Utility class
public class CartTransformer {

    public static CartResponse CartToCartResponse( Cart cart)
    {
        return CartResponse.builder().cartTotal(cart.getCardTotal())
                .foodItems(new ArrayList<>())
                .build();
    }
}
