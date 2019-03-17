package com.gildedrose.item.sellin;

public class DefaultSellIn implements SellIn {

    private final int value;

    public DefaultSellIn(int sellIn) {
        this.value = sellIn;
    }

    public int getValue() {
        return value;
    }

    @Override
    public SellIn update() {
        return new DefaultSellIn(value - 1);
    }
}
