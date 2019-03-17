package com.gildedrose.quality;

import com.gildedrose.sellin.SellIn;

public class ConjuredPassedSellInQuality extends DefaultQuality {

    ConjuredPassedSellInQuality(int quality) {
        super(quality);
    }

    @Override
    public Quality update(SellIn sellIn) {
        return new ConjuredPassedSellInQuality(value - 4);
    }
}
