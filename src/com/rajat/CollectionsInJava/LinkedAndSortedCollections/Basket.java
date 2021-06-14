package com.rajat.CollectionsInJava.LinkedAndSortedCollections;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Basket {

    private final String basketName;
    private final Map<ItemStock, Integer> basketList;

    public Basket(String basketName) {
        this.basketName = basketName;
        this.basketList = new HashMap<>();
    }

    public int addToBasket(ItemStock item, int quantity){
        if((item != null) && (quantity > 0)){
            int inBasket = basketList.getOrDefault(item,0);
            basketList.put(item, inBasket + quantity);
            return basketList.get(item);
        }
        return 0;
    }

    public Map<ItemStock, Integer> getItems(){
        return Collections.unmodifiableMap(basketList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Items in basket \t");

        for(Map.Entry<ItemStock, Integer> items : basketList.entrySet()){
            sb.append("\n");
            sb.append("\t" + " Item Name : " + items.getKey().getName() + " Quantity : " + items.getValue());
        }

        return sb.toString();
    }
}
