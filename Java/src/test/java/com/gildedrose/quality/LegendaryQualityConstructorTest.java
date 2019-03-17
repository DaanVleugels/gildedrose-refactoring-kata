package com.gildedrose.quality;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LegendaryQualityConstructorTest {

    @Test
    public void setsValueToMinimumValueWhenGivenValueIsLowerThanMinimumValue() {
        int minimumValue = 0;
        assertThat(new LegendaryQuality(minimumValue - 1).getValue()).isEqualTo(minimumValue);
    }

    @Test
    public void setValueWhenGivenValueIsInOverDefaultMaximumValue() {
        int value = 51;

        assertThat(new LegendaryQuality(value).getValue()).isEqualTo(value);
    }

}