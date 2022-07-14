package com.gildedrose.quality;

import com.gildedrose.Item;

public class TwiceIncreaseQualityStrategy implements IncreaseQualityStrategy {

    //TODO: 14/07/2022 kaan.sonmezoz: bu sekilde yapmak yerine velocity'sini de 1 2 seklinde de verebiliriz.
    //TODO: 14/07/2022 kaan.sonmezoz: ona da bakabiliriz.
    //TODO: 14/07/2022 kaan.sonmezoz: ya da amaca yonelik bir isimlendirme yapmamiz gerekiyor. Ama cok mantikli degil gibi.
    //TODO: 14/07/2022 kaan.sonmezoz: surekli yeni bir implementasyon mu ekleyecegim yani ...

    @Override
    public void increase(Item item) {
        item.quality = item.quality + 2;
    }
}
