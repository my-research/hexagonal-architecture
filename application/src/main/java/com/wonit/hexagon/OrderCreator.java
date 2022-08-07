package com.wonit.hexagon;

import static org.valid4j.Validation.validate;

import com.wonit.hexagon.command.CreateOrderCommand;
import com.wonit.hexagon.core.Order;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class OrderCreator {
    private final CommandOrderPort saveOrderPort;

    public void create(CreateOrderCommand command) {
        validateSelf(command);
        Order order = Order.of(command.getAddress());

        saveOrderPort.save(order);
    }

    private void validateSelf(CreateOrderCommand command) {
        validate(command != null, new IllegalArgumentException());
        validate(command.getAddress() != null, new IllegalArgumentException());
    }
}
