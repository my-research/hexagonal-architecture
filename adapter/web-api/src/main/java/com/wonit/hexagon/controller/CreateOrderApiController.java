package com.wonit.hexagon.controller;

import com.wonit.hexagon.command.CreateOrderCommand;
import com.wonit.hexagon.data.CommonRequestResult;
import com.wonit.hexagon.data.CreateOrderRequest;
import com.wonit.hexagon.usecase.CreateOrderUseCase;
import java.util.Map;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class CreateOrderApiController {

    private final CreateOrderUseCase createService;

    @PostMapping("/orders")
    public ResponseEntity<Object> create(@RequestBody CreateOrderRequest request) {
        createService.create(CreateOrderCommand.of(request.getAddress()));
        return ResponseEntity.ok(CommonRequestResult.of("order successfully created!!"));
    }
}
