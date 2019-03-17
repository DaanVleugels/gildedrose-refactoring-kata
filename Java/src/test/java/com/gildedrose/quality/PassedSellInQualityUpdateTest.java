package com.gildedrose.quality;

import com.gildedrose.sellin.DefaultSellIn;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class PassedSellInQualityUpdateTest {

    private static final int QUALITY = 42;

    @Test
    public void returnsPassedSellInQualityWithValueOneLowerWhenSellInIsPositive() {
        Quality updatedQuality = new PassedSellInQuality(QUALITY).update(new DefaultSellIn(1));

        assertThat(updatedQuality).isInstanceOf(PassedSellInQuality.class);
        assertThat(updatedQuality.getValue()).isEqualTo(QUALITY - 2);
    }
}