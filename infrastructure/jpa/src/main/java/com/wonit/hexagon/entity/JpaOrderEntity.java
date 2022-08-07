package com.wonit.hexagon.entity;

import com.wonit.hexagon.core.Order;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class JpaOrderEntity {

    public static JpaOrderEntity convert(Order domain) {
        return JpaOrderEntity.builder()
                .address(domain.getAddress())
                .build();
    }

    public static Order convert(JpaOrderEntity entity) {
        return Order.of(entity.id, entity.address);
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String address;
}
