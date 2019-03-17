package com.gildedrose.item;

import com.gildedrose.Item;
import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class UpdatableItemFactoryCreateTest {

    private static final int SELL_IN = 1;
    private static final int QUALITY = 2;
    private Item item;

    private UpdatableItemFactory factory;

    @Before
    public void setUp() {
        item = new Item(null, SELL_IN, QUALITY);
        factory = new UpdatableItemFactory();
    }

    @Test
    public void returnsADefaultUpdatableItemForAnUnknownName() {
        item.name = "unknown item";

        UpdatableItem updatableItem = factory.create(item);

        assertThat(updatableItem).isInstanceOf(DefaultUpdatableItem.class);
    }


    @Test
    public void returnsAnImprovingUpdatableItemForAnAgedBrieName() {
        item.name = "Aged Brie";

        UpdatableItem updatableItem = factory.create(item);

        assertThat(updatableItem).isInstanceOf(ImprovingUpdatableItem.class);
    }


    @Test
    public void returnsALegendaryUpdatableItemForTheSulfarasName() {
        item.name = "Sulfuras, Hand of Ragnaros";

        UpdatableItem updatableItem = factory.create(item);

        assertThat(updatableItem).isInstanceOf(LegendaryUpdatableItem.class);
    }

    @Test
    public void returnsABackstagePassesUpdatableItemtForANameStartingWithBackstagePasses() {
        item.name = "Backstage passes to Kabouter Plop";

        UpdatableItem updatableItem = factory.create(item);

        assertThat(updatableItem).isInstanceOf(BackstagePassesUpdatableItem.class);
    }

    @Test
    public void returnsAConjuredUpdatableItemtForANameStartingWithConjured() {
        item.name = "Conjured item";

        UpdatableItem updatableItem = factory.create(item);

        assertThat(updatableItem).isInstanceOf(ConjuredUpdatableItem.class);
    }

}