package com.gildedrose.quality;

import com.gildedrose.sellin.DefaultSellIn;
import com.gildedrose.sellin.SellIn;

public class LegendaryQuality implements Quality {

    private static final int FIXED_QUALITY_VALUE = 80;

    public int getValue() {
        return FIXED_QUALITY_VALUE;
    }

    @Override
    public Quality update(SellIn sellIn) {
        return this;
    }
}
