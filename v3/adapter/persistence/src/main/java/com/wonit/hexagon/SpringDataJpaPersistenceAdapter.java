package com.wonit.hexagon;

import com.wonit.hexagon.command.CreateOrderCommand;
import com.wonit.hexagon.core.Order;
import com.wonit.hexagon.port.CommandOrderPort;
import com.wonit.hexagon.support.OutBoundAdapter;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@OutBoundAdapter
@Service
@RequiredArgsConstructor
public class SpringDataJpaPersistenceAdapter implements CommandOrderPort {

    private final SpringDataJpaOrderRepository repository;

    @Override
    public Order create(CreateOrderCommand command) {
        Order order = Order.newInstance(command.getAddress());
        SpringDataJpaOrderEntity entity = repository.save(SpringDataJpaOrderEntity.convert(order));
        return SpringDataJpaOrderEntity.convert(entity);
    }
}
