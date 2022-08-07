package com.wonit.hexagon;

import com.wonit.hexagon.core.Order;

public interface CommandOrderPort {
    Order save(Order order);
}
