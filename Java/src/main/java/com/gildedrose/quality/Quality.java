package com.gildedrose.quality;

import com.gildedrose.sellin.SellIn;

public interface Quality {

    int getValue();

    Quality update(SellIn sellIn);

}
