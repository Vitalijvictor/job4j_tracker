package ru.job4j.lambda;

import java.util.Comparator;

public class LambdaUsage {
    public static void main(String[] args) {
        Comparator<String> cmpDescSize = (left, right) -> {
            System.out.println("compareDes - " + right.compareTo(left));
            return right.compareTo(left);
        };
    }
}
