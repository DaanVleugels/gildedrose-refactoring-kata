package com.gildedrose;

import com.gildedrose.quality.IncreasingQuality;
import com.gildedrose.quality.Quality;
import com.gildedrose.sellin.DefaultSellIn;
import com.gildedrose.sellin.SellIn;

public class ImprovingUpdatableItem implements UpdatableItem {

    private Name name;
    private SellIn sellIn;
    private Quality quality;

    public ImprovingUpdatableItem(Item item) {
        name = new Name(item.name);
        sellIn = new DefaultSellIn(item.sellIn);
        quality = new IncreasingQuality(item.quality);
    }

    @Override
    public void updateQuality() {
        this.sellIn = this.sellIn.update();
        this.quality = this.quality.update(sellIn);

    }

    @Override
    public Item asItem() {
        return new Item(name.getValue(), sellIn.getValue(), quality.getValue());
    }
}
