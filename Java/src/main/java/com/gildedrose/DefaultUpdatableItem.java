package com.gildedrose;

class DefaultUpdatableItem implements UpdatableItem {

    private Name name;
    private Quality quality;
    private SellIn sellIn;

    public DefaultUpdatableItem(Item item) {
        this.name = new Name(item.name);
        this.quality = new DefaultQuality(item.quality);
        this.sellIn = new SellIn(item.sellIn);
    }

    @Override
    public void updateQuality() {
        quality = new DefaultQuality(quality.getValue() - 1);
        sellIn = new SellIn(sellIn.getValue() - 1);
    }

    @Override
    public Item asItem() {
        return new Item(name.getValue(), quality.getValue(), sellIn.getValue());
    }
}
