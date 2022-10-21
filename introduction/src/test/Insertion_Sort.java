package test;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Insertion_Sort {
    public static void main(String[] args) {
        int[] arr  = {4,3,5,-1,8,10};
//        Map<String, Integer> map = new HashMap<>();
//        map.put("one", 1);
//        map.put("two", 2);
//        Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
//        System.out.println("Length: " + entrySet.size());
//        for(Map.Entry<String, Integer> entry : map.entrySet()) {
//            System.out.println("Key - Value: " + entry.getKey() + " - " + entry.getValue());
//        }
        for (int i = 1; i <arr.length ; i++) {
            for (int j = i; j >0 ; j--) {
                if(arr[j]<arr[j-1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j-1] = temp;
                }else {
                    break;
                }
            }
        }
        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i] + "\t");
        }
    }
}
