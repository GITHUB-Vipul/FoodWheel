package com.example.FoodWheel.Models;

import com.example.FoodWheel.Enum.Gender;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Size;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
@Entity
@Table(name="delivery_partner")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class DeliveryPartner {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int Id;

    String name;

    @Enumerated(EnumType.STRING)
    Gender gender;


    @Column(unique = true,nullable = false)
    @Size(min = 10,max = 10)
    String contactNo;

    @OneToMany(mappedBy = "deliveryPartner",cascade = CascadeType.ALL)
    List<OrderEntity> orders=new ArrayList<>();
}
