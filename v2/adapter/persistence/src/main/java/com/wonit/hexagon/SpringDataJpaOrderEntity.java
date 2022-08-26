package com.wonit.hexagon;

import com.wonit.hexagon.core.Order;
import com.wonit.hexagon.core.OrderStatus;
import javax.persistence.Entity;
import javax.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity(name = "orders")
@AllArgsConstructor
@NoArgsConstructor
@Getter
final class SpringDataJpaOrderEntity {

    static SpringDataJpaOrderEntity convert(Order order) {
        return new SpringDataJpaOrderEntity(order.getId(), order.getAddress(), order.getStatus());
    }

    static Order convert(SpringDataJpaOrderEntity entity) {
        return Order.of(entity.getId(), entity.getAddress(), entity.getStatus());
    }

    @Id
    private Long id;
    private String address;
    private OrderStatus status;
}
