package com.gildedrose.item;

import com.gildedrose.Item;
import com.gildedrose.Name;
import com.gildedrose.quality.LegendaryQuality;
import com.gildedrose.quality.Quality;
import com.gildedrose.sellin.LegendarySellIn;
import com.gildedrose.sellin.SellIn;

public class LegendaryUpdatableItem implements UpdatableItem {

    private Name name;
    private SellIn sellIn;
    private Quality quality;

    public LegendaryUpdatableItem(Item item) {
        name = new Name(item.name);
        sellIn = new LegendarySellIn(item.sellIn);
        quality = new LegendaryQuality(item.quality);
    }

    @Override
    public void updateQuality() {
        this.sellIn = sellIn.update();
    }

    @Override
    public Item asItem() {
        return new Item(name.getValue(), sellIn.getValue(), quality.getValue());
    }
}
