package com.gildedrose.item;

import com.gildedrose.Item;
import com.gildedrose.item.quality.BackstagePassesQuality;

class BackstagePassesUpdatableItem extends UpdatableItem {

    BackstagePassesUpdatableItem(Item item) {
        super(item);
        this.quality = new BackstagePassesQuality(item.quality);
    }
}
