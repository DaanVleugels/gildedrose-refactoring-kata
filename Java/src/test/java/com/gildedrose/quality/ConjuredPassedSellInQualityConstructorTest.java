package com.gildedrose.quality;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ConjuredPassedSellInQualityConstructorTest {

    @Test
    public void setsValueToMinimumValueWhenGivenValueIsLowerThanMinimumValue() {
        int minimumValue = 0;
        assertThat(new ConjuredPassedSellInQuality(minimumValue - 1).getValue()).isEqualTo(minimumValue);
    }

    @Test
    public void setsValueToMaximumValueWhenGivenValueIsHigherThanMaxValue() {
        int maximumValue = 50;
        assertThat(new ConjuredPassedSellInQuality(maximumValue + 1).getValue()).isEqualTo(maximumValue);
    }

    @Test
    public void setValueWhenGivenValueIsInBetweenMinimumAndMaximumValue() {
        int value = 42;

        assertThat(new ConjuredPassedSellInQuality(value).getValue()).isEqualTo(value);
    }

}