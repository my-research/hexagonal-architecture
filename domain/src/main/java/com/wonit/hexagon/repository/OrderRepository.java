package com.wonit.hexagon.repository;

import com.wonit.hexagon.core.Order;
import java.util.Optional;

public interface OrderRepository {
    Order save(Order order);
    Optional<Order> findById(Long id);
}
