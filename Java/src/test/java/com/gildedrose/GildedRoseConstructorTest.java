package com.gildedrose;

import org.junit.Test;

import static com.gildedrose.ItemBuilder.anItem;
import static org.assertj.core.api.Assertions.assertThat;

public class GildedRoseConstructorTest {

    @Test
    public void setsItems() {
        Item item1 = anItem().build();
        Item item2 = anItem().build();

        GildedRose app = new GildedRose(new Item[] {item1, item2});

        assertThat(app.items).containsExactly(item1, item2);
    }

}
