package com.gildedrose.item.quality;

import com.gildedrose.item.sellin.SellIn;

public class LegendaryQuality implements Quality {

    private static final int MINIMUM_QUALITY = 0;

    private int value;

    public LegendaryQuality(int quality) {
        this.value = quality < 0 ? MINIMUM_QUALITY : quality;
    }

    public int getValue() {
        return value;
    }

    @Override
    public Quality update(SellIn sellIn) {
        return this;
    }
}
