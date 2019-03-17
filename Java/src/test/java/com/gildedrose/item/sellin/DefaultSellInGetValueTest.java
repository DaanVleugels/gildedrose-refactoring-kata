package com.gildedrose.item.sellin;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class DefaultSellInGetValueTest {

    @Test
    public void returnsValue() {
        int value = 42;

        assertThat(new DefaultSellIn(value).getValue()).isEqualTo(value);
    }

}