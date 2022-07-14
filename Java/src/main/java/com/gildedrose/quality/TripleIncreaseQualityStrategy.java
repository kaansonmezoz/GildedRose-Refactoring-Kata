package com.gildedrose.quality;

import com.gildedrose.Item;

public class TripleIncreaseQualityStrategy implements IncreaseQualityStrategy {
    @Override
    public void increase(Item item) {
        item.quality = item.quality + 3;
    }
}
