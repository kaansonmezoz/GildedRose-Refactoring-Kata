package com.gildedrose.quality;

import com.gildedrose.Item;

public class ConcertIncreaseQualityStrategy implements IncreaseQualityStrategy {
    @Override
    public void increase(Item item) {
        decideIncreaseQualityStrategyForConcert(item).increase(item);
    }

    private IncreaseQualityStrategy decideIncreaseQualityStrategyForConcert(Item item) {
        IncreaseQualityStrategy increaseQualityStrategy;
        if(item.sellIn >= 11) {
            increaseQualityStrategy = new NormalIncreaseQualityStrategy();
        } else if(item.sellIn >= 6){
            increaseQualityStrategy = new TwiceIncreaseQualityStrategy();
        } else {
            increaseQualityStrategy = new TripleIncreaseQualityStrategy();
        }
        return increaseQualityStrategy;
    }
}
