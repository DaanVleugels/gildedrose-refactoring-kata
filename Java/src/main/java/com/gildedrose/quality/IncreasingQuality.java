package com.gildedrose.quality;

import com.gildedrose.sellin.SellIn;

public class IncreasingQuality implements Quality {

    private static final int MAX_QUALITY = 50;

    private final int value;

    public IncreasingQuality(int quality) {
        if (quality > MAX_QUALITY) {
            throw new RuntimeException("quality cannot be greater than " + MAX_QUALITY);
        }
        this.value = quality;
    }

    public int getValue() {
        return value;
    }

    public Quality update(SellIn sellIn) {
        if (value == MAX_QUALITY) {
            return this;
        }
        if(sellIn.getValue() <= 0) {
            return new IncreasingQuality(value + 2);
        }
        return new IncreasingQuality(value + 1);
    }
}
