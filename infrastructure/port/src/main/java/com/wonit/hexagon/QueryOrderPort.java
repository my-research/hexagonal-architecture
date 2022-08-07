package com.wonit.hexagon;

import com.wonit.hexagon.core.Order;
import java.util.Optional;

public interface QueryOrderPort {
    Optional<Order> findBy(Long id);
}
