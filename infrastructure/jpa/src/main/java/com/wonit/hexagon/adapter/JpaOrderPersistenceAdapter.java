package com.wonit.hexagon.adapter;

import com.wonit.hexagon.CommandOrderPort;
import com.wonit.hexagon.QueryOrderPort;
import com.wonit.hexagon.core.Order;
import com.wonit.hexagon.entity.JpaOrderEntity;
import com.wonit.hexagon.repository.JpaOrderRepository;
import java.util.Optional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class JpaOrderPersistenceAdapter implements QueryOrderPort, CommandOrderPort {

    private final JpaOrderRepository repository;

    @Override
    public Optional<Order> findBy(Long id) {
        Optional<JpaOrderEntity> optionalEntity = repository.findById(id);

        if (optionalEntity.isEmpty()) {
            return Optional.empty();
        }
        Order domain = JpaOrderEntity.convert(optionalEntity.get());
        return Optional.of(domain);
    }

    @Override
    public Order save(Order order) {
        JpaOrderEntity entity = JpaOrderEntity.convert(order);
        JpaOrderEntity saved = repository.save(entity);
        return JpaOrderEntity.convert(saved);
    }
}
