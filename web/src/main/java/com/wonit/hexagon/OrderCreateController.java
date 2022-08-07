package com.wonit.hexagon;

import com.wonit.hexagon.command.CreateOrderCommand;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class OrderCreateController {

    private final OrderCreator creator;

    @GetMapping("/orders")
    public ResponseEntity<String> createOrder() {
        creator.create(CreateOrderCommand.of("hello world"));
        return ResponseEntity.ok("success");
    }
}
