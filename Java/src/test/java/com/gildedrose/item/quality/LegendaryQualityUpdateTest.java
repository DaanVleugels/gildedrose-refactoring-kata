package com.gildedrose.item.quality;

import com.gildedrose.item.sellin.DefaultSellIn;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LegendaryQualityUpdateTest {

    @Test
    public void returnsSelf() {
        LegendaryQuality legendaryQuality = new LegendaryQuality(42);

        assertThat(legendaryQuality.update(new DefaultSellIn(42))).isEqualTo(legendaryQuality);
    }

}