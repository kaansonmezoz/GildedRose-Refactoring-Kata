package com.gildedrose;

import com.gildedrose.quality.IncreaseQualityStrategy;

public class Item {

    private static final int QUALITY_UPPER_LIMIT = 50;
    private static final int QUALITY_LOWER_LIMIT = 0;

    private static final String SULFURAS_NAME = "Sulfuras, Hand of Ragnaros";
    private static final String CONCERT_NAME = "Backstage passes to a TAFKAL80ETC concert";
    private static final String AGED_BRIE_NAME = "Aged Brie";

    public String name;

    public int sellIn;

    public int quality;

    public Item(String name, int sellIn, int quality) {
        this.name = name;
        this.sellIn = sellIn;
        this.quality = quality;
    }

    //TODO: 14/07/2022 kaan.sonmezoz: find better name
    public boolean isQualityLowerThanUpperLimit() {
        return this.quality < QUALITY_UPPER_LIMIT;
    }

    //TODO: 14/07/2022 kaan.sonmezoz: find better name
    public boolean isQualityGreaterThanLowerLimit() {
        return this.quality > QUALITY_LOWER_LIMIT;
    }

    public boolean isSulfuras() {
        return name.equals(SULFURAS_NAME);
    }

    public boolean isConcert() {
        return name.equals(CONCERT_NAME);
    }

    public boolean isAgedBrie() {
        return name.equals(AGED_BRIE_NAME);
    }

    public void increaseQuality(IncreaseQualityStrategy strategy) {
        strategy.increase(this);
    }

    @Override
    public String toString() {
        return this.name + ", " + this.sellIn + ", " + this.quality;
    }
}
