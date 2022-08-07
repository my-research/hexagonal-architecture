package com.wonit.hexagon.repository;

import static org.junit.jupiter.api.Assertions.*;

import com.wonit.hexagon.core.Order;
import com.wonit.hexagon.entity.JpaOrderEntity;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

@DataJpaTest
class JpaOrderRepositoryTest {

    @Autowired
    JpaOrderRepository repository;

    @Test
    void name() {
        JpaOrderEntity saved = repository.save(JpaOrderEntity.builder().address("some_address").build());

    }
}