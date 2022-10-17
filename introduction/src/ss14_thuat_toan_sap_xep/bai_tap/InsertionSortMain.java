package ss14_thuat_toan_sap_xep.bai_tap;

import java.util.Scanner;

public class InsertionSortMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter list size:");
        int size = scanner.nextInt();
        int[] list = new int[size];
        System.out.println("Enter " + list.length + " values:");
        for (int i = 0; i < list.length; i++) {
            list[i] = scanner.nextInt();
        }
        System.out.print("Your input list: ");
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + "\t");
        }
        System.out.println("\nBegin sort processing...");
        insertionSort(list);
    }
    public static void insertionSort(int[] list){
        for (int i = 1; i <list.length ; i++) {
            for (int j = i; j >0 ; j--) {
                if(list[j]<list[j-1]){
                    int temp= list[j];
                    list[j] = list[j-1];
                    list[j-1] = temp;
                }else {
                    break;
                }
            }
        }
        for (int i = 0; i <list.length ; i++) {
            System.out.print(list[i] + "\t");
        }
    }
}
