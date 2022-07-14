package com.gildedrose.quality;

import com.gildedrose.Item;

public class ConcertIncreaseQualityStrategy implements IncreaseQualityStrategy {
    @Override
    public void increase(Item item) {
        if (item.sellIn >= 11) {
            item.quality = item.quality + 1;
        } else if (item.sellIn >= 6) {
            item.quality = item.quality + 2;
        } else {
            item.quality = item.quality + 3;
        }
    }
}
