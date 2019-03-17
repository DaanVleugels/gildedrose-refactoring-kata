package com.gildedrose;

import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ItemToStringTest {

    private static final String NAME = "name";
    private static final int SELL_IN = 1234;
    private static final int QUALITY = 4321;
    private static final String EXPECTED_STRING = "name, 1234, 4321";

    private Item item;

    @Before
    public void setUp() {
        item = new Item(NAME, SELL_IN, QUALITY);
    }

    @Test
    public void printsProperties() {
        assertThat(item.toString()).isEqualTo(EXPECTED_STRING);
    }
}
