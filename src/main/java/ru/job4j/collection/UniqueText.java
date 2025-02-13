package ru.job4j.collection;

import java.util.Arrays;
import java.util.HashSet;

public class UniqueText {
    public static boolean isEquals(String originText, String duplicateText) {
        boolean rsl = true;
        String[] origin = originText.split(" ");
        String[] text = duplicateText.split(" ");
        HashSet<String> check = new HashSet<>();
        /* for-each origin -> new HashSet. */
        for (String element : origin) {
            check.add(element);
        }
        /* for-each text -> hashSet.contains */
        for (String ss : text) {
            if (!check.contains(ss)) {
                rsl = false;
                break;
            }
        }
        return rsl;
    }
}