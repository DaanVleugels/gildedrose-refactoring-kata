package com.gildedrose.item;

import com.gildedrose.Item;
import com.gildedrose.item.quality.LegendaryQuality;
import com.gildedrose.item.sellin.LegendarySellIn;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LegendaryUpdatableItemConstructorTest {

    private static final int SELL_IN = 2;
    private static final int QUALITY = 4;
    private static final String NAME = "name";

    @Test
    public void returnsItemWithCorrectProperties() {
        Item item = new Item(NAME, SELL_IN, QUALITY);
        UpdatableItem updatableItem = new LegendaryUpdatableItem(item);

        assertThat(updatableItem.name.getValue()).isEqualTo(NAME);
        assertThat(updatableItem.quality).isInstanceOf(LegendaryQuality.class);
        assertThat(updatableItem.quality.getValue()).isEqualTo(QUALITY);
        assertThat(updatableItem.sellIn).isInstanceOf(LegendarySellIn.class);
        assertThat(updatableItem.sellIn.getValue()).isEqualTo(SELL_IN);
    }
}
