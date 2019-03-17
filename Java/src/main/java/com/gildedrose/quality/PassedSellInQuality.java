package com.gildedrose.quality;

import com.gildedrose.sellin.SellIn;

public class PassedSellInQuality extends DefaultQuality {

    PassedSellInQuality(int quality) {
        super(quality);
    }

    @Override
    public Quality update(SellIn sellIn) {
        return new PassedSellInQuality(value - 2);
    }
}
