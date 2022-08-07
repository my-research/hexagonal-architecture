package com.wonit.hexagon;


import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.verify;

import com.wonit.hexagon.command.CreateOrderCommand;
import com.wonit.hexagon.core.Order;
import com.wonit.hexagon.port.CommandOrderPort;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.exceptions.base.MockitoException;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class OrderCreatorTest {

    @InjectMocks
    OrderCreator sut;

    @Mock
    CommandOrderPort saveOrderPort;

    @Test
    void not_null() {
        CreateOrderCommand command = CreateOrderCommand.of(null);

        assertThatThrownBy(() -> sut.create(command))
                .isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    void not_null2() {
        CreateOrderCommand command = null;

        assertThatThrownBy(() -> sut.create(command))
                .isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    void call() {
        CreateOrderCommand command = CreateOrderCommand.of("some address");

        sut.create(command);

        verify(saveOrderPort).save(any(Order.class));
    }
}