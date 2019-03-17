package com.gildedrose.sellin;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LegendarySellInGetValueTest {

    @Test
    public void returnsValue() {
        int value = 42;

        assertThat(new LegendarySellIn(value).getValue()).isEqualTo(value);
    }

}