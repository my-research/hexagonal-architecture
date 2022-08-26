package com.wonit.hexagon;

import com.wonit.hexagon.command.CreateOrderCommand;
import com.wonit.hexagon.command.CreatedOrder;
import com.wonit.hexagon.core.Order;
import com.wonit.hexagon.port.CommandOrderPort;
import com.wonit.hexagon.support.OutBoundAdapter;
import com.wonit.hexagon.util.TimeBasedIdGenerator;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@OutBoundAdapter
@Service
@RequiredArgsConstructor
public class SpringDataJpaPersistenceAdapter implements CommandOrderPort {

    /**
     * 사실상 SpringDataJpaPersistenceAdapter 가 OrderRepository 의 구현체야
     * CommandOrderPort 가 domain 에 있는 Repository 인거고
     */

    private final SpringDataJpaOrderRepository repository;

    @Override
    public Order create(CreateOrderCommand command) {
        Order order = Order.newInstance(command.getAddress());
        SpringDataJpaOrderEntity entity = repository.save(SpringDataJpaOrderEntity.convert(order));
        return SpringDataJpaOrderEntity.convert(entity);
    }
}
