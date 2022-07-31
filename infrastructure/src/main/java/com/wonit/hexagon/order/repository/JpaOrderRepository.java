package com.wonit.hexagon.order.repository;

import com.wonit.hexagon.order.entity.JpaOrderEntity;
import com.wonit.hexagon.repository.OrderRepository;
import org.springframework.data.repository.Repository;

public interface JpaOrderRepository extends Repository<JpaOrderEntity, Long>, OrderRepository {
}
