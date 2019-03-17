package com.gildedrose.quality;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class BackstagePassesQualityConstructorTest {

    @Test
    public void setsValueToMinimumValueWhenGivenValueIsLowerThanMinimumValue() {
        int minimumValue = 0;
        assertThat(new BackstagePassesQuality(minimumValue - 1).getValue()).isEqualTo(minimumValue);
    }

    @Test
    public void setsValueToMaximumValueWhenGivenValueIsHigherThanMaxValue() {
        int maximumValue = 50;
        assertThat(new BackstagePassesQuality(maximumValue + 1).getValue()).isEqualTo(maximumValue);
    }

    @Test
    public void setValueWhenGivenValueIsInBetweenMinimumAndMaximumValue() {
        int value = 42;

        assertThat(new BackstagePassesQuality(value).getValue()).isEqualTo(value);
    }

}