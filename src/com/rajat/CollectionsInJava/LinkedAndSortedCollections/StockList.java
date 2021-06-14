package com.rajat.CollectionsInJava.LinkedAndSortedCollections;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class StockList {

    private final Map<String, ItemStock> stockList;

    public StockList() {
        this.stockList = new HashMap<>();
    }

    public int addItem(ItemStock itemStock){
        if(itemStock != null){
            ItemStock inStock = stockList.get(itemStock.getName());
            if(inStock != null){
                itemStock.adjustStock(inStock.getQuantityStock());
            }
            stockList.put(itemStock.getName(),itemStock);
            return itemStock.getQuantityStock();
        }
        return 0;
    }

    public int sellStock(String item, int quantity){
        ItemStock inStock = stockList.get(item);

        if(inStock != null && inStock.getQuantityStock() >= quantity && quantity > 0){
            inStock.adjustStock(-quantity);
            return inStock.getQuantityStock();
        }
        return 0;
    }

    public ItemStock getStockItem(String key) {
        return stockList.get(key);
    }

    public Map<String, ItemStock> items(){
        return Collections.unmodifiableMap(stockList);
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        System.out.println("All items in stock currently \t");
        for (Map.Entry<String, ItemStock> item : stockList.entrySet()){
            ItemStock itemInStock = item.getValue();

            sb.append("Item  : " + item.getKey() + " ,Price : " + item.getValue().getPrice() + " ,Number of Items : " +
                    item.getValue().getQuantityStock() + "\n");
        }
        return sb.toString();
    }
}
