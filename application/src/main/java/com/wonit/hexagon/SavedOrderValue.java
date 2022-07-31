package com.wonit.hexagon;

import lombok.Value;

@Value(staticConstructor = "of")
public class SavedOrderValue {
    Long id;
    String address;
}
