package com.gildedrose;

public class Item {

    private static final int QUALITY_UPPER_LIMIT = 50;
    private static final int QUALITY_LOWER_LIMIT = 0;

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

    @Override
    public String toString() {
        return this.name + ", " + this.sellIn + ", " + this.quality;
    }
}
