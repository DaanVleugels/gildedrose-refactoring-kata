package com.gildedrose.quality;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class DefaultQualityGetValueTest {

    @Test
    public void returnsValue() {
        int value = 42;

        assertThat(new DefaultQuality(value).getValue()).isEqualTo(value);
    }

}