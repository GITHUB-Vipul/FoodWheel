package com.example.FoodWheel.Models;

import com.example.FoodWheel.Enum.FoodCategory;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level= AccessLevel.PRIVATE)
@Entity
@Table(name="food_item_info")
public class FoodItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int Id;

    String dishName;

    @Enumerated(EnumType.STRING)
    FoodCategory category;

    boolean veg;

    boolean available;

    double price;


    @ManyToOne
    @JoinColumn
    Cart cart;

    @ManyToOne
    @JoinColumn
    Restaurant restaurant;


    @ManyToOne
    @JoinColumn
    OrderEntity orderEntity;
}
