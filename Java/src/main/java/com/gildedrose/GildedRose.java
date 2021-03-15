package com.gildedrose;

class GildedRose {
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        for (Item item : items) {
        	switch (item.name) {
	            case "Aged Brie" :
	            	item.sellIn--;
	            	item.quality = (item.quality++)>50 ? 50 : (item.quality++);
	                break;
	            case "Sulfuras, Hand of Ragnaros" :
	                break;
	            case "Backstage passes to a TAFKAL80ETC concert" :
	            	item.sellIn--;
	            	item.quality = (item.quality+1)>50 ? 50 : (item.quality+1);
	                break; 
	            case "Conjured Mana Cake" :
	            	item.sellIn--;
	            	item.quality = (item.quality - item.quality)<0 ? 0 : (item.quality - item.quality);
	                break;
	            default:
	            	if( item.sellIn<=0 ) {
	            		item.quality = (item.quality - item.quality)<0 ? 0 : (item.quality - item.quality);
	            	}
	            	else {
	            		if(item.sellIn>5 && item.sellIn<=10) {
	            			item.sellIn--;
	            			item.quality = item.quality+2>50 ? 50 : item.quality+2;
	            		}
		            		else if(item.sellIn<=5 && item.sellIn>0) {
		            			item.sellIn--;
		            			item.quality = item.quality+3>50 ? 50 : item.quality+3;
		            		}
		            	else {
		            		item.sellIn--;
		            		item.quality = (item.quality--)<0 ? 0 : (item.quality--);
		            	}
	            	}
	            	
	                break;
	        }
        }
    }
}