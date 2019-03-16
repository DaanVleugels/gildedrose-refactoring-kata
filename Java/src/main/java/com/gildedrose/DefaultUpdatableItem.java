package com.gildedrose;

import com.gildedrose.quality.DefaultQuality;
import com.gildedrose.quality.Quality;
import com.gildedrose.sellin.DefaultSellIn;
import com.gildedrose.sellin.SellIn;

class DefaultUpdatableItem implements UpdatableItem {

    private Name name;
    private Quality quality;
    private SellIn sellIn;

    public DefaultUpdatableItem(Item item) {
        this.name = new Name(item.name);
        this.quality = new DefaultQuality(item.quality);
        this.sellIn = new DefaultSellIn(item.sellIn);
    }

    @Override
    public void updateQuality() {
        quality = quality.update(sellIn);
        sellIn = sellIn.update();
    }

    @Override
    public Item asItem() {
        return new Item(name.getValue(), sellIn.getValue(), quality.getValue());
    }
}
