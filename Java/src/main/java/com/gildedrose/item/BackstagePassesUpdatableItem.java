package com.gildedrose.item;

import com.gildedrose.Item;
import com.gildedrose.quality.BackstagePassesQuality;

public class BackstagePassesUpdatableItem extends UpdatableItem {
    protected BackstagePassesUpdatableItem(Item item) {
        super(item);
        this.quality = new BackstagePassesQuality(item.quality);
    }
}
