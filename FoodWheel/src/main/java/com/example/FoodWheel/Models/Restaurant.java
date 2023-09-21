package com.example.FoodWheel.Models;


import com.example.FoodWheel.Enum.RestaurantCategory;
import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.ArrayList;
import java.util.List;

@FieldDefaults(level = AccessLevel.PRIVATE)
@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Builder
@Table(name="restaurant_info")
public class Restaurant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int Id;

    String name;

    String location;

    @Enumerated(EnumType.STRING)
    RestaurantCategory category;


    @Column(unique = true,nullable = false)
    @Size(min = 10,max = 10)
    String ContactNo;

    boolean opened;

    @OneToMany(mappedBy = "restaurant",cascade = CascadeType.ALL)
    List<FoodItem> foodItems=new ArrayList<>();

    @OneToMany(mappedBy = "restaurant",cascade = CascadeType.ALL)
    List<OrderEntity> orders=new ArrayList<>();
}
