package com.wonit.hexagon.port;

import com.wonit.hexagon.command.CreateOrderCommand;
import com.wonit.hexagon.core.Order;

public interface CommandOrderPort {
    Order create(CreateOrderCommand command);
}
