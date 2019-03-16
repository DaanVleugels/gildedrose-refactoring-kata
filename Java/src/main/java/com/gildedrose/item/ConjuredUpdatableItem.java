package com.gildedrose.item;

import com.gildedrose.Item;
import com.gildedrose.Name;
import com.gildedrose.quality.ConjuredQuality;
import com.gildedrose.quality.Quality;
import com.gildedrose.sellin.DefaultSellIn;
import com.gildedrose.sellin.SellIn;

public class ConjuredUpdatableItem implements UpdatableItem {
    private Name name;
    private SellIn sellIn;
    private Quality quality;

    public ConjuredUpdatableItem(Item item) {
        this.name = new Name(item.name);
        this.sellIn = new DefaultSellIn(item.sellIn);
        this.quality = new ConjuredQuality(item.quality);
    }

    @Override
    public void updateQuality() {
        sellIn = sellIn.update();
        quality = quality.update(sellIn);
    }

    @Override
    public Item asItem() {
        return new Item(name.getValue(), sellIn.getValue(), quality.getValue());
    }
}
