package com.gildedrose.item;

import com.gildedrose.Item;
import com.gildedrose.item.quality.IncreasingQuality;

class ImprovingUpdatableItem extends UpdatableItem {

    ImprovingUpdatableItem(Item item) {
        super(item);
        quality = new IncreasingQuality(item.quality);
    }
}
