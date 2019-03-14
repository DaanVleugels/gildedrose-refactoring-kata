package com.gildedrose;

class DefaultQuality implements Quality {

    private static final int MAX_QUALITY = 50;

    private final int value;

    DefaultQuality(int quality) {
        if(quality > 50) {
            throw new RuntimeException("quality cannot be greater than " + MAX_QUALITY);
        }
        this.value = quality;
    }

    public int getValue() {
        return value;
    }
}
