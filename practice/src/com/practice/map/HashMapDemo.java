package com.practice.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

    public static void main(String[] args) {
        Map<String, String> users = new HashMap<>();
        users.put("name", "paolo");

        // hashMap with multiple data types
        Map<String, Object> mapObj = new HashMap<>();
        mapObj.put("age", 20);
        mapObj.put("name", "john");
        mapObj.put("isActive", true);

    }
}
