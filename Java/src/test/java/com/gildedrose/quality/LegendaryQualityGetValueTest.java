package com.gildedrose.quality;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LegendaryQualityGetValueTest {

    @Test
    public void returnsValue() {
        int value = 42;

        assertThat(new LegendaryQuality(value).getValue()).isEqualTo(value);
    }

}