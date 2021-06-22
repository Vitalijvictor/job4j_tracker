package ru.job4j.collection;

import java.util.HashMap;

public class UsageMap {
    public static void main(String[] args) {
        HashMap<String, String> email = new HashMap<>();
        email.put("trump@yahoo.com", "Donald Trump");
        for (String key : email.keySet()) {
            String value = email.get(key);
            System.out.println(key + " = " + value);
        }
    }
}
