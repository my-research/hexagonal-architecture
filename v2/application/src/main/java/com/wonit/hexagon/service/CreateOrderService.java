package com.wonit.hexagon.service;

import com.wonit.hexagon.core.Order;
import com.wonit.hexagon.port.CommandOrderPort;
import com.wonit.hexagon.command.CreateOrderCommand;
import com.wonit.hexagon.usecase.CreateOrderUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class CreateOrderService implements CreateOrderUseCase {

    private final CommandOrderPort commandPort;

    @Override
    public void create(CreateOrderCommand command) {
        Order order = commandPort.create(command);
    }
}
