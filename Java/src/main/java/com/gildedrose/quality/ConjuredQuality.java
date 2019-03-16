package com.gildedrose.quality;

import com.gildedrose.sellin.SellIn;

public class ConjuredQuality implements Quality {
    private final int value;

    public ConjuredQuality(int quality) {
        this.value = quality;
    }

    @Override
    public int getValue() {
        return value;
    }

    @Override
    public Quality update(SellIn sellIn) {
        return new ConjuredQuality(value - 2);
    }
}
