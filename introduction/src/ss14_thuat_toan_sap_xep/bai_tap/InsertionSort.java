package ss14_thuat_toan_sap_xep.bai_tap;

import java.util.Scanner;

public class InsertionSort {
    static int[] arr = {9,10,-1,5,3,4,2,6};
    public static void insertionSort(int[] list){
        for (int i = 1; i <list.length ; i++) {
            for (int j = i; j >0 ; j--) {
                if(list[j]<list[j-1]){
                    int temp = list[j];
                    list[j]=list[j-1];
                    list[j-1]=temp;
                }else {
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {
        insertionSort(arr);
        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i] + "\t");
        }

    }
}
