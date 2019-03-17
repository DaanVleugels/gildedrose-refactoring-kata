package com.gildedrose.quality;

import com.gildedrose.sellin.DefaultSellIn;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ConjuredQualityUpdateTest {

    private static final int QUALITY = 42;

    @Test
    public void returnsConjuredQualityWithValueTwoLower() {
        Quality updatedQuality = new ConjuredQuality(QUALITY).update(new DefaultSellIn(1));

        assertThat(updatedQuality).isInstanceOf(ConjuredQuality.class);
        assertThat(updatedQuality.getValue()).isEqualTo(QUALITY - 2);
    }

    @Test
    public void returnsPassedSellInQualityWithValueTwoLowerWhenSellInIsZero() {
        Quality updatedQuality = new ConjuredQuality(QUALITY).update(new DefaultSellIn(0));

        assertThat(updatedQuality).isInstanceOf(ConjuredQuality.class);
        assertThat(updatedQuality.getValue()).isEqualTo(QUALITY - 4);
    }

    @Test
    public void returnsPassedSellInQualityWithValueTwoLowerWhenSellInIsNegative() {
        Quality updatedQuality = new ConjuredQuality(QUALITY).update(new DefaultSellIn(-1));

        assertThat(updatedQuality).isInstanceOf(ConjuredQuality.class);
        assertThat(updatedQuality.getValue()).isEqualTo(QUALITY - 4);
    }

}