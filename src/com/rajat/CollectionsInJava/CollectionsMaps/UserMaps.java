package com.rajat.CollectionsInJava.CollectionsMaps;

import java.util.HashMap;
import java.util.Map;

public class UserMaps {

    private Map<String, String> languages = new HashMap<>();

    public Map<String, String> getLanguages() {
        return languages;
    }

    public void setLanguages(Map<String, String> languages) {
        this.languages = languages;
    }

    public void addLanguages(String key, String value){
        if (this.languages.containsKey(key)){
            System.out.println(key + " is Already Added !!");
            return;
        }
        this.languages.put(key,value);

    }

}
