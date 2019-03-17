package com.gildedrose.quality;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class PassedSellInQualityConstructorTest {

    @Test
    public void setsValueToMinimumValueWhenGivenValueIsLowerThanMinimumValue() {
        int minimumValue = 0;
        assertThat(new PassedSellInQuality(minimumValue - 1).getValue()).isEqualTo(minimumValue);
    }

    @Test
    public void setsValueToMaximumValueWhenGivenValueIsHigherThanMaxValue() {
        int maximumValue = 50;
        assertThat(new PassedSellInQuality(maximumValue + 1).getValue()).isEqualTo(maximumValue);
    }

    @Test
    public void setValueWhenGivenValueIsInBetweenMinimumAndMaximumValue() {
        int value = 42;

        assertThat(new PassedSellInQuality(value).getValue()).isEqualTo(value);
    }

}