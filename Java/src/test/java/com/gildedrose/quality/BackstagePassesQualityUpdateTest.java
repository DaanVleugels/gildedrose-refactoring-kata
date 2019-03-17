package com.gildedrose.quality;

import com.gildedrose.sellin.DefaultSellIn;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class BackstagePassesQualityUpdateTest {

    private static final int QUALITY = 42;

    @Test
    public void returnsBackstagePassesQualityWithValueOneHigherWhenSellInIsHigherThanTen() {
        Quality updatedQuality = new BackstagePassesQuality(QUALITY).update(new DefaultSellIn(11));

        assertThat(updatedQuality).isInstanceOf(BackstagePassesQuality.class);
        assertThat(updatedQuality.getValue()).isEqualTo(QUALITY + 1);
    }

    @Test
    public void returnsBackstagePassesQualityWithValueTwoHigherWhenSellInIsLowerThanTen() {
        Quality updatedQuality = new BackstagePassesQuality(QUALITY).update(new DefaultSellIn(9));

        assertThat(updatedQuality).isInstanceOf(BackstagePassesQuality.class);
        assertThat(updatedQuality.getValue()).isEqualTo(QUALITY + 2);
    }

    @Test
    public void returnsBackstagePassesQualityWithValueThreeHigherWhenSellInIsLowerThanFive() {
        Quality updatedQuality = new BackstagePassesQuality(QUALITY).update(new DefaultSellIn(4));

        assertThat(updatedQuality).isInstanceOf(BackstagePassesQuality.class);
        assertThat(updatedQuality.getValue()).isEqualTo(QUALITY + 3);
    }

    @Test
    public void returnsBackstagePassesQualityWithValueThreeHigherWhenSellInIsEqualToZero() {
        Quality updatedQuality = new BackstagePassesQuality(QUALITY).update(new DefaultSellIn(0));

        assertThat(updatedQuality).isInstanceOf(BackstagePassesQuality.class);
        assertThat(updatedQuality.getValue()).isEqualTo(QUALITY + 3);
    }

    @Test
    public void returnsBackstagePassesQualityWithZeroValueWhenSellInIsLowerThanZero() {
        Quality updatedQuality = new BackstagePassesQuality(QUALITY).update(new DefaultSellIn(-1));

        assertThat(updatedQuality).isInstanceOf(BackstagePassesQuality.class);
        assertThat(updatedQuality.getValue()).isEqualTo(0);
    }
}