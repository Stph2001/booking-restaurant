package com.booking.dtos;

import lombok.Getter;

@Getter
public class CreateRestaurantDto {
    private String name;
    private String address;
    private String description;
    private String image;
}
