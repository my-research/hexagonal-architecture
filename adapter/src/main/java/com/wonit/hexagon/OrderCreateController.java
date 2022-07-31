package com.wonit.hexagon;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class OrderCreateController {

    private final OrderSaver saver;

    @GetMapping("/orders")
    public ResponseEntity<SavedOrderValue> createOrder() {
        return ResponseEntity.ok(saver.save());
    }
}
