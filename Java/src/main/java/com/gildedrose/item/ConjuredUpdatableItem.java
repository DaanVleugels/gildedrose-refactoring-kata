package com.gildedrose.item;

import com.gildedrose.Item;
import com.gildedrose.quality.ConjuredQuality;

public class ConjuredUpdatableItem extends UpdatableItem {

    public ConjuredUpdatableItem(Item item) {
        super(item);
        this.quality = new ConjuredQuality(item.quality);
    }
}
