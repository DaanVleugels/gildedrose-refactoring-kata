package com.gildedrose.item.quality;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class DefaultQualityConstructorTest {

    @Test
    public void setsValueToMinimumValueWhenGivenValueIsLowerThanMinimumValue() {
        int minimumValue = 0;
        assertThat(new DefaultQuality(minimumValue - 1).getValue()).isEqualTo(minimumValue);
    }

    @Test
    public void setsValueToMaximumValueWhenGivenValueIsHigherThanMaxValue() {
        int maximumValue = 50;
        assertThat(new DefaultQuality(maximumValue + 1).getValue()).isEqualTo(maximumValue);
    }

    @Test
    public void setValueWhenGivenValueIsInBetweenMinimumAndMaximumValue() {
        int value = 42;

        assertThat(new DefaultQuality(value).getValue()).isEqualTo(value);
    }

}