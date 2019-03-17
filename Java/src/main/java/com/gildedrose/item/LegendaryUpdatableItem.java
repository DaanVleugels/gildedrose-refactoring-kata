package com.gildedrose.item;

import com.gildedrose.Item;
import com.gildedrose.item.quality.LegendaryQuality;
import com.gildedrose.item.sellin.LegendarySellIn;

class LegendaryUpdatableItem extends UpdatableItem {

    LegendaryUpdatableItem(Item item) {
        super(item);
        sellIn = new LegendarySellIn(item.sellIn);
        quality = new LegendaryQuality(item.quality);
    }
}
