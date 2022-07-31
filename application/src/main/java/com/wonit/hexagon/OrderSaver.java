package com.wonit.hexagon;

import com.wonit.hexagon.core.Order;
import com.wonit.hexagon.repository.OrderRepository;
import java.util.UUID;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class OrderSaver {

    private final OrderRepository repository;

    public SavedOrderValue save() {
        Order order = Order.of(UUID.randomUUID().toString());
        Order save = repository.save(order);
        return SavedOrderValue.of(save().getId(), save().getAddress());
    }
}
