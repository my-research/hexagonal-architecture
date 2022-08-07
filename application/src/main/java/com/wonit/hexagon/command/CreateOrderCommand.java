package com.wonit.hexagon.command;

import lombok.Value;

@Value(staticConstructor = "of")
public class CreateOrderCommand {
    String address;
}
