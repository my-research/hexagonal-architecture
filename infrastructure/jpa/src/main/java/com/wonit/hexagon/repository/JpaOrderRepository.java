package com.wonit.hexagon.repository;

import com.wonit.hexagon.core.Order;
import com.wonit.hexagon.entity.JpaOrderEntity;
import org.springframework.data.repository.CrudRepository;

public interface JpaOrderRepository extends CrudRepository<JpaOrderEntity, Long> {
}
