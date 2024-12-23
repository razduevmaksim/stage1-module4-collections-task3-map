package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.Map;

public class KeyValueSwapper {
    public Map<String, Integer> swap(Map<Integer, String> sourceMap) {
        Map<String, Integer> swappedMap = new HashMap<String, Integer>();

        for (Map.Entry<Integer, String> e : sourceMap.entrySet())
            swappedMap.put(e.getValue(), e.getKey());

        return swappedMap;
    }
}
