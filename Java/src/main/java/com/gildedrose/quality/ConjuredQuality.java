package com.gildedrose.quality;

import com.gildedrose.sellin.SellIn;

public class ConjuredQuality extends DefaultQuality {

    public ConjuredQuality(int quality) {
        super(quality);
    }

    @Override
    public Quality update(SellIn sellIn) {
        if (sellIn.getValue() <= 0) {
            return new ConjuredQuality(value - 4);
        }
        return new ConjuredQuality(value - 2);

    }
}
