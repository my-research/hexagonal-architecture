package com.wonit.hexagon.data;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Value;

@NoArgsConstructor
@Data
public class CommonRequestResult {

    public static CommonRequestResult of(String message) {
        return new CommonRequestResult(message);
    }

    String message;

    private CommonRequestResult(String message) {
        this.message = message;
    }
}
