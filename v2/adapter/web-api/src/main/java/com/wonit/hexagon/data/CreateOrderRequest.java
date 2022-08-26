package com.wonit.hexagon.data;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Value;

@NoArgsConstructor
@Getter
public class CreateOrderRequest {
    private String address;
}
