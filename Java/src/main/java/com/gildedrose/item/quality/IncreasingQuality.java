package com.gildedrose.item.quality;

import com.gildedrose.item.sellin.SellIn;

public class IncreasingQuality extends DefaultQuality {

    public IncreasingQuality(int quality) {
        super(quality);
    }

    public Quality update(SellIn sellIn) {
        if (sellIn.getValue() <= 0) {
            return new IncreasingQuality(value + 2);
        }
        return new IncreasingQuality(value + 1);
    }
}
