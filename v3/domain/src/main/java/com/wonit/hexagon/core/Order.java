package com.wonit.hexagon.core;

import com.wonit.hexagon.util.TimeBasedIdGenerator;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Order {

    public static Order newInstance(String address) {
        Long id = TimeBasedIdGenerator.gen();
        return new Order(id, address, OrderStatus.WAITING);
    }

    public static Order of(Long id, String address, OrderStatus status) {
        return new Order(id, address, status);
    }

    private Long id;
    private String address;
    private OrderStatus status;

    public void confirm() {
        status = OrderStatus.CONFIRMED;
    }

    public void cancel() {
        status = OrderStatus.CANCELED;
    }
}
