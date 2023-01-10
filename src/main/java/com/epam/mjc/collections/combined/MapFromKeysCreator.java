package com.epam.mjc.collections.combined;

import java.util.Map;
import java.util.Set;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.stream.Collectors;
public class MapFromKeysCreator {
    List<String> setOfWords = new ArrayList<>();

    public Map<Integer, Set<String>> createMap(Map<String, Integer> sourceMap) {
        Map<Integer, Set<String>> lengthOfKeys = new HashMap<>();
        sourceMap.keySet().stream().sorted((s1, s2) -> Integer.compare(s1.length(), s2.length())).forEach(word -> {
            if (lengthOfKeys.containsKey(word.length())) {
                setOfWords.add(word);
                lengthOfKeys.put(word.length(), setOfWords.stream().collect(Collectors.toSet()));
            } else {
                setOfWords = new ArrayList<>();
                setOfWords.add(word);
                lengthOfKeys.put(word.length(), setOfWords.stream().collect(Collectors.toSet()));
            }
        });
        return lengthOfKeys;
    }
}
