package com.wonit.hexagon.util;

import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import org.junit.jupiter.api.Test;

class TimeBasedIdGeneratorTest {

    @Test
    void name() {
        System.out.println(ZonedDateTime.now().toEpochSecond());
    }
}