package com.gildedrose.item;

import com.gildedrose.Item;
import com.gildedrose.item.name.Name;
import com.gildedrose.item.quality.DefaultQuality;
import com.gildedrose.item.quality.Quality;
import com.gildedrose.item.sellin.DefaultSellIn;
import com.gildedrose.item.sellin.SellIn;

public abstract class UpdatableItem {

    protected Name name;
    protected SellIn sellIn;
    protected Quality quality;

    UpdatableItem(Item item) {
        this.name = new Name(item.name);
        this.sellIn = new DefaultSellIn(item.sellIn);
        this.quality = new DefaultQuality(item.quality);
    }

    public void updateQuality() {
        sellIn = sellIn.update();
        quality = quality.update(sellIn);
    }

    public Item asItem() {
        return new Item(name.getValue(), sellIn.getValue(), quality.getValue());
    }
}
