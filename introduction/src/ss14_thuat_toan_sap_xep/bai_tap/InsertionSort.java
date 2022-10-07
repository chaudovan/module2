package ss14_thuat_toan_sap_xep.bai_tap;

import java.util.Scanner;

public class InsertionSort {
    static int[] arr = {9,10,-1,5,3,4,2,6};
    public static void insertionSort(int[] list){
        for (int i = 1; i <list.length ; i++) {
             int x = list[i];
             int j = i;
             for( j = i ; j > 0 && x < list[j-1] ;j--){
                 list[j] = list[j-1];
             }
//             j = i;
//            while (j>0 && x<list[j-1]){
//                list[j] = list[j-1];
//                j--;
//            }
            list[j] =x;
        }
    }

    public static void main(String[] args) {
        insertionSort(arr);
        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i] + "\t");
        }

    }
}
