package com.gildedrose;

public class LegendaryUpdatableItem implements UpdatableItem {

    private Name name;
    private SellIn sellIn;
    private Quality quality;

    public LegendaryUpdatableItem(Item item) {
        name = new Name(item.name);
        sellIn = new SellIn(item.sellIn);
        quality = new LegendaryQuality();
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
