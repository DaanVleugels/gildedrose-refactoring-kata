package com.gildedrose.item;

import com.gildedrose.Item;
import com.gildedrose.quality.IncreasingQuality;
import com.gildedrose.sellin.DefaultSellIn;

class ImprovingUpdatableItem extends UpdatableItem {

    ImprovingUpdatableItem(Item item) {
        super(item);
        sellIn = new DefaultSellIn(item.sellIn);
        quality = new IncreasingQuality(item.quality);
    }
}
