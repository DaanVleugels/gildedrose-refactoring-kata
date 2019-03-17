package com.gildedrose;

import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ItemConstructorTest {

    private static final String NAME = "name";
    private static final int SELL_IN = 1234;
    private static final int QUALITY = 4321;

    private Item item;

    @Before
    public void setUp() {
        item = new Item(NAME, SELL_IN, QUALITY);
    }

    @Test
    public void setsName() {
        assertThat(item.name).isEqualTo(NAME);
    }

    @Test
    public void setsSellIn() {
        assertThat(item.sellIn).isEqualTo(SELL_IN);
    }

    @Test
    public void setsQuality() {
        assertThat(item.quality).isEqualTo(QUALITY);
    }
}
