package com.gildedrose;

import org.junit.Test;

import static com.gildedrose.ItemBuilder.anItem;
import static org.assertj.core.api.Assertions.assertThat;

public class GildedRoseUpdateQualityTest {

    @Test
    public void doesNotChangeTheName() {
        String itemName = "foo";
        GildedRose app = new GildedRose(new Item[] { anItem().withName(itemName).build() });

        app.updateQuality();

        assertThat(app.items[0].name).isEqualTo(itemName);
    }

    @Test
    public void lowersTheSellInByOne() {
        int sellIn = 20;
        GildedRose app = new GildedRose(new Item[] { anItem().withSellIn(sellIn).build() });

        app.updateQuality();

        assertThat(app.items[0].sellIn).isEqualTo(sellIn - 1);
    }
}
