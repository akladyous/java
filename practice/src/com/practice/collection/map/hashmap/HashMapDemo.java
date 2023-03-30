package com.practice.collection.map.hashmap;

import javax.xml.namespace.QName;
import java.util.*;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("a", 1);
        map.put("b", 2);
        map.put("c", 3);
        map.forEach((key, value) -> {
            System.out.printf("key : %-10s value %-10d%n", key, value);
        });
        map.entrySet().forEach(pair -> {
            System.out.println(pair.getKey() + pair.getValue());
        });
        Set<Map.Entry<String, Integer>> pairs = map.entrySet();

        map.compute("a",(k,v) -> {
            return v*10;
        });
        map.computeIfPresent("a", (k,v) -> v*v);
        map.computeIfAbsent("e", k-> map.size()+1);

        map.merge("d", 4, Math::addExact);

        map.containsKey("a");
        map.containsValue(1);
        int aValue = map.get("a");
        map.putIfAbsent("f", 6);
        map.getOrDefault("f", 6);
        map.remove("a", 3);
        map.keySet().forEach(key -> {
            map.compute(key, (k, v) -> {
               return v %2 == 0 ? v : v * 3;
            });
        });

        System.out.println(map);
//        demo1();
    }


    public static void demo1() {
        Map<String, String> users = new HashMap<>();
        users.put("name", "paolo");
        // hashMap with multiple Values data types

        Map<String, Object> mapObj = new HashMap<>();
        mapObj.put("age", 20);
        mapObj.put("name", "john");
        mapObj.put("isActive", true);
        mapObj.put("test", 1234);
        Set mapObjEntrySet = mapObj.entrySet();
        Iterator mapObjIterator = mapObjEntrySet.iterator();

        System.out.println(mapObj);
        System.out.println(mapObj.containsKey("name"));
        System.out.println(mapObj.containsValue("john"));
        System.out.println(mapObj.containsValue(20));
        System.out.println(mapObj.remove("test"));
        System.out.println("mapObj.entrySet() : " + mapObjEntrySet);
        System.out.println("mapObj size : " + mapObj.size());
        // iterate over hashMap
//        System.out.println();
        for(Map.Entry pair : mapObj.entrySet()) {
            System.out.println(pair.getKey() + " " + pair.getValue());
        }
//        mapObj.entrySet().stream();

    }
}


