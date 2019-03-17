package com.gildedrose.item.sellin;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class DefaultSellInUpdateTest {

    @Test
    public void returnsDefaultSellInWithOneLowerValue() {
        int originalSellIn = 42;

        assertThat(new DefaultSellIn(originalSellIn).update().getValue()).isEqualTo(originalSellIn - 1);
    }

}