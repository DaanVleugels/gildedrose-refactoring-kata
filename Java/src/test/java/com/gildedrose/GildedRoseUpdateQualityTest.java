package com.gildedrose;

import org.junit.Test;

import static com.gildedrose.ItemBuilder.anItem;
import static org.assertj.core.api.Assertions.assertThat;

public class GildedRoseUpdateQualityTest {

    private static final int MAXIMUM_QUALITY = 50;
    private static final int MINIMUM_QUALITY = 0;

    @Test
    public void doesNotChangeTheName() {
        String itemName = "foo";
        GildedRose app = new GildedRose(new Item[]{anItem().withName(itemName).build()});

        app.updateQuality();

        assertThat(app.items[0].name).isEqualTo(itemName);
    }

    @Test
    public void lowersTheSellInByOne() {
        int sellIn = 20;
        GildedRose app = new GildedRose(new Item[]{anItem().withSellIn(sellIn).build()});

        app.updateQuality();

        assertThat(app.items[0].sellIn).isEqualTo(sellIn - 1);
    }

    @Test
    public void lowersTheQualityOfARegularItemByOne() {
        Item item = anItem().build();
        int initialQuality = item.quality;
        GildedRose app = new GildedRose(new Item[]{item});

        app.updateQuality();

        assertThat(app.items[0].quality).isEqualTo(initialQuality - 1);
    }

    @Test
    public void doesNotChangeTheQualityOfLegendaryItems() {
        Item item = anItem().legendary().build();
        int initialQuality = item.quality;
        GildedRose app = new GildedRose(new Item[]{item});

        app.updateQuality();

        assertThat(app.items[0].quality).isEqualTo(initialQuality);
    }

    @Test
    public void doesNotChangeTheSellInOfLegendaryItems() {
        Item item = anItem().legendary().build();
        int initialSellIn = item.sellIn;
        GildedRose app = new GildedRose(new Item[]{item});

        app.updateQuality();

        assertThat(app.items[0].sellIn).isEqualTo(initialSellIn);
    }

    @Test
    public void raisesTheQualityOfAgedBrie() {
        Item item = anItem().agedBrie().build();
        int initialQuality = item.quality;
        GildedRose app = new GildedRose(new Item[]{item});

        app.updateQuality();

        assertThat(app.items[0].quality).isEqualTo(initialQuality + 1);
    }

    @Test
    public void qualityCannotBecomeHigherThanFifty() {
        Item item = anItem().agedBrie().withQuality(MAXIMUM_QUALITY).build();
        GildedRose app = new GildedRose(new Item[]{item});

        app.updateQuality();

        assertThat(app.items[0].quality).isEqualTo(MAXIMUM_QUALITY);
    }

    @Test
    public void qualityCannotBecomeNegative() {
        Item item = anItem().withQuality(MINIMUM_QUALITY).build();
        GildedRose app = new GildedRose(new Item[]{item});

        app.updateQuality();

        assertThat(app.items[0].quality).isEqualTo(MINIMUM_QUALITY);
    }


    @Test
    public void lowersQualityOfARegularItemByTwoWhenSellInDateIsPassed() {
        Item item = anItem().withSellIn(0).build();
        int initialQuality = item.quality;
        GildedRose app = new GildedRose(new Item[]{item});

        app.updateQuality();

        assertThat(app.items[0].quality).isEqualTo(initialQuality - 2);
    }

    @Test
    public void raisesQualityOfAgedBrieByTwoWhenSellInDateIsPassed() {
        Item item = anItem().agedBrie().withSellIn(0).build();
        int initialQuality = item.quality;
        GildedRose app = new GildedRose(new Item[]{item});

        app.updateQuality();

        assertThat(app.items[0].quality).isEqualTo(initialQuality + 2);
    }

    @Test
    public void raisesQualityOfBackStagePasses() {
        Item item = anItem().backStagePass().build();
        int initialQuality = item.quality;
        GildedRose app = new GildedRose(new Item[]{item});

        app.updateQuality();

        assertThat(app.items[0].quality).isEqualTo(initialQuality + 1);
    }

    @Test
    public void raisesQualityOfBackStagePassesByTwoWhenSellInIsLowerThanTen() {
        Item item = anItem().backStagePass().withSellIn(10).build();
        int initialQuality = item.quality;
        GildedRose app = new GildedRose(new Item[]{item});

        app.updateQuality();

        assertThat(app.items[0].quality).isEqualTo(initialQuality + 2);
    }

    @Test
    public void raisesQualityOfBackStagePassesByThreeWhenSellInIsLowerThanFive() {
        Item item = anItem().backStagePass().withSellIn(5).build();
        int initialQuality = item.quality;
        GildedRose app = new GildedRose(new Item[]{item});

        app.updateQuality();

        assertThat(app.items[0].quality).isEqualTo(initialQuality + 3);
    }

    @Test
    public void setsQualityOfBackStagePassesToZeroWhenSellInDateIsPassed() {
        Item item = anItem().backStagePass().withSellIn(0).build();
        GildedRose app = new GildedRose(new Item[]{item});

        app.updateQuality();

        assertThat(app.items[0].quality).isEqualTo(0);
    }


    @Test
    public void lowersQualityOfAConjuredItemByTwo() {
        Item item = anItem().conjured().build();
        int initialQuality = item.quality;
        GildedRose app = new GildedRose(new Item[]{item});

        app.updateQuality();

        assertThat(app.items[0].quality).isEqualTo(initialQuality - 2);
    }
}
