package ss11_stack_queue.bai_tap.count_of_work;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class CountOfWords {
    public static void main(String[] args) {
        Map<String,Integer> map = new TreeMap<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("nhập một chuỗi : ");
        String string = sc.nextLine();
        String[] arrString = string.split(" ");
        for (int i = 0; i <arrString.length ; i++) {
            arrString[i] = arrString[i].toLowerCase();
            if(map.containsKey(arrString[i])){
                map.replace(arrString[i],map.get(arrString[i])+1);
            }else{
                arrString[i].toLowerCase();
                map.put(arrString[i],1);
            }
        }
        System.out.println(map.toString());
    }
}
