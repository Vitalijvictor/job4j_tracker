package ru.job4j.collection;

import java.util.Comparator;

public class StringCompare implements Comparator<String> {
    @Override
    public int compare(String left, String right) {
        for (int i = 0; i < left.charAt(Integer.parseInt(left)); i++) {
            char leftChar = left.charAt(i);
            for (int j = 0; j < right.charAt(Integer.parseInt(right)); j++) {
                char rightChar = left.charAt(j);
                if (leftChar > rightChar) {
                    return  leftChar;
                } else {
                    return rightChar;
                }
            }
        }
    }
}