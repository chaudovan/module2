package ss14_thuat_toan_sap_xep.thuc_hanh.sap_xep_chon;

import java.util.Arrays;

public class SelectionSort {
    static int[] arr = {9,10,-1,5,3,4,2,6};
    public static void selectionSort(int[] list){
        for (int i = 0; i <list.length ; i++) {
            int min = i;
            for (int j = i+1; j <list.length ; j++) {
                if(list[j]<list[min]){
                    min = j;
                }
            }
            if(min!=i){
                int temp = list[i];
                list[i] = list[min];
                list[min] = temp;
            }
        }
    }

    public static void main(String[] args) {
        selectionSort(arr);
        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i] + "\t");
        }
    }
}
