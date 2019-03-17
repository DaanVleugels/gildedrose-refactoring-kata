package com.gildedrose.quality;

import com.gildedrose.sellin.SellIn;

public class ConjuredQuality extends DefaultQuality {

    public ConjuredQuality(int quality) {
        super(quality);
    }

    @Override
    public Quality update(SellIn sellIn) {
        return new ConjuredQuality(value - 2);
    }
}
