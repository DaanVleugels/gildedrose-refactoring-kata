package com.gildedrose.quality;

import com.gildedrose.sellin.SellIn;

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
