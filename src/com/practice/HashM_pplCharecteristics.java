package com.practice;

import java.lang.reflect.Field;
import java.util.*;

public class HashM_pplCharecteristics extends HashMap<String, String> {
    private static int countsInstanceNames;
    private final Map<String, String> peopleCharecteristics;

    public HashM_pplCharecteristics() {
        this.peopleCharecteristics = new HashMap<>();
    }

    public Map<String, String> getPeopleCharecteristics() {
        System.out.println(getTheInstanceName());
        return peopleCharecteristics;
    }

    // making put() adding a unique key
    @Override
    public void put(String key, String value) { // i cannot change the return type
        if(!this.peopleCharecteristics.containsKey(key)) {
            System.out.println(key + "  --->  added");
            this.peopleCharecteristics.put(key, value);
        } else {
            System.out.println("Sorry. Key is within the Hash Map");
        }
    }

    @Override
    public String remove(Object key) {
        return super.remove(key);
    }

    @Override
    public String toString() {
        return "HashM_pplCharecteristics{" + "peopleCharecteristics=" + peopleCharecteristics + '}';
    }

    private static String getTheInstanceName() {
        for(Field f : Main.class.getDeclaredFields()) {
            if(f.getType().equals(HashM_pplCharecteristics.class))//Here you would retrieve the variable name when the type is dieselEngine.
                return f.getName();
        }
        return null; //actually, it will never happen
    }
}
