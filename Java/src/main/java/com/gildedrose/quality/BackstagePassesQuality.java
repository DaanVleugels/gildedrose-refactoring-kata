package com.gildedrose.quality;

import com.gildedrose.sellin.SellIn;

public class BackstagePassesQuality extends DefaultQuality {


    public BackstagePassesQuality(int quality) {
        super(quality);
    }

    @Override
    public Quality update(SellIn sellIn) {
        return new BackstagePassesQuality(calculateValidQuality(getNewQuality(sellIn)));
    }

    private int getNewQuality(SellIn sellIn) {
        if (sellIn.getValue() < 0) {
            return 0;
        } else if (sellIn.getValue() < 5) {
            return value + 3;
        } else if (sellIn.getValue() < 10) {
            return value + 2;
        }

        return value + 1;
    }
}
