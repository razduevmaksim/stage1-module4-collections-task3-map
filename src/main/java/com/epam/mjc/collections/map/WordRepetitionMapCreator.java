package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.Map;

public class WordRepetitionMapCreator {
    public Map<String, Integer> createWordRepetitionMap(String sentence) {
        Map<String, Integer> wordRepetition = new HashMap<>();

        if (sentence == null || sentence.isEmpty()) {
            return wordRepetition;
        }

        String[] words = sentence.toLowerCase().split("\\W+");

        for (String word : words){
            if (wordRepetition.containsKey(word)) continue;

            int count = 0;

            for (String nextWord: words){
                if (nextWord.equals(word))
                    count++;
            }

            wordRepetition.put(word, count);
        }

        return wordRepetition;
    }
}
