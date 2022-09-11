package ss3_Mang_PhuongThuc;
import java.util.Scanner;
public class TimMin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhập số phần tử cho mảng : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i <arr.length ; i++) {
            System.out.print("nhập phần tử arr[" + i +"] :");
            arr[i] = sc.nextInt();
        }
        int min = arr[0];
        for (int i = 1; i <arr.length ; i++) {
            if(arr[i]<min){
                min = arr[i];
            }
        }
        System.out.print("Min : " +min);
    }
}
