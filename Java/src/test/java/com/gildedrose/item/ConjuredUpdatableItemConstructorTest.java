package com.gildedrose.item;

import com.gildedrose.Item;
import com.gildedrose.item.quality.ConjuredQuality;
import com.gildedrose.item.sellin.DefaultSellIn;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ConjuredUpdatableItemConstructorTest {

    private static final int SELL_IN = 2;
    private static final int QUALITY = 4;
    private static final String NAME = "name";

    @Test
    public void returnsItemWithCorrectProperties() {
        Item item = new Item(NAME, SELL_IN, QUALITY);
        UpdatableItem updatableItem = new ConjuredUpdatableItem(item);

        assertThat(updatableItem.name.getValue()).isEqualTo(NAME);
        assertThat(updatableItem.quality).isInstanceOf(ConjuredQuality.class);
        assertThat(updatableItem.quality.getValue()).isEqualTo(QUALITY);
        assertThat(updatableItem.sellIn).isInstanceOf(DefaultSellIn.class);
        assertThat(updatableItem.sellIn.getValue()).isEqualTo(SELL_IN);
    }
}
