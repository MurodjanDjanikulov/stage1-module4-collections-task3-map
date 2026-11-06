package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.Map;

public class WordRepetitionMapCreator {
    public Map<String, Integer> createWordRepetitionMap(String sentence) {
        Map<String, Integer> result = new HashMap<>();
        if (sentence == null || sentence.isBlank()) {
            return result;
        }
        String[] splitted = sentence.toLowerCase()
                .replaceAll("[^a-z\\s]", "")
                .split("\\s+");
        for (String s : splitted) {
            result.put(s, result.getOrDefault(s, 0) + 1);
        }
        return result;
    }
}
