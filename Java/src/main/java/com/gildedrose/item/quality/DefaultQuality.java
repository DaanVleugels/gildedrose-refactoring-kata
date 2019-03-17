package com.gildedrose.item.quality;


import com.gildedrose.item.sellin.SellIn;

public class DefaultQuality implements Quality {

    private static final int MAXIMUM_VALUE = 50;
    private static final int MINIMUM_VALUE = 0;

    int value;

    public DefaultQuality(int quality) {
        value = calculateValidQuality(quality);
    }

    public int getValue() {
        return value;
    }

    public Quality update(SellIn sellIn) {
        if (sellIn.getValue() <= 0) {
            return new DefaultQuality(value - 2);
        }
        return new DefaultQuality(value - 1);
    }

    int calculateValidQuality(int quality) {
        int value = quality;
        if (quality > MAXIMUM_VALUE) {
            value = MAXIMUM_VALUE;
        }
        if (quality < MINIMUM_VALUE) {
            value = MINIMUM_VALUE;
        }
        return value;
    }
}
