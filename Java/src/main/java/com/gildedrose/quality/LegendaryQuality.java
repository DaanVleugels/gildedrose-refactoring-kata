package com.gildedrose.quality;

import com.gildedrose.sellin.SellIn;

public class LegendaryQuality implements Quality {

    private int value;

    public LegendaryQuality(int quality) {
        this.value = quality;
    }

    public int getValue() {
        return value;
    }

    @Override
    public Quality update(SellIn sellIn) {
        return this;
    }
}
