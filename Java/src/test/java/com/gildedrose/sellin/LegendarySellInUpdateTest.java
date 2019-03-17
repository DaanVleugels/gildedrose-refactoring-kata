package com.gildedrose.sellin;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LegendarySellInUpdateTest {

    @Test
    public void returnsTheSameObject() {
        LegendarySellIn legendarySellIn = new LegendarySellIn(42);
        assertThat(legendarySellIn.update()).isEqualTo(legendarySellIn);
    }

}