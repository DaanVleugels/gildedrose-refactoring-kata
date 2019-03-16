package com.gildedrose.item;

import com.gildedrose.Item;
import com.gildedrose.Name;
import com.gildedrose.quality.DefaultQuality;
import com.gildedrose.quality.Quality;
import com.gildedrose.sellin.DefaultSellIn;
import com.gildedrose.sellin.SellIn;

public abstract class UpdatableItem {

    protected Name name;
    protected SellIn sellIn;
    protected Quality quality;

    protected UpdatableItem(Item item) {
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
