package com.wonit.hexagon.usecase;

import com.wonit.hexagon.command.CreateOrderCommand;

public interface CreateOrderUseCase {
    void create(CreateOrderCommand command);
}
