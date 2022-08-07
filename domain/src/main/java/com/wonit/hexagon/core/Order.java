package com.wonit.hexagon.core;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class Order {

    public static Order of(Long id, String address) {
        return new Order(id, address);
    }

    public static Order of(String address) {
        return new Order(address);
    }

    private Long id;
    private String address;

    private Order(Long id, String address) {
        this.id = id;
        this.address = address;
    }

    private Order(String address) {
        this.address = address;
    }
}
