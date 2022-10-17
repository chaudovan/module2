package test;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Insertion_Sort {
    int[] arr  = {4,3,5,-1,8,10};
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("one", 1);
        map.put("two", 2);
        Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
        System.out.println("Length: " + entrySet.size());
        for(Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println("Key - Value: " + entry.getKey() + " - " + entry.getValue());
        }
    }
    }
