package com.packages;

import java.util.*;

public class CollectionsDemo {
    public static void main(String[] args){
        List<String> names = new ArrayList<>();
        names.add("Srijal");
        names.add("Shreya");
        names.add("Srijal");

        System.out.println("Names List: " + names);

        Set<String> uniqueNames = new HashSet<>(names);
        System.out.println("Unique names: " + uniqueNames);

        Map<String, Integer> nameToAge = new HashMap<>();
        nameToAge.put("Srijal", 21);
        nameToAge.put("Shreya", 20);
        System.out.println("Map: " + nameToAge);
    }
}
