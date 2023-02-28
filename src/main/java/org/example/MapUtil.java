package org.example;

import java.util.Arrays;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Predicate;

public class MapUtil {
    private Map<String, String> map;

    private String[] sensualKeys;

    public MapUtil(Map<String, String> map, String[] sensualKeys) {
        this.map = map;
        this.sensualKeys = sensualKeys;
    }

    private final Predicate<String> isSensual = s -> Arrays.asList(this.sensualKeys).contains(s);

    private final BiFunction<String, String, String> obfuscateSensualData = (key, value) -> isSensual.test(key) ? "******" : value;

    public void displayObfuscatedData() {
        map.keySet().forEach(key -> System.out.printf("%s: %s\n", key, obfuscateSensualData.apply(key, map.get(key))));
    }
}
