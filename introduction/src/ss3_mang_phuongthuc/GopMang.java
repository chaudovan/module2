package ss3_mang_phuongthuc;
import java.util.Scanner;
public class GopMang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhập số phần tử cho mảng 1 : ");
        int n = sc.nextInt();
        int[] arr1 = new int[n];
        for (int i = 0; i <n ; i++) {
            System.out.print("nhập phần tử arr1[" + i + "] :");
            arr1[i] = sc.nextInt();
        }
        System.out.print("nhập số phần tử cho mảng 2 : ");
        int m = sc.nextInt();
        int[] arr2 = new int[m];
        for (int i = 0; i <m ; i++) {
            System.out.print("nhập phần tử arr2[" + i + "] :");
            arr2[i] = sc.nextInt();
        }
        int[] arr3 = new int[m+n];
        int index = arr1.length;
        int dem=0;
        for (int i = 0; i <arr1.length ; i++) {
            arr3[i] = arr1[i];
        }
        for (int i = index; i <arr3.length ; i++) {
            arr3[i] = arr2[dem];
            dem++;
        }
        for (int i = 0; i <arr3.length ; i++) {
            System.out.print(arr3[i] + "  ");
        }
    }
}
