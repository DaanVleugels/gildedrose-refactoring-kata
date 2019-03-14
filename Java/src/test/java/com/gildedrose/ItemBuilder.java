package com.gildedrose;

import java.util.Random;

public final class ItemBuilder {
    private String name = "item" + new Random().nextInt();
    private int sellIn = 20;
    private int quality = 20;

    private ItemBuilder() {
    }

    public static ItemBuilder anItem() {
        return new ItemBuilder();
    }

    public ItemBuilder withName(String name) {
        this.name = name;
        return this;
    }

    public ItemBuilder withSellIn(int sellIn) {
        this.sellIn = sellIn;
        return this;
    }

    public ItemBuilder withQuality(int quality) {
        this.quality = quality;
        return this;
    }

    public Item build() {
        return new Item(name, sellIn, quality);
    }
}
