package com.gildedrose.quality;

import com.gildedrose.Item;

public class NormalQualityStrategy implements QualityStrategy {
    @Override
    public void increase(Item item) {
        item.quality = item.quality + 1;
    }
}
