package com.gildedrose.quality;

import com.gildedrose.Item;

public class NormalIncreaseQualityStrategy implements IncreaseQualityStrategy {
    @Override
    public void increase(Item item) {
        item.quality = item.quality + 1;
    }
}
