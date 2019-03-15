package com.gildedrose;

class SellIn {

    private final int value;

    SellIn(int sellIn) {
        this.value = sellIn;
    }

    int getValue() {
        return value;
    }

    SellIn update() {
        return new SellIn(value - 1);
    }
}
