package com.gildedrose.quality;

import com.gildedrose.sellin.SellIn;

public class PassedSellInQuality implements Quality {

    private int quality;

    public PassedSellInQuality(int quality) {
        this.quality = quality;
    }

    @Override
    public int getValue() {
        return quality;
    }

    @Override
    public Quality update(SellIn sellIn) {
        return new PassedSellInQuality(quality - 2);
    }
}
