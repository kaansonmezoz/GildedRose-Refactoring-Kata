package com.gildedrose.quality;

import com.gildedrose.Item;

public class ConcertQualityStrategy implements QualityStrategy {

    //TODO: 14/07/2022 kaan.sonmezoz: bunu concertBackStagePass diye vs isimlendirmek gerekebilir daha sonra

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
