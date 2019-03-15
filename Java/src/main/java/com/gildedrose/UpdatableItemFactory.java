package com.gildedrose;

public class UpdatableItemFactory {
    public UpdatableItem create(Item item) {
        if("Sulfuras, Hand of Ragnaros".equals(item.name)) {
            return new LegendaryUpdatableItem(item);
        }
        return new DefaultUpdatableItem(item);
    }
}
