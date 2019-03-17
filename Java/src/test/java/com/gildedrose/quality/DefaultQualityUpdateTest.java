package com.gildedrose.quality;

import com.gildedrose.sellin.DefaultSellIn;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class DefaultQualityUpdateTest {

    private static final int QUALITY = 42;

    @Test
    public void returnsDefaultQualityWithValueOneLowerWhenSellInIsPositive() {
        Quality updatedQuality = new DefaultQuality(QUALITY).update(new DefaultSellIn(1));

        assertThat(updatedQuality).isInstanceOf(DefaultQuality.class);
        assertThat(updatedQuality.getValue()).isEqualTo(QUALITY - 1);
    }

    @Test
    public void returnsPassedSellInQualityWithValueTwoLowerWhenSellInIsZero() {
        Quality updatedQuality = new DefaultQuality(QUALITY).update(new DefaultSellIn(0));

        assertThat(updatedQuality).isInstanceOf(PassedSellInQuality.class);
        assertThat(updatedQuality.getValue()).isEqualTo(QUALITY - 2);
    }

    @Test
    public void returnsPassedSellInQualityWithValueTwoLowerWhenSellInIsNegative() {
        Quality updatedQuality = new DefaultQuality(DefaultQualityUpdateTest.QUALITY).update(new DefaultSellIn(-1));

        assertThat(updatedQuality).isInstanceOf(PassedSellInQuality.class);
        assertThat(updatedQuality.getValue()).isEqualTo(QUALITY - 2);
    }

}