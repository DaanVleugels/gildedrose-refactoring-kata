package com.gildedrose.quality;


import com.gildedrose.sellin.SellIn;

public class DefaultQuality implements Quality {

    private static final int MAX_QUALITY = 50;
    private static final int MIN_QUALITY = 0;

    int value;

    public DefaultQuality(int quality) {
        value = calculateValidQuality(quality);
    }

    public int getValue() {
        return value;
    }

    public Quality update(SellIn sellIn) {
        if (sellIn.getValue() <= 0) {
            return new PassedSellInQuality(value - 2);
        }
        return new DefaultQuality(value - 1);
    }

    int calculateValidQuality(int quality) {
        int value = quality;
        if (quality > MAX_QUALITY) {
            value = MAX_QUALITY;
        }
        if (quality < MIN_QUALITY) {
            value = MIN_QUALITY;
        }
        return value;
    }
}
