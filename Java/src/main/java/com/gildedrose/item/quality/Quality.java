package com.gildedrose.item.quality;

import com.gildedrose.item.sellin.SellIn;

public interface Quality {

    int getValue();

    Quality update(SellIn sellIn);
}
