package com.gildedrose.quality;

import com.gildedrose.sellin.DefaultSellIn;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class IncreasingQualityUpdateTest {

    private static final int QUALITY = 42;

    @Test
    public void returnsIncreasingQualityWithValueOneHigherWhenSellInIsPositive() {
        Quality updatedQuality = new IncreasingQuality(QUALITY).update(new DefaultSellIn(1));

        assertThat(updatedQuality).isInstanceOf(IncreasingQuality.class);
        assertThat(updatedQuality.getValue()).isEqualTo(QUALITY + 1);
    }

    @Test
    public void returnsPassedSellInQualityWithValueTwoHigherWhenSellInIsNegative() {
        Quality updatedQuality = new IncreasingQuality(IncreasingQualityUpdateTest.QUALITY).update(new DefaultSellIn(-1));

        assertThat(updatedQuality).isInstanceOf(IncreasingQuality.class);
        assertThat(updatedQuality.getValue()).isEqualTo(QUALITY + 2);
    }

}