package com.gildedrose;

import com.gildedrose.item.UpdatableItem;
import com.gildedrose.item.UpdatableItemFactory;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class GildedRose {
    private final UpdatableItemFactory updatableItemFactory;
    Item[] items;

    public GildedRose(Item[] items) {
        this.updatableItemFactory = new UpdatableItemFactory();
        this.items = items;
    }

    public void updateQuality() {
        newImplementation();

//        oldImplementation();
    }

    private void newImplementation() {
        List<UpdatableItem> updatableItems = Arrays.stream(items).map(updatableItemFactory::create).collect(Collectors.toList());

        updatableItems.forEach(UpdatableItem::updateQuality);
        items = updatableItems.stream().map(UpdatableItem::asItem).toArray(Item[]::new);
    }

    private void oldImplementation() {
        for (int i = 0; i < items.length; i++) {
            if (!items[i].name.equals("Aged Brie")
                    && !items[i].name.equals("Backstage passes to a TAFKAL80ETC concert")) {
                if (items[i].quality > 0) {
                    if (!items[i].name.equals("Sulfuras, Hand of Ragnaros")) {
                        items[i].quality = items[i].quality - 1;
                    }
                }
            } else {
                if (items[i].quality < 50) {
                    items[i].quality = items[i].quality + 1;

                    if (items[i].name.equals("Backstage passes to a TAFKAL80ETC concert")) {
                        if (items[i].sellIn < 11) {
                            if (items[i].quality < 50) {
                                items[i].quality = items[i].quality + 1;
                            }
                        }

                        if (items[i].sellIn < 6) {
                            if (items[i].quality < 50) {
                                items[i].quality = items[i].quality + 1;
                            }
                        }
                    }
                }
            }

            if (!items[i].name.equals("Sulfuras, Hand of Ragnaros")) {
                items[i].sellIn = items[i].sellIn - 1;
            }

            if (items[i].sellIn < 0) {
                if (!items[i].name.equals("Aged Brie")) {
                    if (!items[i].name.equals("Backstage passes to a TAFKAL80ETC concert")) {
                        if (items[i].quality > 0) {
                            if (!items[i].name.equals("Sulfuras, Hand of Ragnaros")) {
                                items[i].quality = items[i].quality - 1;
                            }
                        }
                    } else {
                        items[i].quality = items[i].quality - items[i].quality;
                    }
                } else {
                    if (items[i].quality < 50) {
                        items[i].quality = items[i].quality + 1;
                    }
                }
            }
        }
    }
}