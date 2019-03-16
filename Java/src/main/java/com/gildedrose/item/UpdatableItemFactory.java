package com.gildedrose.item;

import com.gildedrose.Item;

public class UpdatableItemFactory {
    public UpdatableItem create(Item item) {
        if("Sulfuras, Hand of Ragnaros".equals(item.name)) {
            return new LegendaryUpdatableItem(item);
        }
        if("Aged Brie".equals(item.name)) {
            return new ImprovingUpdatableItem(item);
        }
        if(item.name.startsWith("Conjured ")) {
            return new ConjuredUpdatableItem(item);
        }
        if("Backstage passes to a TAFKAL80ETC concert".equals(item.name)) {
            return new BackstagePassesUpdatableItem(item);
        }
        return new DefaultUpdatableItem(item);
    }
}
