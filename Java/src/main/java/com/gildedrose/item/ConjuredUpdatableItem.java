package com.gildedrose.item;

import com.gildedrose.Item;
import com.gildedrose.quality.ConjuredQuality;

class ConjuredUpdatableItem extends UpdatableItem {

    ConjuredUpdatableItem(Item item) {
        super(item);
        this.quality = new ConjuredQuality(item.quality);
    }
}
