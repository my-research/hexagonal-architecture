package com.wonit.hexagon.core;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Order {

    public static Order of(String address) {
        return new Order(address);
    }

    private Long id;
    private String address;

    public Order(String address) {
        this.address = address;
    }
}
