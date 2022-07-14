package com.gildedrose;

class GildedRose {
    private static final int QUALITY_UPPER_LIMIT = 50;
    private static final int QUALITY_LOWER_LIMIT = 0;

/*

============================================
Gilded Rose Requirements Specification
============================================

    - Small Inn
    - Inkeeper: Allison
    - Buys & sells goods
    - Qualify of bought goods degrade as the time is passed.

    - Item:
        - SellIn value: the number of days is left to sell the item. (sell by date)
        - Quality value: how valuable the item is
        - At the end of each day both values are lowered for every item.
        - The Quality of an item is never negative
        - The Quality of an item is never more than 50
        - Once the sell by date has passed, Quality degrades twice as fast

    - Exceptions:
        - "Aged Brie" actually increases in Quality the older it gets
        - "Sulfuras", being a legendary item, never has to be sold or decreases in Quality
        - "Backstage passes", like aged brie, increases in Quality as its SellIn value approaches;
	        - Quality increases by 2 when there are 10 days or less and by 3 when there are 5 days or less but
	        - Quality drops to 0 after the concert
        - An item can never have its Quality increase above 50, however "Sulfuras" is a legendary item and as such
          its Quality is 80 and it never alters.

    - Task: Add new feature => Enables to sell items from a new category
        - A deal has been signed with conjured items supplier.
        - "Conjured" items degrade in Quality twice as fast as normal items

    * Feel free to make any changes to the UpdateQuality method and add any new code as long as everything still works correctly
    * However, do not alter the Item class or Items property as those belong to the goblin in the corner who will insta-rage and one-shot you
      as he doesn't believe in shared code ownership (you can make the UpdateQuality method and Items property static if you like, we'll cover for you).


 */


    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        for (int i = 0; i < items.length; i++) {
            if (!items[i].name.equals("Aged Brie")
                && !items[i].name.equals("Backstage passes to a TAFKAL80ETC concert")) {
                if (items[i].quality > QUALITY_LOWER_LIMIT) {
                    if (!items[i].name.equals("Sulfuras, Hand of Ragnaros")) {
                        items[i].quality = items[i].quality - 1;
                    }
                }
            } else {
                if (items[i].quality < QUALITY_UPPER_LIMIT) {
                    items[i].quality = items[i].quality + 1;

                    if (items[i].name.equals("Backstage passes to a TAFKAL80ETC concert")) {
                        if (items[i].sellIn < 11) {
                            if (items[i].quality < QUALITY_UPPER_LIMIT) {
                                items[i].quality = items[i].quality + 1;
                            }
                        }

                        if (items[i].sellIn < 6) {
                            if (items[i].quality < QUALITY_UPPER_LIMIT) {
                                items[i].quality = items[i].quality + 1;
                            }
                        }
                    }
                }
            }

            if (!items[i].name.equals("Sulfuras, Hand of Ragnaros")) {
                items[i].sellIn = items[i].sellIn - 1;
            }

            if (items[i].sellIn < 0) {
                if (!items[i].name.equals("Aged Brie")) {
                    if (!items[i].name.equals("Backstage passes to a TAFKAL80ETC concert")) {
                        if (items[i].quality > QUALITY_LOWER_LIMIT) {
                            if (!items[i].name.equals("Sulfuras, Hand of Ragnaros")) {
                                items[i].quality = items[i].quality - 1;
                            }
                        }
                    } else {
                        items[i].quality = items[i].quality - items[i].quality;
                    }
                } else {
                    if (items[i].quality < QUALITY_UPPER_LIMIT) {
                        items[i].quality = items[i].quality + 1;
                    }
                }
            }
        }
    }

}
