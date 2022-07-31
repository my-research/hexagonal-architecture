package com.wonit.hexagon.order.entity;

import com.wonit.hexagon.core.Order;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;

@Entity(name = "orders")
@Getter
public class JpaOrderEntity extends Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    public JpaOrderEntity() {
        super();
    }
}
