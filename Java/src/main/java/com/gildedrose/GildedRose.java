package com.gildedrose;

import com.gildedrose.item.UpdatableItem;
import com.gildedrose.item.UpdatableItemFactory;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class GildedRose {
    private UpdatableItemFactory updatableItemFactory;
    Item[] items;

    public GildedRose(Item[] items) {
        this.updatableItemFactory = new UpdatableItemFactory();
        this.items = items;
    }

    public void updateQuality() {
        List<UpdatableItem> updatableItems = Arrays.stream(items).map(updatableItemFactory::create).collect(Collectors.toList());

        updatableItems.forEach(UpdatableItem::updateQuality);
        items = updatableItems.stream().map(UpdatableItem::asItem).toArray(Item[]::new);
    }

}